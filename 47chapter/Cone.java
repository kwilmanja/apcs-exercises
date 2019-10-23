public class Cone
{
  private double radius;  // radius of the base
  private double height;  // height of the cone
  
  public Cone( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
  }

  public void setHeight( double height )
  {
    if ( height >= 0 )
      this.height = height ;
  }
  
  public void setRadius( double radius )
  {
    if ( radius >= 0 )
      this.radius = radius ;
  }
  
  public double getHeight( )
  {
    return this.height ;
  }
  
  public double getRadius( )
  {
    return this.radius ;
  }
  

  //Methods:
  public double surfaceArea()
  {
    return Math.PI*radius*(radius + slantHeight() );
  }
  
  public double volume()
  {
    return Math.PI*radius*radius*height/3.0;  
  }


  public double slantHeight(){
    return Math.sqrt(height*height + radius*radius);
  }

  public double angle(){
    return Math.atan(this.radius / this.height);
  }
  
}