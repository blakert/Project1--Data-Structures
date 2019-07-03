public class Run {
    private int numTimes;
    private Pixel pixData;

    Run() {
        numTimes = 0;
        pixData = null;
    }
    Run(Pixel data, int numTimes) {
        this.pixData = data;
        this.numTimes = numTimes;
    }

    public int getNumTimes() {
        return numTimes;
    }

    public Pixel getPixData() {
        return pixData;
    }

    public void setNumTimes(int numTimes) {
        this.numTimes = numTimes;
    }

    public void setPixData(Pixel pixData) {
        this.pixData = pixData;
    }
}
