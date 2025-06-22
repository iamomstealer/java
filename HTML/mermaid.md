graph TD
    A[Start] --> B[Declare array and variables]
    B --> C[Input size of array (n)]
    C --> D[Input elements of array]
    D --> E[Input the element to be searched (key)]
    E --> F[Set found = false]
    F --> G{Loop i = 0 to n-1}
    G --> H[If array[i] == key]
    H -->|Yes| I[Print "Element found at position i"]
    I --> J[Set found = true]
    J --> K[Exit loop]
    H -->|No| G
    K --> L{found == false}
    G --> L
    L -->|Yes| M[Print "Element not found"]
    L -->|No| N[End]
    M --> N
