;public class Main {
    public static void main(String[] args) {
        //Задача№1
        byte age = 18;
        System.out.print("Если возраст человека равен или больше 18, то ");
        if (age >= 18) {
            System.out.print("он совершеннолетний.");
        } else {
            System.out.print("он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задание№2
        byte temperature = 5;
        System.out.println("На улице " + temperature + " градусов, ");//почему-то этот вывод пишется слитно с прошлыми.
        if (temperature <= 5) {
            System.out.print("оденьте шапку.");
        } else {
            System.out.print("можно идти без шапки");
        }
        //Задание№3
        byte kmH = 60;
        System.out.println("Если скорость " + kmH + ", то ");
        if (kmH <= 60) {
            System.out.print("можно ездить спокойно.");
        } else {
            System.out.print("придётся заплатить штраф.");
        }
        //Задание№4
        System.out.println("Если возраст человека равен " + age + ", то ");
        if (age > 2 && age < 6) {
            System.out.println("ему нужно ходить в детский сад.");
        }
        if (age > 7 && age < 8) {
            System.out.println("ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24) {
            System.out.println("его место в университете.");
        } else {
            System.out.println("ему пора ходить на работу.");
        }
        //Задача№5
        System.out.println("Если возраст равен " + age + ", то ");
        if (age < 5) {
            System.out.println("он не может кататься на аттракционе.");
        }
        if (age > 5 && age < 14) {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("он может кататься без сопровождения.");
        }
        //Задание№5
        byte capacity = 102;
        byte seats = 60;
        int stand = capacity - seats;
        byte piple = 102;
        System.out.println("В вагоне ");
        if ( piple < seats ) {
            System.out.println(seats - piple + "сидячих мест.");
        }
            else {
            System.out.println(capacity - piple + "стоячих мест");//не понимаю как сделать так что бы при выводе она исчезала.
        }
            if ( piple == capacity ){
            System.out.println("нет места.");
        }
        //Задание№7
        int one = 1;
        int two = 4;
        int three = 3;
        if ( one < two && one < three ) {
            System.out.println("число " + one + " меньше чем " + two + " и " + three );
            if ( two < three && two > one ) {
                System.out.println("Число " + two + " Больше чем " + one + " и меньше чем " + three );
            }
            else {
                System.out.println("Число " + two + " больше чем остальные ");
            }
        }

        //Пока оставлю так, я прям совсем не понимаю как нужно сделать Задачу№7. остальное отдаю на проверку.
    }


}