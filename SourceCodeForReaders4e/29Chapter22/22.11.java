public V getValue(K key){   checkInitialization();   V result = null;   int index = getHashIndex(key);   index = locate(index, key);   if (index != -1)      result = hashTable[index].getValue(); // Key found; get value   // Else not found; result is null   return result;} // end getValue// Version 4.0