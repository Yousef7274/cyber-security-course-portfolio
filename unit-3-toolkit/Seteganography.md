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

# task 3 You are a cybersecurity professional performing an authorized penetration test on TechNova Solutions. You have successfully gained access to an internal file server and extracted an Excel spreadsheet containing employee data 

