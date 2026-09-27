# Phase 1 - Group/Paired

#### the attacker is Yousef and the defender is Aarav

# phase 2 - Attacker groups: design a scenario 

#### The attack i chose is phishing email targeting the finance team

### 1. target selection
i would target a financial controller who approves wire transfers since they can move money or change bank details.

### 2. Reconnassance
i would try to see if there are any public vendor names in linkedin since if i know who they use for accounting or a specific supplier so i can spoof that relationship

### 3. Pretext
my scenario is a fake invoice from a know supplier but i alter their account number to seem not suspicious

### 4. Hook
the controller approves it and pays the invoice as part of their normal process, thats if they don't double check the account details so the money goes straight to me.

### 5. Execution script
#### i chose email text for this one and the fake email i have is: billing@kuljetuspalvelut-tampere.fi the real one has oy in it
Subject: Updated Invoice – Kuljetuspalvelut Tampere Oy – Payment Due 26.12.2027

From: billing@kuljetuspalvelut-tampere.fi
To: matti viitakoski, pohjola logistics oy

Hello Matti,

Please find attached the invoice for our latest transport services due for payment by 26.12.2027

please note that we have recently updated our bank account details due to an internal account restructuring, please ensure payment is sent to the new account listed below and disregard any previous account information you may have on file:

Bank: Nordea
Account Name: Kuljetuspalvelut Tampere Oy
IBAN: FI21 1234 5678 9000

Let us know when the payment has been processed, apologies for any inconvenience caused by the change.

kind regards,
Henkka Niinistö
Kuljetuspalvelut Tampere Oy


### 6. indicators
what red flags would be in my attack for number 1 it would probably be the fake account itself since the finance person could just call the real one and instantly shut down the entire attack. number 2 would be the fake email, since if he just double checks the email differences he would notice the oy is missing. 
