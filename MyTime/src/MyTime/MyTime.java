/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTime;

/**
 *
 * @author User
 */

public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public MyTime(int hours, int minutes, int seconds, boolean meridian) {
        hours = clamp(hours, 23, 0);
        minutes = clamp(minutes, 59, 0);
        seconds = clamp(seconds, 59, 0);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = hours > 12 ? false : meridian;
    }

    public static void main(String[] args){
        MyTime time = new MyTime(24, 59, 59, true);
        time.displayTime12();
        time.displayTime24();
        time.advanceTime(200);
        time.displayTime12();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours > 12 || hours < 1) hours = 12;
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes > 59 || minutes < 0) minutes = 0;
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds > 59 || seconds < 0) seconds = 0;
        this.seconds = seconds;
    }

    public String getMeridian() {
        return meridian ? "AM" : "PM";
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }
    
    public void advanceTime(int seconds){
        for(int i = 0 ; i < seconds; i++){
            tickBySecond();
        }
    }
    
    public void tickBySecond(){
        if(this.seconds + 1 > 59){
            this.seconds = 0;
            tickByMinute();
        }else{
            this.seconds++;
        }
    }
    
    public void tickByMinute(){
        if(this.minutes + 1 > 59){
            this.minutes = 0;
            tickByHour();
        }else{
            this.minutes++;
        }
    }
    
    public void tickByHour(){
        if(this.hours > 23){
            this.hours = 1;
            this.meridian = false;
        }else{
            this.hours++;
        }
        if(this.hours > 11){
            this.meridian = false;
        }
        this.meridian = this.hours > 11 ? false : true;
    }
    
    public void displayTime12(){
        System.out.println(this.hours % 12 +":"+ this.minutes +":"+ this.seconds+":"+getMeridian());
    }
    
    public void displayTime24(){
        System.out.println(this.hours +":"+ this.minutes +":"+ this.seconds);
    }

    private int clamp(int number, int max, int min){
        return Math.max(min, Math.min(max, number));
    }
}
