/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario;

/**
 *
 * @author ABRAHAM
 */
public class ArbolBinario {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       busqueda<Integer> arbol = new busqueda<>();
        
        arbol.add(52);
        arbol.add(11);
        arbol.add(5);
        arbol.add(30);
        arbol.add(3);
        arbol.add(2);
        arbol.add(24);
        arbol.add(arbol.getRoot(), 61);
        arbol.add(arbol.getRoot(), 52);
        arbol.add(arbol.getRoot(), 59);
        arbol.add(arbol.getRoot(), 30);
        arbol.add(arbol.getRoot(), 48);
      
        
       // System.out.println(arbol);
        System.out.println("preorder");
       arbol.preorder(arbol.getRoot());
       System.out.println("postorder");
       arbol.postorder(arbol.getRoot());
       System.out.println("inorder");
       arbol.inorder(arbol.getRoot()); 
        
        
        
    }
}
