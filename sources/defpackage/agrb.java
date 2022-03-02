package defpackage;

/* renamed from: agrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agrb implements aoqb {
    private final agrc a;
    private final long b;
    private final int c;
    private final int d;

    public agrb(agrc agrc, int i, long j, int i2) {
        this.a = agrc;
        this.c = i;
        this.b = j;
        this.d = i2;
    }

    public final aorr a(Object obj) {
        agrc agrc = this.a;
        int i = this.c;
        long j = this.b;
        Exception exc = (Exception) obj;
        agrc.b.a(i, agrc.c.b() - j, this.d);
        throw exc;
    }
}
