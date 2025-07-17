
class Volume {  
    double w;  
    double h;  
    double d;  
    
    // Correct constructor
    Volume(double w, double h, double d) {  
        double volume = w * h * d;  
        System.out.println("Volume: " + volume);  
    }  
}  

class Calculate {  
    public static void main(String[] args) {  
        // Creating object using the constructor
        Volume obj = new Volume(10, 20, 30);  
    }  
}  