import javax.swing.*;
import java.awt.*;

public class Main {

  public static void main(String[] args) {

    JFrame frame = new JFrame("Remote controller");
    JPanel panel = new JPanel(new GridLayout(2, 2)); //設定

    RemoteController tvController = new RemoteController(new TV());
    RemoteController acController = new RemoteController(new AirConditioner());

    //設定按鈕
    JButton tVOn = new JButton("TV on");
    tVOn.addActionListener(e -> tvController.turnOn());

    JButton tvOff = new JButton("TV off");
    tvOff.addActionListener(e -> tvController.turnOff());

    JButton tvUp = new JButton("TV channel +");
    tvUp.addActionListener(e -> tvController.up());

    JButton tvDown = new JButton("TV channel -");
    tvDown.addActionListener(e -> tvController.down());

    JButton acOn = new JButton("AC on");
    acOn.addActionListener(e -> acController.turnOn());

    JButton acOff = new JButton("AC off");
    acOff.addActionListener(e -> acController.turnOff());

    JButton acUp = new JButton("AC temperature +");
    acUp.addActionListener(e -> acController.up());

    JButton acDown = new JButton("AC temperature -");
    acDown.addActionListener(e -> acController.down());

    panel.add(tVOn);
    panel.add(tvOff);
    panel.add(tvUp);
    panel.add(tvDown);
    panel.add(acOn);
    panel.add(acOff);
    panel.add(acUp);
    panel.add(acDown);


    frame.add(panel); //新增各個按鈕到面板上
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //關閉方式
    frame.setSize(800, 200);  //設定視窗大小
    frame.setVisible(true); //將面板設為可見

  }

}
