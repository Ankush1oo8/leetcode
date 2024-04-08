public class studentLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        int sSandwich = 0;
        int cSandwich = 0;
        for (int choice : students) {
            if (choice == 1) {
                sSandwich++;
            } else {
                cSandwich++;
            }
        }
        for (int sw : sandwiches) {
            if (sw == 0 && cSandwich == 0) {
                return sSandwich;
            }
            if (sw == 1 && sSandwich == 0) {
                return cSandwich;
            }
            if (sw == 0) {
                cSandwich--;
            } else {
                sSandwich--;
            }
        }
        return 0;
    }
}