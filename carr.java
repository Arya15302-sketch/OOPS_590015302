class car {
    int modelYear;
    String modelName;
    public static void main(String[] args) {
        car myCar = new car();
        myCar.modelYear = 1969;
        myCar.modelName = "Mustang";
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
