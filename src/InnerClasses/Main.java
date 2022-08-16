package InnerClasses;

public class Main {

    public static void main(String[] args) {
        // Static nested classes
        // NonStatic nested class (Inner class)
        // Local class (Inner class defined inside a scope block)
        // Anonymous class (Nested class without a class name)

        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
    }
}
