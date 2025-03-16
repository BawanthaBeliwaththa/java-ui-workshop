/*
In this code :

1.) "Machines" word is the number of machines available
2.) "max_cap" word is the Max capactiy that we have in this system
3.) "total_power" word is the Total power that the machines can have as the total
4.) "load1" to "load5" words are used to identify the numbers of machines and make each of them are in an array
5.) "load" word is the total load that the machines are having
6.) "optimal_load" word is used to calculate the optimal load of machines
7.) "over_loaded" word is used for recognizing that the system is gone overloaded
8.) "adjusted" word is th adjusted power of new machine inputs
*/

//We have to import the Scanner class to input user values
import java.util.Scanner;

public class assignment_sem01{

    public static void main(String[] args) {
        int Machines = 5;

        //input the max capacity of sysstem
        Scanner mx = new Scanner(System.in);
        System.out.print("What is the max capacity of the system : ");
        int max_cap = mx.nextInt();

        //Input the total power of system
        Scanner tp = new Scanner(System.in);
        System.out.print("What is the total power of system : ");
        int total_power = tp.nextInt();

        //Input the machine loads
        Scanner al1 = new Scanner(System.in);
        System.out.print("Input the load of machine number 01 : ");
        int load1 = al1.nextInt();

        Scanner al2 = new Scanner(System.in);
        System.out.print("Input the load of machine number 02 : ");
        int load2 = al2.nextInt();

        Scanner al3 = new Scanner(System.in);
        System.out.print("Input the load of machine number 03 : ");
        int load3 = al3.nextInt();

        Scanner al4 = new Scanner(System.in);
        System.out.print("Input the load of machine number 04 : ");
        int load4 = al4.nextInt();

        Scanner al5 = new Scanner(System.in);
        System.out.print("Input the load of machine number 05 : ");
        int load5 = al5.nextInt();

        //Listing all machine loads to one list
        int[] load = {load1, load2, load3, load4, load5};

        //Calculate the total required power
        double required_power = load1+load2+load3+load4+load5;

        // Check if the total required power exceeds the available power
        if (required_power > total_power) {
            // Calculate the optimal load distribution
            double[] optimal_load = new double[Machines];
            for (int i = 0; i < Machines; i++) {
                optimal_load[i] = (load[i] / required_power) * total_power;
            }

            //Display the optimal load distribution
            System.out.println("Optimal Loads are adjusted to these values as listed:");
            arryy(optimal_load);
            if (over_loaded(optimal_load, max_cap)) {
                optimal_load = adjusted(optimal_load, total_power, max_cap);
                System.out.println("Adjusted to these states:");
                arryy(optimal_load);
            }
        } else {
            System.out.print("Congrats, No Adjustment Needed Your loads are : ");
            System.out.print(load1+load2+load3+load4+load5);
            System.out.println(" and they are not bigger than the total power : "+total_power);
        }

    }

    public static double sum(double[] arr) {
        double total = 0;
        for (double num : arr) {
            total += num;
        }
        return total;
    }

    //check for overloads
    public static boolean over_loaded(double[] loads, double max_cap) {
        for (double load : loads) {
            if (load > max_cap) {
                return true; // Overloaded
            }
        }
        return false; // No overload
    }

    // Method to adjust loads to prevent overloads
    public static double[] adjusted(double[] loads, double total_power, double max_cap) {
        double remain = total_power - sum(loads);

        for (int i = 0; i < loads.length; i++) {
            if (loads[i] > max_cap) {
                double excess = loads[i] - max_cap;
                loads[i] = max_cap; // Cap the load
                remain += excess; // Add excess back to remaining power
            }
        }

        // Redistribute any remaining power
        if (remain > 0) {
            double addit = remain / loads.length;
            for (int i = 0; i < loads.length; i++) {
                loads[i] = Math.min(loads[i] + addit, max_cap); // Ensure no overload
            }
        }

        return loads;
    }

    public static void arryy(double[] arr) {
        for (double num : arr) {
            System.out.printf("Machine load of machine ("+")"+"%.2f \n", num);
        }
        System.out.println();
    }
}
