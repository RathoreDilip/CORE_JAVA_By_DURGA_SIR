package c_23_JVM_Architecture.c_03_MemoryAreasOfJVM;

public class HeapDemo {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        double mb=1024*1024;
        System.out.println("Max memory :: "+r.maxMemory()/mb);
        System.out.println("Total memory :: "+r.totalMemory()/mb);
        System.out.println("Free memory :: "+r.freeMemory()/mb);
        System.out.println("Consumed memory :: "+(r.totalMemory()-r.freeMemory())/mb);
    }
}
