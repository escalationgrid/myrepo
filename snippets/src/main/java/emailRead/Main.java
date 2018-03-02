package emailRead;

import java.util.List;

/**
 * Read emails from Gmail
 * Filter by Subject:  
 *   Json CEF:  -> "\"CEF Event\""  (including quotes)
 *   Cycle   :  -> "Chamado"
 *
 * The EG version is a better one!
 */
public class Main {

	public static void main(String[] args) {
		
		List<String> messages = new ReadEmail().readEmails();
	}

}
