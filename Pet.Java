public class Pet {
  private String furColor;
  private String name;
  private String type;
  private double cost = 25.00;

  public Pet (String color, String name, String type) {
    this.furColor = color;
    this.name = name;
    this.type = type;
  }

  public double getCost() {
    return cost;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public String getColor() {
    return furColor;
  }

  public String toString() {
    return "Your " + type + ", " + name + ", has " + furColor + " fur.";
  }
}