package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bapn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bapn extends bapj implements baps {
    protected bapn() {
    }

    /* renamed from: a */
    public final int compareTo(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof baps) {
            bapt b = listIterator();
            bapt b2 = ((baps) list).b();
            while (b.hasNext() && b2.hasNext()) {
                long a = b.a();
                long a2 = b2.a();
                int i = (a > a2 ? 1 : (a == a2 ? 0 : -1));
                if (a != a2) {
                    return i;
                }
            }
            if (!b2.hasNext()) {
                return !b.hasNext() ? 0 : 1;
            }
            return -1;
        }
        bapt b3 = listIterator();
        ListIterator listIterator = list.listIterator();
        while (b3.hasNext() && listIterator.hasNext()) {
            int compareTo = ((Comparable) b3.next()).compareTo(listIterator.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (!listIterator.hasNext()) {
            return !b3.hasNext() ? 0 : 1;
        }
        return -1;
    }

    public void a(int i, int i2) {
        throw null;
    }

    public void a(int i, long j) {
        throw null;
    }

    public boolean a(long j) {
        throw null;
    }

    public boolean addAll(int i, Collection collection) {
        d(i);
        Iterator it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, (Long) it.next());
            i++;
        }
        return hasNext;
    }

    public long b(int i) {
        throw null;
    }

    public long b(int i, long j) {
        throw null;
    }

    /* renamed from: c */
    public bapt listIterator(int i) {
        throw null;
    }

    public void clear() {
        a(0, size());
    }

    public int d(long j) {
        bapt b = listIterator();
        while (b.hasNext()) {
            if (j == b.a()) {
                return b.previousIndex();
            }
        }
        return -1;
    }

    public int e(long j) {
        bapt c = listIterator(size());
        while (c.hasPrevious()) {
            if (j == c.b()) {
                return c.nextIndex();
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof baps) {
                    bapt b = listIterator();
                    bapt b2 = ((baps) list).b();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (b.a() != b2.a()) {
                            return false;
                        }
                        size = i;
                    }
                } else {
                    bapt b3 = listIterator();
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        Object next = b3.next();
                        Object next2 = listIterator.next();
                        if (next == null) {
                            if (next2 != null) {
                                break;
                            }
                        } else if (!next.equals(next2)) {
                            break;
                        }
                        size = i2;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public final Long get(int i) {
        return Long.valueOf(a(i));
    }

    @Deprecated
    /* renamed from: g */
    public final Long remove(int i) {
        return Long.valueOf(b(i));
    }

    @Deprecated
    public final int indexOf(Object obj) {
        return d(((Long) obj).longValue());
    }

    @Deprecated
    public final int lastIndexOf(Object obj) {
        return e(((Long) obj).longValue());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        bapt b = listIterator();
        int size = size();
        sb.append("[");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(b.a()));
                z = false;
                size = i;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final int hashCode() {
        bapt b = listIterator();
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long a = b.a();
            i = (i * 31) + ((int) (a ^ (a >>> 32)));
            size = i2;
        }
    }

    /* renamed from: b */
    public baps subList(int i, int i2) {
        d(i);
        d(i2);
        if (i <= i2) {
            return new bapm(this, i, i2);
        }
        throw new IndexOutOfBoundsException("Start index (" + i + ") is greater than end index (" + i2 + ")");
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
        } else if (i > size()) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than list size (" + size() + ")");
        }
    }

    /* access modifiers changed from: protected */
    public final void e(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is negative");
        } else if (i >= size()) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + size() + ")");
        }
    }

    /* renamed from: b */
    public final bapt listIterator() {
        return listIterator(0);
    }

    @Deprecated
    /* renamed from: b */
    public final Long set(int i, Long l) {
        return Long.valueOf(b(i, l.longValue()));
    }

    public final boolean b(long j) {
        return d(j) >= 0;
    }

    @Deprecated
    /* renamed from: a */
    public final void add(int i, Long l) {
        a(i, l.longValue());
    }
}
