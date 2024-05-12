# MiniDesktopSearchEngine
 Mini Desktop Search Engine Using Binary Search Tree

1) Before starting the project description, if you want to learn how the project works, please check the Application Details section.
2) Also, if you encounter an error when you run the application via “MainFrame”, please check the Notes section

# INTRODUCTION

This report presents the design and implementation of a mini desktop search engine project developed using Java Swing, binary search trees (BST), and linked lists. The project aims to provide users with a simple yet effective tool for searching and managing documents based on  word occurrences within those documents.

Through this project, users can input keywords and search for documents containing those keywords, with the search engine returning relevant documents along with their corresponding word frequencies. Additionally, users can manage ignored words and track document frequencies through the provided interface.

The subsequent sections of this report will provide detailed insights into the architecture, algorithms, and user interactions of the desktop search engine project, aiming to elucidate its implementation details.
# CODE DESIGN
## The main purpose of object “MyLinkedListNode”:
This class represents a node in the singly linked list, containing data and a reference to the next node.
## The main purpose of object “MyLinkedList”:
This class implements a singly linked list with methods for adding elements, checking if an element exists, and retrieving an element at a specific index. It also provides an iterator for traversing the list.
## The main purpose of object “WordFrequency”:
This class encapsulates the frequency of a word in a specific document. It has two attirbutes which is “documentName” and “frequency”.
## The main purpose of object “BSTNode”:
This class represents a node in the BST, containing data and references to the left and right child nodes.
## The main purpose of object “BSTData”:
This class encapsulates a word and its frequencies in different documents, represented as a linked list of WordFrequency objects. It has two attirbutes which is “word” and “MyLinkedList<WordFrequency>wordCounts”.

### update() method:
The update method in “BSTData” class is used to update the frequency of a particular word in a particular file. If this method finds WordFrequency.documentName matching a given document name, it increases the frequency; otherwise, it creates a new WordFrequency object with frequency 1 and adds it to the wordCounts linked list.

### compareTo() method:
The compareTo method allows a class to become comparable with other objects, typically used for sorting operations. It is implemented in classes that extend the Comparable<T> interface. For example, the “BSTData” class extends the Comparable<BSTData> interface and implements the compareTo method to compare words alphabetically. 

### toString() method:
The toString() method allows converting an object to a string representation. It is often used to display an object's data in a readable format. For example, the “BSTData” class implements the toString method to return the word and its frequency in documents as a string. This is used to ensure that the data is presented in a readable format when displaying this data in a binary search tree or any other data structure.

## The main purpose of “BinarySearchTree” class:
This class implements a BST with methods for inserting data, searching for words, giving suggestions when searching for words, and traversing the tree in different orders (in-order, post-order, pre-order).

### Structure of a node of BST tree:

![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/d04a38b8-dc20-4749-8137-85e60c7dfd99)

### add() method:
   The add method in a Binary Search Tree (BST) is used to insert a new node into the tree. This method employs a recursive approach to find the appropriate position in the binary search tree and place the new node there. Initially, the 
   add method takes the root node of the tree and the new data to be added as parameters. Then, the insertion operation is carried out recursively.
   1)	If the root node is null, it sets the new node as the root and completes the operation.
   2)	If the root node is not null, it compares the value of the new node with the value of the current node.

     	2.1) If the value of the new node is less than the value of the current node, it calls the add method with the left child of the current node to traverse the left subtree.
     	
     	2.2) If the value of the new node is greater than the value of the current node, it calls the add method with the right child of the current node to traverse the right subtree.
     	
     	2.3) If the value of the new node is equal to the value of the current node, instead of adding the new node, we update the data of the current node (using update() method in “BSTData” class).
      
   3)	The method is recursively called to ensure the new node is placed in the appropriate position.

