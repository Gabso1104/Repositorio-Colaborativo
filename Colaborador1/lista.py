# Crear una lista de números
numeros = [1, 2, 3, 4, 5]

# Imprimir la lista original
print("Lista original:", numeros)

# Obtener la longitud de la lista
longitud = len(numeros)
print("Longitud de la lista:", longitud)

# Acceder al primer elemento de la lista
primer_elemento = numeros[0]
print("Primer elemento:", primer_elemento)

# Acceder al último elemento de la lista
ultimo_elemento = numeros[-1]
print("Último elemento:", ultimo_elemento)

# Modificar un elemento de la lista
numeros[2] = 6
print("Lista modificada:", numeros)

# Agregar un elemento al final de la lista
numeros.append(7)
print("Lista con elemento añadido:", numeros)

# Insertar un elemento en una posición específica
numeros.insert(3, 8)
print("Lista con elemento insertado:", numeros)

# Eliminar un elemento de la lista
numeros.remove(4)
print("Lista con elemento eliminado:", numeros)

# Revertir el orden de la lista
numeros.reverse()
print("Lista revertida:", numeros)

# Ordenar la lista de forma ascendente
numeros.sort()
print("Lista ordenada:", numeros)

# Obtener la suma de los elementos de la lista
suma = sum(numeros)
print("Suma de los elementos:", suma)