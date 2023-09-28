public class Main {
	
	static Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Esto es un logger de debugging");
		log.info("Esto es un logger de INFO");

	}
}