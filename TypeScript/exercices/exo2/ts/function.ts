import { Contact } from "./interfaces";

export function createContact(firstname: string, lastname: string, birth: Date,
    mail: string, phoneNumber: string, avatarUrl?: string): Contact {

    const contact: Contact = {
        firstname,
        lastname,
        birth,
        mail,
        phoneNumber,
        avatarUrl : avatarUrl ?? "avatar.jpg"
    }
    return contact;
}

