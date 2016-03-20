
public class SecurityAgent {
    private Combination secret;
    private DoorLock myLock;

    public SecurityAgent(){
        int first = (int) ( Math.random()*5 ) + 1;
        int second = (int) ( Math.random()*5 ) + 1;
        int third = (int) ( Math.random()*5 ) + 1;
        secret = new Combination(first, second, third);
        myLock = new DoorLock(secret);
    }

    public DoorLock getDoorLock(){
        return myLock;
    }

    public void activateDoorLock(){
        myLock.activate(secret);
    }
}
