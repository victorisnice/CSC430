public T getFront(){   checkInitialization();   if (isEmpty())      throw new EmptyQueueException();   else      return queue[frontIndex];} // end getFront// Version 4.0