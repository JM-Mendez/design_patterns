class Bill():
    id:str
    def __init__(self,id:str):
        self.id = id

    def _report(self,step):
        print('[bill:' + self.id + ' step:' + step + ']')

    def execute_workflow(self):
        self._report("Proposal")
        self._report("Committee Debate")
        self._report("Committee Vote")
        self._report("Floor Debate")
        self._report("Floor Vote")
        self._report("Executive Signoff")
