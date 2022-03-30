import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(("curso Java"));
        curso1.setDescricao(("descrição curso Java"));
        curso1.setCargaHoraria((8));

        Curso curso2 = new Curso();
        curso2.setTitulo(("curso Js"));
        curso2.setDescricao(("descrição curso Js"));
        curso2.setCargaHoraria((4));

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição de Java");
        mentoria1.setData(LocalDate.now());          //não escrevi uma data pq usando o .now a data será a data de criação da mentoria1


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }

}
