package br.com.igti.lod.ex2;

public class Carro {

	private IMotor iMotor;

	public Carro(MotorDeCombustao motorDeCombustao) {
		this.iMotor = motorDeCombustao;
	}

	public void acelerar() {
		iMotor.acelerar();
	}

}
