
## Decimal to Binary

| Decimal | Binary  |
|---------|----------|
| 10      | 00001010 | 
| 210     | 11010010 |
| 168     | 10101000 |
| 16      | 00010000 | 
| 255     | 11111111 | 
| 128     | 10000000 | 
| 192     | 11000000 | 
| 248     | 11111000 | 
|  0      | 00000000 | 

<img width="3060" height="4080" alt="image" src="https://github.com/user-attachments/assets/9e888514-c03f-497f-8cc0-a407004e007e" />

## Binary to Decimal

|  Binary  | Decimal  |
|----------|----------|
| 11000000 | 192      | 
| 11111111 | 255      |
| 10101000 | 168      |
| 00010000 | 16       | 
| 11111000 | 248      | 
| 11010010 | 210      | 


<img width="3060" height="4080" alt="image" src="https://github.com/user-attachments/assets/d73a1592-c58d-46d1-9e13-9dd6e7c6915d" />

## Full-address-conversion
basically making an ip address into binary.

10.210.168.16 becomes into 00001010.11010010.10101000.00010000

192.168.0.1 gets changed into 11000000.10101000.00000000.00000001

172.16.5.100 becomes into 10101100.00010000.00000101.01100100

## Full-address-conversion but starting from binary

11000000.10101000.00000001.00000001 becomes into --< 192.168.1.1
00001010.00001010.00000000.01001011 turns into --> 10.10.0.75


<img width="3060" height="4080" alt="image" src="https://github.com/user-attachments/assets/212fccd7-7d0a-4978-a007-b2bfcbd78ce6" />


## Recognize the class and CIDR


|  Address      |  Class   | Default mask (dotted) | Default mask (CIDR) |
|---------------|----------|-----------------------|---------------------|
| 10.0.0.5      |    A     |     255.0.0.0         |  /8                 |
| 192.168.1.1   |    C     |     255.255.255.0     |  /24                |
| 172.16.4.20   |    B     |     255.255.0.0       |  /16                |
| 8.8.8.8       |    A     |     255.0.0.0         |  /8                 |
| 200.100.50.25 |    C     |     255.255.255.0     |  /24                |

## Masks <-> CIDR <-> binary

| Dotted-decimal  |  CIDR    | Binary (32 bits, dots between octets) |
|-----------------|----------|------------------------------------- |
| 255.255.255.0   |   /24    | 11111111.11111111.11111111.00000000  |
| 255.255.0.0     |   /16    | 11111111.11111111.00000000.00000000  |
| 255.0.0.0       |   /8     | 11111111.00000000.00000000.00000000  |
| 255.255.255.192 |   /26    | 11111111.11111111.11111111.11000000  |
| 255.255.248.0   |   /21    | 11111111.11111111.11111000.00000000  |
| 255.255.255.128 |   /25    | 11111111.11111111.11111111.10000000  |

## Networks and hosts per class

| Class |  Default CIDR |   Number of possible networks | Number of hosts per network |
|-------|---------------|-------------------------------|-----------------------------|
| A     | /8            |   128                         |   16 million hosts          |
| B     | /16           |   16k                         |   64k hosts                 |
| C     | /24           |   2 million                   |   254 hosts                 |

##  The five key values - the main event

### 3.1 - 172.16.0.0/16
Subnet mask: 255.255.0.0
Network address: 172.16.0.0
Default gateway: 172.16.0.1
Host range start: 172.16.0.2
Host range end: 172.16.255.254
Broadcast: 172.16.255.255

### 3.2 - 10.10.0.0/26

Subnet mask: 255.255.255.192
Network address: 10.10.0.0
Default gateway: 10.10.0.1
Host range start: 10.10.0.2
Host range end: 10.10.0.62
Broadcast: 10.10.0.63

### 3.3 - 192.168.5.0/28

Subnet mask: 255.255.255.240
Network address: 192.168.5.0
Default gateway: 192.168.5.1
Host range start: 192.168.5.2
Host range end: 192.168.5.15
Broadcast: 192.168.5.14

### 3.4 - 10.0.0.0/30

Subnet mask: 255.255.255.252
Network address: 10.0.0.0
Default gateway: 10.0.0.1
Host range start: 10.0.0.2
Host range end: 10.0.0.2
Broadcast: 10.0.0.3

### 3.5 - 192.168.100.128/25

