package model;

import java.util.List;

/**
 * 
 * @author Dione
 *
 */
public class Caixa implements CaixaAssinaturaNivel {
	private String name;
	private List<CaixaAssinaturaNivel> assinatura;

	public Caixa(String name, List<CaixaAssinaturaNivel> assinatura) {
		this.name = name;
		this.assinatura = assinatura;
	}

	@Override
	public void imprimir(String structure) {
		System.out.println(structure + name);
		for (CaixaAssinaturaNivel child : assinatura) {
			child.imprimir(structure + "| ");
		}
	}
}
