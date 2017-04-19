package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {

		if(function.equals("앱"))
		{
			RunApp();
		}
		else{
			super.execute(function);}
	}

	@Override
	protected void playMusic() {

		this.DownplayMusic();
	}
	public void DownplayMusic(){
		System.out.println("다운로드해서 음악 재생");
	}
	public void RunApp()
	{
		System.out.println("앱실행");
	}

}
