import { getRandomQuote } from "./quotes.js";
import {capitalizeFirstLetter} from "./util.js";



const btn = document.querySelector("#generate");
const output = document.querySelector("#quote");

btn.addEventListener("click", () => {
    const quote = getRandomQuote();

    output.textContent = capitalizeFirstLetter(quote);
})