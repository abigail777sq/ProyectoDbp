import Link from 'next/link';
import styles from './Reservation_b.module.css';

export default function Reservation(){
    return (
        <div id={styles.r_body}>
            Haga una reservación!
            <Link href={'http://localhost:3000/reservation_page'}>
                <button id={styles.r_button}>Reservación</button>
            </Link>

        </div>
    )
}