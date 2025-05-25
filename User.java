public class User {

  private double money;
  private String petNames;

  public User(double money, Pet[] pets) {
    this.money = money;
  }

  public double getMoney() {
    return money;
  }

  public void updatePets(Pet[] pets) {
    for (Pet pet : pets) {
      this.petNames += pet.getName() + ", ";
    }
  }

  public void purchase(double cost) {
    getMoney();
    money = money - cost;
  }

  public String getPets() {
    return petNames;
  }
  

  public String toString() {
    String result;
    result = "Money: $" + money;

    return result;
  }

}