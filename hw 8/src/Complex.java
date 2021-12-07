public class Complex {

    double real;
    double image;

    Complex (double real, double image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {}

    public double getReal() {return real;}

    public double getImage() {return image;}

    public Complex add (Complex a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }

    public Complex mul (Complex a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real*real2 - image*image2;
        double newImage = image*real2 + real*image2;
        Complex result = new Complex(newReal,newImage);
        return result;
    }

    public void print () {
        if (image > 0) {
            System.out.println(real + " + " + image + "i");
        } else if (image < 0) {
            System.out.println(real + "" + image + "i");
        } else {
            System.out.println(real);
        }
    }
}