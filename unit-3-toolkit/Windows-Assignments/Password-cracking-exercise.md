
# task 3


<img width="577" height="92" alt="image" src="https://github.com/user-attachments/assets/d1926a5c-099b-406b-b889-bce39d0778e4" />



<img width="775" height="308" alt="image" src="https://github.com/user-attachments/assets/19cf3485-215d-40e0-9ec1-34550b5b0e5f" />




local_shadow = 1234

## Task 4 and the rest take too long to do it on windows so i will continue this in my VM.

# task 4

### I made the file with nano in kali.

<img width="959" height="548" alt="image" src="https://github.com/user-attachments/assets/5915e129-3f5a-4a6c-b628-97bb97a610d6" />

### Now i extract the crackable hash with ssh2john

<img width="627" height="210" alt="image" src="https://github.com/user-attachments/assets/9dcb42cc-fbd8-4333-bbe5-648d9005139b" />

<img width="959" height="532" alt="image" src="https://github.com/user-attachments/assets/fdbd5cb2-d6e6-4829-9f40-e4f79370d352" />

### The extracted message turned out to be mango

<img width="191" height="86" alt="image" src="https://github.com/user-attachments/assets/da3e115d-557d-4adf-9ab8-b72a724f07d8" />

# task 5

### In this one i will use zip2john.

### I first copy the folder from my computer onto the vm.

<img width="959" height="291" alt="image" src="https://github.com/user-attachments/assets/fc24ced5-b73d-44b4-9af4-9e2cb5316fdc" />

### Run zipjohn on it.

<img width="959" height="458" alt="image" src="https://github.com/user-attachments/assets/50e3933e-9c91-4717-a14a-edd6f1cf5cb9" />

### Now crack it.

<img width="537" height="127" alt="image" src="https://github.com/user-attachments/assets/fbf5c12b-f6ae-4a57-b621-e56d741668a5" />

### After getting the password for the encrypted file, i opened it using it to find the secret message 

<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/39c15bf3-420a-486e-897a-c96f8abc58a8" />

### The encrypted message was " THM{w3ll_d0n3_h4sh_r0y4l} "

# task 6

### Copy the file into kali the same way i did with task 5.

<img width="837" height="296" alt="image" src="https://github.com/user-attachments/assets/9ad5a9b4-a7ac-4b0d-a380-20af9b01af8d" />

### Open the file with rar2john

<img width="625" height="379" alt="image" src="https://github.com/user-attachments/assets/e1670d92-6e5a-47f5-82f5-de35608147d8" />

### Crack it with the rockyou.txt

<img width="959" height="502" alt="image" src="https://github.com/user-attachments/assets/440fa2be-cd3d-4ebd-a44f-01af5a5544df" />

### The password is " password "

### Now i open the encrypted file with the password.

<img width="959" height="539" alt="image" src="https://github.com/user-attachments/assets/824c71fd-908f-442d-ab54-fe350ad0255d" />

<img width="712" height="401" alt="image" src="https://github.com/user-attachments/assets/163229c3-0f44-4782-93a7-eb005fed1d4e" />

<img width="763" height="368" alt="image" src="https://github.com/user-attachments/assets/59495362-8ab4-4fe1-b8ef-f9914110b8b8" />

### The encrypted message was " THM{r4r_4rch1ve5_th15_t1m3} "
