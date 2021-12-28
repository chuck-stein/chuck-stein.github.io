---
name: Propellion
tools: [Unity, C#, Procedural Generation, Game AI, Dialogue Editing, Audio Production, Ableton Live, iZotope VocalSynth]
image: ../assets/projects/propellion/propellion-simulation-booth.jpeg
description: A 3D sci-fi parkour game where you are a space ninja grappling through an asteroid field and fighting aliens
---

# Propellion

{% capture carousel_images %}
../assets/projects/propellion/propellion-action-shot.jpeg
../assets/projects/propellion/propellion-black-hole.jpeg
../assets/projects/propellion/propellion-b3m1s.jpeg
../assets/projects/propellion/propellion-alien.jpeg
../assets/projects/propellion/propellion-wounded-alien.jpeg
../assets/projects/propellion/propellion-simulation-booth.jpeg
{% endcapture %}
{% include elements/carousel.html %}

I worked with two friends on this project, my first real venture into 3D game development.
In the game you are training to be a "space ninja," guided by a snarky robot named B3M1S (a.k.a. "Bemis").
The goal is to navigate through an asteroid field to find a portal using all the tools at your disposal -- a grapple gun, a jetpack,
and a "space katana" to slice alien foes who stand in your way. You can grapple between asteroids, but have to act quickly because
your space suit can take damage if you smash into them too hard, or get shot by an alien. You can repair suit damage by reeling in med kits floating around the asteroid field.
The game features three levels -- the first is a simple asteroid field to get the hang of the movement controls, the second adds a black hole
consistently expanding behind you and sucking up anything in its path (asteroids and all) that you must stay ahead of to survive,
and the third adds the threat of aliens which you must grapple towards you and slice with your space katana to defeat.
We incorporated simple AI via a finite state machine for the aliens, procedural generation for the asteroid field, and heavy use of Unity's physics system for movement and the black hole.
We also built a reactive dialogue system in which B3M1S will (often mockingly) guide the player through their mistakes and successes,
triggering different voice lines based on game state and player actions.
The voice lines are all recorded and edited by me within Ableton Live, and processed using iZotope VocalSynth 2 to make my voice sound robotic.
I also composed the game soundtrack in Ableton Live.

<p class="text-center">
  {% include elements/button.html link="https://github.com/chilipot/propellion" text="See The Code" %}
</p>

___

<p align="center">
  <b>
    You can play the game below straight from your browser!
  </b>
  <br />
  Open in full screen for the best experience.
  <br />
  Does not work on mobile.
</p>
  
<p class="text-center">
  <iframe frameborder="0" src="https://itch.io/embed-upload/2574138?color=17191a" allowfullscreen="" width="768" height="480">
    <a href="https://chuckstein.itch.io/propellion-beta">
      Play Propellion - Beta on itch.io
    </a>
  </iframe>
</p>

#### Controls

| Button            | Effect                                                         |
| ----------------- |:--------------------------------------------------------------:|
| left click & hold | grapple & reel in towards target (if close enough)             |
| right click       | swing katana                                                   |
| space             | thrust forward in direction you are facing / skip cutscenes    |
| tab               | toggle pause menu                                              |

<center>Follow the direction indicated by the blue arrow on your HUD to reach the portal at the end of each level. Remember to reel in aliens before swinging your katana to slay them!</center>
