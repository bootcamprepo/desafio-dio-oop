import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        //System.out.println(curso);


        mentoria.setTitulo("JAVA")
        mentoria.setDescricao("ment java");
        mentoria.setDate(LocalDate.now());
        System.out.println(mentoria);
        System.out.println("---fim---");



    }
}
