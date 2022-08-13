import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> companyStack = new Stack<>();

        companyStack.push("GCNET");
        companyStack.push("SuperTech");
        companyStack.push("SuperLock");
        companyStack.push("Amandi");

        System.out.println("[BEFORE STACK]-> " + companyStack);

        String newCompanies = companyStack.pop(); // last element

        System.out.println("[LAST ITEM]-> " + newCompanies);
        System.out.println("[REMAINS AFTER POP] -> " + companyStack);
    }
}
