class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(3.0, 4.0);
        System.out.println("" + c1 + " " 
            + ((c1 == c2) ? "==" : "!=")
            + " " + c2);
        System.out.println("" + c1 + " " 
            + ((c1.equals(c2)) ? " equals " : " does not equal ")
            + " " + c2);
            
        Complex c3 = new Complex(5.0, 0.0);
        Double d = 5.0;
        System.out.println("" + c3 + " " 
            + ((c3.equals(d)) ? " equals " : " does not equal ")
            + " " + d);
        
    }
} 
