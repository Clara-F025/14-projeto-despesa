package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//        Despesa despesa = new Despesa();
//        despesa.setId(103L);
//        despesa.setDescricao("Monster");
//        despesa.setValor(16.90);
//        despesa.setCategoria(new Categoria(3L, ""));
//        despesa.setData(LocalDate.parse("22/08/2025", mascara));
//
//        dao.inserir(despesa);


        List<Despesa> lista = dao.listar();
        for(Despesa despesa : lista) {
            System.out.println(despesa.getId() + "  --> " + despesa.getDescricao()+" - "+despesa.getValor());
        }
    }
}
