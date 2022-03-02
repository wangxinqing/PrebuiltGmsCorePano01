package defpackage;

/* renamed from: bvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bvi {
    public final bve a;
    public final long b;
    public final long c;

    public bvi(bve bve, long j, long j2) {
        boolean z = true;
        iva.b(j >= 0);
        iva.b(j2 < j ? false : z);
        iva.a((Object) bve);
        this.a = bve;
        this.b = j;
        this.c = j2;
    }

    public final boolean a() {
        return this.b > 0;
    }
}
