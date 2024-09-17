public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational( Rational rational) {
        rational = this;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public Rational reciprocal() {
        Rational rational = new Rational(denominator, numerator);
        return  rational;
    }

    public Rational multiply(Rational a, Rational b) {
        int newNumerator = a.numerator * b.numerator;
        int newDenominator = a.denominator * b.denominator;
        Rational newRational = new Rational(newNumerator, newDenominator);
        return newRational;
    }
}
