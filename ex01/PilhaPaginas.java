package ex01;

import java.util.LinkedList;

public class PilhaPaginas {
private LinkedList<Pagina> stack;

	public PilhaPaginas() {
		this.stack = new LinkedList<>();
	}
	
	//peguei da prof a pilha e so alterei usando a classe pagina
	
	public boolean isEmpty () {
		return (this.stack.isEmpty());
	}
	
	public int size() {
		return this.stack.size();
	}
	
	public Pagina top () {
		return this.stack.getFirst();
	}
	
	public void push (Pagina p) {
		this.stack.addFirst(p);
	}
	
	public Pagina pop () {
		return this.stack.removeFirst();
	}


}
