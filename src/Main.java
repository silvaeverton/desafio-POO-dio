import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Curso java class");
        mentoria1.setDescricao("descrição curso java class");
        mentoria1.setData(LocalDate.now());

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descrição curso Python");
        curso2.setCargaHoraria(10);


        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEverton = new Dev();
        devEverton.setNome("Everton");
        devEverton.inscreverBootcamp(bootcamp);
        System.out.println( "Conteudo Inscritos Everton:"+ devEverton.getConteudosInscritos());

        Dev devJheniffer = new Dev();
        devJheniffer.setNome("Jheniffer");
        devJheniffer.inscreverBootcamp(bootcamp);
        System.out.println( "Conteudo Inscritos Jheniffer:"+ devJheniffer.getConteudosInscritos());


    }
}
