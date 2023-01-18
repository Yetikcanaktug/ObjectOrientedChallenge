public class Person {
    public String name;
    public int age;
    public Eye leftEye;
    public Eye rightEye;
    public Heart heart;
    public Stomach stomach;
    public Skin skin;

    public Person(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }


    public Eye getRightEye() {
        return rightEye;
    }



    public Heart getHeart() {
        return heart;
    }



    public Stomach getStomach() {
        return stomach;
    }



    public Skin getSkin() {
        return skin;
    }


}
