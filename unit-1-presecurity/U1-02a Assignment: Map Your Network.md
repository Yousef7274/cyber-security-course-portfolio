# Network Profile — [my machine]

## Identity
- IPv4 address: 192.168.X.X
- Subnet mask / CIDR: 255.255.255.0
- MAC address: 70-08-94-D9-9C-XX
- Network address: 192.168.X.X
- Broadcast address: 192.168.X.XXX

## Gateway and reachability
- Default gateway: 192.168.X.X
- Ping to gateway (avg): 4 ms
- Ping to 1.1.1.1 (avg): 18 ms

## DNS
- Configured DNS server(s): 192.168.x.x
- example.com resolves to: The IPV4 address and IPV6

## Path to the internet
- Hops to example.com: 30 hops
- First hop: 192.168.X.X

## Listening ports
| Port | Protocol | Interface (localhost / all)  | Common use                                |
|------|----------|------------------------------|-------------------------------------------|
| 135  | TCP      | ALL                          | Windows RPC                               |
| 445  | TCP      | ALL                          | SMB                                       |
| 5040 | TCP      | ALL                          | Application specific; identify by PID 7300|
| 49664| TCP      | ALL                          | Windows dynamic                           |
| 49665| TCP      | ALL                          | Windows dynamic                           |
| 49666| TCP      | ALL                          | Windows dynamic                           |
| 49667| TCP      | ALL                          | Windows RPC                               |
| 49668| TCP      | ALL                          | Windows RPC                               |
| 49669| TCP      | ALL                          | Windows RPC                               |
| 49670| TCP      | ALL                          | Windows RPC                               |
| 49635| TCP      | localhost                    | Application-specific; PID 1608            |
| 139  | TCP      | 192.168.X.XXX                | NetBIOS Session Service                   |
| 42050| TCP      | localhost                    | Application-specific; PID 2944            |


## Reflection (150–200 words)

### What surprised you about your own network?
  What surprised me most about my network was how easy it was to find my IP addresses. Since you could just go into you're friends home and ask for the router password so you can have internet but little do they know with just one command you can get they're IP addresses, what do you do with you're friends IP addresses? No clue, since i have no idea how someone can hack you're network.

  
### Which open port (if any) would you want to investigate or close?
I would probably investigate and close "port 445" since it is used for file sharing. So if i don't need to share on my printer i would probably close it.

### Which command do you think you'll use most often, and why?
  The command i will probably use the most often would be ipconfig or ipconfig /all, since its such a useful command because it shows you the IPV4 address, the MAC address and the default address, and any other IP address for that matter. Another command i would probably use a lot is ping, since ping allows me to see if that specific device or website is reachable and is responding over a network. Tracert is also a great command and i probably will use it from time and time but not as often as i would be likely to use ipconfig since i don't know why i would need to see the amount of hops a website needs. The other commands like netstat i probably will not memorize since its a long command and it took me a bit long to figure out all the things of netstat, however i do think its a good command, i just probably wont be able to memorize it.


## Questions

