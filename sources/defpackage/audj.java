package defpackage;

import java.util.List;

/* renamed from: audj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audj extends audk {
    static aucx c(Object obj, long j) {
        return (aucx) aufp.f(obj, j);
    }

    public final List a(Object obj, long j) {
        int i;
        aucx c = c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        if (size != 0) {
            i = size + size;
        } else {
            i = 10;
        }
        aucx b = c.b(i);
        aufp.a(obj, j, (Object) b);
        return b;
    }

    public final void b(Object obj, long j) {
        c(obj, j).b();
    }

    public final void a(Object obj, Object obj2, long j) {
        aucx c = c(obj, j);
        aucx c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.a()) {
                c = c.b(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        aufp.a(obj, j, (Object) c2);
    }
}
