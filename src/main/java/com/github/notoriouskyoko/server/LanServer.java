package com.github.notoriouskyoko.server;

import com.esotericsoftware.kryonet.Server;

import java.io.IOException;

public class LanServer {
   public  void startLanServer(){
       Server server = new Server();
       server.start();
       try {
           server.bind(54555, 54777);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
