package br.com.fiap.main;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    static void main() {
        Connection con = ConnectionFactory.abrirConexao();

        ClienteDao clienteDao = new ClienteDao(con);

        Cliente cliente = new Cliente();
//        cliente.setIdCliente(1);
//        cliente.setNomeCliente("Felipe");
//        cliente.setPlaca("JKK1900");
//        System.out.println(clienteDao.inserir(cliente));
//
//        cliente.setIdCliente(2);
//        cliente.setNomeCliente("Lucas");
//        cliente.setPlaca("PTS4536");
//        System.out.println(clienteDao.inserir(cliente));
//
//        cliente.setIdCliente(3);
//        cliente.setNomeCliente("Raphael");
//        cliente.setPlaca("LMT2370");
//        System.out.println(clienteDao.inserir(cliente));
//
//        cliente.setIdCliente(4);
//        cliente.setNomeCliente("Giovanni");
//        cliente.setPlaca("JNV3516");
//        System.out.println(clienteDao.inserir(cliente));


        cliente.setIdCliente(1);
        cliente.setPlaca("FCV2026");
        cliente.setNomeCliente("Paulo");
        System.out.println(clienteDao.alterar(cliente));

        cliente.setIdCliente(2);
        System.out.println(clienteDao.excluir(cliente));

        ArrayList<Cliente> resultado = clienteDao.listarTodos();
        if (resultado != null) {
            for (Cliente cliente1 : resultado){
                System.out.println("\nID: " + cliente1.getIdCliente());
                System.out.println("Nome: "+ cliente1.getNomeCliente());
                System.out.println("Placa: "+ cliente1.getPlaca() );
            }
        }else {
            System.out.println("Tabela não existe ou esta vazia");
        }
        ConnectionFactory.fecharConexao(con);

    }
}
