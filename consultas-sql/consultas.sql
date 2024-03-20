--Consulta 1 
select S.NOMBRE_SUPERMERCADO, count(*) as cantidad, TP.DESCRIPCION_TIPO ,f.FECHA_VENTE  from SUPERMERCADO S
inner join vendedor v on S.id_supermercado = v.id_supermercado
inner join factura f on f.ID_VENDEDOR = v.ID_VENDEDOR 
inner join producto p on f.ID_PRODUCTO = p.id_producto
inner join tipo_producto tp on p.ID_TIPO_PRODUCTO = tp.ID_TIPO_PRODUCTO 
where tp.DESCRIPCION_TIPO = 'CARNICOS'
AND F.FECHA_VENTE <= '2013-12-31'
GROUP BY 
    S.NOMBRE_SUPERMERCADO, TP.DESCRIPCION_TIPO, f.FECHA_VENTE 
--Consulta 2
SELECT 
    c.id_cliente,
    c.nombre_cliente,
    c.apellido_cliente,
    c.cedula_cliente,
    c.telefono_cliente,
    c.direccion,
    s.nombre_supermercado,
    f.valor_venta
FROM 
    cliente c
INNER JOIN 
    factura f ON c.id_cliente = f.id_cliente
INNER JOIN 
    vendedor v ON f.id_vendedor = v.id_vendedor
INNER JOIN 
    supermercado s ON v.id_supermercado = s.id_supermercado
WHERE 
    s.nombre_supermercado = 'Exito'
    AND f.valor_venta > 150000
ORDER BY 
    f.valor_venta DESC;
--Consulta 3
   SELECT 
    v.nombre_vendedor,
    s.nombre_supermercado,
    SUM(f.valor_venta) AS total_ventas
FROM 
    vendedor v
INNER JOIN 
    factura f ON v.id_vendedor = f.id_vendedor
INNER JOIN 
    supermercado s ON v.id_supermercado = s.id_supermercado
GROUP BY 
    v.nombre_vendedor, s.nombre_supermercado
ORDER BY 
    total_ventas DESC;
	
--Consulta 4
   SELECT 
    f.numero_factura,
    f.valor_venta,
    v.nombre_vendedor
FROM 
    factura f
INNER JOIN 
    vendedor v ON f.id_vendedor = v.id_vendedor
WHERE 
    f.valor_venta > 100000
    AND v.id_vendedor = 3;