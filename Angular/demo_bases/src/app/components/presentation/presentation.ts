import { Component } from "@angular/core";

@Component({
    selector: 'app-presentation',
    imports: [],
    templateUrl : './presentation.html',
    styleUrl : './presentation.css'
})

export class Presentation {
    name : string = "Toto"
    isLogged : boolean = false 
    // m2i : string ""
}