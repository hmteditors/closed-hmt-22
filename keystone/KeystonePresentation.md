# Background:
- Homer Multitext Project
	- Multi-institutional, dedicated to creating digital, diplomatic editions of the Homeric manuscripts 
- Venetus A
	- 10th Century (Oldest)
	- Byzantine
	- Deluxe Readers Guide
	- Scholia
![12r.png](https://raw.githubusercontent.com/hmteditors/hmt-22/master/keystone/12r.png)

# The Edition

## Overview
- Digital, diplomatic edition of the Venetus A
- Hosted on a github repository
- 150+ Contributors
	
## Paleography and Line Indexing: 
- Take a select number of observations from text and scholia
	- Assigned **uniform resource names**, which index the edition to the image of the edited text
	- Verifiable
- URNs: Canonical identification of texts
	
## Editing:
- XML Editor, limited set of TEI markup	
- Manual transcription directly from the image of the manuscript to the edition	
- Tag place names, abbreviations, corrections, quotations, etc.
- Separation of concerns: Analysis and editing

![BankesXMLScreengrab.png](https://raw.github.com/hmteditors/hmt-22/master/keystone/BankesXMLScreengrab.png)
	
## Automated Machine Validation
- Run every edition against the Morpheus Parser, to confirm that it is composed entirely of valid lexical entities and 	valid Greek 
- Collate a list of Byzantine Orthographic Equivalents
- New lexical entities not found in Liddell and Scott
- Revisions to Validation Procedure
	- Summer 2017
	- Kanones Parser
---
# Analysis
---
## Example: The Evolution of Homeric Accent Notation
---
### Overview
- The grammar of pre-Archaic Greek was exploited to shape the sound of Homeric epic
	- Vowel quantity = rhythm
	- Linguistic tonality = pitch
- Linguistic tonality died out from the language and was replaced by a system of grammatical accentuation
- Early accent systems would have been more reflective of Homeric melody than the more grammatically-conceived systems into which they evolved.
---
### Bankes Papyrus
- c. 150 AD, Egypt
- One of the most important Homeric papyri for its intactness and antiquity; contains approx. 600 lines
- Includes an accent system which has been theorized to reflect the entirety of the melody of the line
---
![114_5.jpg](https://raw.github.com/hmteditors/hmt-22/master/keystone/114_5.jpg)
---
![VA315RN-0485.jpg](https://raw.github.com/hmteditors/hmt-22/master/keystone/VA315RN-0485.jpg)
![114_2.jpg](https://raw.github.com/hmteditors/hmt-22/master/keystone/114_2.jpg)
---
### Melodic Material in the Venetus A?
- Could the intermediate stage of evolution of accent notation in the Venetus A be preserving something of the melodic accent system, as preserved in the Bankes Papyrus?
- Could the Venetus A employ text reuse with an older accent system preserved?
---
## General Procedures

---

### Using Scala
- a more logical, sophisticated language 
- work with large amounts of data

---

### Our Approach	
- able to load the text
- isolate the accents

![convertToPitches.png](https://raw.githubusercontent.com/hmteditors/hmt-22/master/keystone/convertToPitches.png)

---

- filter results based on specific accents
- does not change original

![nodes.png](https://raw.githubusercontent.com/hmteditors/hmt-22/master/keystone/nodes.png)

---

- print the line as syllables with the accents
- uses a CTS URN

![printPitch.png](https://raw.githubusercontent.com/hmteditors/hmt-22/master/keystone/printPitch.png)


# Future Directions
## Comparing Accent Patterns
- across 3 versions
- trace a possible evolution

## Procedure
- map to boolean
- .contains() and .filter() functions

## Goals
- finished editions of both the Venetus A manuscript and the Bankes papyrus by 2018
