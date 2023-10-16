
def CodBotMW2():
  
    response = input("Hello, I am CodBot, new to the game? please simply choose the genre that you would like to learn more about : weapons / perks  (all information is up to date)")
    

    if response == "weapons":
        while 1 > 0:

            print(" ")
            print("Want to learn more?")
            print(" ")
            
            specificQ = input("Enter a letter that matches with what you are looking for. Are you looking for the best weapon overall? type 'O', the best weapon for long range? type 'L', the best weapon for short range? type 'S', best AR? type 'AR', best SMG? type 'SMG' , best Battle Rifle? type 'BR', best shotgun? type 'SG', best LMG? type 'LMG', best marksman rifle? type 'MR'")
            print(" ")
            if specificQ == "o":
                print("The best rated weapon, by users, is currently the TAQ-56")
            elif specificQ == "l":
                print("the best rated weapon for long range use is currently the MCPR-300 sniper rifle, any other ")
            elif specificQ == "s":
                print("the best weapons for short range are currently Fennec 45 – SMG, Lachmann Sub – SMG, Vaznev-9k – SMG, Lockwood 300 - shotgun, Bryson 800 - shotgun")
            elif specificQ == "ar":
                print("the best AR is currently the TAQ-56")
            elif specificQ == "smg":
                print("the best SMG in the game is currently the Lachmann Sub")
            elif specificQ ==  "br":
                print("the best Battle Rifle in the game is currently the FTAC Recon")
            elif specificQ == "sg":
                print("the best shotgun in the game is currently the Lockwood 300")
            elif specificQ == "lmg":
                print("the best rated LMG is currently the RAAL MG")
            elif specificQ == "mr":
                print("the best rated marksman rifle is currently the Lockwood MK2")

    if response == "perks":
        while 1 > 0:
            print(" ")
            print("Want to learn more?")
            print(" ")

            perksQ = input("Enter a letter that matches with what you are looking for. For information about the perk 'Overkill' type 'O'. For information about the perk 'Scavenger' type 'S'. For information about the perk 'Resupply' type 'R'. For information about the perk 'Fast Hands' type 'FH'. For information about the perk 'Focus' type 'F'. For information about the perk 'Ghost' type 'G.")
            print(" ")
            if perksQ == "o":
                print("Overkill is a perk that allows you to carry two primary weapons at one time, instead of a primary and secondary.")
            elif perksQ == "s":
                print("Scavenger is a perk that allows you to consistently refill your ammo and throwing knives by running over dead bodies.")
            elif perksQ =="r":
                print("Resupply allows you to spawn into the match with an additional lethal each time.")
            elif perksQ =="fh":
                print("Fast Hands is focused on fast reloads for your weapons and the ability to swap weapons faster.")
            elif perksQ ==  "f":
                    print("if you want to stay on target, or are using a sniper and want more ‘Hold Breath’ duration, add this one to your loadout.")
            elif perksQ == "g":
                    print("Ghost makes you undetectable by UAVs, Portable Radars, and Heartbeat Sensors.")
                


                
                
            
  
CodBotMW2()



