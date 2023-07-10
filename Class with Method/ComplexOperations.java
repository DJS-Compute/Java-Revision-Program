class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
        double realSum = this.real + c.real;
        double imaginarySum = this.imaginary + c.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public Complex subtract(Complex c) {
        double realDiff = this.real - c.real;
        double imaginaryDiff = this.imaginary - c.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    public void display() {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.5, 3.5);
        Complex c2 = new Complex(1.5, 2.5);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);

        sum.display();
        difference.display();
    }
}

