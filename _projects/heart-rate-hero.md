---
name: Heart Rate Hero
tools: [PureData, C++, Bela, Generative Music]
image: ../assets/projects/heart-rate-hero/game-circuit.jpg
description: A rhythm game where the tempo is controlled by your heart rate
---

# Heart Rate Hero

A collaboration with another Northeastern student, this project is a rhythm game in which the music is generated on the fly, and its tempo is controlled by your heart rate.
Think Guitar Hero but more experimental. Nervous because you keep missing notes? Maybe that will cause your heart rate to go up, which will cause the notes get faster
and the game to get even harder.

The game is powered by [Bela](https://bela.io/about), a platform for running high-performance audio applications on an embedded computer.
Bela programs can be in either [PureData](https://en.wikipedia.org/wiki/Pure_Data), C++, or a combination of both. We chose C++ for the majority of the application,
except for the heart-rate detection algorithm, which was written in C++ to run more efficiently.

The player wraps a pulse sensor around their finger to get a reading, then as the music plays (with a tempo equal to their heart rate), LEDs will light up one at a time, in
a row, with four rows, each leading to a button that must be pressed along with the beat, when the light reaches the end of the row. If the player presses the button on
beat, it will trigger a drum sound to play along with the music (with a unique drum sound for each row -- kick, snare, tom, and hi hat). There is another LED indicating how
well the player is doing, which turns red if they are missing a lot of notes, green if they are hitting a lot of notes, and orange/yellow for somewhere in between.

All throughout gameplay, the soundtrack is being generated in real time from the PureData patch, by a variety of types of instruments (FM, wavetable, etc.) which are
each randomly selecting from their own set of possible notes, taken from the same scale so they all play in harmony. The rhythms of certain instruments are also generated
randomly, with random key changes as well to keep the soundtrack dynamic. The drum patterns that the player must play along to are also selected randomly from a group of
possible patterns throughout the game.

<div class="text-center">
  <video controls src="../assets/projects/heart-rate-hero/game-demo.mp4" width=700>
    <!-- fallback -->
    <p>Your browser does not support HTML5 video playback, but you can still <a href="../assets/projects/heart-rate-hero/game-demo.mp4">download the video</a>.</p>
  </video>
</div>

<div class="text-center">
  <em>A demo of the game being played. It is unfortunately not the best recording, so you must turn up the volume and listen closely to hear the game soundtrack and the triggered drum sounds.</em>
</div>

<br />

{% capture carousel_images %}
../assets/projects/heart-rate-hero/game-circuit-cropped.png
../assets/projects/heart-rate-hero/pd-music-generation.png
../assets/projects/heart-rate-hero/pd-game-mechanics.png
../assets/projects/heart-rate-hero/pd-heart-rate-measurement.png
{% endcapture %}
{% include elements/carousel.html %}

<div class="text-center">
  <em>The game interface and circuit, followed by some sections of the PureData patch: the music generation, the game mechanics, and the heart-rate detection algorithm from before it moved to C++</em>
</div>

<br />

<p class="text-center">
  {% include elements/button.html link="https://github.com/chuck-stein/heart-rate-hero" text="See The Code" %}
</p>
