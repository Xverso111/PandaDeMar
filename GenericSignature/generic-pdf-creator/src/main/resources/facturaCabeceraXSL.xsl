<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.1" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method='html' version='1.0' encoding='UTF-8' indent='yes'/>
<xsl:template match="/">
  <html>
  <body>
  
 <p><xsl:value-of select="factura/infoTributaria/razonSocial"/></p>
 <p> R.U.C: <xsl:value-of select="factura/infoTributaria/ruc"/></p>
 <p><b>FACTURA</b><xsl:text>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;</xsl:text>No. <xsl:value-of select="factura/infoTributaria/secuencial"/></p>
   <p> Dir. Matriz: <xsl:value-of select="factura/infoTributaria/dirMatriz"/></p>
    <p>CLAVE ACCESO</p>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>