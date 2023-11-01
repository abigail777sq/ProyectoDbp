export const metadata = {
  title: 'Iniciar sesión',
}

export default function RootLayout({children,}: {children: React.ReactNode}) {
  return (
    <html lang="es">
      <body>{children}</body>
    </html>
  )
}
