# Notes for using these scripts


## Vcoabulary

- *sbt* Scala Build Tool
- *REPL* Read-Evaluate-Print-Loop.  (The bash shell is an example of a REPL.  So is the sbt console.)


## Running Scala scripts (general)

1. Start sbt from a bash shell: `sbt`
2. In sbt, explicitly set the scala version to use:  `++ 2.11.8`
3. In sbt, start a console (REPL):  `console`
4. In the sbt console, load a script : `:load FILENAME` (note the loading colon)


## The `indexing.sc` script

Use this to look up correct image URN for a given page of the Ventus A.

1. Start up an sbt console, and load this script (see previous section).
2. Look up an image:  `imgForPage("URN")`, e.g.,

    imgForPage(urn:cite2:hmt:msA.2017a:283r")

You should see a result like this:

    res1: String = urn:cite2:hmt:vaimg.2017a:VA283RN_0453
