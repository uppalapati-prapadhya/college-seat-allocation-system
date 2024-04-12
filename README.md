<h1>College Seat Allocation System</h1>
<h2>Overview</h2>
    <p>The College Seat Allocation System is a program designed to allocate college seats to students based on their preferences and ranks. The program reads student data from a text file, processes their preferences, and assigns them to various branches in different colleges according to available seats.</p>

<h2>Features</h2>
    <ul>
        <li>Data Input via Text File</li>
        <li>Dynamic Seat Allocation</li>
        <li>Clear Output Format</li>
    </ul>

<h2>Prerequisites</h2>
    <p>For the C version:</p>
    <ul>
        <li>GCC compiler or any standard C compiler installed on your machine.</li>
    </ul>

<h2>Setup and Compilation</h2>
    <p>For the C version:</p>
    <ol>
        <li>Clone the repository or download the C source code along with the accompanying data file (<code>sampledata.txt</code>).</li>
        <li>Make sure that <code>sampledata.txt</code> is located in the same directory as the source code or update the file path in the code if necessary.</li>
    </ol>

<h2>Running the Program</h2>
    <p>For the C version:</p>
    <ol>
        <li>Open a terminal or command prompt.</li>
        <li>Navigate to the directory containing the source code.</li>
        <li>Compile the C program using the following command:</li>
        <pre><code>gcc -o CollegeSeatAllocation CollegeSeatAllocation.c</code></pre>
        <li>Execute the compiled program:</li>
        <pre><code>./CollegeSeatAllocation</code></pre>
    </ol>

<h2>Input File Format</h2>
    <p>The <code>sampledata.txt</code> should be formatted as follows:</p>
    <ul>
        <li>The first line contains two integers: number of students (<code>n</code>) and number of preferences (<code>m</code>).</li>
        <li>Subsequent lines provide the student details:</li>
        <ul>
            <li>An integer for the student's rank.</li>
            <li>A string for the student's name (without spaces).</li>
            <li><code>m</code> integers where each integer denotes a preference coded as <code>cm</code> (c for college index, m for branch index).</li>
        </ul>
    </ul>

<h2>Output</h2>
    <p>Output will list each student's rank, name, and their allocated branch formatted as <code>college-branch</code>.</p>
    <p>For example:</p>
    <pre><code>1 Alice 1-1 
2 Bob 2-1 
3 Charlie 3-1</code></pre>

<h2>Contributing</h2>
    <p>Contributions are welcome. Please fork the repository and submit pull requests with any enhancements.</p>

<h2>License</h2>
    <p>[Insert License Here] - Please specify the license under which the project is released, ensuring compliance with open-source guidelines.</p>
<hr>
<p>This README is designed to help users understand, set up, and run the College Seat Allocation System in C.</p>
