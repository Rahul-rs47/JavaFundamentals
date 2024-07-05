class Mark{

	private int English;
	private int Science;

	public int getEnglish(){
		return this.English;
	}


	public void  setEnglish(int englishMark) throws MOBException{

		//try{

			if(englishMark < 0 || englishMark > 100){
				throw new MOBException();
			}else{
				this.English = englishMark;
			}

		//}catch(MOBException e){

		//}
		
	}



	public static void main(String args[]) {

		try{

			Mark mark = new Mark();
			mark.setEnglish(1);

			System.out.println("English : " +  mark.getEnglish());

		}catch(MOBException e){

		}

		
	}
	
}