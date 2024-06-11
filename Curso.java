package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	          
	        
	

			
			public int getCargaHoraria() {
				return cargaHoraria;
			}
			public void setCargaHoraria(int cargaHoraria) {
				this.cargaHoraria = cargaHoraria;
			}
			
	
	        @Override
	        public String toString() {
	        	StringBuilder sb = new StringBuilder();
	        	sb.append("Curso: " + "\n");
	        	sb.append("Titulo: " + getTitulo() + "\n");
	        	sb.append("Descrição: " + getDescrição() + "\n");
	        	return sb.toString();
	        }
			@Override
			public double calcularXp() {
				// TODO Auto-generated method stub
				return XP_PADRAO * cargaHoraria;
			}
	
	
	
	
	
	
}
