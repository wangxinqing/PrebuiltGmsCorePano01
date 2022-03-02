package defpackage;

import java.util.Iterator;

/* renamed from: amzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amzt extends amzm {
    public final amzy a() {
        this.c = true;
        return amzy.b(this.a, this.b);
    }

    public final void b(Iterable iterable) {
        super.a(iterable);
    }

    public final void c(Object obj) {
        super.a(obj);
    }

    public amzt() {
        super(4);
    }

    public amzt(int i) {
        super(i);
    }

    public final void a(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.a(obj);
    }

    public final void b(Object... objArr) {
        super.a(objArr);
    }
}
