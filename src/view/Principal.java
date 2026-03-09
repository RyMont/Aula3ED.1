package view;

import controller.VetoresController;

public class Principal {
	public static void main(String[] args) {
		int[] array1Ex1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] array2Ex1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] array1Ex2 = {44, 43, 42, 41, 40, 39, 38};
		int[] array2Ex2 = {44, 43, 42, 41, 40, 39, 38};
		int[] array1Ex3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		int[] array2Ex3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		VetoresController vc = new VetoresController();
		
		//Ex1
		
		System.out.println("Exercicio 1 antes bubble: ");
		for (int num : array1Ex1) {
			System.out.print(num + " ");
		}
		System.out.println();
		vc.bubbleAula(array1Ex1);
		System.out.println("Exercicio 1 depois bubble: ");
		for (int num : array1Ex1) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Exercicio 1 antes merge: ");
		for (int num : array2Ex1) {
			System.out.print(num + " ");
		}
		System.out.println();
		vc.mergeAula(array2Ex1);
		System.out.println("Exercicio 1 depois merge: ");
		for (int num : array2Ex1) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
		
		//Ex2
		
		System.out.println("Exercicio 2 antes bubble: ");
		for (int num : array1Ex2) {
			System.out.print(num + " ");
		}
		System.out.println();
		vc.bubbleAula(array1Ex2);
		System.out.println("Exercicio 2 depois bubble: ");
		for (int num : array1Ex2) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Exercicio 2 antes merge: ");
		for (int num : array2Ex2) {
			System.out.print(num + " ");
		}
		System.out.println();
		vc.mergeAula(array2Ex2);
		System.out.println("Exercicio 2 depois merge: ");
		for (int num : array2Ex2) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
		
		//Ex3
		
		System.out.println("Exercicio 3 antes bubble: ");
		for (int num : array1Ex3) {
			System.out.print(num + " ");
		}
		System.out.println();
		vc.bubbleAula(array1Ex3);
		System.out.println("Exercicio 3 depois bubble: ");
		for (int num : array1Ex3) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Exercicio 3 antes merge: ");
		for (int num : array2Ex3) {
			System.out.print(num + " ");
		}
		System.out.println();
		vc.mergeAula(array2Ex3);
		System.out.println("Exercicio 3 depois merge: ");
		for (int num : array2Ex3) {
			System.out.print(num + " ");
		}
		
	}
}
