# 💻 IT Projects

This directory contains my **Information Technology–focused** coursework and personal projects.  
These projects emphasize **network infrastructure, automation, diagnostics, and systems configuration** through hands-on implementations.

---

## 🗂️ Projects

### ⚙️ [NetworkToolPowerShell](./NetworkToolPowerShell)
A **PowerShell-based network diagnostic and repair utility** built to automate troubleshooting and system logging.  
The tool provides an interactive menu system to execute connectivity tests, detect failures, and automatically attempt network repairs.

**Core Features**
- **Automated tests** for:
  - Network adapters, gateways, external IP, DNS, and web connectivity  
- **Auto-Fix system** that:
  - Detects failed tests and executes targeted DNS/IP configuration repairs  
  - Wraps Windows `ipconfig` utilities in error-safe try/catch blocks  
- **Reporting & Logging**
  - Generates structured logs and styled HTML reports with timestamps and results  
  - Tracks test outcomes and provides visual summaries for debugging sessions  
- **Menu-Driven Workflow**
  - Full and basic test modes  
  - Auto-Fix trigger based on test results  
  - HTML export and graceful exit handling via `$running` flag  

**Contributors**
- **Rebeca:** Built the full execution framework — global variable setup, menu orchestration, Run-FullTest/Run-BasicTest functions, and Auto-Fix logic integration.
- **Phailin:** Implemented detailed logic for the individual test functions and file output systems (`Write-Log`, `Export-HtmlReport`).

**Technologies:** PowerShell 5+, Windows Networking APIs, HTML, CSS  
**Date:** Fall 2025

---

### 🔌 [Networking Final Project](./Networking_Final)
A **Cisco Packet Tracer–based enterprise network** simulation covering multiple interconnected branch offices.

**Key Features**
- VLAN segmentation with inter-VLAN routing (RIP v2)
- NAT, ACLs, DHCP relay, and centralized server deployment
- SSH access and partial VoIP integration
- Built to demonstrate routing, subnetting, and security fundamentals

**Technologies:** Cisco 4331 routers, Catalyst switches, DNS/DHCP servers  
**Deliverables:** Project report (PDF), `.pkt` simulation file

---

### 🧠 Coming Soon
Future IT labs will expand into:
- Linux system administration  
- Active Directory & Windows Server configuration  
- Infrastructure automation (Ansible/PowerShell remoting)
