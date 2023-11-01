import "./globals.css"
import Link_button from "../components/link_button.js"
import Link from 'next/link'
import Link_sign_b from "../components/log_sign_b.js"


export const metadata = {
  title:"CoffeeCat - UwU"
}

export default function RootLayout({children}: {children: React.ReactNode}) {
  return (
    <html lang="es">
      <body>
        <div className="bg-amber-500 flex justify-between pr-10 pl-5 pt-5 pb-5 items-center">
          <Link href='./' className='text-4xl'>CatCoffee </Link>
          <nav className="space-x-3">
            <Link_button message='Acerca de nosotros' link_page={'/about_us'}/>
            <Link_button message='Reservas' link_page={'/about_us'}/>
            <Link_button message='Menu' link_page={'/about_us'}/>
          </nav>
          <Link_sign_b/>
        </div>
        {children}
      </body>
    </html>
  )
}
