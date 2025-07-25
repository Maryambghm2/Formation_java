export class Directory {
    constructor(contacts) {
        this.contacts = contacts;
    }
    addContact(contact) {
        this.contacts.push(contact);
    }
    removeContact(contact) {
        this.contacts.filter(c => c !== contact);
    }
    findContactByName(name) {
        return this.contacts.filter(c => c.lastname === name);
    }
    findAllContacts() {
        return this.contacts;
    }
}
