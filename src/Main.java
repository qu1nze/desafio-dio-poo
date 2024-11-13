import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java dev");
        bootcamp.setDescricao("Descricao bootcamp java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        System.out.println(devLucas.getNome());
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
        System.out.println("--------------------------------------");

        Dev devJean = new Dev();
        devJean.setNome("Jean");
        System.out.println(devJean.getNome());
        devJean.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devJean.getConteudosInscritos());
        devJean.progredir();
        devJean.progredir();
        devJean.progredir();
        System.out.println("---");
        System.out.println("Conteudos inscritos " + devJean.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devJean.getConteudosConcluidos());
        System.out.println("XP: " + devJean.calcularTotalXp());

    }
}
