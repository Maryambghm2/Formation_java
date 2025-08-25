import { Routes } from '@angular/router';
import { Navbar } from './components/navbar/navbar';
import path from 'path';
import { Counter } from './components/counter/couter';

export const routes: Routes = [
    { path: "navbar", component: Navbar },
    { path: "counter", component: Counter }
    // {path: "series", component: Series}
];
