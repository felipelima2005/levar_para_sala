package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteCreate {
    static void main() {
        Connection con = ConnectionFactory.abrirConexao();
        CarroDAO carroDAO = new CarroDAO(con);

        Carro carro = new Carro();
        carro.setPlaca("JKK1900");
        carro.setCor("Branco");
        carro.setDescricao("Nivus");

        carro.setPlaca("PTS4536");
        carro.setCor("Preto");
        carro.setDescricao("Astra");
        System.out.println(carroDAO.inserir(carro));

        carro.setPlaca("LMT2370");
        carro.setCor("Cinza");
        carro.setDescricao("Corolla");
        System.out.println(carroDAO.inserir(carro));

        carro.setPlaca("JNV3516");
        carro.setCor("Azul");
        carro.setDescricao("Lancer");
        System.out.println(carroDAO.inserir(carro));

        ConnectionFactory.fecharConexao(con);

    }
}
