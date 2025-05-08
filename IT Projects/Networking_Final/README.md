# Networking Final Project – Enterprise Network Simulation

This project is a comprehensive enterprise network simulation built in **Cisco Packet Tracer** as the final for a computer networking course. It includes routing, switching, VLAN segmentation, DHCP, NAT, ACLs, server deployment, and network security measures.

## 📦 Contents

- `Final Test Again.pkt` – Cisco Packet Tracer simulation file
- `Computer Networking Final Documentation.pdf` – Full project report
- `IP Addressing Table.pdf` – Complete subnetting and IP schema
- `Final Network Diagram.pdf` – Logical layout of the entire network

## 🧠 Project Highlights

- **3 Routers**, **3 L3 Switches**, and **7 L2 Switches**
- **Multiple VLANs** across Admin, HR, Finance, Sales, R&D, Support, Voice, Server Room
- **RIP v2** dynamic routing
- **DHCP Relay** via ip helper-address
- **NAT/PAT** to the cloud
- **ACLs** for SSH restriction, server isolation, and VLAN-level filtering
- **SSH & Wi-Fi** configuration
- **VoIP** partially configured (working demo submitted separately)

## ✅ Key Functional Tests

- ✅ Admin VLAN can SSH into routers
- ✅ Internet access limited to Admin & R&D VLANs
- ✅ Inter-VLAN control and access restrictions working
- ✅ DHCP working across most VLANs (static IP workaround used in HR due to Packet Tracer bug)

## 📷 Visuals

See `Final Network Diagram.pdf` for a full topology and VLAN layout.

---

### 🛠 How to Use

1. Open `Final Test Again.pkt` in Cisco Packet Tracer (v8.2+)
2. Wait for boot-up and test:
   - Inter-VLAN routing (`ping`)
   - NAT translation (`show ip nat translations`)
   - DHCP assignments
   - ACL enforcement (`ping` and `traceroute`)
3. Refer to the PDF documentation for configurations, IP plan, and ACLs

---

Feel free to fork or reference for learning, study, or interview prep.
