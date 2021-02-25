from event import Event

class FileDownloader():
    onUpdate = None

    def __init__(self):
        self.onUpdate = Event()

    def download(self,file):
        self.onUpdate.notify('beginning load...')

        for i in range(0, 10):
            self.onUpdate.notify('percent complete' + str(i * 10))

        self.onUpdate.notify('done with download')
