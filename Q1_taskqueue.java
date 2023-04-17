import java.util.*;

public class Q1_taskqueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs
        System.out.print("Enter the task queue as a list: ");
        List<String> taskQueue = Arrays.asList(scanner.nextLine().split(" "));
        System.out.print("Enter the current index: ");
        int currentIndex = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the active members as a list: ");
        List<String> activeMembers = Arrays.asList(scanner.nextLine().split(" "));

        // Filter task queue by active members
        Set<String> activeMembersSet = new HashSet<>(activeMembers);
        List<String> filteredQueue = new ArrayList<>();
        for (String member : taskQueue) {
            if (activeMembersSet.contains(member)) {
                filteredQueue.add(member);
            }
        }

        // Find the new index of the current member
        String currentMember = filteredQueue.get(currentIndex % filteredQueue.size());
        int newCurrentIndex = filteredQueue.indexOf(currentMember);

        // Output
        System.out.println("Filtered queue after filtering by active members are: " + filteredQueue);
        System.out.println("New current index is: " + newCurrentIndex);
    }
}

//Description
//We take task queue and current index and active members as an input as mentioned in the question
//
//Then A HashSet is created from the active members list to allow for fast membership testing. The program then iterates through 
//the task queue, and adds any member to the filtered queue if it is in the active members set