### search() method:
   The search method in a Binary Search Tree (BST) is utilized to find a specific value within the tree. This method operates recursively by starting the search at the root node and traversing the tree based on the comparison of the    
   target value with the values stored in each node.

   Here's a breakdown of how the search method works:
   1.	The search method takes the target value to be searched for, along with the current node in the tree where the search begins.
   2.	If the current node is null (indicating an empty subtree), it means the target value is not found in the tree, and the search ends. It may return an appropriate message or value to indicate that the value was not found.
   3.	If the target value matches the value stored in the current node, the search is successful, and the method may return the current node or perform any other desired action.
   4.	If the target value is less than the value stored in the current node, the search continues in the left subtree. The search method is recursively called with the left child of the current node as the new starting point.
   5.	If the target value is greater than the value stored in the current node, the search continues in the right subtree. The search method is recursively called with the right child of the current node as the new starting point.
   6.	Steps 2-5 are repeated recursively until the target value is found or until a null node is encountered, indicating that the value does not exist in the tree.
   7.	Once the target value is found, the method perform any necessary actions, such as returning the node containing the value or displaying information related to the search results.

### getSuggestion() method (extra feature)
   This method is designed to provide word suggestions based on a given prefix within a Binary Search Tree (BST) containing words. It returns a string representing a word suggestion that starts with the provided prefix.

   Here's how the method works:
   1.	The public getSuggestion method is the entry point for obtaining word suggestions. It takes a prefix as input and calls the private recursive method getSuggestionRec with the root of the BST and the prefix.
   2.	The private getSuggestionRec method is a recursive helper function responsible for traversing the BST and finding word suggestions. It takes the current root node of the subtree and the prefix as parameters.
   3.	If the current root node is null (indicating an empty subtree), the method returns null, indicating that no suggestion can be found.
   4.	If the word stored in the current root node of the subtree starts with the given prefix, the method returns this word as a suggestion.
   5.	If the prefix is alphabetically less than the word stored in the current root node, the method recursively calls itself with the left child of the current root node. This is because in a BST, words that come before the prefix  
   alphabetically are in the left subtree.
   6.	If the prefix is alphabetically greater than or equal to the word stored in the current root node, the method recursively calls itself with the right child of the current root node. This is because words that come after the prefix      alphabetically are in the right subtree.
   7.	Steps 3-6 are repeated recursively until a word suggestion is found (step 4) or until a null node is encountered (step 3), indicating that no word suggestions exist for the given prefix in the subtree.

### inOrder() , postOrder() and preOrder() methods:

The inOrder, postOrder, and preOrder methods are traversal algorithms used to visit all nodes in a Binary Search Tree (BST) and process them in different orders. Each traversal method follows a specific pattern for visiting nodes:

1)	In-order traversal (inOrder):
•	Visit the left subtree.
•	Process the current node.
•	Visit the right subtree.

2)	Post-order traversal (postOrder):
•	Visit the left subtree.
•	Visit the right subtree.
•	Process the current node.

3)	Pre-order traversal (preOrder):
•	Process the current node.
•	Visit the left subtree.
•	Visit the right subtree.

## The main purpose of “DocumentCleaner” class:
This class is responsible for cleaning up a document by removing HTML tags, ignored words, and extra spaces. It also adds the words from a cleaned document to the BST.

### readHTMLFileWithoutTags() method

The readHTMLFileWithoutTags method is designed to read the content of an HTML file while disregarding any HTML tags present in the file. It processes the file line by line, extracting only the textual content and ignoring any HTML markup.
Here's a breakdown of how the method works:

1.	Initialization: The method initializes a StringBuilder named contentBuilder to store the extracted textual content from the HTML file.
2.	File Reading: It reads the HTML file line by line using a BufferedReader. This allows it to process the file efficiently without loading the entire content into memory at once.
3.	Tag Detection: While reading each line of the file, the method checks for the presence of HTML tags (< and >) within the line. If a tag is found, it indicates the start or end of an HTML element.
4.	Text Extraction: Between HTML tags, the method extracts the text content by removing any HTML markup using a regular expression (replaceAll). It replaces all occurrences of punctuation and whitespace characters with a single space, ensuring that words are separated correctly.
5.	Appending to StringBuilder: The extracted text content from each line is appended to the contentBuilder StringBuilder. This accumulates all the textual content from the HTML file while ignoring the HTML tags.
6.	Completion: Once the entire file has been processed, the contentBuilder StringBuilder contains the combined textual content of the HTML file without any HTML tags.
7.	Result: The method returns the content stored in the contentBuilder StringBuilder as a single string, representing the textual content of the HTML file.

