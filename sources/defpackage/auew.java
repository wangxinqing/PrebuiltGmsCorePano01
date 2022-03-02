package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: auew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auew implements Iterator {
    final /* synthetic */ auey a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public auew(auey auey) {
        this.a = auey;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }

    public final boolean hasNext() {
        if (this.b + 1 < this.a.a.size()) {
            return true;
        }
        if (this.a.b.isEmpty() || !a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        if (i >= this.a.a.size()) {
            return (Map.Entry) a().next();
        }
        return (Map.Entry) this.a.a.get(this.b);
    }

    public final void remove() {
        if (this.c) {
            this.c = false;
            this.a.c();
            if (this.b >= this.a.a.size()) {
                a().remove();
                return;
            }
            auey auey = this.a;
            int i = this.b;
            this.b = i - 1;
            auey.c(i);
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
