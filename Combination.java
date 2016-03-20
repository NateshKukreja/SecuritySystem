
public class Combination {
    private int first;
    private int second;
    private int third;
    public Combination(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public boolean equals(Combination other){
        return ((this.first == other.first) && (this.second == other.second) && (this.third == other.third));
    }
    public String toString(){
        return first+":"+second+":"+third;
    }
}
