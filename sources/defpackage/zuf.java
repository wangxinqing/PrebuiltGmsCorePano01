package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: zuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zuf {
    public final Set a;
    public final Long b;
    public final Long c;
    public final boolean d;

    public zuf(Long l, Long l2) {
        this(l, l2, 0);
    }

    public final void a(Long l) {
        this.a.add(l);
    }

    public zuf(Long l, Long l2, int i) {
        this.a = new LinkedHashSet();
        this.b = l;
        this.c = l2;
        this.d = i != 1 ? false : true;
    }
}
