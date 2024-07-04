import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Diseño de una Red Social");
        /*Graph<String> graph=new Graph<>();
        NodeGraph<String> node1=graph.addNode("Ricardo");
        NodeGraph<String> node2=graph.addNode("Katy");
        NodeGraph<String> node3=graph.addNode("Samanta");
       
        graph.addConnection(node1, node2);
        graph.addConnection(node1, node3);


        System.out.println("Amigos de "+node1.getUser()+graph.getFriends(node1));
        System.out.println("Recomendados de  "+node1.getUser()+graph.recommendFriends(node1));*/

        Graph<User> graph = new Graph<>();

        // Crear usuarios
        User user1 = new User("Alice", 30, Arrays.asList("Music", "Art"));
        User user2 = new User("Bob", 25, Arrays.asList("Music", "Sports"));
        User user3 = new User("Charlie", 35, Arrays.asList("Art", "Movies"));
        User user4 = new User("Dave", 40, Arrays.asList("Sports", "Travel"));
        User user5 = new User("Eve", 28, Arrays.asList("Music", "Movies"));
        
        // Crear nodos          // Añadir nodos al grafo
        NodeGraph<User> node1 = graph.addNode(user1);
        NodeGraph<User> node2 = graph.addNode(user2);
        NodeGraph<User> node3 = graph.addNode(user3);
        NodeGraph<User> node4 =  graph.addNode(user4);
        NodeGraph<User> node5 = graph.addNode(user5);
        

        
        // Añadir conexiones
        graph.addConnection(node1, node2);
        graph.addConnection(node1, node3);
        graph.addConnection(node2, node4);
        graph.addConnection(node2, node3);
        graph.addConnection(node3, node5);
        graph.printGraph();
       
        //recomendaciones de amigos
        RecommendationEngine engine=new RecommendationEngine();
        List<User>recomendations=engine.recommendFriends(node1, graph);
        System.out.println("Friend recomendations for  "+user1.getName()+" : "+recomendations);
    }

   
}
