public class QuadraticRoots {
  private double root1;
  private double root2;
  private boolean hasRealRoots;
  private double discriminant;
  //construtor para inicializar as raizes e o discriminante 
  public QuadraticRoots(double root1, double root2, boolean hasRealRoots, double discriminant) {
    this.root1 = root1;
    this.root2 = root2;
    this.hasRealRoots = hasRealRoots;
    this.discriminant = discriminant;
  }
  //metodo para exibir as raizes calculadas e o valor de delta
  public void displayRoots() {
    System.out.println("O valor de delta (discriminante) é: " + discriminant);
    if (hasRealRoots) { //se ha raizes reais
      if (root1 == root2) { //se as raizes sao iguais
        System.out.println("A equação tem uma raiz real:");
        System.out.println("Raiz:" + root1);
      } else { //se as raizes sao diferentes
        System.out.println("A equação tem duas raízes reais e distintas:");
        System.out.println("Raiz 1: " + root1);
        System.out.println("Raiz 2: " + root2);
      }
    } else { //se nao ha raizes reais
      System.out.println("A equação não tem raízes reais.");
    }
  }
}