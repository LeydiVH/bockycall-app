import { Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bockycall-spring-front';

  showHeader: boolean = true;
  showButton: boolean = true;

  constructor(private router: Router) {
    this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        if ((event.url === '/home') || (event.url === '/')) {
          this.showHeader = false;
        } else {
          this.showHeader = true;
        }

        if (event.url === '/error') {
          this.showButton = false;
        } else {
          this.showButton = true;
        }
      }
    });
  }

}
