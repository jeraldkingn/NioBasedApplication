public class NioService {
	
	private NioInterface nioInterface;

	public NioService(NioInterface nioInterface) {
		this.nioInterface = nioInterface;
	}
	
	public static NioService getInterfaceObj(){
        return new NioService(new NioImpl());
    }
	
	public int lineCharCount(int lineNumber) {
		return nioInterface.lineCharCount(lineNumber);
	}
	
	public void sortAlphabetically() {
		nioInterface.sortAlphabetically();
	}

	public void totalLines() {
		nioInterface.totalLines();
	}
	public void totalLineCount() {
		nioInterface.totalLineCount();
	}
}
