#Importamos una libreria para el uso de expresiones regulares
import re as r

def Menu():
	pass		
#============================================================================================================================================#
def ElementosXn():
	"""Función para pedir al usuario el numero de secuencias que desea ingresar a Xn para despues usarlo e ingresar datos correspondientes"""	
	
	while True:
		try:
			elementosx=int(input("¿ Cuantas secuencias desea agregar a Xn ?:\t"))
			return elementosx
			break
		except ValueError:
			print("No se ingreso un entero \n")
		except KeyboardInterrupt:
			print("Cancelado por usuario \n")
			break	

def Xnn():
	"""Función para ingresar valores a Xn usando la función previa ElementosXn para agregar las respectivas secuencias"""

	try:
		a=ElementosXn()
		xn=[]
		for i in range(a):
			valoresxn=input("Ingresa los valores de la secuencia para Xn deben ser enteros y agregar Xorgn para el origen:\t")
			xn.append(valoresxn)
		return xn
	except KeyboardInterrupt:
		print("Cancelado por usuario\n")

def ValidacionXn(xn):
	"""Funcioón para Validar nuestra secuencia Xn"""

	while True:
		try:
			cont=0
			for i in xn:
				cont+=1
				if len(i) >=5 and r.findall(r"^\d+orgn",i):
					return cont

			break
		except KeyboardInterrupt:
			print("Cancelado por usuario\n")
			break
		
def Xn(c,xn):
	"""Nuestro vector Xn queda definido aqui"""
	try:
		xnizquierda=[]
		xnderecha=[]
		origen=0
		print("Valor de C",c)
		for i in xn[0:c-1]:
			print(i)
			xnizquierda.append(int(i))
			return xnizquierda
		
		for z in xn[c:]:
			print(i)
			xnderecha.append(int(z))
			return xnderecha

		for w in xn[c-1]:
			
		
	except TypeError:
		print("Entradas no validas al no tener origen\n")
		



#============================================================================================================================================#

def ElementosYn():
	"""Función para pedir al usuario el numero de secuencias que desea ingresar a Xy, para despues usarlo e ingresar datos correspondientes"""	
	
	while True:
		try:
			elementos=int(input("¿ Cuantas secuencias desea agregar a Yn ?:\t"))
			return elementos
			break
		except ValueError:
			print("No se ingreso un entero \n")
		except KeyboardInterrupt:
			print("Cancelado por usuario \n")
			break	

def Yn():
	"""Función para ingresar valores a Xy usando la función previa ElementosXy para agregar las respectivas secuencias"""

	try:
		b=ElementosYn()
		yn=[]
		for i in range(b):
			valoresyn=input("Ingresa los valores de la secuencia para Yn:\t")
			yn.append(valoresyn)
		return yn
	except KeyboardInterrupt:
		print("Cancelado por usuario\n")




if __name__ == '__main__':
	xnn=Xnn()
	vxn=ValidacionXn(xnn)
	Xn(vxn,xnn)