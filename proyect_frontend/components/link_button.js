import Link from 'next/link';
import "../app/globals.css"

export default function A_link_boton({ message, link_page }) {
    return (
      <Link href={link_page}>
        <button>{message}</button>
      </Link>
    );
  }