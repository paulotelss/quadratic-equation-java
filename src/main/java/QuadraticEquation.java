public class QuadraticEquation {
  private double a;
  private double b;
  private double c;
  //construtor para inicializar os coeficientes da equacao
  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  //metodo para calcular as raizes da eqaucao quadratica
  public QuadraticRoots calculateRoots() {
    double discriminant = calculateDiscriminant(); //calcula o discriminante (delta)
    double root1 = 0;
    double root2 = 0;
    boolean hasRealRoots = true;
    if (discriminant > 0) { //se delta > 0, ha daus raizes reais e distintas
      root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    } else if (discriminant == 0) { //se delta = 0, ha uma raiz real dupla
      root1 = -b / (2 * a);
      root2 = root1;
    } else { // se delta < 0,nao ha raizes reais 
      hasRealRoots = false;
    }
    //retorna um objeto QuadraticRoots com as raizes e o discriminante
    return new QuadraticRoots(root1, root2, hasRealRoots, discriminant);
  }
  //metodo para calcular o discriminante (delta)
  private double calculateDiscriminant() {
    return (b * b) - (4 * a * c); //formula para delta: b^2 - 4ac
  }
}