class Bill():
    id:str
    def __init__(self,id:str):
        self.id = id

    def _report(self,step):
        print('[bill:' + self.id + ' step:' + step + ']')

    def preProposal(self):
        pass

    def proposal(self):
        self._report("Proposal")

    def postProposal(self):
        pass

    def preCommittee(self):
        pass

    def committee(self):
        self._report("Committee Debate")
        self._report("Committee Vote")

    def postCommittee(self):
        pass

    def preFloor(self):
        pass

    def floor(self):
        self._report("Floor Debate")
        self._report("Floor Vote")

    def postFloor(self):
        pass

    def preSignoff(self):
        pass

    def signoff(self):
        self._report("Executive Sign-off")

    def postSignoff(self):
        pass

    def execute_workflow(self):
        self.preProposal()
        self.proposal()
        self.postProposal()

        self.preCommittee()
        self.committee()
        self.postCommittee()

        self.preFloor()
        self.floor()
        self.postFloor()

        self.preSignoff()
        self.signoff()
        self.postSignoff()

