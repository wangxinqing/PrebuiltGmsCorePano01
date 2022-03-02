package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: dua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dua implements Iterator {
    protected int a;
    public dty b;
    public final Map[] c;
    final /* synthetic */ SearchResults d;

    public dua(SearchResults searchResults) {
        this.d = searchResults;
        this.c = !searchResults.a() ? new Map[searchResults.i.length] : null;
    }

    /* renamed from: a */
    public final dtz next() {
        if (hasNext()) {
            dtz dtz = new dtz(this.d, this.a, this);
            this.a++;
            return dtz;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return !this.d.a() && this.a < this.d.g;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
