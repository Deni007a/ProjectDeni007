package OOP2.Bonus;


//import java.sql.Array;

import javax.management.ObjectName;
import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

/**
 * Created by Den on 31.03.2017.
 */
class LinkedList<T> implements List<T>  {

    Object[] arRaus = new Object[10];



    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < arRaus.length; i++) {
            if (arRaus[i] != null) count++;
            else break;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) return true;
        else return false;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) return false;
        boolean z = false;
        for (Object j : arRaus) {
            if (j != null && j.equals(o)) return z = true;
        }
        return z;
    }

    @Override
    public Iterator<T> iterator() { /////////////////???????
       MyInterator myInterator= new MyInterator();
//    myInterator.next();
//        return myInterator;
        return myInterator;
    }

    @Override
    public Object[] toArray() {
        if (isEmpty()) return new Object[0];
        Object o[] = Arrays.copyOf(arRaus, size());

        return o;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        Object[] arRaus1 = new Object[size()];   // делем новый обект без null
        System.arraycopy(arRaus, 0, arRaus1, 0, size());

               Arrays.sort(arRaus1);


       // if (a.length < size()) return (T1[]) Arrays.copyOf(arRaus1, size(), a.getClass());
        if (a.length < size()) return (T1[]) Arrays.copyOf(arRaus1, size(),a.getClass());
                  System.arraycopy(arRaus1, 0, a, 0, size());
                  if (a.length > size())
                          a[size()] = null;

        return a;
    }

    @Override
    public boolean add(T t) {
        int size = size();
        arRaus[size] = t;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        Object[] arRaus1;
        if (contains(o) == false) return false;
        for (int i = 0; i < size(); i++) {
            if (arRaus[i] == o) {
                if (i == 0) {
                    arRaus1 = Arrays.copyOfRange(arRaus, 1, size());
                    arRaus = arRaus1;

                } else if (i == size()) {
                    arRaus1 = Arrays.copyOfRange(arRaus, 0, size() - 1);
                    arRaus = arRaus1;
                } else if (i != 0 & i != size()) {
                    arRaus1 = Arrays.copyOfRange(arRaus, 0, size() - 1);
                    arRaus = arRaus1;
                }
            }
        }
        return true;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        boolean thisColl = true;
        for (Object z : c) {
            if (!contains(z)) thisColl = false;
        }

        return thisColl;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c.isEmpty()) return false;  // фолс ели колекция пуста
        for (Object t : c) {
            arRaus[size()] = t;
        }
        return true;
    }


    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        if ((index < 0 || index >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана длина");   // генерируем исключение
        }
        if (c == null) throw new NullPointerException("NULL!!");
        System.arraycopy(arRaus, index, arRaus, index, size());
        for (Object o : c) {
            add(index, (T) o);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean boolRemovall = false;
        if (c.isEmpty()) return false;
        for (Object o : c) {
            if (!contains(o)) continue;
            if (contains(o)) {
                remove(o);
                boolRemovall = true;
            }
        }
        return boolRemovall;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }///////////////////

    @Override
    public void clear() {
        Arrays.fill(arRaus, 0, size(), null);

    }

    @Override
    public T get(int index) {
        if ((index < 0 || index >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана длина");   // генерируем исключение
        }
        return (T) arRaus[index];
    }

    @Override
    public T set(int index, T element) {
        if (element == null) throw new NullPointerException("NULL!!");
        if ((index < 0 || index >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана длина");   // генерируем исключение
        }
        return (T) (arRaus[index] = element);
    }

    @Override
    public void add(int index, T element) {
        if ((index < 0 || index >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана длина");   // генерируем исключение
        }
        if (element == null) throw new NullPointerException("NULL!!");
        System.arraycopy(arRaus, index, arRaus, index + 1, size());
        arRaus[index] = element;
    }

    @Override
    public T remove(int index) {
        Object temp = arRaus[index];
        if ((index < 0 || index >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана длина");   // генерируем исключение
        }
        System.arraycopy(arRaus, index + 1, arRaus, index, size());

        return (T) temp;
    }

    @Override
    ///////////////////////////перписать созать обект фиксированого размера (чтоб небыло null)и сравнить
    public int indexOf(Object o) {
        if (isEmpty()) throw new NullPointerException("NULL!!");
        if (o == null) throw new NullPointerException("Object o NULL!!");
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (arRaus[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (isEmpty()) throw new NullPointerException("NULL!!");
        if (o == null) throw new NullPointerException("Object o NULL!!");
        int index = -1;
        for (int i = 0; i < size(); i++) {
            System.out.println(arRaus[i]);
            if (arRaus[i].equals(o)) {
                index = i;

            }
        }
        return index;
    }

    @Override
    public ListIterator<T> listIterator() {  //////////////////????????????


        return listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    } ////////???????

    @Override
    public List<T> subList(int fromIndex, int toIndex) {

        if ((fromIndex < 0 || fromIndex >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана начальная  длина");   // генерируем исключение
        }
        if ((toIndex < 0 || toIndex >= size())) {
            throw new IndexOutOfBoundsException("неправильно задана конечная  длина");   // генерируем исключение
        }
        if(fromIndex==toIndex) throw new NullPointerException("список пуст NULL!!");

        LinkedList<Object> listSub = new LinkedList<>();

        for (int i = fromIndex; i <toIndex ; i++) {
            listSub.add(arRaus[i]);
        }
        return (List<T>) listSub;
    }

///////////////////////*****************////////////////////////////////
    class MyInterator implements Iterator<T> {
        int interrr = -1;

        @Override
        public boolean hasNext() {
            if (arRaus[0] != null) {
                interrr++;
                return true;
            }
            else if(interrr>size()-1) return false;
            else return false;
        }

        @Override
        public T next() {

            return (T) arRaus[interrr + 1];
        }
    }


}
