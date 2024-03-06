/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author ABRAHAM
 */
public class busqueda<T extends Comparable<T>> {
    
    
     private nodo<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public nodo<T> getRoot() {
        return root;
    }

    public boolean isRoot(nodo<T> nodo) {

        return root == nodo;
    }

    public boolean isLeaf(nodo<T> nodo) {

        return nodo.getLeft() == null && nodo.getRight() == null;
    }

    public boolean isInternal(nodo<T> nodo) {
        return !isLeaf(nodo);
    }

    public nodo<T> add(nodo<T> origen, T elemento) {

        nodo<T> nodo = null;
        if (root == null) {

            root = new nodo<>(elemento);
        } else {
            if (origen == null) {

                System.out.println("El origen es nulo");
            } else {

                if (origen.getElement().compareTo(elemento) > 0) {

                    if (origen.getLeft() != null) {
                        add(origen.getLeft(), elemento);
                    } else {
                        nodo = new nodo<>(elemento);
                        nodo.setParent(origen);
                        origen.setLeft(nodo);
                    }

                } else {

                    if (origen.getRight() != null) {
                        add(origen.getRight(), elemento);
                    } else {
                        nodo = new nodo<>(elemento);
                        nodo.setParent(origen);
                        origen.setRight(nodo);
                    }

                }
            }

        }
        return nodo;
    }

    public nodo<T> add(T elemento) {

        nodo<T> nodo = null;
        if (root == null) {

            root = new nodo<>(elemento);
        } else {

            nodo<T> aux = root;
            boolean insertado = false;
            while (!insertado) {

                if (aux.getElement().compareTo(elemento) > 0) {

                    if (aux.getLeft() != null) {
                       aux = aux.getLeft();
                    } else {
                        nodo = new nodo<>(elemento);
                        nodo.setParent(aux);
                        aux.setLeft(nodo);
                        insertado = true;
                    }

                } else {

                    if (aux.getRight() != null) {
                       aux = aux.getRight();
                    } else {
                        nodo = new nodo<>(elemento);
                        nodo.setParent(aux);
                       aux.setRight(nodo);
                       insertado = true;
                    }

                }

            }

        }
        return nodo;
    }
    
    public void preorder(nodo<T> nodo){
     
        System.out.println(nodo.getElement().toString());
        if(nodo.getLeft() != null){
            
            preorder(nodo.getLeft());
        }
        
        if(nodo.getRight() != null){
            preorder(nodo.getRight());
        }
        
        
    }
    
      public void inorder(nodo<T> nodo){
     
        
        if(nodo.getLeft() != null){
            
            preorder(nodo.getLeft());
        }
        
        System.out.println(nodo.getElement().toString());
        
        if(nodo.getRight() != null){
            preorder(nodo.getRight());
        }
        
        
    }
      
       public void postorder(nodo<T> nodo){
     
        
        if(nodo.getLeft() != null){
            
            preorder(nodo.getLeft());
        }
        
       
        
        if(nodo.getRight() != null){
            preorder(nodo.getRight());
        }
        
        System.out.println(nodo.getElement().toString());
        
    }

}

    
    
    

