package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

	private LocalDateTime data;
	
	

				
				public LocalDateTime getData() {
					return data;
				}
				public void setData(LocalDateTime data) {
					this.data = data;
				}

				
				@Override
				public String toString() {
					StringBuilder sb = new StringBuilder();
					sb.append("Mentoria: " + " \n");
					sb.append("titulo: " + getTitulo() + "\n");
					sb.append("Descrição: " + getDescrição() + "\n");
					sb.append("Data: " + data);
					return sb.toString();			          
				}
				
				@Override
				public double calcularXp() {
					// TODO Auto-generated method stub
					return XP_PADRAO + 20d;
				}
	
	
	            
	
	
	
	
}
