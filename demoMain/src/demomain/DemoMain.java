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
public class DemoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      shape1.draw();
      Shape shape2 = shapeFactory.getShape("SQUARE");
      shape2.draw();
      
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      shape3.draw();
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      shape4.draw();
      
      AbstractFactory borderFactory = FactoryProducer.getBorderFactory();
      BorderShape borderShape1 = borderFactory.getBorderShape("TRIANGLE");
      borderShape1.draw();
      borderShape1.applyBorder();
      
      BorderShape borderShape2 = borderFactory.getBorderShape("ROUNDED_TRIANGLE");
      borderShape2.draw();
      borderShape2.applyBorder();
      borderShape2.draw();
    }
    
}
