package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: annp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class annp implements Iterable, Serializable {
    public static int a(double d) {
        return aoog.b((long) d);
    }

    public static void c(int i) {
        amrl.a(i > 0);
    }

    public abstract int b(int i);

    public final int d(int i) {
        if (a(i)) {
            return b(i);
        }
        return -1;
    }

    public final Iterator iterator() {
        return new annl(this);
    }

    public boolean a(int i) {
        return b(i) >= 0;
    }
}
