package tk.drwrong.server.osgi;

public class HelloWorldSvcImpl implements IHelloWorldSvc {

	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello " + name + ", server service great you" );
	}
	
	public void init(){
		System.out.println("the server started: " + this.getClass().getName());
	}

}