### cleanUpSpaces() and cleanUpIgnoredWords() methods:

The cleanUpSpaces() method and cleanUpIgnoredWords() method are designed to process textual data by removing unnecessary characters or ignored words to prepare the data for further analysis.

1) cleanUpSpaces() Method:
   
   •	This method is responsible for removing redundant spaces from the textual content.

   •	It utilizes regular expressions to replace multiple consecutive whitespace characters with a single space.

   •	The purpose of this method is to normalize the whitespace within the text, ensuring that words are properly separated and there are no excessive spaces.

   •	After processing, the textual content will have consistent spacing, making it easier to tokenize and analyze.

2)	cleanUpIgnoredWords() Method:

  	•	This method is used to filter out ignored words from the textual data.

  	•	It reads a list of ignored words, typically stored in a file, and removes these words from the text.

  	•	The method iterates over each line in the file containing ignored words and adds them to a data structure, often a linked list.

  	•	Then, while processing the text content, it checks each word against the list of ignored words and removes any occurrences of these words from the text.

  	•	The purpose of this method is to exclude common or irrelevant words (such as "a", "an", "the", etc.) from the textual data before performing analysis.

  	•	After processing, the textual data will be cleaner and more focused, containing only relevant words for analysis.

### addFileToBST() method:
The addFileToBST() method adds each word of the cleaned file content to the Binary Search Tree using regular expression. It uses the add() method in Binary Search Tree for this.


## Main purpose of “MainFrame” JFrame:
This class provides the user interface for the application, allowing users to select files, search for words, and display the results.

### pickFile() method:

The pickFile method is designed to open a file picker dialog window, allowing the user to select a file from their filesystem. Here's how it works:

1)	Initializing File Chooser: The method initializes a JFileChooser object, which provides a graphical interface for file selection.
2)	System Look and Feel: It sets the look and feel of the file chooser dialog to match the windows look and feel.
3)	Displaying File Chooser Dialog: The method displays the file chooser dialog window to the user, prompting them to select a file.
4)	User Interaction: The user interacts with the file chooser dialog by browsing through their filesystem and selecting a file.
5)	File Selection: Once the user selects a file and clicks the "Open" or “Enter” button, the method retrieves the selected file and returns it.
6)	Returning Selected File: The method returns the selected file as a File object, which represents the chosen file in the filesystem.

### handleFileSelection() method:

The handleFileSelection method is responsible for managing the selection of files by the user within a Java Swing application. Here's how it works:
1.	Opening File Picker: When the user interacts with the application's interface, typically by clicking a button or performing a specific action, the handleFileSelection method is invoked.
2.	File Selection Dialog: Within the method, the pickFile method is called. This function opens a file picker dialog window, allowing the user to browse and select a file from their filesystem.
3.	Selected File Retrieval: If the user selects a file and confirms their selection in the file picker dialog, the pickFile method returns the selected file as a File object.
4.	Handling File Selection:

  	•	If the user cancels the file selection or does not select any file, the returned File object will be null.
  	•	If the selected file is not null, indicating that the user has chosen a file, the method proceeds to further processing.
  	
5.	Error Handling:

  	•	If the user tries to select the same file multiple times, a warning message is displayed to inform the user that the file has already been selected.

  	•	If the user attempts to select a file without first selecting a file containing ignored words, another warning message is displayed to prompt the user to select the ignored words file first.
  	
6.	File Processing:

  	•	Once a valid file is selected by the user and all necessary conditions are met (such as the existence of an ignored words file), the selected file is added to a list of selected files for further processing.

  	•	The method may also trigger additional processing steps, such as cleaning the selected file's content, adding the file's words to a Binary Search Tree (BST) data structure, updating the user interface, etc.

### searchTextFieldKeyReleased() method:
This method is an event handler for the key release event that occurs when a key is released while the user is typing in the search text field of a Java Swing application. Let's break down how it works:

1) Event Listener:

   •	The method is registered as a listener for key release events on the search text field.

