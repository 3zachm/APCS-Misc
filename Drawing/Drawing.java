import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Drawing extends JComponent {
    private static final long serialVersionUID = 1L; // IDE wanted an ID, verifies sender/reciever of object
    @Override // Overrides a method declaration, not needed here but used anyways
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // other colors used are created directly in setColor
        Color sepGray = new Color(242, 242, 242);
        Color scBar = new Color(40, 40, 40);
        Color selected = new Color(24, 131, 215);
        Color cprog = new Color(194, 194, 194);
        Color progtext = new Color(179, 179, 179);
        Color spotifyc = new Color(29, 185, 84);
        Font sysfont = new Font("Segoe UI", Font.PLAIN, 12);
        // background
        Rectangle background = new Rectangle(0, 0, 1000, 800);
        g2.setColor(Color.WHITE);
        g2.fill(background);
        g2.draw(background);
        //windows taskbar base
        Rectangle taskbar = new Rectangle(0, 720, 1000, 40); // 760 is the base of the window visually, not 800
        g2.setColor(Color.BLACK);
        g2.fill(taskbar);
        g2.draw(taskbar);
        // clock date
        g2.setFont(sysfont);
        g2.setColor(Color.WHITE);
        g2.drawString("12:48 PM", 900, 735);
        g2.drawString("5/10/2019", 900, 753);
        // win
        int x3Vals1[] = {12, 12, 25};
        int y3Vals1[] = {737, 742, 732}; //753
        Polygon back3Pl = new Polygon(x3Vals1, y3Vals1, 3);
        g2.fill(back3Pl);
        g2.draw(back3Pl);
        int x4Vals1[] = {25, 25, 12};
        int y4Vals1[] = {733, 748, 744};
        Polygon back4Pl = new Polygon(x4Vals1, y4Vals1, 3);
        g2.fill(back4Pl);
        g2.draw(back4Pl);
        g2.setColor(Color.BLACK);
        g2.drawLine(18, 732, 18, 749);
        g2.drawLine(12, 740, 25, 740);

        // NOTEPAD

        // notepad separator
        Rectangle nSeparator = new Rectangle(0, 41, 1000, 2); 
        g2.setColor(sepGray);
        g2.fill(nSeparator);
        g2.draw(nSeparator);
        // notepad options
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, // sets preference for text rendering algorithim
        RenderingHints.VALUE_ANTIALIAS_ON); //enables antialiasing
        g2.setFont(sysfont);
        g2.setColor(Color.BLACK);
        g2.drawString("DrawingTester.java - Notepad", 24, 20);
        g2.drawString("File", 10, 38); 
        g2.drawString("Edit", 40, 38);
        g2.drawString("Format", 70, 38);
        g2.drawString("View", 120, 38);
        g2.drawString("Help", 155, 38);
        // contents
        g2.setFont(new Font("Consolas", Font.PLAIN, 16));
        g2.drawString("import javax.swing.JFrame;", 2, 57);
        g2.drawString("public class DrawingTester {", 2, 77);
        g2.drawString("   public static void main(String[]args) {", 2, 97);
        g2.drawString("      JFrame frame = new JFrame();", 2, 117);
        g2.drawString("      frame.setSize(1000, 800);", 2, 157);
        g2.drawString("      frame.setTitle(\"VM\");", 2, 177);
        g2.drawString("      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);", 2, 197);
        g2.drawString("      Drawing picture = new Drawing();", 2, 237);
        g2.drawString("      frame.add(picture);", 2, 257);
        g2.drawString("      frame.setVisible(true);", 2, 277);
        g2.drawString("   }", 2, 297);
        g2.drawString("}", 2, 317);
        // exit
        Rectangle nExit1 = new Rectangle(0, 0, 14, 1);
        AffineTransform back = g2.getTransform(); // used to return to old settings if needed
        g2.setColor(Color.BLACK);
        g2.translate(957, 18); // origin to rotate around
        g2.rotate(Math.toRadians(45.d));
        g2.draw(nExit1); 
        g2.setTransform(back);
        Rectangle nExit2 = new Rectangle(0, 0, 13, 1);
        g2.translate(956, 27); 
        g2.rotate(Math.toRadians(-45.d));
        g2.draw(nExit2); 
        g2.setTransform(back);
        // expand
        Rectangle nMax1 = new Rectangle(914, 17, 8, 8);
        Rectangle nMax2 = new Rectangle(912, 19, 8, 8);
        g2.setColor(Color.BLACK);
        g2.draw(nMax1);
        g2.draw(nMax2);
        g2.setColor(Color.WHITE);
        g2.fill(nMax2); 
        g2.setColor(Color.BLACK);
        g2.draw(nMax2);
        // minimize
        g2.drawLine(865, 22, 875, 22);

        // SPOTIFY

        // window
        Rectangle spotify = new Rectangle(450, 275, 500, 400);
        g2.fill(spotify);
        g2.draw(spotify);
        // bottom bar
        Rectangle sBar = new Rectangle(450, 625, 500, 50);
        g2.setColor(scBar);
        g2.fill(sBar);
        g2.draw(sBar);
        // pause outline
        Double pause = new Ellipse2D.Double(683, 633, 25, 25);
        g2.setColor(progtext);
        g2.draw(pause);
        // pause bars
        Rectangle pBar = new Rectangle(691, 641, 9, 9);
        g2.fill(pBar);
        g2.draw(pBar);
        Rectangle pSep = new Rectangle(694, 641, 3, 9);
        g2.setColor(scBar);
        g2.fill(pSep);
        g2.draw(pSep);
        // progress indicator
        Rectangle progressback = new Rectangle(639, 665, 115, 4);
        g2.setColor(new Color(67, 67, 67));
        g2.fill(progressback);
        g2.draw(progressback);
        Double rPcback = new Ellipse2D.Double(754, 665, 4, 4);
        g2.fill(rPcback);
        g2.draw(rPcback);
        Rectangle progress = new Rectangle(639, 665, 69, 4);
        g2.setColor(cprog);
        g2.fill(progress);
        g2.draw(progress);
        Double lPc = new Ellipse2D.Double(635, 665, 4, 4);
        g2.fill(lPc);
        g2.draw(lPc);
        Double rPc = new Ellipse2D.Double(700, 665, 4, 4);
        g2.fill(rPc);
        g2.draw(rPc);
        // progress time
        g2.setColor(progtext);
        g2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        g2.drawString("2:31", 605, 670);
        g2.drawString("4:29", 770, 670);
        // controls
        int xVals1[] = {655, 660, 660};
        int yVals1[] = {645, 649, 641};
        Polygon backPl = new Polygon(xVals1, yVals1, 3);
        g2.fill(backPl);
        g2.draw(backPl);
        Rectangle backPl2 = new Rectangle(654, 641, 1, 8);
        g2.draw(backPl2);
        int x2Vals1[] = {735, 730, 730};
        int y2Vals1[] = {645, 649, 641};
        Polygon fowardPl = new Polygon(x2Vals1, y2Vals1, 3);
        g2.fill(fowardPl);
        g2.draw(fowardPl);
        Rectangle fowardPl2 = new Rectangle(735, 641, 1, 8);
        g2.draw(fowardPl2);
        // volume
        Rectangle volume = new Rectangle(839, 650, 80, 4);
        g2.setColor(new Color(67, 67, 67));
        g2.fill(volume);
        g2.draw(volume);
        Rectangle volumeL = new Rectangle(839, 650, 65, 4);
        g2.setColor(cprog);
        g2.fill(volumeL);
        g2.draw(volumeL);
        Double volumelPc = new Ellipse2D.Double(835, 650, 4, 4);
        g2.fill(volumelPc);
        g2.draw(volumelPc);
        Double volumerPc = new Ellipse2D.Double(918, 650, 4, 4);
        g2.setColor(new Color(67, 67, 67));
        g2.fill(volumerPc);
        g2.draw(volumerPc);
        g2.setColor(cprog);
        g2.drawLine(819, 650, 820, 650);
        g2.drawLine(820, 650, 822, 648);
        g2.drawLine(822, 648, 822, 654);
        g2.drawLine(822, 654, 820, 652);
        g2.drawLine(820, 652, 819, 652);
        g2.drawLine(819, 652, 819, 650);
        Double volumeS = new Ellipse2D.Double(823, 648, 4, 5);
        g2.draw(volumeS);
        Rectangle volumeSf = new Rectangle(823, 648, 2, 6);
        g2.setColor(scBar);
        g2.fill(volumeSf);
        g2.draw(volumeSf);
        // plus
        Rectangle add1 = new Rectangle(583, 640, 9, 1);
        g2.setColor(progtext);
        g2.draw(add1);
        Rectangle add2 = new Rectangle(587, 636, 1, 9);
        g2.draw(add2);
        // album
        Rectangle album = new Rectangle(460, 634, 30, 30);
        g2.setColor(Color.BLACK);
        g2.fill(album);
        g2.draw(album);
        Double cd = new Ellipse2D.Double(462, 636, 26, 26);
        g2.setColor(progtext);
        g2.draw(cd);
        Double cd2 = new Ellipse2D.Double(472, 646, 6, 6);
        g2.setColor(progtext);
        g2.draw(cd2);
        // sidebar
        Rectangle sideBar = new Rectangle(450, 475, 150, 149);
        g2.setColor(new Color(18, 18, 18));
        g2.fill(sideBar);
        g2.draw(sideBar);
        // separator for sidebar
        Rectangle siderBarSep = new Rectangle(450, 570, 150, 2);
        g2.setColor(new Color(27, 27, 27));
        g2.fill(siderBarSep);
        g2.draw(siderBarSep);
        // sidebar +
        Double addPlay = new Ellipse2D.Double(467, 588, 21, 20);
        g2.setColor(progtext);
        g2.draw(addPlay);
        Rectangle addPlus1 = new Rectangle(473, 597, 9, 1);
        g2.draw(addPlus1);
        Rectangle addPlus2 = new Rectangle(477, 593, 1, 9);
        g2.draw(addPlus2);
        // add playlist text
        g2.setFont(sysfont);
        g2.drawString("New Playlist", 495, 602);
        // playlist lines
        g2.setColor(new Color(32, 32, 32));
        int x = 620;
        for (int i = 0; i < 5; i++) { 
            g2.drawLine(640, x, 910, x);
            x = x-30;
        }
        // Disfunctional ArrayList, intended to use instead of spaghetti code
        /*ArrayList<Rectangle> playPlus1 = new ArrayList<Rectangle>();
        ArrayList<Rectangle> playPlus2 = new ArrayList<Rectangle>();
        int y = 620;
        for (int i = 0; i < 1; i++) {
            playPlus1.add(new Rectangle(640, y, 9, 1));
            g2.draw(playPlus1);
            playPlus1.add(new Rectangle(644, y, 1, 9));
            g2.draw(playPlus2);
            y = y-30;
        }
        for (Rectangle playPlus1 : playPlus1) {
            playPlus1.draw(g);
        }*/
        int x1 = 666;
        int x2 = 670;
        Rectangle play1Plus1 = new Rectangle(x1, 604, 9, 1);
        Rectangle play1Plus2 = new Rectangle(x2, 600, 1, 9);
        Rectangle play2Plus1 = new Rectangle(x1, 574, 9, 1);
        Rectangle play2Plus2 = new Rectangle(x2, 570, 1, 9);
        Rectangle play3Plus1 = new Rectangle(x1, 544, 9, 1);
        Rectangle play3Plus2 = new Rectangle(x2, 540, 1, 9);
        Rectangle play4Plus1 = new Rectangle(x1, 514, 9, 1);
        Rectangle play4Plus2 = new Rectangle(x2, 510, 1, 9);
        g2.setColor(progtext);
        g2.draw(play1Plus1);
        g2.draw(play1Plus2);
        g2.draw(play2Plus1);
        g2.draw(play2Plus2);
        g2.draw(play3Plus1);
        g2.draw(play3Plus2);
        g2.draw(play4Plus1);
        g2.draw(play4Plus2);
        // song titles
        g2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        g2.drawString("TITLE", 696, 490);
        g2.drawString("ARTIST", 836, 490);
        g2.setFont(sysfont);
        g2.setColor(spotifyc);
        g2.drawString("Freedom Dive", 696, 520); // XI
        g2.drawString("XI", 836, 520);
        g2.setColor(progtext);
        g2.drawString("Congratulations", 696, 550); // PewDiePie
        g2.drawString("PewDiePie", 836, 550);
        g2.drawString("Sidetracked Day", 696, 580); // VINXIS
        g2.drawString("VINXIS", 836, 580);
        g2.drawString("Super Mario World", 696, 610); // Logic
        g2.drawString("Logic", 836, 610);
        // now playing
        g2.drawString("Freedom Dive", 503, 645);
        g2.setColor(progtext);
        g2.drawString("XI", 503, 664);
        // playlist cover
        Rectangle playlistC = new Rectangle(635, 315, 100, 100);
        g2.setColor(scBar);
        g2.fill(playlistC);
        g2.draw(playlistC);
        g2.setColor(new Color(66, 66, 66));
        Double playcd = new Ellipse2D.Double(637, 317, 95, 95);
        g2.draw(playcd);
        Double playcd2 = new Ellipse2D.Double(685, 355, 18, 18);
        g2.draw(playcd2);
        // playlist info
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Segoe UI", Font.PLAIN, 9));
        g2.drawString("PLAYLIST", 750, 347);
        g2.drawString("Created by User · 65 songs, 4h 21 min", 750, 410);
        g2.setFont(new Font("Segoe UI", Font.PLAIN, 32));
        g2.drawString("Music", 748, 382);
        // playlist play options
        Double dots = new Ellipse2D.Double(721, 426, 21, 20);
        g2.setColor(progtext);
        g2.draw(dots);
        g2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        g2.drawString("···", 726, 442);
        Rectangle playPlay = new Rectangle(630, 426, 75, 20);
        Double playRound = new Ellipse2D.Double(693, 426, 20, 20);
        g2.setColor(spotifyc);
        g2.fill(playPlay);
        g2.draw(playPlay);
        g2.fill(playRound);
        g2.draw(playRound);
        // playlist selection
        Rectangle selectedPl = new Rectangle(450, 510, 4, 12);
        g2.fill(selectedPl);
        g2.draw(selectedPl);
        g2.setColor(progtext);
        g2.setFont(sysfont);
        g2.drawString("Music", 470, 520);
        g2.drawString("Stuff", 470, 540);
        g2.drawString("Releases", 470, 560);
        // exit
        AffineTransform back3 = g2.getTransform(); // used to return to old settings if needed
        g2.setColor(Color.WHITE);
        g2.translate(927, 284); // origin to rotate around
        g2.rotate(Math.toRadians(45.d));
        g2.draw(nExit1); 
        g2.setTransform(back3);
        Rectangle n3Exit2 = new Rectangle(0, 0, 13, 1);
        g2.setColor(Color.WHITE);
        g2.translate(926, 293); // sub 30, add 266
        g2.rotate(Math.toRadians(-45.d));
        g2.draw(n3Exit2); 
        g2.setTransform(back3);
        // expand
        Rectangle n3Max1 = new Rectangle(882, 283, 10, 10);
        g2.setColor(Color.WHITE);
        g2.draw(n3Max1);
        // minimize
        g2.drawLine(835, 288, 845, 288);
        
        // CMD
        Rectangle cmd = new Rectangle(50, 120, 650, 375);
        g2.setColor(Color.WHITE);
        g2.fill(cmd);
        g2.draw(cmd);
        Rectangle cmdBlack = new Rectangle(50, 150, 650, 345);
        g2.setColor(Color.BLACK);
        g2.fill(cmdBlack);
        g2.draw(cmdBlack);
        // exit
        Rectangle n2Exit1 = new Rectangle(0, 0, 14, 1);
        AffineTransform back2 = g2.getTransform();
        g2.setColor(Color.BLACK);
        g2.translate(676, 130); // origin to rotate around
        g2.rotate(Math.toRadians(45.d));
        g2.draw(n2Exit1); 
        g2.setTransform(back2);
        Rectangle n2Exit2 = new Rectangle(0, 0, 13, 1);
        g2.translate(675, 139); 
        g2.rotate(Math.toRadians(-45.d));
        g2.draw(n2Exit2); 
        g2.setTransform(back2);
        // expand
        Rectangle n2Max1 = new Rectangle(632, 129, 10, 10);
        g2.setColor(Color.BLACK);
        g2.draw(n2Max1);
        // minimize
        g2.drawLine(585, 134, 595, 134);
        // text
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Terminal", Font.PLAIN, 12));
        g2.drawString("Microsoft Windows [Version 10.0.15063]", 50, 161);
        g2.drawString("(c) 2017 Microsoft Corporation. All rights reserved", 50, 175);
        g2.drawString("C:\\Windows\\System32>cd C:\\", 50, 203);
        g2.drawString("C:\\>cd %USERPROFILE%\\Desktop", 50, 231);
        g2.drawString("C:\\Users\\Admin\\Desktop>javac DrawingTester\\DrawingTester.java", 50, 259);
        g2.drawString("C:\\Users\\Admin\\Desktop>java DrawingTester.DrawingTester", 50, 287);
        Rectangle cmdBlue = new Rectangle(49, 119, 652, 377);
        g2.setColor(selected);
        g2.draw(cmdBlue);
        g2.setFont(sysfont);
        g2.setColor(Color.BLACK);
        g2.setFont(sysfont);
        g2.drawString("Command Prompt - cmd", 80, 140);
        // cmd icon
        g2.setColor(new Color(211, 217, 224));
        Rectangle iconCMD = new Rectangle(58, 129, 14, 12);
        g2.fill(iconCMD);
        g2.draw(iconCMD);
        g2.setColor(Color.BLACK);
        Rectangle blackCMD = new Rectangle(59, 133, 13, 8);
        g2.fill(blackCMD);
        g2.draw(blackCMD);
        Rectangle grayCMD = new Rectangle(58, 129, 14, 12);
        g2.setColor(Color.GRAY);
        g2.draw(grayCMD);
    }
}