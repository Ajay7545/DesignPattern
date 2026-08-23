import ObserverDP.User;
import ObserverDP.YoutubeChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    YoutubeChannel javaChannel = new YoutubeChannel();
    YoutubeChannel pythonLearn = new YoutubeChannel();
    User user1= new User("Ajay",javaChannel);
    User user2= new User("Riya",pythonLearn);
    javaChannel.subscriber(user1);
    pythonLearn.subscriber(user2);

    // 4. Trigger event -> Uploading a video notifies both subscribers
    System.out.println("--- First Video Upload ---");
    javaChannel.uploadVideo("Java Design Patterns Tutorial");
    pythonLearn.uploadVideo("learn python");


    System.out.println("In main after end Observer DP");

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

}
