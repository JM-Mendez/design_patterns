from logger import Logger
from progressreporter import ProgressReporter
from filedownloader import FileDownloader

logger = Logger()
reporter = ProgressReporter()

downloader = FileDownloader()
downloader.onUpdate.subscribe(reporter.update)
downloader.onUpdate.subscribe(logger.info)

downloader.download("http://example.com/somefile.txt")