import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameOfWarViewController implements Initializable {

    @FXML
    private ImageView p1BackOfDeckImageView;

    @FXML
    private ImageView p1CardImageView;

    @FXML
    private ImageView p2CardImageView;

    @FXML
    private ImageView p2BackOfDeckImageView;

    @FXML
    private Label p1CardCountLabel;

    @FXML
    private Label p2CardCountLabel;
    private GameOfWar game;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        p1BackOfDeckImageView.setImage(new Image("./images/backOfCard.png"));
        p2BackOfDeckImageView.setImage(new Image("./images/backOfCard.png"));

        game = new GameOfWar();
        p1CardCountLabel.setText(String.format("P1 Card Count: %d",game.getP1CardCount()));
        p2CardCountLabel.setText(String.format("P2 Card Count: %d",game.getP2CardCount()));
    }

    /**
     * This method will play a "hand" when the button is pushed
     */
    public void playHandButtonPushed()
    {
//        p1CardImageView.setImage(game.getP1TopCard().);
    }
}

