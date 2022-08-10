package com.gmail.l.domelink.json_tel_bot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.lang.model.element.NestingKind;
import java.lang.reflect.Array;
import java.util.Arrays;

//"names": ["Max Verstappen","Lewis Hamilton","Valtteri Bottas","Sergio Perez","Carlos Sainz","Lando Norris","Charles Leclerc","Daniel Riccardo","Pierre Gasly","Fernando Alonso","Esteban Ocon","Sebastian Vettel","Lance Stroll","Yuki Tsunoda","George Russell"," Kimi Raikkonen","Nicolas Latifi","Antonio Giovinazzi","Mick Schumacher","Nikita Mazepin"],
//      "PilotsScores": [395.5, 387.5, 226, 190, 164.5, 160, 159, 115, 110, 81, 74, 43, 34, 32, 16, 10, 7, 3, 0, 0],
//"teams": ["Ferrari","Mercedes","RedBull Racing","McLaren","Alpine","AlphaTauri","AstonMarting Racing","Williams","Alfa Romeo","Haas F1 Team"],
//           "scores": [323.5, 613.5, 585.5, 275, 155, 142, 77, 23, 13, 0],

public class App {
 private static final String JSON_STRING =
         """
                         {
                           "seasons": 2021,
                           "teams": [
                           {
                           "name": "Mercedes",
                           "score": 613.5
                           },{
                           "name": "RedBull Racing",
                           "score": 585.5
                           }
                           ],
                           "pilots" : [
                           {
                           "name": "Max Verstappen",
                           "score": 395.5
                           },{
                           "name": "Lewis Hamilton",
                           "score": 387.5
                           }
                           ]
                         }
                 """;

 static class Team {
  String name;
  float score;

  @Override
  public String toString() {
   return "teams{" +
           "names='" + name + '\'' +
           ", TeamsScores='" + score + '\'' +
           '}';
  }
 }

 static class Pilot {
  String name;
  float score;

  @Override
  public String toString() {
   return "Pilots{" +
           "names='" + name + '\'' +
           ", PilotsScores='" + score + '\'' +
           '}';
  }
 }

 static class FormulaOneTask {
  int seasons;
  Team[] teams;
  Pilot[] pilots;

  @Override
  public String toString() {
   return "FormulaOneTask{" +
           "seasons=\"" + seasons + '\"' +
           ", Teams=" + teams +
           ", Pilots=" + pilots +
           '}';
  }
 }

 public static void main(String[] args) {
  Gson gson = new GsonBuilder().setPrettyPrinting().create();
  FormulaOneTask formulaOneTask = gson.fromJson(JSON_STRING, FormulaOneTask.class);
  System.out.println(formulaOneTask);

  String Json = gson.toJson(formulaOneTask);
  System.out.println(Json);

 }
}

