package defpackage;

import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: blo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class blo implements Iterator {
    final /* synthetic */ blp a;
    private final BitSet b = new BitSet(this.a.a.size());
    private int c = 0;

    public blo(blp blp) {
        this.a = blp;
    }

    public final boolean hasNext() {
        return this.b.cardinality() != this.a.a.size();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        if (hasNext()) {
            bpq bpq = this.a.b;
            synchronized (bpq.b) {
                str = (String) bpq.c.pollFirst();
            }
            while (this.b.get(this.c)) {
                this.c++;
            }
            int i = this.c;
            if (str != null) {
                int i2 = i;
                while (true) {
                    if (i2 < this.a.a.size()) {
                        if (!this.b.get(i2) && ((blq) this.a.a.get(i2)).a().equals(str)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            this.b.set(i);
            return (blq) this.a.a.get(i);
        }
        throw new NoSuchElementException();
    }
}
