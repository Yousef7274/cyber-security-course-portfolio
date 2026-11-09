
# ⚠️ Ethical & legal: Phishing anyone without their written prior consent is a criminal offence in Finland (Rikoslaki Ch. 38 § 6 - petos / Ch. 36 - identity fraud, depending on content), and sending bulk unsolicited mail may also violate the e-Privacy Directive. The consent step is non-negotiable. If you can't get it in writing, don't run the campaign. Clear out the Gophish database when done.


# 1. Download and install Gophish onto a VM.

### I first go into the Gophish phishing campaing github in order to download the file that i need. I make sure to download the linux one since the VM im running it on is going to be in linux.

<img width="744" height="113" alt="image" src="https://github.com/user-attachments/assets/0abe23b1-0f76-4d41-9484-91264036d40e" />

### Now i go inside VMware workstation to create a new Virtual Machine and i make sure its typical. I go to download an ISO file since a new VM needs one, i downloaded it from this link https://ubuntu.com/download/server. I made the VM NAT so i could install Gophish in it.

<img width="959" height="557" alt="image" src="https://github.com/user-attachments/assets/aa02d1e3-0089-4e1d-aeeb-4630d56dadb0" />

<img width="959" height="559" alt="image" src="https://github.com/user-attachments/assets/c2cd0419-eff2-45c5-a4f1-ded7125f16f1" />

<img width="322" height="308" alt="image" src="https://github.com/user-attachments/assets/f4c3a55c-e119-44c8-8b0f-032693ce888e" />

<img width="698" height="431" alt="image" src="https://github.com/user-attachments/assets/57a873ff-5078-4b92-996a-eeaeb01c6c4a" />

<img width="457" height="262" alt="image" src="https://github.com/user-attachments/assets/c6a0c6b2-8923-4fbf-b68f-252239d99fb8" />

### After installing ubuntu linux and making a Virtual machine i now need to download Gophish into it. 

<img width="282" height="31" alt="image" src="https://github.com/user-attachments/assets/2ec19267-8c65-4622-91b5-b1c5e275e778" />

### Now i use this command to take the file and put it into the VM. And to also unzip the file.

<img width="488" height="11" alt="image" src="https://github.com/user-attachments/assets/8f4ee7b9-53aa-4aa1-a12a-69a9c0223ed3" />
________________________________________________________________________________________________________________________________

<img width="200" height="17" alt="image" src="https://github.com/user-attachments/assets/36b866c7-a970-4bc3-aac4-8c18cf01b746" />
________________________________________________________________________________________________________________________________

<img width="300" height="25" alt="image" src="https://github.com/user-attachments/assets/94a5c1ae-d7cf-40ba-bb68-91c2ed7de610" />

### Here i will make the binary executable

<img width="140" height="24" alt="image" src="https://github.com/user-attachments/assets/46b8c9ea-9617-4f69-b9b7-5b46039b3dcc" />
________________________________________________________________________________________________________________________________

<img width="207" height="37" alt="image" src="https://github.com/user-attachments/assets/f720e02f-aa1e-4516-bc29-14521e7abd22" />

### Now ill try to run it by using the command "sudo ./gophish"

<img width="513" height="157" alt="image" src="https://github.com/user-attachments/assets/b3759a59-972d-43d4-9c60-12d9287004a2" />

### After confirming that the VM has Gophish and that it can run. I will now switch the network adapter from NAT to Host-Only.

<img width="573" height="559" alt="image" src="https://github.com/user-attachments/assets/e70460a5-7351-492a-95e7-0c8714ac8c49" />

### Now finally i have to reboot the VM by using "sudo reboot" so it can get the new IP.

<img width="480" height="236" alt="image" src="https://github.com/user-attachments/assets/8dbd0d6b-4ed1-425b-b6e5-d075e8e1fdc6" />

# 2. Build a landing page, an email template, and a sending profile.

## I first need access to the admin panel in order to set all 3 of them up. 

### I go into the Gophish directory with the cd command then use the nano command to edit the file.

<img width="959" height="296" alt="image" src="https://github.com/user-attachments/assets/60c80135-7ecd-43d3-a308-20168b6ef56c" />

### once inside i have to turn the first listening url from "127.0.0.1:3333" into 0.0.0.0:3333 so it gives me access to the admin panel. I make sure to press "ctrl + O + enter" so it saves and names the file the same as it was, then i use "ctrl + X" to exit. After doing so i have to reboot the VM so it gets the new ip.

<img width="959" height="361" alt="image" src="https://github.com/user-attachments/assets/1c87a619-6e46-43c3-bf70-1621dc0761ad" />

