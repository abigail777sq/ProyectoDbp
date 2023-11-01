import "../app/globals.css"
import Link_button from "./link_button.js"


export default function Log_sign_b(){
    return(
        <nav className='justify-between space-x-3'>
            <Link_button message='Registrarse' link_page={'/login'}/>
            <Link_button message='Iniciar sesión' link_page={'/signin'}/>
        </nav>
    )
}