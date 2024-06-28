package _05_for_loops._2_badgers;

public class badgers {
    public static void main(String[] args) {
        
for(int z=0;z<2;z+=1){
    for(int x=0;x<12;x+=1){
        System.out.print("Badger");
        if (x<11) {
            System.out.print(", ");
    
        }
        

    }
    System.out.println();
    for(int n=0;n<2;n+=1){
        System.out.print("Mushroom");
        if (n<1) {
            System.out.print(", ");
        }
    }
    System.out.println();

}
System.out.print("A Snake!!!");
}
}