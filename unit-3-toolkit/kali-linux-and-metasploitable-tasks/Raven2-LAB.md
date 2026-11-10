# 1. Download Raven 2 lab from the website.

### I first head over to the website to download raven.
<img width="959" height="213" alt="image" src="https://github.com/user-attachments/assets/2e444937-1fd5-496e-b0ca-53eece73224f" />

<img width="236" height="415" alt="image" src="https://github.com/user-attachments/assets/db4a0a95-d81f-40a3-8571-0768a1290453" />


# 2. add it into VMware and check if it works.
### I open VMware and go into "home" then in there i click "open a Virtual Machine"
<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/7d51b6d9-c206-4288-b4f7-f9c2bb1eb800" />

### I then open the raven 2 file inside VMware and then import it.

<img width="959" height="532" alt="image" src="https://github.com/user-attachments/assets/f67b1f66-c92a-4813-8283-72c93ee53ac5" />

<img width="316" height="319" alt="image" src="https://github.com/user-attachments/assets/303bb442-fbab-4d13-b567-9b380584ffce" />

# 3. Upgrade Virtual Machine, check if it works and crack the password.

### I click the "upgrade this Virtual Machine" and after that i made sure to upgrade it to the latest version.

<img width="190" height="103" alt="image" src="https://github.com/user-attachments/assets/bebc150e-ad42-4999-8de7-2c875fe4fa97" />

<img width="951" height="524" alt="image" src="https://github.com/user-attachments/assets/d648aa53-5d47-40af-acd0-4e1254a846d4" />

<img width="548" height="377" alt="image" src="https://github.com/user-attachments/assets/f21a7ffb-6983-46bd-9d23-f2a6b30a6988" />


### I make sure to "Alter this Virtual Machine" as to not make a copy of it.

<img width="321" height="271" alt="image" src="https://github.com/user-attachments/assets/ef2ddc7f-b686-4b0c-9ac0-431846a93b52" />

### I then make sure to switch the internet to "Host-Only" by going into "edit this Virtual Machine settings" as to not attack the internet and make sure the other vm's can speak with each other.

<img width="191" height="67" alt="image" src="https://github.com/user-attachments/assets/2a689c22-36d9-4070-b051-fb56c45ab7ec" />

<img width="577" height="561" alt="image" src="https://github.com/user-attachments/assets/494d45b6-b76d-41ed-a394-213472fd05a5" />

### Now i have to figure out what the password is so i first power on the virtual machine by clicking "Power on this virtual machine". 

<img width="181" height="54" alt="image" src="https://github.com/user-attachments/assets/0ac806ac-a677-4a1f-8c43-bd6417994d4c" />

### I open kali linux in order to find out what the password is.

### i first write sudo netdiscover on the Host-Only network adapter to figure out which of them is assigned to Raven2

### i found Raven2's ip and with it i will try to find the password. The ip is 192.168.238.132.

<img width="869" height="501" alt="image" src="https://github.com/user-attachments/assets/3d7dff73-008a-493d-a5eb-1035a4958439" />

###  for my first method im going to try to bruteforce it

### so first i have to open the msfconsole, but before that i have to start it by starting the postgresql service. 

<img width="611" height="514" alt="image" src="https://github.com/user-attachments/assets/89cbce28-6dd3-4448-b783-53a18ae309d9" />

### i then open msfconsole with the command.

<img width="959" height="562" alt="image" src="https://github.com/user-attachments/assets/3f9db888-9035-4773-a13e-8a65b5c54fd6" />

### I then search for the exploit im going to be using which is telnet_login for this. Then i need to set the RHOSTS to the Raven2 Host-Only ip then i use my wordlist.txt file that i created with nano which contains the user and password that i am going to use to try to bruteforce it.

<img width="959" height="547" alt="image" src="https://github.com/user-attachments/assets/22497d77-1eeb-4dcf-b925-d2c035bf930f" />

# Attempt 1 fail.

<img width="465" height="43" alt="image" src="https://github.com/user-attachments/assets/6d94d63b-05b8-4458-9057-243b7e25eff6" />

# Second attempt.

### This time im checking the connectivity and checking Raven2's ports.

<img width="959" height="548" alt="image" src="https://github.com/user-attachments/assets/f3de00b4-34a0-4f3d-ae6a-bb5a5c028569" />

### Now im trying to directory bruteforce it

<img width="457" height="44" alt="image" src="https://github.com/user-attachments/assets/780dab5d-d5b2-4fb9-acfc-60371c0a9e3a" />

<img width="959" height="544" alt="image" src="https://github.com/user-attachments/assets/ec76d6dd-c7df-40ff-a031-64eee3e60e6e" />

### Now here i run a wps scan to find the information i need.

<img width="816" height="282" alt="image" src="https://github.com/user-attachments/assets/8d53ca94-10ac-4617-a8e9-7d1d69be104f" />

<img width="552" height="397" alt="image" src="https://github.com/user-attachments/assets/676d16ab-fd82-4fb6-83f9-dcf23ae30121" />

<img width="810" height="197" alt="image" src="https://github.com/user-attachments/assets/f0fb6ce1-6440-4a16-8342-02c8c7cda774" />

### from the WPS scan i found 2 usernames "Steven" and "Michael"

### i enter into exploit cve 

<img width="229" height="32" alt="image" src="https://github.com/user-attachments/assets/196f070b-1b70-463d-9ff7-b04086000f97" />

### Now i run "./exploit.sh 192.168.238.132"

### Sadly it failed at the last moment.

<img width="367" height="66" alt="image" src="https://github.com/user-attachments/assets/396959a0-070c-4e2d-baf5-5a72bdbc28fb" />

# Attempt 2 fail.

# I just realised i wasn't supposed to find the password in this assignment.
