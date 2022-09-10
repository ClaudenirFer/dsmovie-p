// Alterado o tsconfig.json com "baseUrl": "./src" p/ não digitar ../../
import { ReactComponent as GithubIcon } from "assets/github.svg";
import './navbar.css';

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1> DSMovie </h1>
          <a href="https://github.com/ClaudenirFer">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p>/rinedualc</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
