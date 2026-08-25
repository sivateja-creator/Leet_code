class ParkingSystem {
    int[] slots;

    public ParkingSystem(int big, int medium, int small) {
        slots = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        return slots[carType]-- > 0;
    }
}
