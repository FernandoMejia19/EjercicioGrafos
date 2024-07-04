import java.util.LinkedList;
import java.util.List;

public class NodeGraph<T> {
    private T user;
    private List<T> friends;
    
    public NodeGraph(T user){
        this.user=user;
        this.friends=new LinkedList<>();
    }
    
    public void addFriend(NodeGraph<T> friend){
        friends.add(friend.getUser());
    
    }
    public List<T> getFriends(){
        return friends;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public void setFriends(List<T> friends) {
        this.friends = friends;
    }
}
