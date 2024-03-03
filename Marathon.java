public class Marathon {
    private String[] name;
    private final int[] minutes;

    public Marathon(String[] nameArray, int[] minutesArray) {
        this.name = nameArray;
        this.minutes = minutesArray;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] nameArray) {
        name = nameArray;
    }

    public void print() {
        System.out.println("Birinci : " + getNameFirst() + " " + getFirst() + "'");
        System.out.println("İkinci : " + getNameSecond() + " " + getSecond() + "'");
        System.out.println("Üçüncü : " + getNameThird() + " " + getThird() + "'");

        sorting();
    }

    public int getFirst() {
        //find the first minute
        int maxMinute = minutes[0];

        for (int minute : minutes) {
            if (minute < maxMinute)
                maxMinute = minute;
        }
        return maxMinute;
    }

    public int getSecond() {
        //find the second minute
        int first = getFirst();
        int secondMinute = minutes[0];

        for (int minute : minutes) {
            if (minute < secondMinute && minute > first)
                secondMinute = minute;
        }
        return secondMinute;
    }

    public int getThird() {
        //find the third minute
        int second = getSecond();
        int thirdMinute = minutes[0];

        for (int minute : minutes) {
            if (minute < thirdMinute && minute > second)
                thirdMinute = minute;
        }
        return thirdMinute;
    }

    public void sorting() {
        //sort by minute
        int sortingA = 0, sortingB = 0, sortingC = 0;

        for (int minute : minutes) {
            if (minute >= 200 && minute <= 299)
                sortingA++;
            if (minute >= 300 && minute <= 399)
                sortingB++;
            if (minute >= 400)
                sortingC++;
        }

        System.out.println("A →\t" + sortingA);
        System.out.println("B →\t" + sortingB);
        System.out.println("C →\t" + sortingC);
    }

    public String getNameFirst() {
        //find the first name
        int first = getFirst();
        int num1 = 0;

        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == first)
                num1 = i;
        }

        return name[num1];
    }

    public String getNameSecond() {
        //find the second name
        int second = getSecond();
        int num2 = 0;

        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == second)
                num2 = i;
        }

        return name[num2];
    }

    public String getNameThird() {
        //find the third name
        int third = getThird();
        int num3 = 0;

        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == third)
                num3 = i;
        }
        return name[num3];
    }
}