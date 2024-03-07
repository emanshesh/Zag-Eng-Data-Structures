/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task11;

/**
 *
 * @author Pc
 */
public class tree {

    private Node getParent(int value) {
        Node current=root;
        Node parent=root;
        while(current!=null){
            parent=current;
        if (value>=current.value){
            current=current.rightchild;
        }else{
            current=current.leftchild;
        }
        }
        return parent;
            
    }
    private class Node{
    private int value;
   private Node rightchild;
   private Node leftchild;
   public Node(int value){this.value =value;}
    
    }
    private Node root;
    public void insert(int value){
    Node node=new Node(value);
    if (root==null){
        root=node;}
    else {
        Node parent=getParent(value);
        if (value>+parent.value)
            parent.rightchild=node;
        else
            parent.leftchild=node;
    }
    public boolean find (int value){
        Node current=root;
        while(current!=null){
            if(current.value==value)
                return true;
            if(value>=current.value)
                current=current.rightchild;
            else 
                current=current.leftchild;
        }
        return false;
    }
    public int max(){
        int max=root.value;
        Node current=root;
        while (current!=null){
         max =current.value;
         current=current.rightchild;
        }
        return max;
    }
    public int min(){
        int min=root.value;
        Node current=root;
        while (current!=null){
         min =current.value;
         current=current.leftchild;
        }
        return min;
    }
    public void preOrder(){
       preOrder(root); 
    }
    private void preOrder(Node root){
        if (root==null)
            return;
        System.out.println(root.value);
        preOrder(root.leftchild);
        preOrder(root.rightchild);
    }
    public void inOrder(){
       inOrder(root); 
    }
    private void inOrder(Node root){
        if (root==null)
            return;
        inOrder(root.leftchild);
        System.out.println(root.value);
        inOrder(root.rightchild);
    }
    public void postOrder(){
       postOrder(root); 
    }
     private void postOrder(Node root){
        if (root==null)
            return;
        postOrder(root.leftchild);
        postOrder(root.rightchild);
        System.out.println(root.value);
    }
    }

