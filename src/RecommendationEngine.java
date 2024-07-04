import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RecommendationEngine {
    public List<User>recommendFriends(NodeGraph<User>node,Graph<User> graph){
        List <User> recommendFriends=new ArrayList<>();
        for (NodeGraph<User> potentialFriendNode:graph.getNodes()){
            User potentialFriend=potentialFriendNode.getUser();
            if (!node.getFriends().contains(potentialFriend)&&!node.getUser().equals(potentialFriend)){
                double similarity=calcularSimilarity(node.getUser(),potentialFriend);
                if(similarity>0.3){
                    recommendFriends.add(potentialFriend);
                }

            }
        }
        return recommendFriends;
    }
    public double calcularSimilarity(User user1,User user2){
        Set<String> interests1=new HashSet<>(user1.getInterests());
        Set<String> interests2=new HashSet<>(user2.getInterests());
        Set<String> intersection=new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union=new HashSet<>(interests1);
        union.addAll(interests2);

        double resp=(double)intersection.size()/union.size();///>>>(double)>castea deja en double o puede ser un int 
        System.out.println("Valor  -  "+resp);

        return resp;
        
    }
}
