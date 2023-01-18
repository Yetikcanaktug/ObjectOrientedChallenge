import java.util.Scanner;

public class Main {



    public static void main (String [] args){

        Person person = new Person("Brad", 25, new Eye("Left Eye", "Good","Blue",true),
                new Eye("Right Eye","There is some problems","Red",false), new Heart("Heart", "Good",65),new Stomach("Stomach",
                "Good",false),new Skin("Skin", "Soft", "Black", 23));

        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());

        Scanner scanner= new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Choose an organ" +"\n \t 1. Left Eye"
                    +"\n \t 2. Right Eye"
                    +"\n \t 3. Heart"
                    +"\n \t 4. Stomach"
                    +"\n \t 5. Skin"
                    +"\n \t 6. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    person.getLeftEye().getDetails();
                    if (person.getLeftEye().isOpened()) {
                        System.out.println("\t\t 1. Close the eye");
                        if (scanner.nextInt() == 1) {
                            person.getLeftEye().Close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("1. Open the eye");
                        if (scanner.nextInt() == 1) {
                            person.getLeftEye().Open();

                        }
                    }
                    break;
                case 2:
                    person.getRightEye().getDetails();
                    if (person.getRightEye().isOpened()) {
                        System.out.println("\t\t 1. Close the eye");
                        if (scanner.nextInt() == 1) {
                            person.getRightEye().Close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("1. Open the eye");
                        if (scanner.nextInt() == 1) {
                            person.getRightEye().Open();

                        }
                    }
                    break;
                case 3:
                    person.getHeart().getDetails();
                    System.out.println("1. Change Heart Rate: " );
                    if (scanner.nextInt() == 1){
                        System.out.println("Enter the new heart rate");
                        int newHeartRate = scanner.nextInt();
                        person.getHeart().setRate(newHeartRate);
                    }
                    else { continue;
                    }
                    break;
                case 4:
                    person.getStomach().getDetails();

                System.out.println("1. Digest ");
                        if (scanner.nextInt() == 1) {
                            person.getStomach().digest();
                        } else {
                            continue;
                        }
                        break;

                case 5:
                    person.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;



                        }
                    }

                    }

            }









