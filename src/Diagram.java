import java.awt.*;
import java.applet.*;


public class Diagram extends Applet {
   int valerie;
    int Jeroen;
    int Hans;
    int breedtex;
    int lengtex;
    int eindx;
    int beginx;
    int hoogtex;
    int beginy;
    int eindy;
    int lijndikte;
    Color vak;
    int march;
    int march2;
    int march3;
    int march4;
    int lengtey;
    int breedtey;
    int t;//text lengte

	
	
    public void init() {
        valerie = -40;
        Jeroen = -100;
        Hans = -80;
        beginy = 1;
        eindy = 180;
        lijndikte = 40;
        eindx = 190;
        beginx = 50;
        t = 20; //textlengte
        lengtex = 1;
        breedtex = 200;
        lengtey = 180;
        breedtey = 1;
        march = 20 + beginy + 50;
        march2 = 80+ beginy + 50;
        march3 = 140 + beginy + 50;
        march4 = 190 + 10;
        
        vak = Color.RED;
    }

    public void paint(Graphics g) {
    	g.drawRect(beginx, eindx, breedtex, lengtex);
    	
     	g.drawRect(50, 10, breedtey, lengtey);
     	
     	
    	g.drawRect(45, march4-20, 10, lengtex);
    	g.drawRect(45, march4-30, 10, lengtex);
    	g.drawRect(45, march4-40, 10, lengtex);
    	g.drawRect(45, march4-50, 10, lengtex);
    	g.drawRect(45, march4-60, 10, lengtex);
    	g.drawRect(45, march4-70, 10, lengtex);
    	g.drawRect(45, march4-80, 10, lengtex);
    	g.drawRect(45, march4-90, 10, lengtex);
    	g.drawRect(45, march4-100, 10, lengtex);
    	g.drawRect(45, march4-110, 10, lengtex);
    	g.drawRect(45, march4-120, 10, lengtex);
    	g.drawRect(45, march4-130, 10, lengtex);
    	g.drawRect(45, march4-140, 10, lengtex);
    	g.drawString("20",t, march4-25);

    	g.drawString("40",t, march4-45);

    	g.drawString("60",t, march4-65);

     	g.drawString("80",t, march4-85);

     	g.drawString("100",t,march4-105);

     	g.drawString("120",t,march4-125);
     	g.drawString("140",t,march4-145);
     	
    	g.drawString("Valerie",march, eindx+20);
    	g.drawString("Jeroen",march2, eindx+20);
    	g.drawString("Hans",march3, eindx+20);
    	
     	g.setColor(vak);
    	g.fillRect(march, eindx, lijndikte, valerie);
     	g.fillRect(march2, eindx, lijndikte, Jeroen);
     	g.fillRect(march3, eindx, lijndikte, Hans);




    	
    	
  
     
    }
}

