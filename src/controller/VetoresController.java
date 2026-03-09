package controller;

import com.rymont.ordenacao.OrdenaVetores;

public class VetoresController {
	public VetoresController() {
		super();
	}
	
	private OrdenaVetores ov = new OrdenaVetores();
	
	public void mergeAula(int[] vetor) {
		ov.mergeSortAula(vetor, 0, vetor.length-1);
	}
	
	public void bubbleAula(int[] vetor) {
		ov.bubbleSort(vetor);
	}
}
