# Software final group project

<h1>MineSweeper</h1>
 

Minesweepers, it is a classical game. 

We want to promote this game and add more customer style of this game,the software will be applied as agile development process. 

Due Minesweeper is a small game, it is not suitable to use a waterfall model. Moreover, we want to add some customer style in game interface as possible. So, agile method is the best way to finish this project. 

As we know, Minesweeper is fast track to getting outside when get in a trouble mind or take a break. it's funny game and can practice our brain about speculate and reaction of calculation. 

we would prefer to promote this game to younger teen as below 15 ages. the game can practice their thinking and algorithm. As our destination, we hope teen can use this opportunity to open their thinking, even make more like-minded friends.  

![alt text](https://user-images.githubusercontent.com/41785232/113291359-820e9980-9325-11eb-89fd-81527d2c2105.png)

<h2>Introduction</h2>
<p> This article is to mine clearance game do a more detailed requirement analysis. Mainly from the specific implementation of the game and the game and the interface to do detailed introduction.</p>
<ol>
  <li>Project purpose </li>
      <p>This is a based on a small game intelligence under the Windows operating system, the development of the game          is to give operators can easily play this game in his spare time, and can exercise their own thinking                ability.</p>
  <li>Project risk</li>
       <p>Relative to other large program - this program is not much risk, as long as you can in accordance with the           need to the results of the design, will get a satisfactory program.</p>
  <li>Application</li>
       <p>Because it is a little intellectual games and it is attached under the Windows operating system of a game,           so it is suitable for all staff, even a child can play the game, not only there is no harm, but also have             very good help for his brain. If not skilled to the operation of the computer, can learn to play through             the game to help beginners to master the basic operations of a computer.</p>
 
</ol>

<h2>Design overview</h2>
<ol>
  <li>User</li>
     <ul><li>Interface requirements</li></ul>
       <p>Interface is a window that has a menu bar, the title bar. In the menu bar has two games and help menu. In             the game menu to set the start of the game, set the level of the game, is divided into junior middle school           high three game level; Able to record player's highest score;If programmers have experience can also be               added to the game, after the guess ray to a harsh voice, give a ringing laughter after guess ray, but this           is not the focus of the program. Can display the number of ray, and with an electronic clock is used to               calculate the time spent on players, but also can stop timing after players to open the other window, when           the program is in the current active window then previously playing time clock. There should be a shortcut           icon when start, can’t start directly by using the menu bar.</p>
 
   <ul><li>Game performance</li></ul>
      <p>The game is a game of mine. land mine is immediately by the system, each time must be different, that is              land mine immediately. The game has three levels of difficulty: beginner, intermediate and advanced. Its              difficulty of the game increases as the level increases, and the area of the map is proportional to the              number of mines.</p>
   <ul><li>Concrete implementation</li></ul>
       <p>The rules of the game: press left key to “Begin” first, can through the interface shortcut.
          Players can change the difficulty of the game by clicking the “Game” button.</p>
       
       
   <li>Restrictions and constraints</li>
       <p>This procedure can only be Windows programs, and to be written in Java language. Time is three months</p>
   
   <li>Design principles and requirements</li>
       <p>Design principles and requirements of this procedure is a simple and clear interface, can give players the           feeling of be clear at a glance, but at the same time, to be able to fully reflect the characteristics of             the game to learn. Program to stability, to the operating system does not have any influence, of the                 storage size cannot be more than 1M.</p>
 </ol>




<br/>

 
 
 
<h2>The flow chart of development process</h2>

![alt text](https://user-images.githubusercontent.com/41785232/113278579-ad3cbd00-9314-11eb-9ad6-24b1b03c718d.png)

<p> the above picture is our development process. Similar to incremental development in agile methods. We will enhance the feedback and change the machine according to the customer's needs. As the final version, we will change or add some functions to meet their requirements.

 
<h2>Members Responsibilities</h2>

<table style="width:100%">
  <tr>
    <th>Name</th>
    <th>responsibilities & portion</th>
  </tr>
  <tr>
    <td>Daniel</td>
    <td>Collect and prepare data, design and coordinate with other members work</td>
  </tr>
  <tr>
    <td>Violet</td>
    <td>Implement and design the code, test and debug </td>
  </tr>
  <tr>
    <td>Kenny</td>
    <td>Design the documentation, implement and record the detailed of software process</td>
  </tr>
  <tr>
    <td>Kuong</td>
    <td>Analysis useful data to members, expect the risk in process and solve</td>
  </tr>
</table>
 
 

 
 
 
<h2>Schedule of our software</h2>

![alt text](https://user-images.githubusercontent.com/41785232/113278930-191f2580-9315-11eb-867c-a2380e7bf04b.png)

<p>To avoid the delay of delivery, our team are more seriously to consider that allocate the development time. In the process, the most difficult problem mostly centralize on development code and find some bug.
 To overcome the problem, we may need to suspend otther process and we handle it together.
 
 <h2>Algorithm</h2>
 <p>Variable Description:
<li>bon: number of mines</li>
<li>a1[0:bone-1]: the location of the mines</li>
<li>row: row</li>
<li>col: column</li>
<li>a[row][col]: if (row, col) is a mine, a[row][col] = 100, other a][row,col] = number of mines around</li>

Algorithm description:
1. Generate bon different random numbers between 0 and (row*col-1) and store them in the a1[] data respectively.
2. Transform the bon random numbers (a1[]) generated in step 1 into two-dimensional coordinates (x,y), a[x][y] = 100.
3. a[i][j] = 0 except for step 2
4. Iterate over a[i][j]! = 100, let a[i][j] = number of surrounding mines </p>
 
 <h2>The detailed of testing</h2>
 <p>Inside of testing, we can use CI/CD (Continuous Integration and Continuous Deployment or Continuous Delivery) Pipeline, which is consisted of CI and CD. CI is consistent and automated way to build, package, and test applications. CD means deliver of applications to selected infrastructure environments. As simply to see, CI/CD is an automatic machine process to test our product. As the advantage, CI/CD supports change code frequently, so it can be more flexible when developer change their original function even add new function in the product. Due the flexible to modify code, the beginning of project can be set up faster. Focus the core function or take the feedback of customer can be make our product be time-market product.</p>
 
 
 
<h2>Basic structure of model</h2>

![alt text](https://user-images.githubusercontent.com/41785232/113290061-ab2e2a80-9323-11eb-9073-757c2e8afbf3.png)

 
<h2>Game flow</h2>
 
<li>Game flow</li></ul>

![image](https://user-images.githubusercontent.com/81738923/113380575-2a1c7500-93af-11eb-9f7c-d92ec47218a1.png)



<h2>Current situation</h2>
<p> Due the development of software is most finish, but we also can dicover many room for improvement. 
 we may need to refactor our code and reduce the potential risk. In addition, we are making a concept about the mode of online-competitor. 
<h2>Group Project DEMO Video</h2>
    <p>https://www.youtube.com/watch?v=kf7LupEG5OY</p>
<h2>New changelling and our outlook</h2>

<ol>
 <li>Game development</li>
 <p></p>
   <p>As a unique cultural form, games satisfy people's instinct to seek happiness, and at the same time greatly expand the territory of human civilization's creativity and imagination. Game is more than just entertainment. The connection between games and education has not been broken since ancient times. An educational function of games is mainly to stimulate learning motivation, construct gamified learning environment, and cultivate knowledge, ability, emotional attitude and values.
The game itself is to the music, architecture, sculpture, painting, photography, film and other art forms of comprehensive and creation, can give a person with aesthetic edification, many game also incorporates a lot of history, culture, science and technology knowledge, can stimulate players to further understand the interest, stimulate players' participation motivation, promote the development of autonomous learning.
There is a subcategory of games called educational games, or serious games, which teach knowledge and skills, provide professional training and simulation.
High-quality games with high cultural taste and good play experience deserve more attention, and they deserve more time and energy to think about how to make good games more valuable in all aspects of our lives.
<li>Expanded functionality in the future</li>

  <p>First of all, we will have our first major update in the first month after launch, which will include three background music and two different sets of interactive sound effects.
After that, we will release a second major update three months after the first one. This time we will provide our own server system in the game to allow our players to upload their highest scores, providing a global scoreboard of player scores.
Finally, five months after the second update, we'll have a third major update, with ten new maps and a map editor that allows players to build their own maps. In addition, we will update the UI of our game to include two different sets of cut-scenes in the interaction.
At the same time of the last update, we will open source the code of the game and provide it for free to the users who need it.


</ol> 
 
 


 


 

  

