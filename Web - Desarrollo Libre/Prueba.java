
class Binsearch{
	
	//este es un encapsulamiento de una función de busqueda binaria que toma un vector
	//de objetos ordenados y una clave y devuelve un objeto con 2 atributos:
	//index-el valor del vector index
	//found-un valor booleano que indica si key está en el vector.
	//Se devuelve un objeto puesto que en Java no es posible pasar tipos básicos
	//por referencia a una función y por lo tanto devolver los valores.
	//El valor de key es -1 si no se encuentra el elemento.

	public static void search(int key, int[] elemArray, Result r){
		int bottom = 0;
		int top = elemArray.length-1;
		int mid;
		r.found = false;
		r.index = -1;
		while(bottom <= top){
			mid = (top + bottom) / 2;
			if (elemArray[mid] == key) {
				r.index = mid;
				r.found = true;
				return;
			}//if part
			else{
				if (elemArray[mid] < key) {
					bottom = mid + 1;

				}else{
					top = mid -1;
				}
			}
		}//while loop
	}//busqueda
}//Binsearch