<img width="718" height="89" alt="image" src="https://github.com/user-attachments/assets/de5312c3-c9c7-417f-b267-11d90cc357e0" />

### A quick check to see if it works.

<img width="493" height="125" alt="image" src="https://github.com/user-attachments/assets/0daa362b-90d7-42e3-985c-e411d0990dcc" />

### Now i need to enter the ip inside my browser in order to enter the phishing website. 

<img width="959" height="559" alt="image" src="https://github.com/user-attachments/assets/88596c30-1e93-4631-afe7-804c9cde4fcc" />

<img width="959" height="559" alt="image" src="https://github.com/user-attachments/assets/836c7e47-a329-4d64-8f3b-fea67a0e9c3c" /> 

<img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/43699847-2156-4d6b-8ff1-c2848bc920b6" />

### Now i log in into the phishing website, so i can make a permanent password and also make a landing page, an email template, and a sending profile.

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/083ab057-b175-418a-834d-fabf90ecb417" />

<img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/a4c695ad-74a1-4a68-92e6-04493857ff96" />

### Now that i am in, i decided to make a sending profile first so on the panel on the left i clicked "Sending Profiles" and put that on hold.

<img width="959" height="562" alt="image" src="https://github.com/user-attachments/assets/4d285d82-4f21-4b85-ae40-3ecf0cbb3d4b" />

<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/56a31aa4-e50f-496c-8c9c-79ebbd79d515" />

### I make an account in Mailgun.com in order to get a domain, i made a new smtp user aswell. After doing so i save the information from it. I make sure the email is the same as the person im attacking.

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/b5b82400-da2e-4e6c-a633-409b568f0b91" />

<img width="959" height="527" alt="image" src="https://github.com/user-attachments/assets/3d799778-89ff-4af5-9903-3f3b7eb04add" />

<img width="835" height="436" alt="image" src="https://github.com/user-attachments/assets/d8cb200a-5386-4631-8a67-6a5ccaa6be09" />

<img width="298" height="190" alt="image" src="https://github.com/user-attachments/assets/d53adc85-2acf-432c-9d19-686833605305" />

<img width="799" height="165" alt="image" src="https://github.com/user-attachments/assets/ca35f344-05e8-4dd2-b6d5-123f03bcfb5f" />

### I now tab back into the Gophish tab to make the sending profile. I put all the information that i got from mailgun and sent a test email to my email to see if it worked.

<img width="528" height="470" alt="image" src="https://github.com/user-attachments/assets/61a3708e-094c-49f2-91c9-6ea5fe454d4d" />

<img width="525" height="249" alt="image" src="https://github.com/user-attachments/assets/3e3b17e9-c46f-4273-b9bd-997d75be4369" />

<img width="787" height="389" alt="image" src="https://github.com/user-attachments/assets/4df9cde4-0b88-4a1e-ab33-e94ea32cba2c" />


### Now i need to make an email template. I wrote all the information and also a little bit of html code "that took me 15 minutes".

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/1ee61b2d-ad89-419d-9593-f2cebba35306" />

<img width="422" height="492" alt="image" src="https://github.com/user-attachments/assets/2038139a-093d-4fe2-9f76-ee5e41bf23f1" />

<img width="260" height="476" alt="image" src="https://github.com/user-attachments/assets/571d1ebf-9d4f-4d71-ad9c-98e878affa56" />

<img width="959" height="564" alt="image" src="https://github.com/user-attachments/assets/db946b84-33a0-4258-a733-5af56c47eec4" />

### Now finally i will make the landing page. 

<img width="959" height="562" alt="image" src="https://github.com/user-attachments/assets/0ed7eeae-8a20-43f8-8bbe-680901f3ec3d" />

<img width="551" height="474" alt="image" src="https://github.com/user-attachments/assets/9e5945a5-049f-4c56-b2f6-5b85a10087c3" />

#### Some more html coding. (good god)

<img width="349" height="485" alt="image" src="https://github.com/user-attachments/assets/2eeaff6b-73cc-4f71-937e-95a0d702b16b" />

# 3. Recruit a small opt-in group from the class (written consent, in advance) This is the ONLY acceptable target pool!

### Now that i am done setting up everything, i go to make my target group. First i need one classmate and his consent, so i open google forms to have the classmate, consent so i don't go to jail if i use it on them.

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/20d37aba-1a60-408a-861b-9a372e6b1de9" />

### Here is the full form, i enabled collect email so i could also verify that part.

<img width="959" height="562" alt="image" src="https://github.com/user-attachments/assets/e38b0762-25d1-4258-8f38-1bad773acf31" />

### After getting consent i now need to make a new group in the gophish website.

<img width="959" height="565" alt="image" src="https://github.com/user-attachments/assets/736704cf-ae2c-4f8b-b447-b69c884846d2" />

