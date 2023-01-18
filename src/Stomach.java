public class Stomach extends Organ{

    private boolean isEmpty;
    public Stomach(String name, String medicalCondition,boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty();
    }

    public void digest() {
        System.out.println("Digesting begin");
    }
    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty == false) {

            System.out.println("Let's give him some food");
        }
        else
        {
            System.out.println("Already filled.");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    }

