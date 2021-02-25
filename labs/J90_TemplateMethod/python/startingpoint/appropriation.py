from bill import Bill

class Appropriation(Bill):

    def execute_workflow(self):
        self._report("Proposal")
        self._report("Committee Debate")
        self._report("Committee Vote")
        self._report("Some other committee Debate")
        self._report("Some other committee Vote")
        self._report("Floor Debate")
        self._report("Floor Vote")
        self._report("Executive Signoff")
