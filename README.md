# Sonic 1 J2ME Decompilation
A decompilation of the 2005 Java mobile port of Sonic the Hedgehog (1991). This decompilation focuses on the 240x320 resolution version, as it uses the original game's graphics. However, there are lower resolutions that function similarily.

# Status
Currently the decompilation is unbuildable, and obfuscated.
Until the decompilation is usable, continue to mod via the old method of opening the original JAR as an archive and modifying MIDIs and PNGs.

# Directories and Folders
* Part 1 - the first three zones of the game
* Part 2 - the latter three zones of the game (Not yet obtained)

* Art
    * All PNG assets used by the program

* Code
    * Manifest/Header file
    * Boot Java file
    * Game program Java files

* Level
    * Collision BCT files
    * Tile BLT files
    * Layout BIN files
    * Unknwon BMD, ACT, and SCD files

* Misc
    * SEGA chant AMR audio file
    * Unknown frame data file
    * Hitbox size table

* Music
    * All MIDI files used by the program

* Text
    * General text for five languages (English, French, Spanish, German and Italian)
    * Manual text for five languages (English, French, Spanish, German and Italian)

# Credits
Project lead, various works - [Iso Kilo](https://github.com/Iso-Kilo)

b.class and c.class decompilation - [Aurora Fields](https://github.com/NatsumiFox)

c.java and README touch ups - [HyperPolygon64](https://github.com/HyperPolygon64)

Other research and developments - [Members of the Sonic 1 J2ME hacking Discord server](https://discord.gg/xJJZ2QM)

# Usage
Other than compiling the Java files into `.class`, the individual parts can be simply turned into a ZIP archive and have the extension renamed to `.jar`.