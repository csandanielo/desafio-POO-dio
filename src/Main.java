
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso IDEs java");
        curso2.setDescricao("descricao curso IDEs java java");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());
/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaroline = new Dev();
        devCaroline.setNome("Caroline");
        devCaroline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Caroline" + devCaroline.getConteudosInscritos());
        devCaroline.progredir();
        devCaroline.progredir();
        System.out.println("--------XXXX---------");
        System.out.println("Conteudos Inscritos Caroline" + devCaroline.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Caroline" + devCaroline.getConteudosConcluidos());
        System.out.println("XP: " + devCaroline.calcularTotalXp());

        System.out.println("-----------------------------------");


        Dev devIsabela = new Dev();
        devIsabela.setNome("Isabela");
        devIsabela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Isabela" + devIsabela.getConteudosInscritos());
        devIsabela.progredir();
        System.out.println("--------XXXX---------");
        System.out.println("Conteudos Inscritos Isabela"  + devIsabela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Isabela" + devIsabela.getConteudosConcluidos());
        System.out.println("XP: " + devIsabela.calcularTotalXp());
    }
}
