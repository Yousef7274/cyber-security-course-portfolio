# task 1    Embed the following sentence into a picture of your choosing, delete the original text file, and extract the secret sentence.  "Hello, this is a secret message!"

## this is the picture file i chose ("before i embedded anything inside")

<img width="547" height="365" alt="watermelon before embed" src="https://github.com/user-attachments/assets/7011986e-5452-4c22-b73e-665ff5fe8f2c" />

## this is the the picture ("after i embedded an encrypted txt file named "Secret.txt.gpg" into it")  
<img width="547" height="365" alt="Watermelon" src="https://github.com/user-attachments/assets/4e92db36-58bb-4b9b-be30-be9a271da6a9" />

## the encrypted text files passphrase is "zaza" the text file itself should say  "Hello, this is a secret message!  My name is Yousef." 

### one difference i noticed instantly was that the normal file went from "55,2" kb to "56.3" kb  since the encrypted text file i made was only 1 kb.


# task 2  You've been given 2 photos (cat1 and cat2) from an intercepted communication. One of them has an embedded secret message. Identify which photo is tampered with, then extract the secret. Use two different methods to verify it.


The photo that was tampered with was "cat1" i could tell it was tampered because of 2 things. First off was the size of the image they are the same image so they are supposed to be the same amount of megabytes.

<img width="227" height="419" alt="image" src="https://github.com/user-attachments/assets/bacc6959-8b1d-4a9f-8171-19caf36b7e94" />

<img width="227" height="415" alt="image" src="https://github.com/user-attachments/assets/d21e01a9-76eb-4329-999a-f513fcd80043" />




the 2nd reason i was able to tell that "cat1" had the embedded secret message was by using a steghide command in powershell. the command is written ".\steghide info "cat1.jpg" which after it asked me what is the passphrase which i wrote Varia123 and i got the secret text file

<img width="824" height="150" alt="image" src="https://github.com/user-attachments/assets/8b59560d-a606-4d8e-8610-7bdc93c1d043" />

inside of the secret text file was written "This is a secret message!"

# task 3 You are a cybersecurity professional performing an authorized penetration test on TechNova Solutions. You have successfully gained access to an internal file server and extracted an Excel spreadsheet containing employee data Your engagement scope requires you to demonstrate that data can be exfiltrated from the network without triggering DLP (Data Loss Prevention) alerts. Directly emailing or uploading the XLSX would be caught. Your task is to embed the spreadsheet into a legitimate-looking audio file of your choosing and demonstrate you can extract it later.

I first off make an audio file by using a music application and making the audio have only white noise play for 15 seconds. I downloaded the file as a .WAV format and named it Favourite-sound

<img width="233" height="431" alt="image" src="https://github.com/user-attachments/assets/e26282e5-3dca-4f54-baca-4c35591060e5" />

Since i made the audio file big enough to have 1,38 megabytes it had enough space to fit the file i need to hide. then i went to powershell to use steghide to hide the excel spreadsheet in the audio file that i made and wrote this command to embed the file. i also renamed the file into Favourite-music, the .WAV in the end was to make the file stay as .WAV format. 

<img width="863" height="86" alt="image" src="https://github.com/user-attachments/assets/54cacc42-921c-440e-a9b2-fd8b064d68ad" />


The 2nd image is to show that the audio file has the excel spreadsheet inside it.

<img width="868" height="190" alt="image" src="https://github.com/user-attachments/assets/e9ed11b8-5920-4e80-b894-61e4954eadcf" />

the passphrase i gave it was simple, its "zaza"


now how do i extract this file? By using steghide once again.

By using the "extract -sf" command i can extract the excel spreadsheet from the audio file. 

<img width="857" height="88" alt="image" src="https://github.com/user-attachments/assets/966751e3-fe4b-4f15-b226-8785b0dfc468" />
