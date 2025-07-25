import { Contact } from "./interfaces";

export class Directory {
    contacts: Contact[];


    constructor(contacts: Contact[]) {
        this.contacts = contacts;
    }


    addContact(contact: Contact): void {
        this.contacts.push(contact)
    }

    removeContact(contact: Contact): void {
        this.contacts.filter(c => c !== contact)
    }

    findContactByName(name: string): Contact | Contact[] | undefined {
        return this.contacts.filter(c => c.lastname === name);
    }
    findAllContacts(): Contact[] {
        return this.contacts;
    }

}