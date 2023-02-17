package p4;

public class LandTract {
	   
    private double width,
            length, area;
   
    public LandTract(double w, double l) {
        this.width = w;
        this.length = l;
         
    }
    
    public double getArea(){
        area = length * width ;

        return area;
    }
        
        public double getLength(double length){

    return length;
        }
        public double getWidth(double width){

    return width;
    }
        public boolean equals(LandTract lt1 , LandTract lt2) {
		boolean equals;
		if (length == (lt1.length) && width == (lt1.width) || length == (lt2.width) && width == (lt2.length))
			equals = true;
		else
			equals = false;
		return equals;
	}
        public String toString(){
      
            return "length is " + length + "\n and width is " + width + "\n and area is " + area;
        }

}
