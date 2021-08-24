package model;

/**
 * 
 * @author Dione
 *
 */
public class Nivel implements CaixaAssinaturaNivel {
	private String name;

	public Nivel(String name) {
		this.name = name;
	}

	@Override
	public void imprimir(String structure) {
		System.out.println(structure + name);
	}
}
