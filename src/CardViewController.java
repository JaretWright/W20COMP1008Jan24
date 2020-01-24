import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CardViewController implements Initializable {

    @FXML
    private ImageView cardImageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //we want to load a card image
        //1.  we need an ImageView object to hold the Card image (think of it as a picture frame holding a picture)
        //2.  we need the Card object to give us an image
        Image cardImage = new Image("./images/3_of_clubs.png");
        cardImageView.setImage(cardImage);
    }



}
