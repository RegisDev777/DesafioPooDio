package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
      
	private String nome;
    private String descrição;
    private final LocalDateTime dataIncial = LocalDateTime.now();
    private final LocalDateTime dataFinal = dataIncial.plusDays(45);
    private Set<Dev> devIncritos = new HashSet<Dev>();
    private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	
    
    
			    
			    public String getNome() {
					return nome;
				}
				public void setNome(String nome) {
					this.nome = nome;
				}
				
				
				public String getDescrição() {
					return descrição;
				}
				public void setDescrição(String descrição) {
					this.descrição = descrição;
				}
				
				
				public Set<Dev> getDevIncritos() {
					return devIncritos;
				}
				public void setDevIncritos(Set<Dev> devIncritos) {
					this.devIncritos = devIncritos;
				}
				
				
				public Set<Conteudo> getConteudos() {
					return conteudos;
				}
				public void setConteudos(Set<Conteudo> conteudos) {
					this.conteudos = conteudos;
				}
				
				
				public LocalDateTime getDataIncial() {
					return dataIncial;
				}
				public LocalDateTime getDataFinal() {
					return dataFinal;
				}
				
				
				@Override
				public int hashCode() {
					return Objects.hash(conteudos, dataFinal, dataIncial, descrição, devIncritos, nome);
				}
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					BootCamp other = (BootCamp) obj;
					return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
							&& Objects.equals(dataIncial, other.dataIncial) && Objects.equals(descrição, other.descrição)
							&& Objects.equals(devIncritos, other.devIncritos) && Objects.equals(nome, other.nome);
				}
    
    
    
    
               
    
    
             
    
              
    
    
       
         
        
    
}
