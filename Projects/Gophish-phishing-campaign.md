# 1. Download and install Gophish onto a VM.

### I first go into the Gophish phishing campaing github in order to download the file that i need. I make sure to download the linux one since the VM im running it on is going to be in linux.

<img width="744" height="113" alt="image" src="https://github.com/user-attachments/assets/0abe23b1-0f76-4d41-9484-91264036d40e" />

### Now i go inside VMware workstation to create a new Virtual Machine and i make sure its typical. I go to download an ISO file since a new VM needs one, i downloaded it from this link https://ubuntu.com/download/server. I made the VM NAT for now so i could install Gophish in it.

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

# Build a landing page, an email template, and a sending profile
