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
    public class BorderShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType) {
      return null;
   }
   
   @Override
   public BorderShape getBorderShape(String shapeType) {
      if (shapeType.equalsIgnoreCase("TRIANGLE")) {
         return new DoubleBorderTriangle();
      } else if (shapeType.equalsIgnoreCase("ROUNDED_TRIANGLE")) {
         return new DoubleBorderRoundedTriangle();
      }
      return null;
   }
}

