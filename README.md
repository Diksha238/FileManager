# 📁 Java File Manager

A simple command-line File Manager application built using Java.  
It allows users to list directory contents, create directories, and delete files or directories through a text-based interface.

## 📌 Features

- 🔍 **List Files & Directories**: View all files and subdirectories in a given directory path.
- 📂 **Create Directory**: Create a new folder at a specified location.
- ❌ **Delete File or Directory**: Delete files or directories (recursively handles non-empty directories).
- 💬 **Text-based Interface**: Easy-to-use command-line menu for user interaction.
- 🧩 **Modular Design**: Uses interfaces and abstraction for extensibility and clean architecture.

## 🛠️ Project Structure

```bash
com.diksha.filemanager/
│
├── FileManager.java # Core logic for file operations
├── FileApp.java # Abstract class implementing UI event handlers
├── MyFileApp.java # Concrete implementation of FileApp
├── UserInterface.java # Interface for user interaction layer
├── UIEventHandler.java # Interface for handling user actions
└── TextBasedInterface.java # Text UI that interacts with users
```

## ▶️ How to Run

### 1. Compile all Java files:
```bash
javac com/diksha/filemanager/*.java
java com.diksha.filemanager.MyFileApp
```
⚠️ Make sure your terminal is inside the folder that contains the com/ directory.
Java needs the package structure to match the file path.
### 📸 Sample Menu Output
```File Manager Menu
1. List Files
2. Create a directory
3. Delete a file or directory
4. Exit Program
   Enter your choice:
   ```
## 🔧 Example Usage
#### List Files: Enter a valid directory path, e.g., C:\Users\YourName\Documents

#### Create Directory: Input a full path for the new directory.

#### Delete: Input a file or directory path to delete (recursively deletes folders).

## 📚 Concepts Used
#### File Handling (java.io.File)

#### Interfaces and Abstraction

#### Polymorphism

#### Text-based User Interface

#### Recursive Functions (for directory deletion)

## 📄 License
#### This project is open-source and free to use under the MIT License.

# Developed by Diksha with ❤️ | [Java File Management System]

yaml
Copy code

