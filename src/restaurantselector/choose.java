
package restaurantselector;

import javax.swing.JOptionPane;

/**
 *
 * @author Shanell Spann
 */
public class choose {
    
    
    public void userInput()
    {
        JOptionPane.showMessageDialog(null, "Hello. Let's Choose a Restaurant!", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
        int vegetarian = JOptionPane.showConfirmDialog(null,"Are you a vegetarian?", "Restaurant App", JOptionPane.YES_NO_OPTION);
        int vegan = JOptionPane.showConfirmDialog(null,"Are you a vegan?", "Restaurant App", JOptionPane.YES_NO_OPTION);
        int glutenFree = JOptionPane.showConfirmDialog(null,"Are you gluten-free?", "Restaurant App", JOptionPane.YES_NO_OPTION);
        
        // Vegetarian, Vegan, Gluten-Free
        if (vegetarian == JOptionPane.YES_OPTION)
        {
            if (vegan == JOptionPane.YES_OPTION)
            {
                if (glutenFree == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if (glutenFree == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            } 
            else if (vegan == JOptionPane.NO_OPTION)
            {
                if (glutenFree == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen\nMain Street Pizza Company", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if (glutenFree == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen\nMain Street Pizza Company\nMama's Fine Italian", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        }
        else if (vegetarian == JOptionPane.NO_OPTION)
        {
           if (vegan == JOptionPane.YES_OPTION)
            {
                if (glutenFree == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if (glutenFree == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
           else if (vegan == JOptionPane.NO_OPTION)
            {
                if (glutenFree == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nCorner Cafe\nThe Chef's Kitchen\nMain Street Pizza Company", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else if (glutenFree == JOptionPane.NO_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Here are your choices: \n\nJoe's Gourmet Burgers\nMain Street Pizza Company\nMama's Fine Italian\nCorner Cafe\nThe Chef's Kitchen", "Restaurant App", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        }
        
    }
    
}

