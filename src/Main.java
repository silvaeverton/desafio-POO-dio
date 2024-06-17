import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
