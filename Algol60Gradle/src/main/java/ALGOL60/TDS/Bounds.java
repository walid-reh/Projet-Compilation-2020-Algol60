package ALGOL60.TDS;

public class Bounds {
    private int minBoundary;
    private int maxBoundary;
    public Bounds(int min,int max){
        this.minBoundary=min;
        this.maxBoundary=max;
    }

    public int getMaxBoundary() {
        return maxBoundary;
    }

    public void setMaxBoundary(int maxBoundary) {
        this.maxBoundary = maxBoundary;
    }

    public int getMinBoundary() {
        return minBoundary;
    }

    public void setMinBoundary(int minBoundary) {
        this.minBoundary = minBoundary;
    }

    @Override
    public String toString() {
        return this.minBoundary+":"+this.maxBoundary;
    }

}