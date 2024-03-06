/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author ABRAHAM
 */
public class nodo<T extends Comparable<T>> {
    
    
     private T element;
    private nodo<T> parent;
    private nodo<T> left;
    private nodo<T> right;

    public nodo(T element) {
        this.element = element;
    }

    public nodo(T element, nodo<T> parent, nodo<T> left, nodo<T> right) {
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public nodo(T element, nodo<T> parent) {
        this.element = element;
        this.parent = parent;
    }

    public nodo(T element, nodo<T> left, nodo<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public nodo<T> getParent() {
        return parent;
    }

    public void setParent(nodo<T> parent) {
        this.parent = parent;
    }

    public nodo<T> getLeft() {
        return left;
    }

    public void setLeft(nodo<T> left) {
        this.left = left;
    }

    public nodo<T> getRight() {
        return right;
    }

    public void setRight(nodo<T> right) {
        this.right = right;
    }
    
    
}
