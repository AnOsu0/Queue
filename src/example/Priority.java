package example;

public enum Priority {
    LOW, MODERATE, HIGH;

    public static Priority fromInt(int x){
        Priority[] values = Priority.values();
        for (Priority value : values) {
            if (x == value.ordinal()){
              return value;
            }
        }
        throw new IllegalArgumentException("Nie ma takiego priorytetu");
    }
}
