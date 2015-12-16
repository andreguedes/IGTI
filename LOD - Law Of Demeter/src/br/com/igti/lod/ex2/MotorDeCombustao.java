package br.com.igti.lod.ex2;

public class MotorDeCombustao implements IMotor {

	@Override
	public void acelerar() {
		this.aumentaInjecaoCombustivel();
	}
	
	private void aumentaInjecaoCombustivel() {
		
	}

}
