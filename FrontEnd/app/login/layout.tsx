export const metadata = {
  title: 'Ingreso usario',
}

export default function RootLayout({children}: {children: React.ReactNode}) {
  return (
    <html lang="es">
      <body>{children}</body>
    </html>
  )
}
