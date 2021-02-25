from bill import Bill
from resolution import Resolution
from appropriation import Appropriation

if __name__ == "__main__":
    print("Here's a vanilla bill:")
    bill = Bill("1234")
    bill.execute_workflow()

    print('')
    print("Here's a resolution:")
    resolution = Resolution("5678")
    resolution.execute_workflow()

    print('')
    print("Here's an appropriation:")
    appropriation = Appropriation("5678")
    appropriation.execute_workflow()