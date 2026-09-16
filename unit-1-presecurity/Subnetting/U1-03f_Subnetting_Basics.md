
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













