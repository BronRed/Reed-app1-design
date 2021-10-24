package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

public class ToDoItemsController {

    @FXML
    private Button AddItemButton;

    @FXML
    private Tab AllItemsTab;

    @FXML
    private Tab CompletedItemsTab;

    @FXML
    private Button EditItemButton;

    @FXML
    private Button RemoveItemButton;

    @FXML
    void addItem(ActionEvent event) {
        //add new item to data table
        //prompt user for item description
        //prompt user for due date
        //prompt user for completed
    }

    @FXML
    void editItem(ActionEvent event) {
        //if item is selected
        //prompt user for new item description
        //prompt user for new due date
        //prompt user for completed
    }

    @FXML
    void removeItem(ActionEvent event) {
        //if item is selected
        //ask "are you sure?"
        //delete item from data table
    }

    @FXML
    void showAllItems(ActionEvent event) {
        //switch tab view
        //find all data in data table
        //show all data
    }

    @FXML
    void showCompletedItems(ActionEvent event) {
        //switch tab view
        //find data with tag "completed"
        //show data with tag
    }

}

