package exercicio02;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setModelo("Modelo1");
		carro.setFabricante("Fiat");
		carro.setAno(2017);
		carro.setCor("Preto");
		
		carro.dono.setEndereco("Rua Bulcăo");
		carro.dono.setNome("José");
		carro.motor.setMarca("vVv");
		carro.motor.setCilindros(250);
		carro.motor.setCombustivel("Gasolina");
		carro.motor.setPotencia(200);
		
		System.out.println(carro.toString());
	}
}