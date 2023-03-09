package controller;

public class IDthread extends Thread{

	public IDthread() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		ThreadNumero();
	}

	private void ThreadNumero() {
		System.out.println("ID #" + getId());
		
	}
	
	

}
