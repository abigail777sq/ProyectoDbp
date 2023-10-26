import { useEffect, useState } from 'react';
import Link from 'next/link';
import styles from '../styles/inicio.module.css';
import A_boton from '../components/A_link_boton/A_link_boton.js';
import Titulo from '../components/inicio_components/Titulo/Titulo.js';
import Menu_presentation from '../components/inicio_components/Menu/Menu_presentacion';
import Reservation from '../components/inicio_components/Reservation/Reservation_b';
//Otra forma de importar: @nextjs-blog/components/inicio_components/Reservation/Reservation_b
//Te hace ir desde el principio. 
//Con el ../ retrocedes una carpeta, ../../ retorcede dos, y asi sucesivamente. Puede ser engorroso.

export default function Inicio(){
  const [show, setShow] = useState(false);

  useEffect(() => {
    // Activa la animación después de que la página se haya cargado
    setShow(true);
  }, []);

  return(
    <div className={`${styles.body} animate`}>
      <style jsx>{`
  /* Establece la opacidad inicial en 0 y define una animación de fade-in */
  .animated-element {
    opacity: 0;
  }

  .animate {
    animation: fadeIn 1s ease-in-out forwards;
  }

  @keyframes fadeIn {
    from {
      opacity: 0;
    }
    to {
      opacity: 1;
    }
  }
`}</style>
      <div id={styles.pestaña_arriba}>
        <div>
          <Titulo/>
        </div>
        <div id={styles.botones}>
        <div id={styles.log_b}>
          <A_boton message={'Ingresar'} link_page={'/signin'}/>
        </div>
        <div id={styles.sign_b}>
          <A_boton message={'Registrarse'} link_page={'/login'}/>
        </div>
        </div>
      </div>
      <div>
        <Menu_presentation/>
      </div>
      <div>
        <Reservation/>
      </div>
        
    </div>
    )
}



//Forma de correr el archivo: escribir en terminal: npm run dev

//Correr en el terminal para el login: npx shadcn-ui@latest add form

/*
    <div className={styles.container}>
      <Head>
        <title>Create Next App</title>
        <link rel="icon" href="/favicon.ico" />
      </Head>

      <main>
        <h1 className={styles.title}>
          Welcome to <a href="https://nextjs.org">Next.js!</a>
        </h1>

        <p className={styles.description}>
          Get started by editing <code>pages/index.js</code>
        </p>

        <div className={styles.grid}>
          <a href="https://nextjs.org/docs" className={styles.card}>
            <h3>Documentation &rarr;</h3>
            <p>Find in-depth information about Next.js features and API.</p>
          </a>

          <a href="https://nextjs.org/learn" className={styles.card}>
            <h3>Learn &rarr;</h3>
            <p>Learn about Next.js in an interactive course with quizzes!</p>
          </a>

          <a
            href="https://github.com/vercel/next.js/tree/canary/examples"
            className={styles.card}
          >
            <h3>Examples &rarr;</h3>
            <p>Discover and deploy boilerplate example Next.js projects.</p>
          </a>

          <a
            href="https://vercel.com/import?filter=next.js&utm_source=create-next-app&utm_medium=default-template&utm_campaign=create-next-app"
            className={styles.card}
          >
            <h3>Deploy &rarr;</h3>
            <p>
              Instantly deploy your Next.js site to a public URL with Vercel.
            </p>
          </a>
        </div>
      </main>

      <footer>
        <a
          href="https://vercel.com?utm_source=create-next-app&utm_medium=default-template&utm_campaign=create-next-app"
          target="_blank"
          rel="noopener noreferrer"
        >
          Powered by{' '}
          <img src="/vercel.svg" alt="Vercel" className={styles.logo} />
        </a>
      </footer>

      <style jsx>{`
        main {
          padding: 5rem 0;
          flex: 1;
          display: flex;
          flex-direction: column;
          justify-content: center;
          align-items: center;
        }
        footer {
          width: 100%;
          height: 100px;
          border-top: 1px solid #eaeaea;
          display: flex;
          justify-content: center;
          align-items: center;
        }
        footer img {
          margin-left: 0.5rem;
        }
        footer a {
          display: flex;
          justify-content: center;
          align-items: center;
          text-decoration: none;
          color: inherit;
        }
        code {
          background: #fafafa;
          border-radius: 5px;
          padding: 0.75rem;
          font-size: 1.1rem;
          font-family:
            Menlo,
            Monaco,
            Lucida Console,
            Liberation Mono,
            DejaVu Sans Mono,
            Bitstream Vera Sans Mono,
            Courier New,
            monospace;
        }
      `}</style>

      <style jsx global>{`
        html,
        body {
          padding: 0;
          margin: 0;
          font-family:
            -apple-system,
            BlinkMacSystemFont,
            Segoe UI,
            Roboto,
            Oxygen,
            Ubuntu,
            Cantarell,
            Fira Sans,
            Droid Sans,
            Helvetica Neue,
            sans-serif;
        }
        * {
          box-sizing: border-box;
        }
      `}</style>
    </div> */