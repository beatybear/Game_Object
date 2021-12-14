# Game_Object
CS 341 Final Project
Game World –
 Software Engineering and Adapter Design Pattern
You are encouraged to work in teams. it is not required, just encouraged.
In this final project, you will construct a GUI application Game World containing four types of
animated GameObjects. Each GameObject element must be placed on the Canvas (application
window). GameObject elements will move in distinctive ways, outlined in Figure 1 below.
Type_A_GameObject: Moves up and down.
Type_B_GameObject: Moves up, down, left,
and right.
Type_C_GameObject: Moves left and right.
Type_D_GameObject: Moves under the
control of the user. The
arrow keys on the
keyboard allow it to
move up, down, left,
and right
Figure 1
Begin this project by downloading and testing the initial source code from the GitHub address:
https://github.com/tcornez/CS341FinalProject_Original.git
Final Project Tasks
Task 1: Create two concrete classes: Type_A_GameObject and Type_C_GameObject. Both classes must
extend the GameObject abstract class. Refer to Figure 1 for the restricted movements for these
GameObjects.
Task 2: Create a fourth concrete class: Type_B_GameObject. This class will move in all directions, as shown in
Figure 1. Use the Adapter pattern to incorporate TypeB_GameObject, so that it functions correctly.
Task 3: Modify Canvas.java and GameObject.java so that the user can choose a specific GameObjects
displayed on the canvas. For example, when the application is initially launched, the first
GameObject element created will be selected by default. When a GameObject element is selected, it
will be highlighted, indicating that it is the current active choice. Allow the user to click the TAB key,
select to the next GameObject element on the canvas. Once a GameObject element is
selected/highlighted, its movements should be under the user’s control. The user-controlled
movements should still be restricted to the directions originally assigned to them. When a
GameObject is no longer selected (loses its highlight) it should return to its original behavior.
Task 4: Explore use case scenarios and build a UML class diagram of the system. Provide the UML diagram in
Moodle.
Task 5: Implement application and use Eclipse tools to properly test it. Upload your final project to GitHub.
The first GameObject element is initially highlighted
with a square drawn around its periphery.
The user can switch between GameObject by clicking
the tab key and can control the movements of any
GameObject that is highlighted.
The TAB key causes the highlight to switch to the next
GameObject element. A highlighted object us under
user control. Restricted movements still apply. 
