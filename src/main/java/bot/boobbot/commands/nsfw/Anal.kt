package bot.boobbot.commands.nsfw

import bot.boobbot.flight.Category
import bot.boobbot.flight.CommandProperties
import bot.boobbot.models.BbApiCommand

@CommandProperties(description = "That ass love tho.", nsfw = true, category = Category.KINKS)
class Anal : BbApiCommand("anal")
