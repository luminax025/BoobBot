package bot.boobbot.commands.nsfw

import bot.boobbot.flight.Category
import bot.boobbot.flight.CommandProperties
import bot.boobbot.models.BbApiCommand

@CommandProperties(description = "Sexy gifs!", nsfw = true, category = Category.GENERAL)
class Gif : BbApiCommand("Gifs")

