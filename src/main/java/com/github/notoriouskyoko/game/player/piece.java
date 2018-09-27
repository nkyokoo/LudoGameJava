package com.github.notoriouskyoko.game.player;

public class piece {
    private String _id = "";
    private String content = "";
    private String Position = "";
    private boolean isHome = true;
    private String homeID =  "";

    public void setPosition(String position) {
        Position = position;
    }

    public void setContent(String color) {
        this.content = color;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setHome(boolean home) {
        isHome = home;
    }

    public void setHomeID(String homeID) {
        this.homeID = homeID;
    }

    public String get_id() {
        return _id;
    }

    public String getContent() {
        return content;
    }

    public String getHomeID() {
        return homeID;
    }

    public String getPosition() {
        return Position;
    }

    public boolean isHome() {
        return isHome;
    }


}
