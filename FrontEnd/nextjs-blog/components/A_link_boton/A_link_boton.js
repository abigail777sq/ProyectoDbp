import styles from './A_link_boton.module.css'
import Link from 'next/link';

export default function A_link_boton({ message, link_page }) {
    return (
      <Link href={link_page}>
        <button className={styles.boton}>{message}</button>
      </Link>
    );
  }