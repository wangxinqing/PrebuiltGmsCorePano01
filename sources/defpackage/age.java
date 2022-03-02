package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: age  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class age {
    final ArrayDeque a;
    private final Runnable b;

    public age() {
        this((Runnable) null);
    }

    public final void a() {
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            agb agb = (agb) descendingIterator.next();
            if (agb.a) {
                hl hlVar = agb.c;
                hlVar.a(true);
                if (!hlVar.e.a) {
                    hlVar.d.a();
                    return;
                } else {
                    hlVar.c();
                    return;
                }
            }
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public age(Runnable runnable) {
        this.a = new ArrayDeque();
        this.b = runnable;
    }
}
