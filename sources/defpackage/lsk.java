package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: lsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lsk {
    private final lsi a;
    private final Set b;

    public lsk(boolean z) {
        lsi lsi;
        if (z) {
            lsi = new lsi(this);
        } else {
            lsi = null;
        }
        this.a = lsi;
        this.b = new HashSet();
    }

    private final void a(kmp kmp, boolean z) {
        knc a2 = kmp.a();
        boolean contains = this.b.contains(a2);
        if (!contains) {
            if (!a(kmp)) {
                return;
            }
        } else if (z && this.a.a.contains(a2)) {
            return;
        }
        if (z) {
            lsi lsi = this.a;
            iva.a(lsi.a.add(kmp.a()), (Object) "Entry has already been considered before");
            boolean c = lsi.c.c(kmp);
            if (c) {
                lsi.b.add(kmp);
            }
            z = c;
        }
        if (!contains || z) {
            this.b.add(a2);
            kky b2 = b(kmp);
            if (b2 != null) {
                try {
                    Iterator it = b2.iterator();
                    while (it.hasNext()) {
                        a((kmp) it.next(), z);
                    }
                } finally {
                    b2.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(kmp kmp);

    public final Set b() {
        return Collections.unmodifiableSet(this.b);
    }

    /* access modifiers changed from: protected */
    public abstract kky b(kmp kmp);

    /* access modifiers changed from: protected */
    public boolean c(kmp kmp) {
        return false;
    }

    public final void d(kmp kmp) {
        lsi lsi = this.a;
        if (lsi != null) {
            lsi.a.clear();
            lsi.b.clear();
        }
        this.b.clear();
        a(kmp, this.a != null);
    }

    public final Set a() {
        return Collections.unmodifiableSet(this.a.b);
    }
}
