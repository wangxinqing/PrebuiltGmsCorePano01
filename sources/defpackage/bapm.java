package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bapm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bapm extends bapn implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final baps a;
    protected final int b;
    protected int c;

    public bapm(baps baps, int i, int i2) {
        this.a = baps;
        this.b = i;
        this.c = i2;
    }

    public final long a(int i) {
        e(i);
        return this.a.a(this.b + i);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, (Long) obj);
    }

    public final boolean addAll(int i, Collection collection) {
        d(i);
        this.c += collection.size();
        return this.a.addAll(this.b + i, collection);
    }

    public final long b(int i) {
        e(i);
        this.c--;
        return this.a.b(this.b + i);
    }

    public final bapt c(int i) {
        d(i);
        return new bapl(this, i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((List) obj);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, (Long) obj);
    }

    public final int size() {
        return this.c - this.b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator();
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public final /* bridge */ /* synthetic */ bapr a() {
        return listIterator();
    }

    public final long b(int i, long j) {
        e(i);
        return this.a.b(this.b + i, j);
    }

    public final boolean c(long j) {
        int d = d(j);
        if (d == -1) {
            return false;
        }
        this.c--;
        this.a.b(this.b + d);
        return true;
    }

    public final void a(int i, int i2) {
        d(i);
        d(i2);
        baps baps = this.a;
        int i3 = this.b;
        baps.a(i3 + i, i3 + i2);
        this.c -= i2 - i;
    }

    public final baps b(int i, int i2) {
        d(i);
        d(i2);
        if (i <= i2) {
            return new bapm(this, i, i2);
        }
        throw new IllegalArgumentException("Start index (" + i + ") is greater than end index (" + i2 + ")");
    }

    public final void a(int i, long j) {
        d(i);
        this.a.a(this.b + i, j);
        this.c++;
    }

    public final boolean a(long j) {
        this.a.a(this.c, j);
        this.c++;
        return true;
    }
}
