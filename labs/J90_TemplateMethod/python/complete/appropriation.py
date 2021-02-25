from bill import Bill

class Appropriation(Bill):

    def postCommittee(self):
        self._report("Some *other* committee Debate")
        self._report("Some *other* committee Vote")

