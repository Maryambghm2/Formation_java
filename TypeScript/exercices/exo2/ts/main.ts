import { Directory } from "./directory";
import { createContact } from "./function";
import { Contact } from "./interfaces";

const contact1: Contact = createContact("toto", "titi", new Date("2010-10-10"), "toto@gmail.com", "06-10-65-40-41", "url_avatar.jpg");

const contact2: Contact = createContact("tata", "titi", new Date("2000-05-21"), "tata@gmail.com", "06-42-40-78-12");

const contact3: Contact = createContact("tutu", "tata", new Date("2010-10-10"), "tutu@gmail.com", "06-01-74-20-41");


const contacts = [contact1, contact2, contact3]

const directory = new Directory(contacts);



document.addEventListener("DOMContentLoaded", () => {

    const contactsDiv = document.getElementById("contacts-div") as HTMLDivElement

    const ul = document.createElement("ul");

    contacts.forEach(contact => {
        const name = document.createElement("li");
        name.textContent = `${contact.lastname} ${contact.firstname}`;

        // Mettre enfant name dans parent ul 
        ul.appendChild(name);
        console.log(name)
    });

    // Mettre enfant ul dans parent contactsDiv
    contactsDiv.appendChild(ul);
    console.log(contactsDiv)
});
