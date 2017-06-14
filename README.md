PvPToggle by Sleelin
With assistance from AlexDGr8r.
Updated by ryans1230

Allows PvP enabling or disabling on a per-user basis, or allows for global PvP to be enabled or disabled.
Supports multiple worlds when defined in the config file.

Supports SuperPerms and legacy Permissions plugin.

Changelog:

v3.0.1:
- Update for support of Spigot 1.12+, which removed legacy Bukkit APIs that PvPToggle required
- Remove CitizenAPI support
- Remove Legacy permissions support. SuperPerms and BukkitPerms still are supported.
- Remove update checker

v3.0.0:
- Created PvPCommand architecture
- Broke away command handling into separate classes per command extending PvPCommand class
- Established internal region management, worldguard regions must now be tagged in PvPToggle
- Added global worldguard integration option in configuration file
- Added region command
- Fixed NPE from player with forced or denied PvP not getting added to player pool on log in
- Fixed enter region message and added exit region message
- If a localisation message is blank, the message will no longer be displayed 

v2.2.1:
- Fixed WorldEdit dependency

v2.2.0:
- WorldGuard region PVP flag integration

v2.1.1:
- Fixed non-pass of EDbyE event due to (yet another) change in citizens API  

v2.1.0:
- Added localisations and customisable strings throughout plugin

v2.0.1:
- Fixed (hopefully) NPE occurring on plugin load

v2.0.0:
- Fixed update checker bug
- Rewrote config handling
- Rewrote config file format (autoupdates to new format)
- Combined gpvp and pvp into single command
- Added proper world command 
- Rewrote help command, now in more detail
- Rewrote API
- Added ability to set what command to use for the plugin
- Added toggle on command use without argument
- Added reset command
- Made memory use improvements
- Redefined permissions

v1.1.0:
- Added automatic update checker
- Fixed sending commands from console
- Added PvP enabled warmup
- Fixed checking PvP status
- Added blocking of potions while not in PvP mode
- Fixed bug with toggling other player's PvP causing combat to fail
- Optimised player status record keeping

v1.0.3:
- Fixed issues with toggling other user's PvP arising from last version

v1.0.2:
- Fixed permissions for individuals toggling or checking PvP for themselves
- Fixed issues with name recognition in commands

v1.0.1:
- Fixed issues to do with permissions when toggling or checking status of other players

v1.0.0:
- Rewrote command handlers to enable easier addition, modification and maintenance
- Fixed issues with certain commands not performing as expected
- Added blocking of damage due to projectiles fired by players in combat (including arrows, fireballs and snowballs!)

v0.5.0:
- Added pvptoggle.pvp.force permissions node
- Added pvptoggle.pvp.deny permissions node
- Added pvptoggle.pvp.autoenable permissions node
- Fixed bug where disabled world PvP reported global PvP disabled instead of world disabled. 
- Removed redundant force option
- Added permissions debugging

v0.4.4:
- Updated to new Citizens API (they really should stop changing this!)

v0.4.3:
- Re-Added legacy Permissions support
- Fixed SuperPerms permissions not being registered
- Above adds support for PermissionsEx and bPermissions
- Fixed typo in config generation and reading
- Fixed strange reload behaviour

v0.4.1:
- Re-Added Citizens support

v0.4.0:
- Updated to new permissions
- Removed legacy permissions support
- Temporarily removed Citizens support
- Added support for forced PvP in a specific world

v0.3.1:
- Added Citizens support: console no longer spews errors about NPCs

v0.3.0:
- Added option for cooldown between last conflict and disabling PvP
- Added console support for toggling PvP status of specific players, or all players in a specific world, or across all worlds

v0.2.5:
- Updated multiworld support to use bukkit-dependent world detection (fixes issues with misconfiguration)
- Swapped to YAML config file format for ease of use 

v0.2.3:
- Added persistence across player sessions
- Fixed bug in /pvp with no arguments

v0.2.1:
- Fixed severe errors on reload (to do with initialising players)
- Fixed /pvp status [player] [world] - it actually works now

v0.2.0:
- Added multiworld support
- Tidied up command handling

v0.1.0:
- Initial release
