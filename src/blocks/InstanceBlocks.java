package blocks;

public class InstanceBlocks {

    String empName;

    //Instance blocks
    {
        System.out.println("This is a instance block");
        empName = "Rocky";
    }

    public InstanceBlocks(){
        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {
        InstanceBlocks obj = new InstanceBlocks();
    }

}
