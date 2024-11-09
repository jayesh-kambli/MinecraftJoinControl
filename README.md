# MinecraftJoinControl

**MinecraftJoinControl** is a simple Minecraft plugin that teleports players to a specified spawn world if they join a world that is not on an approved list.

## Features

- Checks the world a player joins.
- Teleports the player to the spawn location of the `world_spawn` world if they join an unapproved world.
- Customizable list of approved worlds (easily modified in code).

## Requirements

- Minecraft server running on Spigot or a compatible fork (e.g., Paper)
- Java 17 or above (as required by recent Minecraft versions)

## Installation

1. Download the latest release of the plugin from the [releases page](#).
2. Place the `.jar` file in your server's `plugins` folder.
3. Restart or reload your server.

## Configuration

By default, the plugin checks if the player is joining one of the following worlds:

- `world`
- `world_nether`
- `world_spawn`
- `world_the_end`

If a player joins any other world, they will be teleported to the `world_spawn` world’s spawn location.

To modify this behavior, edit the `isApprovedWorld` method in `MinecraftJoinControl.java` and add or remove world names as needed.

## Usage

Once the plugin is installed, it automatically handles player joins. There’s no need for any additional setup.

## Development

To modify or contribute:

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/MinecraftJoinControl.git
