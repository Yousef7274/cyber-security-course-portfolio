# 1. Install VMware. Download and install VMware Workstation (Windows / Linux) or Fusion (macOS).

### I downloaded VMware since i use Windows .

<img width="230" height="404" alt="image" src="https://github.com/user-attachments/assets/f1c58ad7-b7e9-4877-a616-1616a110c5f8" />


# 2. Create the Kali VM. Download the Kali installer image, create a new VM (≈ 4 GB RAM, 2 - 4 CPU, 80 GB disk) and give it two network adapters: NAT (for updates) and Host-Only.

### I made the VM and gave it another network adapter since it only had 1.

<img width="238" height="403" alt="image" src="https://github.com/user-attachments/assets/356c66ed-f54f-4919-9184-de21b685b5b5" />

<img width="515" height="417" alt="image" src="https://github.com/user-attachments/assets/be90512d-87e6-49c0-b4ee-32aee9e53773" />


# 3. Import Metasploitable 2. Download and unzip it, then open the existing .vmx file in VMware. Set its only network adapter to Host-Only.

<img width="243" height="399" alt="image" src="https://github.com/user-attachments/assets/c14b8f61-c319-4bde-9cbb-fc223e37ac49" />

<img width="516" height="424" alt="image" src="https://github.com/user-attachments/assets/02520334-e81a-46f6-8cad-b6473274dda0" />


# 4. Lock down the network. Confirm both VMs share the same Host-Only network, and that Metasploitable has no NAT or Bridged adapter.


### This one is Metasploitable.
<img width="569" height="406" alt="image" src="https://github.com/user-attachments/assets/d87bd044-c55d-4227-a20d-e5151d853d88" />

### Metasploitable has 1 network adapter and its Host-Only. As for kali it has 2, one that is Host-Only so it can talk with Metasploitable, and another one that is NAT so it can update.


### This one is Kali.
<img width="572" height="425" alt="image" src="https://github.com/user-attachments/assets/18519f03-de34-4c19-870c-83ee8f88f28d" />


# 5. Verify isolation. From Metasploitable, try to reach the internet, it should fail. From Kali, ping Metasploitable's Host-Only IP, it should succeed. Now you're ready


### Here is me trying to reach the internet with Metasploitable and it failing.
<img width="526" height="309" alt="image" src="https://github.com/user-attachments/assets/c531fa25-356c-4060-b44e-e2fb15059b7e" />


### And now here is me pinging Metasploitable's Host-Only IP through Kali.
<img width="800" height="527" alt="image" src="https://github.com/user-attachments/assets/efe981d6-e02d-4e5b-8046-2576709864b2" />
