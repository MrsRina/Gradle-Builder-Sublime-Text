# # # # # # # # # #
# Python Imports  #
# # # # # # # # # #
import os;
import shutil;
import sys;

#
# Created by rina.
# In 25/09/2020.
#
class Compile:
	def __init__(self, task, args):
		self.run(task, args)

	def run(self, task, args):	
		os.system("" + task);

		try:
			shutil.copyfile("build/libs/" + str(args[0]) + ".jar", os.getenv("APPDATA") + "\\.minecraft\\mods\\" + str(args[1]) + ".jar")

			os.system("start " + args[2] + "");

			print("Build has been finished. No errors.");		
		except:
			print("A error ocurred in BUILD.");

		sys.exit()

Compile(
	task = "gradlew setupDecompWorkspace",
	args = ["NameOfMod", "FinalVersion", "MinecraftPath"]
);
