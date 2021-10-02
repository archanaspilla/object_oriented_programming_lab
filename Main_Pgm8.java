/* Create class ‘CPU’ with attribute price. Create inner class Processor (no. of cores,
manufacturer) and static nested class RAM (memory, manufacturer). Create an object
of CPU and print information of Processor and RAM.*/

class CPU {
    double price;
    class Processor{
	double no_of_cores;
               String manufacturer;

               double getCache(){
               	return 4.3;
               }
    }
    static class RAM{
	double memory;
        	String manufacturer;

       	 double getClockSpeed(){
          	  return 5.5;
       	 }
    }
}
public class Main_Pgm8 {
    public static void main(String[] args) {
    CPU cpu = new CPU();
    CPU.Processor processor = cpu.new Processor();
    CPU.RAM ram = new CPU.RAM();
    System.out.println("Processor Cache = " + processor.getCache());
    System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}