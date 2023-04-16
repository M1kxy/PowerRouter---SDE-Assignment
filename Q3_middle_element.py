class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        
def getMiddle(head):
    slow_ptr = head
    fast_ptr = head
    
    # Move fast_ptr two steps ahead of slow_ptr until it reaches the end of the linked list
    while fast_ptr is not None and fast_ptr.next is not None:
        slow_ptr = slow_ptr.next
        fast_ptr = fast_ptr.next.next
        
    # If the number of nodes is odd, the slow_ptr points to the middle node
    # If the number of nodes is even, the slow_ptr points to the second middle node
    return slow_ptr.data

# Create a singly linked list from user input
n = int(input("Enter the number of nodes: "))
head = None
current = None
for i in range(n):
    data = int(input(f"Enter the value for node {i+1}: "))
    node = Node(data)
    if head is None:
        head = node
        current = node
    else:
        current.next = node
        current = node

# Display the original linked list
print("The original linked list is:")
current = head
while current is not None:
    print(current.data, end=" ")
    current = current.next

# Find the middle element of the linked list
middle = getMiddle(head)
print("\n\nThe middle element is:", middle)
