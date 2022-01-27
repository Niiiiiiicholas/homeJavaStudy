package ru.newStudy.homeJava.extendsAndPolymorphism.Lesson2;

public enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);
    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public String getDescription() {
        switch (this) {
            case XXS:
                return "Детский размер";
            default:
                return "Взрослый размер";
        }
    }
    public int getEuroSize() {
        return euroSize;
    }
}