### Before i make the users and groups in gophish and send it, i make a ngrok temporary public url that reaches straight to my VM. First i make an email in ngrok.com for the token.

<img width="959" height="528" alt="image" src="https://github.com/user-attachments/assets/13dfc94f-b695-4bc8-8617-ab21505062d0" />

<img width="724" height="419" alt="image" src="https://github.com/user-attachments/assets/7babaaa6-29cd-40d2-a7a6-cc7162aa7139" />

### In the VM's terminal i download ngrok inside.

<img width="706" height="295" alt="image" src="https://github.com/user-attachments/assets/31c85703-8d7a-4f3b-816a-3ffce7ba20e5" />

<img width="374" height="236" alt="image" src="https://github.com/user-attachments/assets/c9cae098-aa18-4866-a785-ad90e305ffad" />

### Once i added the auth-token i need to start my endpoint.

<img width="180" height="16" alt="image" src="https://github.com/user-attachments/assets/6e757de3-cc47-483c-8b4a-aa66b1911c30" />

<img width="349" height="14" alt="image" src="https://github.com/user-attachments/assets/6f466b0f-dbd9-43dd-ac34-5217278ede3d" />

<img width="356" height="60" alt="image" src="https://github.com/user-attachments/assets/64d8a259-bc8d-4086-b258-d19e0eba4445" />

<img width="425" height="191" alt="image" src="https://github.com/user-attachments/assets/fc0e9f4b-82ee-49d5-858b-a11c2fb18e1a" />

### I now make my users and groups.

<img width="526" height="432" alt="image" src="https://github.com/user-attachments/assets/fc4b82fb-4d09-4b92-a8d3-7ea4ab384650" />

### Now i finally have to make a campaign, then launch it.

<img width="959" height="559" alt="image" src="https://github.com/user-attachments/assets/9b018d0a-446e-43ec-bce7-143961337d97" />

<img width="959" height="560" alt="image" src="https://github.com/user-attachments/assets/c7b1d45a-8b47-47d0-9ffb-c86e39288512" />

<img width="959" height="564" alt="image" src="https://github.com/user-attachments/assets/b92a7fdf-fe85-4c6f-b8a2-92c93761d33f" />

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/b6a6b07c-c18d-4b0f-8832-11b3206028d9" />

<img width="959" height="562" alt="image" src="https://github.com/user-attachments/assets/ba90646a-5395-466f-b2b2-a46a23172b6f" />

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/1e0dfe34-33e7-441a-9683-bd33bbc464c6" />

<img width="786" height="56" alt="image" src="https://github.com/user-attachments/assets/7921b9a2-efd3-4de3-b0d7-2eb87a9cc397" />

<img width="805" height="377" alt="image" src="https://github.com/user-attachments/assets/45b4018d-8c0b-4744-a03a-3a32e94d7182" />

<img width="416" height="197" alt="image" src="https://github.com/user-attachments/assets/458d91ee-0a94-4903-83c3-47675bf084a9" />


#### Afterwards i debriefed my friend on what the website gave me and what info it gave me.

### also here is what the website looked like

<img width="4080" height="3060" alt="20261109_105903" src="https://github.com/user-attachments/assets/adba9125-756c-44a6-ba78-7dbdbb8b73e2" />

<img width="4080" height="3060" alt="20261109_104946" src="https://github.com/user-attachments/assets/c451e9d6-11ba-42ff-9260-5be6fcd0af24" />


_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________

_________________________________________________________________________________________________________________________________________________


# a tiny test i did where i tried to make a Host-Only server.

### I opened a 2nd terminal in my Gophish VM by using the combination "ctrl + alt + F2" and "ctrl + alt + F1" to go back to the original VM. I have the 1st terminal still open to keep the phishing page up. Now in the 2nd terminal i start a local mail server by making a python code file with nano. After a painful 35 minutes of writing python code i save the file with "ctrl + O" then exit it using "ctrl X". 

<img width="959" height="563" alt="image" src="https://github.com/user-attachments/assets/c078ead6-c287-4847-b3b2-bd7fceb3557f" />

### Time to test if it works. Sh#t, it failed because of a typo, motherfu##. "nano fake_smtp.py" to fix my mistake quickly.

<img width="266" height="76" alt="image" src="https://github.com/user-attachments/assets/a6b1b67c-e401-4f2d-9b56-0a5de238b827" />

## There we go it finally works. welp, this was a waste of time, i don't know what i was thinking.

<img width="250" height="48" alt="image" src="https://github.com/user-attachments/assets/f8adfda2-b160-4273-bf3b-2ace1b4d06e1" />



