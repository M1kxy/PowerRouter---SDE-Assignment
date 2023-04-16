# Take input from the user
task_queue = input("Enter the task queue as a list: ").split()
current_index = int(input("Enter the current index: "))
inactive_members = input("Enter the inactive members as a list: ").split()

# Remove inactive members from the task queue
active_members = task_queue[:current_index+1]
for member in inactive_members:
    while member in active_members:
        active_members.remove(member)
active_members_set = set(active_members)
filtered_queue = [member for member in task_queue if member in active_members_set]

# Find the new index of the current member
current_member = filtered_queue[current_index % len(filtered_queue)]
new_current_index = filtered_queue.index(current_member)

# Output the results
print("Filtered queue after removing the inactive members are",filtered_queue)
print("New current index is",new_current_index)
