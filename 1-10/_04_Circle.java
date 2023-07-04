import java.lang.Math;

public class _04_Circle {
  public _04_Circle(double radius) {
    // Initialisation des parametres.
    this.radius = radius;
  }

  public double calcSurface() {
    return Math.pow(this.radius, 2) * Math.PI;
  }
  
  public double calcPerimeter() {
    return this.radius * 2 * Math.PI;
  }
  
  double radius;
}
