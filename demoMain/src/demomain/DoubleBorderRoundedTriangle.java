/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomain;

/**
 *
 * @author SP20-BSE-032
 */
public class DoubleBorderRoundedTriangle implements BorderShape {
   @Override
   public void draw() {
      System.out.println("Inside DoubleBorderRoundedTriangle::draw() method.");
   }
   
   @Override
   public void applyBorder() {
      System.out.println("Applying double border to Rounded Triangle.");
   }
}
