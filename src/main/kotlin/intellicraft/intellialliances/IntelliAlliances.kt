package intellicraft.intellialliances

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.entity.Player
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin


class IntelliAlliances: JavaPlugin(), Listener, CommandExecutor {
    override fun onEnable() {
        this.server.broadcastMessage("[IntelliAlliances] This Plugin was made by IntelliCraft")

    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player){

            when(command.name){
                "alliance" -> {
                    when (args[0]){
                        "create" -> {
                            // Create alliance {alliance: args[1]}
                        }
                        "invite" -> {
                            // Invite member to alliance {member: args[1], alliance: args[2]}
                        }
                        "list" -> {
                            when (args[1]) {
                                "member" -> {
                                    // Get list of all members in alliance {alliance: args[2]}
                                }
                            }
                        }

                    }
                }
                "find" -> {
                    // Find player in alliances {player: args[0]}
                }
                else -> return false
            }
        }



        return true
    }
}




