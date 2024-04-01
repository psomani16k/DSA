import os as os
import datetime as dt
from termcolor import colored

PROBLEMS_DIRECTORY = os.getcwd() + "\Problems"

def monthlyQuestions():
    monthDirs = os.listdir(PROBLEMS_DIRECTORY)
    print("--------------")
    for i in monthDirs:
        count = 0
        for root_dir, cur_dir, files in os.walk(PROBLEMS_DIRECTORY + "\\" + i):
            count += len(files)
        
        print(f"{i} :", count)
        print("--------------")

def daysMissed():
    checkDate = dt.datetime(2024, 3, 28)
    while checkDate < dt.datetime.now():
        dirPath = PROBLEMS_DIRECTORY + "\\" + checkDate.strftime('%m-%Y\%d')
        if(checkDate.day == 1):
            print("------------")
            print(checkDate.strftime("%B-%Y"))
            print("------------")
        try:    
            if len(os.listdir(dirPath)) == 0:
                print(colored(checkDate.strftime('%d-%m-%y'), 'red'))
            else:    
                print(colored(checkDate.strftime('%d-%m-%y'), 'green'))
        except:
            print(colored(checkDate.strftime('%d-%m-%y'), 'red'))
        checkDate = checkDate + dt.timedelta(1)

