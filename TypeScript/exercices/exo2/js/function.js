export function createContact(firstname, lastname, birth, mail, phoneNumber, avatarUrl) {
    const contact = {
        firstname,
        lastname,
        birth,
        mail,
        phoneNumber,
        avatarUrl: avatarUrl !== null && avatarUrl !== void 0 ? avatarUrl : "avatar.jpg"
    };
    return contact;
}
