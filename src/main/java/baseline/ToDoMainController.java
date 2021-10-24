package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ToDoMainController {

    @FXML
    private Button EditListButton;

    @FXML
    private Button NewListButton;

    @FXML
    private Button RemoveListButton;

    @FXML
    private Button SaveListButton;

    @FXML
    private ListView<?> ToDoListsView;

    @FXML
    void addNewList(ActionEvent event) {
        //make new data table for todo list
        //take name
    }

    @FXML
    void editList(ActionEvent event) {
        //if list is selected
        //prompt user for new list name
    }

    @FXML
    void removeList(ActionEvent event) {
        //if list is selected
        //prompt user "are you sure?"
        //deleted data table for list
    }

    @FXML
    void saveList(ActionEvent event) {
        //if list is selected
        //prompt user for file location
        //copy data from data table into text file
    }

}


