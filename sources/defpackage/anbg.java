package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: anbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbg implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public anbg(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        anbf anbf = new anbf(this.a);
        anbf.c(this.b);
        anbh a2 = anbh.a(anbf.e, anbf.b, anbf.a);
        anbf.b = a2.size();
        anbf.c = true;
        return a2;
    }
}
