package practicepatterns.iteratorpattern;

public interface Iterator {
    public boolean hasNext();
    public Object next();
}

interface Container {
    public Iterator getIterator();
}

class CollectionofNames implements Container {
    public String name[]={"satya", "sai","vishnu","kumar","Hemant"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate() ;
    }
    private class CollectionofNamesIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            if (i<name.length){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}