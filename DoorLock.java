
public class DoorLock {

    private final int MAX_NUMBER_OF_ATTEMPTS = 3; //constant

    private int attempts; //instance
    private boolean open;
    private Combination combination;
    private boolean activated;

    public DoorLock(Combination combination) { //Constructor
        attempts = 0;
        open = false;
        this.combination = combination;
        activated = true;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    public void activate(Combination c) {
        if (combination.equals(c)) {
            activated = true;
        }
    }

    public boolean open(Combination combination) {
        if (activated) {
            if (combination.equals(combination) && attempts <= MAX_NUMBER_OF_ATTEMPTS) {
                open = true;
                attempts = 0;
            } else {
                attempts++;
                if (attempts > MAX_NUMBER_OF_ATTEMPTS) {
                    activated = false;
                    attempts = 0;
                }
            }
        }
        return activated&&open;
    }
}


