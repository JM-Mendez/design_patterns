from logger import Logger
from progressreporter import ProgressReporter
from filedownloader import FileDownloader

logger = Logger()
reporter = ProgressReporter()
downloader = FileDownloader(logger,reporter)

downloader.download("http://example.com/somefile.txt")