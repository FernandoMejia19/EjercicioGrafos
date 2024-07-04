import java.util.ArrayList;

import java.util.List;


public class Graph<T> {
    private List<NodeGraph<T>> nodes;

    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }

    public Graph(){
        this.nodes = new ArrayList<NodeGraph<T>>();
    }

    public NodeGraph<T> addNode(T user){
        NodeGraph<T> newNode= new NodeGraph<>(user);
        nodes.add(newNode);
        return newNode;
    }
    public void addConnection(NodeGraph<T> node1,NodeGraph<T>  node2){
        node1.addFriend(node2);
        node2.addFriend(node1);
    }
    public List<T> getFriends(NodeGraph<T>node){
        List<T> friends = new ArrayList<>();
        for (T friend : node.getFriends()) {
            friends.add(friend);
        }
        return friends;
        
    }
    ///public List<T> recommendFriends(NodeGraph<T> node){
       
    //}
    public void printGraph(){
        for (NodeGraph<T> node:nodes){
            System.out.print("Vertex  "+node.getUser()+" : ");
            for (T firends :  node.getFriends()){
                System.out.print(" -> "+firends);
            }
            System.out.println();
        }

        }
    }

