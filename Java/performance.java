class CPU {

    int price;

    
    CPU(int price) {
        this.price = price;
    }

    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int cores, String manu) {
            noOfCores = cores;
            manufacturer = manu;
        }

        void display() {
            System.out.println("Processor Cores: " + noOfCores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }


    class RAM {
        int memory;
        String manufacturer;

        RAM(int mem, String manu) {
            memory = mem;
            manufacturer = manu;
        }

        void display() {
            System.out.println("RAM Size: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }
}

public class  performance{
    public static void main(String[] args) {

        CPU cpu = new CPU(45000);

        
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = cpu.new RAM(16, "Corsair");

       
        System.out.println("CPU Price: " + cpu.price);
        System.out.println("---- Processor Info ----");
        processor.display();

        System.out.println("---- RAM Info ----");
        ram.display();
    }
}
