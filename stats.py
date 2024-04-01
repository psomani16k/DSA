import os as os

dir_path = 'C:/Users/Parth Somani/Desktop/DSA/Problems'
monthDirs = os.listdir(dir_path)


def monthlyQuestions():
    for i in monthDirs:
        count = 0
        for root_dir, cur_dir, files in os.walk(dir_path + "/" + i):
            count += len(files)
        print(f"{i}:", count)