from bill import Bill

class Resolution(Bill):

    def execute_workflow(self):
        self._report("Proposal")
        self._report("Committee Debate")
        self._report("Committee Vote")
        self._report("Floor Debate")
        self._report("Floor Vote")
