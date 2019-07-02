public class Pixel {
    short red;
    short green;
    short blue;

    Pixel(short red, short green, short blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
    Pixel(){

    }

    public Pixel getPixel() {
        return this;
    }

    public void setPixel(short red, short green, short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public short getRed() {
        return red;
    }

    public void setRed(short red) {
        this.red = red;
    }

    public short getGreen() {
        return green;
    }

    public void setGreen(short green) {
        this.green = green;
    }

    public short getBlue() {
        return blue;
    }

    public void setBlue(short blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "{ red: " + this.red + " green: " + this.green + " blue: " + this.blue + " }";
    }
}