Subnet mask: 255.255.255.128
Network address: 192.168.100.128
Default gateway: 192.168.100.129
Host range start: 192.168.100.130
Host range end: 192.168.100.254
Broadcast: 192.168.100.255

## Which subnet does this host belong to?


### 4.1 - 10.10.0.75/26

of this subnet: 10.10.0.64
Broadcast of this subnet: 10.10.0.127
Is this address a valid host address, or is it the network/broadcast? (Explain how you know.)
10.10.0.75/26 is a valid host address. sincr its subnet runs from 10.10.0.64 to 10.10.0.127, and 75 is neither.


### 4.2 - 192.168.1.200/26

Network address: 192.168.1.192
Broadcast: 192.168.1.255
Valid host? (yes/no + reason)
yes it is valid the reason is its subnet is from 192.168.1.192 to 192.168.1.255 and 200 is not either of them.


### 4.3 - 172.16.5.130/25

Network address: 172.16.5.128
Broadcast: 172.16.5.255
Valid host? (yes/no + reason)
yes it is a valid host. this ones subnet goes from 172.16.5.128 into 172.16.5.255 and they both arent 130


### 4.4 - 10.0.0.0/30

Network address: 10.0.0.0
Broadcast: 10.0.0.3
Valid host? (yes/no + reason - this one is a trap; think carefully about a /30)
now this one is not a valid host. the addresses host bits are set to 0 so only 2 hosts are usuable

## Slicing up a /24

### 5.1 - Four equal /26 subnets
Divide 192.168.10.0/24 into four equal /26 subnets. For each of the four resulting subnets, write out:

Network address	192.168.10.0/26
Default gateway	192.168.10.1
Host range the start --> 192.168.10.1  the end ---> 192.168.10.62
Broadcast address 192.168.10.63

Network address 192.168.10.64/26
Default gateway 192.168.10.65
Host range the start --> 	192.168.10.65 the end ---> 	192.168.10.126
Broadcast address 192.168.10.127

Network address 192.168.10.128/26
Default gateway 192.168.10.129
Host range the start --> 192.168.10.129  the end ---> 192.168.10.190
Broadcast address	192.168.10.191

Network address 192.168.10.192/26
Default gateway 192.168.10.193
Host range the start --> 	192.168.10.193  the end ---> 192.168.10.254
Broadcast address	192.168.10.255

### 5.2 - Enough hosts?

Department A: 50 hosts
Department B: 25 hosts
Department C: 10 hosts
Department D: 2 hosts (a point-to-point link)

#### Would a /26 fit all four departments? Which departments have "too much" address space and could use a smaller subnet (higher CIDR number, fewer host bits)?
no it wouldnt fit all 4 departments 



|   CIDR  |total addresses| Usable hosts (total − 2)    |
|---------|---------------|-----------------------------|
| /24     | 256           |   254                       |
| /25     | 128           |   126                       |
| /26     | 64            |   62                        |
| /27     | 32            |   30                        |
| /28     | 16            |   14                        |
| /29     | 8             |   6                         |
| /30     | 4             |   2                         |

| Department | Hosts Needed | Suggested CIDR | Usable Hosts |
|---|---:|---:|---:|
| A | 50 | /26 | 62 |
| B | 25 | /27 | 30 |
| C | 10 | /28 | 14 |
| D | 2 | /30 | 2 |

The department A needs /26 because /27 only has 30 usable hosts.

The department B can use /27 because it has 30 usable hosts.

The department C can use /28 because it has 14 usable hosts.

The department D needs to use /30 since it has only 2 usable hosts.

---

##  IPv6, Briefly

### 6.1 - Hex ↔ Decimal ↔ Binary
| Hex | Decimal | Binary |
|---|---:|---:|
| 0 | 0 | 0000 |
| 5 | 5 | 0101 |
| a | 10 | 1010 |
| f | 15 | 1111 |

### 6.2 - Compress These IPv6 Addresses
2001:0df8:23f2:0000:0000:0000:0000:0f11

2001:df8:23f2::f11

2001:0000:00d0:00f2:0000:0000:0000:0f11

2001:0:d0:f2::f11

fe80:0000:0000:0000:0000:0000:0000:0001

fe80::1

### 6.3 - A conceptual question

We need IPV6 since ipv4 addresses are starting to run out since there are only like 4 billion of them in the world while ipv6 has enough to last future generations.
