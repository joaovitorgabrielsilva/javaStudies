package application;

public class ProgramFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*USING SCANNER

		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			if (sc!=null)
				sc.close();
		}
		*/
		
		/*USING FILE READER/BUFFERED READER 1ST APPROACH
		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
			if (br!=null)
				br.close();
			if (fr!=null)
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		*/
		
		
		/*USING TRY-WITH-RESOURCES WITH BUFFEREDREADER FILEREADER
		String path = "c:\\temp\\in.txt";
		try(BufferedReader br2 = new BufferedReader(new FileReader(path))) {
			String line = br2.readLine();
		
			while(line != null) {
				System.out.println(line);
				line = br2.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		*/
		
		
		/* USING BUFFERED WRITER FILE WRITER
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\temp\\out.txt";
		
		//With this instanciation we create or recreate the file
		//To just add the text, we must use ( path, true) in FileWriter constructor
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		/*Creating and acessing files and folders
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: "+success);;
	
	
		sc.close();
		
		*/
		
		
		/*Modules with informations of File
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());

		sc.close();
		*/
	}

}

