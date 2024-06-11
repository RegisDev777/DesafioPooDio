package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> ConteudoInscrito = new LinkedHashSet<>(); // Set pois nao permite repetição!
	private Set<Conteudo> ConteudoConcluidos = new LinkedHashSet<>();
	

	
				public void inscreverBootcamp(BootCamp bootCamp) {
					this.ConteudoInscrito.addAll(bootCamp.getConteudos());
					bootCamp.getDevIncritos().add(this);
				}
	           
				public void progredir() {
					Optional<Conteudo>conteudo = this.ConteudoInscrito.stream().findFirst();
					if(conteudo.isPresent()) {
						this.ConteudoConcluidos.add(conteudo.get());
						this.ConteudoInscrito.remove(conteudo.get());
					} else {
						System.err.println("Voce nao esta matriculado em nenhum conteudo!");
					}
				}
	
				public Double calculaXp() {
					return this.ConteudoConcluidos.stream()
							.mapToDouble(conteudo -> conteudo.calcularXp()).sum();
					
				}

				
				public String getNome() {
					return nome;
				}
				public void setNome(String nome) {
					this.nome = nome;
				}

				
				public Set<Conteudo> getConteudoInscrito() {
					return ConteudoInscrito;
				}
				public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
					ConteudoInscrito = conteudoInscrito;
				}

				
				public Set<Conteudo> getConteudoConcluidos() {
					return ConteudoConcluidos;
				}				
				public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
					ConteudoConcluidos = conteudoConcluidos;
				}

				
				
				@Override
				public int hashCode() {
					return Objects.hash(ConteudoConcluidos, ConteudoInscrito, nome);
				}

				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Dev other = (Dev) obj;
					return Objects.equals(ConteudoConcluidos, other.ConteudoConcluidos)
							&& Objects.equals(ConteudoInscrito, other.ConteudoInscrito)
							&& Objects.equals(nome, other.nome);
				}
				
			    
				
	
}
