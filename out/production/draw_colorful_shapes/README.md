# README

## Objective

The objective of this assignment is to understand inheritance and polymorphism. Source code is provided to draw circles on the screen, which will serve as the starting point to develop your own code.

## Task

As outlined in the class instructions, you are required to achieve the following goals:

1. **Shape Abstraction:**
   - Create a Shape abstract class in the "Shapes" package. This class will serve as a reference for creating Circles and Rectangles.

2. **Shape Management:**
   - Develop a Stack that will store all shapes created on the screen using the left mouse button.

3. **Shape Removal:**
   - Implement functionality to remove shapes from the stack using the right mouse button.

4. **Shape Switching:**
   - Enable switching between rectangle and circle shapes by clicking the middle mouse button.

5. **Node and Stack Implementation:**
   - Place the Node and Stack classes inside the "LinkedLists" package to manage the storage and retrieval of shapes efficiently.

## Implementation

1. **Shape Abstraction:**
   - Create an abstract class named "Shape" in the "Shapes" package. This class will define common properties and methods for all shapes.
   - Implement concrete classes, "Circle" and "Rectangle," inheriting from the Shape class. Provide specific implementations for drawing circles and rectangles.

2. **Shape Management:**
   - Develop the Stack class in the "LinkedLists" package. This class should support operations for pushing shapes onto the stack and popping shapes from it.

3. **User Interface Setup:**
   - Create the DrawingFrame class to serve as the main window of the drawing program. Set up the frame with appropriate title and close operation.

4. **Implement DrawingPanel:**
   - Develop the DrawingPanel class, which extends JPanel and handles the drawing and user interactions.
   - Implement mouse event listeners (MouseListener, MouseMotionListener) to respond to user actions such as creating, deleting, and switching shapes.

5. **Handle Mouse Events:**
   - Implement logic in the DrawingPanel class to respond to mouse button clicks:
     - Left Mouse Button: Create a new shape (circle or rectangle) at the clicked position and push it onto the stack.
     - Right Mouse Button: Remove the top shape from the stack.
     - Middle Mouse Button: Toggle between drawing circle and rectangle shapes.

6. **Update Drawing Graphics:**
   - Ensure the panel's graphics are updated to reflect the current state after each user interaction.
   - Implement a method to draw all shapes stored in the stack onto the panel.

