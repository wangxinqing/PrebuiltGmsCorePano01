package defpackage;

import java.util.List;

/* renamed from: ahwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwe {
    final List a;
    final long b;
    final /* synthetic */ ahwf c;

    public ahwe(ahwf ahwf, long j, List list) {
        this.c = ahwf;
        this.b = j;
        this.a = list;
    }

    public final void a(List list) {
        this.c.a(true);
        this.c.a(this.b, this.a, list);
    }
}
