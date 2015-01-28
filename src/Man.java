import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Man extends JFrame implements Runnable {

		int x,y1,y2,y3,ts,ts1;
		int a1x = 300, a1a = 110, a2x = 240, a2a = 50;
		int a3x = 300, a3a = 110, a4x = 240, a4a = 50;
		double ry = 390, oy = 360;
		int r1x = 350, r2x = 290, o1x = 345, o2x = 285;
		int p1x = 50, p2x = 350, p3x = 650, p4x = 950, p5x = 1250, p6x = 1550;
		int sx = 80, sy = 80;
		int z1 = 1290, z2 = 1265, z3 = 1265, z4 = 1260, z5 = 1300, z6 = 1280;
		int za1 = 990, za2 = 965, za3 = 960, za4 = 1000, za5 = 980;
		int zb1 = 190, zb2 = 165, zb3 = 160, zb4 = 200, zb5 = 180, zb6 = 210,
			zb7 = 150;
		int zc1 = 590, zc2 = 565, zc3 = 560, zc4 = 600, zc5 = 580, zc6 = 610,
			zc7 = 550, zc8 = 580;
		int cr1 = 1370, cr2 = 1420, cr3 = 1420, cr4 = 1390, cr5 = 1490, cr6 = 1435,
			cr7 = 1500, cr8 = 1450, cr9 = 1455, cr10 = 1457;
		int ca1 = 0, ca2 = 90, ca3 = 180, ca4 = 270, cb1 = 0, cb2 = 90, cb3 = 180,
			cb4 = 270;
		int crr1 = -190, crr2 = -180, crr3 = -180, crr4 = -170, crr5 = -70,
			crr6 = -165, crr7 = -100, crr8 = -100, crr9 = -85, crr10 = -82;
		int car1 = 0, car2 = 90, car3 = 180, car4 = 270, cbr1 = 0, cbr2 = 90,
			cbr3 = 180, cbr4 = 270;
		int s1=360,s2=360,s3=330,s4=310,s5=280,s6=300;
		int crf1=2255,crf2=2270,crf3=2273;
		int s11=360,s12=310,s13=300;
		int s10=340,s101=360,s111=300;
		String str = "",str1 = "";
		Color c, c1, c2,c3;

	public Man() {

			this.setSize(1400, 750);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setTitle("Man Walk");
			this.getContentPane().setBackground(new Color(130, 130, 255));
			c = new Color(50, 0, 0);
			c3 = new Color(50, 0, 0);
			c1 = new Color(100, 100, 255);
			c2 = new Color(100, 50, 150);
			y1 =8000; 
			y2 =8000; 
			y3 =8000; 
			ts=70;
			ts1=30;
	}

	@Override
	public void paint(Graphics g) {

			super.paint(g);
		// theme
			g.setColor(new Color(240, 240, 0));
			g.fillOval(1100, 120, sx, sy);
			g.setColor(new Color(50, 0, 0));
			g.fillArc(200, -250, 1000, 700, 200, 140);
			g.fillArc(-400, -200, 1200, 750, 200, 140);
			g.fillArc(800, -200, 1000, 750, 200, 140);
			g.setColor(new Color(0, 150, 0));
			g.fillRect(0, 550, 1400, 200);
			g.setColor(Color.black);
			g.fillRect(0, 400, 1400, 150);
		// road
			g.setColor(Color.white);
			g.fillRect(p1x, 470, 200, 10);
			g.fillRect(p2x, 470, 200, 10);
			g.fillRect(p3x, 470, 200, 10);
			g.fillRect(p4x, 470, 200, 10);
			g.fillRect(p5x, 470, 200, 10);
			g.fillRect(p6x, 470, 200, 10);
		// tree
			g.setColor(new Color(120, 60, 0));
			g.fillRect(zb1, 310, 30, 60);
			g.fillArc(zb2, 360, 80, 30, 0, 180);
			g.setColor(new Color(0, 100, 0));
			g.fillOval(zb3, 270, 50, 50);
			g.fillOval(zb4, 270, 50, 50);
			g.fillOval(zb5, 250, 50, 50);
			g.fillOval(zb6, 230, 50, 50);
			g.fillOval(zb7, 240, 50, 50);

			g.setColor(new Color(120, 60, 0));
			g.fillRect(za1, 310, 30, 60);
			g.fillArc(za2, 360, 80, 30, 0, 180);
			g.setColor(new Color(0, 100, 0));
			g.fillOval(za3, 270, 50, 50);
			g.fillOval(za4, 270, 50, 50);
			g.fillOval(za5, 250, 50, 50);

			g.setColor(new Color(120, 60, 0));
			g.fillRect(zc1, 310, 30, 80);
			g.fillArc(zc2, 380, 80, 30, 0, 180);
			g.setColor(new Color(0, 100, 0));
			g.fillOval(zc3, 270, 50, 50);
			g.fillOval(zc4, 270, 50, 50);
			g.fillOval(zc5, 230, 50, 50);
			g.fillOval(zc6, 230, 50, 50);
			g.fillOval(zc7, 240, 50, 50);
			g.fillOval(zc8, 200, 50, 50);

			g.setColor(new Color(120, 60, 0));
			g.fillRect(z1, 310, 30, 80);
			g.fillArc(z2, 380, 80, 30, 0, 180);
			g.setColor(new Color(0, 100, 0));
			g.fillOval(z3, 290, 80, 30);
			g.fillOval(z4, 250, 50, 50);
			g.fillOval(z5, 250, 50, 50);
			g.fillOval(z6, 230, 50, 50);
			
		// car=right to left
			g.setColor(c1);
			g.fillRoundRect(cr1, 370, 200, 60, 10, 10);
			g.fillArc(cr2, 320, 140, 40, 0, 180);
			g.fillRect(cr3, 340, 140, 50);
			g.setColor(Color.darkGray);
			g.fillArc(cr4, 400, 60, 60, 0, 360);
			g.fillArc(cr5, 400, 60, 60, 0, 360);
			g.setColor(Color.gray);
			g.fillArc(cr4, 400, 60, 60, ca1, 20);
			g.fillArc(cr4, 400, 60, 60, ca2, 20);
			g.fillArc(cr4, 400, 60, 60, ca3, 20);
			g.fillArc(cr4, 400, 60, 60, ca4, 20);
			g.fillArc(cr5, 400, 60, 60, cb1, 20);
			g.fillArc(cr5, 400, 60, 60, cb2, 20);
			g.fillArc(cr5, 400, 60, 60, cb3, 20);
			g.fillArc(cr5, 400, 60, 60, cb4, 20);
			g.setColor(Color.white);
			g.fillRect(cr6, 340, 45, 30);
			g.fillRect(cr7, 340, 45, 30);
			g.setColor(new Color(255, 140, 80));
			g.fillOval(cr8, 340, 30, 30);
			g.setColor(Color.white);
			g.fillOval(cr9, 350, 12, 7);
			g.setColor(Color.black);
			g.fillOval(cr10, 350, 7, 7);
		// car-left to right
			g.setColor(c2);
			g.fillRoundRect(crr1, 440, 200, 60, 10, 10);
			g.fillArc(crr2, 390, 140, 40, 0, 180);
			g.fillRect(crr3, 410, 140, 50);
			g.setColor(Color.darkGray);
			g.fillArc(crr4, 470, 60, 60, 0, 360);
			g.fillArc(crr5, 470, 60, 60, 0, 360);
			g.setColor(Color.gray);
			g.fillArc(crr4, 470, 60, 60, car1, 20);
			g.fillArc(crr4, 470, 60, 60, car2, 20);
			g.fillArc(crr4, 470, 60, 60, car3, 20);
			g.fillArc(crr4, 470, 60, 60, car4, 20);
			g.fillArc(crr5, 470, 60, 60, cbr1, 20);
			g.fillArc(crr5, 470, 60, 60, cbr2, 20);
			g.fillArc(crr5, 470, 60, 60, cbr3, 20);
			g.fillArc(crr5, 470, 60, 60, cbr4, 20);
			g.setColor(Color.white);
			g.fillRect(crr6, 410, 45, 30);
			g.fillRect(crr7, 410, 45, 30);
			g.setColor(new Color(255, 140, 80));
			g.fillOval(crr8, 410, 30, 30);
			g.setColor(Color.white);
			g.fillOval(crr9, 420, 12, 7);
			g.setColor(Color.black);
			g.fillOval(crr10, 420, 7, 7);
			
		// comment
			g.setFont(new Font("calibri", Font.ITALIC, 20));
			g.setColor(c3);
			g.drawLine(s1, s2, s3, s4);
			g.drawString(str1, s5, s6);
			g.setColor(c);
			g.drawLine(s10, s11, s101, s12);
			g.drawString(str, s111, s13);
			
		//Man second face
			g.setColor(new Color(255, 140, 80));
			g.fillOval(crf1, 410, 30, 30);
			g.setColor(Color.white);
			g.fillOval(crf2, 420, 12, 7);
			g.setColor(Color.black);
			g.fillOval(crf3, 420, 7, 7);
		// Man
			g.setColor(new Color(255, 140, 80));
			g.fillOval(305, (int) oy, 30, 30);
			g.fillOval(o1x, 455, 10, 10);
			g.fillOval(o2x, 455, 10, 10);
			g.fillRect(r1x, 530, 15, 5);
			g.fillRect(r2x, 530, 15, 5);
			g.setColor(new Color(170, 100, 255));
			g.fillRoundRect(310, (int) ry, 20, 80, 10, 10);
			g.fillArc(a3x, 390, 100, 140, a3a, 20);
			g.fillArc(a4x, 390, 100, 140, a4a, 20);
			g.setColor(new Color(50, 50, 255));
			g.fillArc(a1x, 460, 100, 150, a1a, 20);
			g.fillArc(a2x, 460, 100, 150, a2a, 20);
			g.setColor(Color.white);
			g.fillOval(320, (int) (oy + 10), 12, 7);
			g.setColor(Color.black);
			g.fillOval(324, (int) (oy + 10), 7, 7);
	}

	public static void main(String[] args) {

		Man m = new Man();
		
		Thread t1 = new Thread(m,"1");
		Thread t2=new Thread(m,"2");
		Thread t3=new Thread(m,"3");
		Thread t4=new Thread(m, "4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	public void set(Color c, String str) {
		this.c = c;
		this.str = str;
	}
	public void set2(Color c3, String str1) {
		this.c3 = c3;
		this.str1 = str1;
	}
	public void manWalk() {

		a1x--;
		a1a--;
		a2x++;
		a2a++;
		a3x--;
		a3a--;
		a4x++;
		a4a++;
		if (a1x > 270) {
			ry = ry - 0.25;
		}
		if (a1x < 270) {
			ry = ry + 0.25;
		}
		if (a1x > 270) {
			oy = oy - 0.25;
		}
		if (a1x < 270) {
			oy = oy + 0.25;
		}

		r1x--;
		r2x++;
		o1x--;
		o2x++;
		
		if (a1x == 240) {

			a1x = 300;
			a1a = 110;
			a2x = 240;
			a2a = 50;
			a3x = 300;
			a3a = 110;
			a4x = 240;
			a4a = 50;
			r1x = 350;
			r2x = 290;
			o1x = 345;
			o2x = 285;
			ry = 390;
			oy = 360;
		}
		if(x>12700){
			a1x = 2300;
			a1a = 2110;
			a2x = 2240;
			a2a = 250;
			a3x = 2300;
			a3a = 2110;
			a4x = 2240;
			a4a = 250;
			r1x = 2350;
			r2x = 2290;
			o1x = 2345;
			o2x = 2285;
			ry = 2390;
			oy = 2360;
			crf1=crr6;
			crf2=crr6+15;
			crf3=crr6+18;
		}
	}

	public void treeRoad() {

		p1x--;
		p2x--;
		p3x--;
		p4x--;
		p5x--;
		p6x--;
		z1--;
		z2--;
		z3--;
		z4--;
		z5--;
		z6--;
		za1--;
		za2--;
		za3--;
		za4--;
		za5--;
		zb1--;
		zb2--;
		zb3--;
		zb4--;
		zb5--;
		zb6--;
		zb7--;
		zc1--;
		zc2--;
		zc3--;
		zc4--;
		zc5--;
		zc6--;
		zc7--;
		zc8--;

		if (p1x == -250) {
			p1x = 50;
			p2x = 350;
			p3x = 650;
			p4x = 950;
			p5x = 1250;
			p6x = 1550;
		}
		if (zc1 == -300) {

			zc1 = 1690;
			zc2 = 1665;
			zc3 = 1660;
			zc4 = 1700;
			zc5 = 1680;
			zc6 = 1710;
			zc7 = 1650;
			zc8 = 1680;
		}
		if (zb1 == -300) {

			zb1 = 1590;
			zb2 = 1565;
			zb3 = 1560;
			zb4 = 1600;
			zb5 = 1580;
			zb6 = 1610;
			zb7 = 1550;
		}
		if (za1 == -300) {
			za1 = 1490;
			za2 = 1465;
			za3 = 1460;
			za4 = 1500;
			za5 = 1480;
		}
		if (z1 == -300) {
			z1 = 1490;
			z2 = 1465;
			z3 = 1465;
			z4 = 1460;
			z5 = 1500;
			z6 = 1480;
		}
	}

	public void car() {

		if (x > 1000) {
			cr1--;
			cr2--;
			cr3--;
			cr4--;
			cr5--;
			cr6--;
			cr7--;
			cr8--;
			cr9--;
			cr10--;
			ca1++;
			ca2++;
			ca3++;
			ca4++;
			cb1++;
			cb2++;
			cb3++;
			cb4++;
		}
		if (x > 3500) {
			crr1++;
			crr2++;
			crr3++;
			crr4++;
			crr5++;
			crr6++;
			crr7++;
			crr8++;
			crr9++;
			crr10++;
			car1--;
			car2--;
			car3--;
			car4--;
			cbr1--;
			cbr2--;
			cbr3--;
			cbr4--;
		}
		if(crr1==2800){
			c2 = new Color(50, 100, 100);
			crr1 = -190;
			crr2 = -180;
			crr3 = -180;
			crr4 = -170;
			crr5 = -70;
			crr6 = -165;
			crr7 = -100;
			crr8 = -100;
			crr9 = -85;
			crr10 = -82;
		}
		if (cr1 == -700) {

			c1 = new Color(50, 100, 100);
			if(x>9000){
				c1 = new Color(180, 180, 180);
			}
			cr1 = 1570;
			cr2 = 1620;
			cr3 = 1620;
			cr4 = 1590;
			cr5 = 1690;
			cr6 = 1635;
			cr7 = 1700;
			cr8 = 1650;
			cr9 = 1655;
			cr10 = 1657;
		}
	}

	public void comment(){
		
		if (x == 800) {
			set(Color.WHITE, "I am so tired...");
		}
		if (x == 1000) {
			set(Color.WHITE, "My home is so far...");
		}
		if (x == 1200) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 3000) {
			set(Color.WHITE, "Wow...!!!");
		}
		if (x == 3200) {
			set(Color.WHITE, "Nice carrrr$$$....");
		}
		if (x == 3400) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 5400) {
			set(Color.WHITE, "ohh no....");
		}
		if (x == 5600) {
			set(Color.WHITE, "Now I can't walk anymore...");
		}
		if (x == 5800) {
			set(Color.WHITE, "Please GOD...help me!!!");
		}
		if (x == 6000) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 7600) {
			set(Color.WHITE, "Is that??...Mady's car.???");
		}
		if (x == 7800) {
			set(Color.WHITE, "?????");
		}
		if (x == 8000) {
			set(Color.WHITE, "I think...YES..");
		}
		if (x == 8200) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 8800) {
			set(Color.WHITE, "Hi....Mady");
		}
		if (x == 8830) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 8840) {
			set2(Color.WHITE, "Hi..Sam");
		}
		if (x == 8870) {
			set2(new Color(50, 0, 0), "");
		}
		if (x == 8880) {
			set(Color.WHITE, "Where r u going..???");
		}
		if (x == 8910) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 8920) {
			set2(Color.WHITE, "Garden...to meet g.f.~~~~");
		}
		if (x == 8950) {
			set2(new Color(50, 0, 0), "");
		}
		if (x == 8960) {
			set(Color.WHITE, "Cool...aa..dude");
		}
		if (x == 8990) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 9000) {
			set2(Color.WHITE, "What r u doing here....");
		}
		if (x == 9030) {
			set2(new Color(50, 0, 0), "");
		}
		if (x == 9040) {
			set(Color.WHITE, "going..Home...yar..");
		}
		if (x == 9070) {
			set(Color.WHITE, "i am so tired....can you drop me?");
		}
		if (x == 9100) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 9110) {
			set2(Color.WHITE, "Sorry!!...yar");
		}
		if (x == 9140) {
			set2(Color.WHITE, "Already i am late...g.f. wait for me...");
		}
		if (x == 9170) {
			set2(Color.WHITE, "so sorry!!!....yar");
		}
		if (x == 9200) {
			set2(new Color(50, 0, 0), "");
		}
		if (x == 9210) {
			set(Color.WHITE, "It's k....u can go...");
		}
		if (x == 9240) {
			set(Color.WHITE, "friends are change.....");
		}
		if (x == 9270) {
			set(Color.WHITE, "they have more much time for gf...");
		}
		if (x == 9300) {
			set(Color.WHITE, "but not for friend,,,K...no problem!!!");
		}
		if (x == 9330) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 9340) {
			set2(Color.WHITE, "sorry!!!..yar..");
		}
		if (x == 9370) {
			set2(new Color(50, 0, 0), "");
		}
		if (x == 9380) {
			set(Color.WHITE, "It's k...bye");
		}
		if (x == 9410) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 9420) {
			set2(Color.WHITE, "bye!!!");
		}
		if (x == 9450) {
			set2(new Color(50, 0, 0), "");
		}
		if(x>9480){
			y1=1;
			y2=1;
			y3=1;
		}
		if (x == 10000) {
			set(Color.WHITE, "bad luck....");
		}
		if (x == 10200) {
			set(Color.WHITE, "michhhh$$$$......");
		}
		if (x == 10400) {
			set(new Color(50, 0, 0), "");
		}
		if(x>12280){
			s1=380;
			s2=420;
			s3=410;
			s4=380;
			s5=370;
			s6=370;
		}
		if(x>12320){
			y1=8000;
			y2=8000;
			y3=8000;
		}
		if (x == 12330) {
			set2(Color.WHITE, "hey Sam...come in side....");
		}
		if (x == 12360) {
			set2(Color.WHITE, "I will drop you....");
		}
		if (x == 12390) {
			set2(Color.black, "");
		}
		if (x == 12400) {
			set(Color.white, "Hey..Maddy..what happen???");
		}
		if (x == 12430) {
			set(Color.white, "why u come back...");
		}
		if (x == 12460) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 12470) {
			set2(Color.white, "nothing...dude...");
		}
		if (x == 12500) {
			set2(Color.white, "come in side...fast...");
		}
		if (x == 12530) {
			set2(Color.white, "I will drop you...");
		}
		if (x == 12560) {
			set2(Color.black, "");
		}
		if (x == 12590) {
			set(Color.white, "are you shure???..");
		}
		if (x == 12620) {
			set(new Color(50, 0, 0), "");
		}
		if (x == 12630) {
			set2(Color.white, "yaa...dude");
		}
		if (x == 12660) {
			set2(Color.black, "");
		}
		if (x == 12690) {
			set(Color.white, "thanx...budy..");
		}
		if (x == 12720) {
			set(new Color(50, 0, 0), "");
		}
		if(x>12750){
			s11=400;
			s12=350;
			s13=340;
		}
		if(x>12780){
			y2=1;
			car1--;
			car2--;
			car3--;
			car4--;
			cbr1--;
			cbr2--;
			cbr3--;
			cbr4--;
			car1--;
			car2--;
			car3--;
			car4--;
			cbr1--;
			cbr2--;
			cbr3--;
			cbr4--;
			car1--;
			car2--;
			car3--;
			car4--;
			cbr1--;
			cbr2--;
			cbr3--;
			cbr4--;
		}
		if (x == 12800) {
			set(Color.white, "thank...god u come back");
		}
		if (x == 12850) {
			set(Color.black, "");
		}
		if (x == 12860) {
			set2(Color.white, "hmmm....");
		}
		if (x == 12910) {
			set2(Color.black, "");
		}
		if (x == 12920) {
			set(Color.white, "but..why u come back...");
		}
		if (x == 12970) {
			set(Color.white, "ur gf waits for you naa...");
		}
		if (x == 13020) {
			set(Color.black, "");
		}
		if (x == 13030) {
			set2(Color.white, "ohh..yaa...but friends is first...");
		}
		if (x == 13080) {
			set2(Color.black, "");
		}
		if (x == 13130) {
			set(Color.white, "ohh...really...");
		}
		if (x == 13180) {
			set(Color.white, "In which mall u r going??...");
		}
		if (x == 13230) {
			set(Color.black, "");
		}
		if (x == 13240) {
			set2(Color.white, "no no...not mall..");
		}
		if (x == 13290) {
			set2(Color.white, "going to...Impress garden..");
		}
		if (x == 13340) {
			set2(Color.black, "");
		}
		if (x == 13350) {
			set(Color.white, "that's cool....");
		}
		if (x == 13360) {
			set(Color.black, "");
		}
		if (x == 13500) {
			set(Color.white, "drive fast yar...");
		}
		if (x == 13550) {
			set(Color.black, "");
		}
		if (x == 13560) {
			set2(Color.white, "kk....");
		}
		if (x == 13610) {
			set2(Color.black, "");
		}
		if (x >13620) {
			ts=10;
		}
		if (x == 16100) {
			set(Color.white, "more fast yarrr....");
		}
		if (x == 16200) {
			set(Color.black, "");
		}
		if (x >16220) {
			ts=2;
			ts1=10;
		}
		if(x>18000){
			y1=1;
			y3=1;
		}
		if(x>20000){
			s1=crr2+40;
			s2=420;
			s3=crr2+70;
			s4=380;
			s5=crr2+40;
			s6=370;
			s10=crr2+100;
			s101=crr2+120;
			s111=crr2+60;
		}
		if (x >20000) {
			set(Color.red, "aaaaaaa....aaaaaaaaa!!!!!!");
		}
		if (x >20000) {
			set2(Color.red, "aaaaaaa....aaaaaaaaa!!!!!!");
		}
	}
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		while (true) {
	
			comment();
			
			if(Thread.currentThread().getName().equals("1")){
			try {
				manWalk();
				synchronized (this) {
					if(x>8820){
					wait(y1);
					}
				}
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
				
			if(Thread.currentThread().getName().equals("2")){
				try {
					treeRoad();
					synchronized (this) {
						if(x>8820){
						wait(y2);
						}
					}
					Thread.sleep(ts);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			
			if(Thread.currentThread().getName().equals("3")){
				try {
					car();
					synchronized (this) {
						if(x>8820){
						wait(y3);
						}
					}
					Thread.sleep(ts1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			if(Thread.currentThread().getName().equals("4")){
			
					
					try {
						Thread.sleep(110);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			if(x>20000 && cr1==s10){
				
				break;
				
			}
			repaint();
			x++;
		}
	}
}
