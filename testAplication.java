package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class testAplication {
     public static void main(String[] args) {
		
    	 Curso curso1 = new Curso();
    	 curso1.setTitulo("Curso Java");
    	 curso1.setDescrição("Descrição curso java");
    	 curso1.setCargaHoraria(8);
    	    	 
    	 
    	 Curso curso2 = new Curso();
    	 curso1.setTitulo("Curso Js");
    	 curso1.setDescrição("Descrição curso Js");
    	 curso1.setCargaHoraria(4);
    	  	 
    	 
    	 Mentoria mentoria = new Mentoria();
    	 mentoria.setTitulo("Curso Java");
    	 mentoria.setDescrição("Descrição curso java");
    	 mentoria.setData(LocalDateTime.now());
    	
    	 
//    	 System.out.println(curso1);
//    	 System.out.println(curso2);
//    	 System.out.println(mentoria);
    	 
    	 
    	 BootCamp bootCamp = new BootCamp();
    	 bootCamp.setNome("Bootcamp java developer");
    	 bootCamp.setDescrição("Descrição Bootcamp java developer");
    	 bootCamp.getConteudos().add(curso1);
    	 bootCamp.getConteudos().add(curso2);
    	 bootCamp.getConteudos().add(mentoria);
    	 
    	 Dev devRegis = new Dev();
    	 devRegis.setNome("Regis");
    	 devRegis.inscreverBootcamp(bootCamp); 
    	 System.out.println("Conteudos inscritos " + devRegis.getConteudoInscrito());
    	 devRegis.progredir();
    	 System.out.println("Conteudos concluidos " + devRegis.getConteudoConcluidos());
    	 
    	 
    	 System.out.println();
    	 System.out.println();
    	 System.out.println();
    	 
    	 Dev devJoao = new Dev();
    	 devJoao.setNome("Joao");
    	 devJoao.inscreverBootcamp(bootCamp);
    	 System.out.println("Conteudos inscritos " + devJoao.getConteudoInscrito()); 
    	 devJoao.progredir();
    	 System.out.println("Conteudos concluidos " + devJoao.getConteudoConcluidos()); 
    	 
    	
    	 
    	 
    	 
    	 
	}
}
