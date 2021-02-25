from logger import Logger

class FileDownloader():
    logger=None
    progressreporter = None
    def __init__(self,logger,progressreporter):
        self.logger = logger
        self.progressreporter=progressreporter

    def download(self,file):
        beginMessage = 'beginning load...'
        self.progressreporter.update(beginMessage)
        self.logger.info(beginMessage)

        for i in range(0, 10):
            message = 'percent complete' + str(i * 10)
            self.progressreporter.update(message)
            self.logger.info(message)

        endmessage = 'done with download'
        self.progressreporter.update(endmessage)
        self.logger.info(endmessage)