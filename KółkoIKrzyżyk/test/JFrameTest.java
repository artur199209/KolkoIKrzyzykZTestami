/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Artur
 */
public class JFrameTest {
    
    public JFrameTest() {
    }

    @Test
    public void testSetXO() {
        System.out.println("setXO");
        JButton jb = new JButton();
        JFrame j = new JFrame();
        j.setXO(jb);
        Assert.assertEquals(jb.getText(), "O");
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testResetGame() {
        System.out.println("reset game");
        JFrame jf = new JFrame();
        jf.btn1.setText("X");
        jf.resetGame();
        Assert.assertEquals(jf.btn1.getText(), "");
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCheck() {
        System.out.println("check");
        JFrame jf = new JFrame();
        jf.setXO(jf.btn1);
        jf.setXO(jf.btn2);
        jf.setXO(jf.btn5);
        jf.setXO(jf.btn8);
        jf.setXO(jf.btn9);
        jf.check(jf.btn1, jf.btn5, jf.btn7);
        Assert.assertEquals(jf.motionlabel.getText(), "Wygrał O");
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCheckAll() {
        System.out.println("check");
        JFrame jf = new JFrame();
        jf.setXO(jf.btn1);
        jf.setXO(jf.btn2);
        jf.setXO(jf.btn5);
        jf.setXO(jf.btn8);
        jf.setXO(jf.btn9);
        jf.checkAll();
        Assert.assertEquals(jf.motionlabel.getText(), "Wygrał O");
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testRetNumI() {
        System.out.println("I");
        JFrame jf = new JFrame();
        jf.setXO(jf.btn2);
        jf.setXO(jf.btn1);
        jf.setXO(jf.btn8);
        jf.setXO(jf.btn7);
        Assert.assertEquals(jf.retNumI(), 4);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testEndGame() {
        System.out.println("End game");
        JFrame jf = new JFrame();
        jf.setXO(jf.btn2);
        jf.setXO(jf.btn1);
        jf.setXO(jf.btn8);
        jf.setXO(jf.btn7);
        jf.setXO(jf.btn3);
        jf.setXO(jf.btn6);
        jf.setXO(jf.btn9);
        jf.setXO(jf.btn5);
        jf.setXO(jf.btn4);

        Assert.assertEquals(jf.motionlabel.getText(), "Koniec gry. Remis.");
        // TODO review the generated test code and remove the default call to fail.
    }
}
