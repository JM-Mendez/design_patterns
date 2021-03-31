package TemplateMethodComplete;

public class App {

    public static void main(String[] args) {
        System.out.println("Here's a vanilla bill:");
        new Bill("123").processWorkflow();
        System.out.println();

        System.out.println("Here's a resolution:");
        new Resolution("1932").processWorkflow();
        System.out.println();

        System.out.println("Here's an appropriation:");
        new Appropriation("HR212").processWorkflow();
        System.out.println();   
    }


}
