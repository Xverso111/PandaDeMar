<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.1" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method='html' version='1.0' encoding='UTF-8' indent='yes'/>
<xsl:template match="/">
  <html>
  <body>
  <p></p>
 <p><xsl:value-of select="factura/infoFactura/razonSocialComprador"/></p>
 <p><xsl:value-of select="factura/infoFactura/dirEstablecimiento"/></p>
 <p>Cedula / RUC / Pasaporte: <xsl:value-of select="factura/infoFactura/identificacionComprador"/><xsl:text>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;</xsl:text>Fecha Emision: <xsl:value-of select="factura/infoFactura/fechaEmision"/></p>
 <p>Obligado a llevar Contabilidad: <xsl:value-of select="factura/infoFactura/obligadoContabilidad"/><xsl:text>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;</xsl:text>Guia Remision: <xsl:value-of select="factura/infoFactura/guiaRemision"/></p>
  
  
  <table border="1" cellspacing="0" cellpadding="2" style="width:100%">
    <tr>
      <th>Codigo</th>
      <th>Descripcion</th>
      <th>Cantidad</th>
      <th>Precio Unitario</th>
    </tr>
    <xsl:for-each select="factura/detalles/detalle">
    <tr>
      <td><xsl:value-of select="codigoPrincipal"/></td>
      <td><xsl:value-of select="descripcion"/></td>
      <td><xsl:value-of select="cantidad"/></td>
      <td><xsl:value-of select="precioUnitario"/></td>
    </tr>
    </xsl:for-each>
  </table>
  
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>