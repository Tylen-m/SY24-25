public class Fraction
{ private int num;
  private int denom;
  public Fraction(int num, int denom)
  { this.num = num;
    this.denom = denom; 
  }
  public Fraction multiply(Fraction other)
  {
    
      
      return new Fraction(num * other.num, denom * other.denom);
  }
  public Fraction divide(Fraction other)
  {
    
      
      return new Fraction(num * other.denom, denom * other.num);
  }
  public String toString()
  {
      return num +"/"+ denom;

  }
}
