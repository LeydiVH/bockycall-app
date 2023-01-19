import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  @Input() showButton: boolean = true;

  constructor(private router: Router) {
  
  }

  goToHome() {
    this.router.navigate(['/home']);
  }
}
