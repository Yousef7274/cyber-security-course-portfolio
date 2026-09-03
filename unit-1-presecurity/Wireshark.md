# Part A - the HTTP capture

## Question: What username and password were sent?

Username: anna.virtanen
Password: Summer2026!

I found it in the HTTP POST data:
username=anna.virtanen&password=Summer2026!&remember=on

## Question: Was the login submitted using GET or POST?

The login was submitted by using POST.

## Question: What is the SESSION ID cookie, and why is it dangerous?

The SESSION ID was:
a3f9c2e7b81d4f60a5e2c9d10f4b7e88

It was shown in the HTTP response as a Set-Cookie header.

This is very dangerous since if an attacker steals the cookie they could access the users logged in session without knowing the password.

## Question: What two sensitive pieces of information were visible on the dashboard?

The role and email were shown, and they are very sensitive information.

This information was visible because the website was using plain HTTP.

Role: Finance Administrator
Email: [anna.virtanen@pohjola-logistics.local](mailto:anna.virtanen@pohjola-logistics.local)

# Part B - the HTTPS capture

## Question: Can the username and password be found in the HTTPS capture? Why or why not?

No since the username and password are encrypted by TLS, so someone watching the network can't read the login information.

##  Question: What is the server name shown in the Client Hello?

The server name was lab-portal.local.

I found it in the SNI in the TLS Client Hello.

## Question: What can an eavesdropper still learn from the HTTPS capture?

They can still see some information, such as you're IP addresses, The packet sizes and the timing. though they cannot see the actual encrypted website data.

# Part C - making sense of it

## Question: Why does protocol choice matter for confidentiality?

HTTP tends to sends information in plain text, while HTTPS encrypts it. that means HTTPS is way safer for things like passwords and other private information.

## Question: Give a daily-life example involving an untrusted network.

if I use a public WiFi at a airport, the HTTPS helps protect my web traffic from other people on the network. They probably will still be able to see some information like IP addresses, but not the actual traffic.

## Question: What surprised me

It suprised me how much information one could get out of wire shark.

## How was i able to do wireshark without my own computer?

I asked one of my friends to lend me their computer so i could do this whole assignment. Said friend also helped me find some info when i couldn't find it myself.
