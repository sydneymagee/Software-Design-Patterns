/**
 * This is the Reverse Diner Menu Iterator.
 *
 * @author Sydney Magee
 * @version 10/18/2020
 */
public class ReverseDinerMenuIterator implements Iterator
{
    MenuItem[] items;
    int position;

    public ReverseDinerMenuIterator(MenuItem[] items)
    {
        this.items = items;
        position = items.length -1;
    }
    public MenuItem next()
    {
        MenuItem item = items[position];
        position --;
        return item;
    }
    public boolean hasNext()
    {
        if(position < 0 || items[position] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public void remove()
    {
        throw new UnsupportedOperationException();
    }

}
