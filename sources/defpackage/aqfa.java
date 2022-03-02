package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: aqfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfa {
    final List a = new ArrayList();
    private final long b;

    public aqfa(long j) {
        this.b = j;
    }

    public final int a(int i, long j) {
        if (i < 0) {
            return i;
        }
        this.a.add(new aqez(i, j));
        ListIterator listIterator = this.a.listIterator();
        int i2 = 0;
        long j2 = 0;
        while (listIterator.hasNext()) {
            aqez aqez = (aqez) listIterator.next();
            if (Math.abs(j - aqez.b) <= this.b) {
                j2 += (long) aqez.a;
                i2++;
            } else {
                listIterator.remove();
            }
        }
        return i2 > 0 ? (int) (j2 / ((long) i2)) : i;
    }

    public final void a() {
        this.a.clear();
    }
}
