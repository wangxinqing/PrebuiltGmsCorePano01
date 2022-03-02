package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: azzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azzz implements Iterator {
    final /* synthetic */ baaa a;
    private boolean b = true;
    private int c = this.a.b;

    public azzz(baaa baaa) {
        this.a = baaa;
    }

    public final boolean hasNext() {
        if (this.b) {
            return true;
        }
        while (true) {
            int i = this.c;
            baaa baaa = this.a;
            baaf baaf = baaa.c;
            if (i >= baaf.d) {
                return false;
            }
            if (!Arrays.equals(baaa.a.b, baaf.a(i))) {
                this.c++;
            } else {
                this.b = true;
                return true;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.b = false;
            baaa baaa = this.a;
            baaf baaf = baaa.c;
            int i = this.c;
            this.c = i + 1;
            return baaf.a(i, baaa.a);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
