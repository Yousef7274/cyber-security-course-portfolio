# 1. Identify your target.
### I start off by writing the command "ifconfig" to find the host-only ip. Then i write "sudo netdiscover eth0" to identify the target.

<img width="959" height="562" alt="image" src="https://github.com/user-attachments/assets/bca4889a-e052-4628-95a8-b014f1086995" />

<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/56ae4510-ca2f-4b55-9b4b-f9c4cd5833fd" />


# 2. Scan your target and identify vulnerable services.
### In order to scan my target i have to use nmap so by writing "nmap -sS -sV 192.168.238.130" it shows me the vulnerable ports.

<img width="959" height="558" alt="image" src="https://github.com/user-attachments/assets/a19c3805-4de9-4919-828d-b2503cbd7e97" />


# 3. Search, select an appropriate exploit and show options.
### Now i need to go into the msfconsole, i first have to activate postgresql so i write "service postgresql start" then to check if its on i write "service postgresql status". After doing so i write "sudo msfconsole" to go inside the console. 

<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/d165a77c-6a02-41f4-a425-f7fb5486d8b3" />

<img width="959" height="564" alt="image" src="https://github.com/user-attachments/assets/5f22fb96-76e9-4d88-8085-e2eac0fb4fa5" />

### Now i search for the appropiate exploit that i am going to use. Which after i write "use 0" so i can enter the exploit and i write "show options" aswell to show what i can do with it.

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/92ba3a80-f0f2-4dc6-a521-0037b0534af9" />


# 4. Set target IP address.
### I set my ip address by using RHOSTS then check.  

<img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/6971d851-f0ce-4c06-ae0b-9c81e09eb940" />


# 5. Run the exploit.

<img width="792" height="377" alt="image" src="https://github.com/user-attachments/assets/bd394154-0dfd-4198-a251-d2fd724b20e0" />


# 6. use netcat to verify enumerated users.
### I used net cat with the command "nc 192.168.238.130" it almost worked but since my computer is crappy it couldn't finish.

<img width="959" height="392" alt="image" src="https://github.com/user-attachments/assets/17660bd2-7d5a-4305-b35b-bbe20c08aff2" />
