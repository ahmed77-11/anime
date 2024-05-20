package com.selim.anime.controllers;

import com.selim.anime.Beans.Anime;
import com.selim.anime.service.AnimeService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Date;

public class UpdateAnimeController {

    @FXML
    private Button cancelBtn;

    @FXML
    private TextField createAtTf;

    @FXML
    private TextField idTf;

    @FXML
    private TextField nameTf;

    @FXML
    private TextField typeTf;

    @FXML
    private Button updateBtn;
    AnimeService animeService=new AnimeService();
    public void setAnimeData(Anime anime) {
        idTf.setText(String.valueOf(anime.getId()));
        typeTf.setText(anime.getType());
        nameTf.setText(anime.getType());
        createAtTf.setText(String.valueOf(anime.getCreated_at()));
    }

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {
        int id=Integer.parseInt(idTf.getText());
        String type=typeTf.getText();
        String name=nameTf.getText();
        Anime anime=new Anime(id,name,type,new Date());
        boolean res=animeService.modifier(anime);
        if(res){
            System.out.println("Anime updated");
            Stage stage = (Stage) updateBtn.getScene().getWindow();
            stage.close();
        }
    }

}
