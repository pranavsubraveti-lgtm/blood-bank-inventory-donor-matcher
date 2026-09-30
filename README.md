# 🩸 Blood Bank Inventory & Donor Matcher System

A Java-based automated decision-support system for real-time blood inventory verification, donor compatibility evaluation, and emergency triage management.

## 🎯 Features
- Real-time stock tracking across ABO & Rh blood groups
- Rule-based donor compatibility matching
- Instant clinical decision dispatch ("Issue Blood" / "Donor Required" / "Incompatible")
- Universal donor (O-) cross-matching logic

## 🛠️ Tech Stack
- Java (Core)
- `equalsIgnoreCase()` for case-insensitive blood group matching
- Nested if-else for triage logic
- Boolean operators (&&, ||) for compatibility rules

## 🚦 How It Works
1. Patient requests a blood group + number of units
2. System checks current inventory
3. If sufficient → "Issue Blood"
4. If deficit → "Donor Required"
5. If mismatch → Evaluate cross-compatibility (e.g., O- universal donor)

## ▶️ How to Run
```bash
javac BloodBank.java
java BloodBank
