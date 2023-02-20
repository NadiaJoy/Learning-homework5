public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void getNumber() {
        System.out.println("The model of this phone: " + this.model);

    }

}