2) Suggestion Check:

   •	It first checks whether the "getSuggestion" checkbox is selected. This checkbox likely controls whether the application provides auto-completion suggestions for the search text.
   
3) Handling Backspace Key:

   - If the backspace key (KeyEvent.VK_BACK_SPACE) is pressed, indicating that the user is deleting characters from the search text:

     o It retrieves the current text from the search text field.

     o	If the current text is not empty, it removes the last character from the text.

     o	It then requests a suggestion for the modified text from the Binary Search Tree (BST) (bst.getSuggestion(newText)).

     o	If a suggestion is found:

        - It updates the text field with the suggestion.
          
        - It sets the selection start and end positions in the text field to highlight the portion of the suggestion that differs from the original text.
          
4) Handling Other Key Releases:
   - If a key other than backspace is released:

     o	It retrieves the entire text from the search text field.

     o	It requests a suggestion for the current text from the BST (bst.getSuggestion(to_check)).

     o	If a suggestion is found, it updates the text field and adjusts the selection to highlight the suggested portion.
6) Suggestion Display:

   •	The method ultimately updates the search text field with the suggested text, if available, and adjusts the selection to highlight the suggested portion for the user's convenience.

# APPLICATION DETAILS

## How the project works
1) First, run the application via “MainFrame”

   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/ee5e387e-58a0-4df3-99f7-f2547901a65f)
   
2) After that, please select your ignored words txt file

   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/0ab8f2a6-b68c-48e9-89d0-561f4ae614fc)

   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/783574f3-11c5-4342-8c86-dc1e4344cf41)

3) Now, you can select your example html files one by one.

   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/c5e9eed3-1b68-429a-9697-28ad3ab794c2)

   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/b62ff161-c608-4e05-86b4-01db8e280e56)

4) After this, you can see in-order, post-order, and pre-order treversal. Also, you can search word from added files

   - In order treversal
     
     ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/70d2b16b-396b-485b-a9dd-8a9cc1e0422c)

   - Post order treversal
     
     ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/6fe8a952-96cd-4908-afc1-7f1026f39ea5)

   - Pre order treversal
     
     ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/e54844d0-4580-4411-925f-6273d052d545)
     
   - Search Word Part Without Word Suggestion

     ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/2f386fc9-3f28-4ec3-bbe7-91a17eb459c8)

     
   - Search Word Part With Word Suggestion:
     
     - It is activated when the checkbox is checked. It automatically gives suggestions based on the words in the tree.
     
     ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/c63eec57-b893-434e-a4a9-48c29050125c)

     ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/4ac644e4-c68a-41f6-8fdf-997ba3fc2d09)

5) Multiple files can be added. When a new file is added, the words in this file are added to the tree.

   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/401ee48d-8867-4b00-b399-e0069cd5308c)

# GUI PART 

Some special classes have been written for the GUI part. The purpose of writing these classes is to design more beautiful and user-friendly user interface. You can see the classes in the “CustomSwingComponents” package.

# CONCLUSION

Throughout the project, a desktop search engine was developed using the binary search tree, linked list, and java swing. This project provided an opportunity to practice data structures and user interface design. It helped me deepen my understanding of how data structures, such as linked lists and binary search trees, can be implemented.

The user interface, utilizing the features provided by Java Swing, allowed users to easily perform functions such as file selection, searching, and viewing results. This ensured that the project was user-friendly and accessible.

Completing the project enabled me to gain further knowledge in data structures and algorithms, as well as experience in integrating complementary components and creating interactive user interfaces. The development of this project has equipped me with skills and knowledge that I can apply to future software development projects.
  
     
# NOTES
If you encounter an error when you run the application via “MainFrame”, follow the steps below.

1) Please right click on the project name and select properties.
   
   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/bd07532f-f8b4-42d3-b0c4-d2753b2c2d5e)

2) Please go to the “Source” menu and set the "Source Binary Format" section to 17.
   
   ![image](https://github.com/zahidesad/MiniDesktopSearchEngine/assets/116666407/02fa3329-3bdd-4f4d-8d14-41c6b07fb173)

   



