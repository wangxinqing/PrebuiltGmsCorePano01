package defpackage;

/* renamed from: ajeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajeb implements ajec {
    private final ajed a;
    private final long b;

    public ajeb(ajed ajed, long j) {
        this.a = ajed;
        this.b = j;
    }

    public final arvl a() {
        ajed ajed = this.a;
        long j = this.b;
        aucd o = arvl.d.o();
        arvk arvk = ajed.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        arvl arvl = (arvl) o.b;
        arvk.getClass();
        arvl.a = arvk;
        arvl.b = (int) (j - ajed.b);
        int a2 = (int) (ajed.a() - ajed.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arvl) o.b).c = a2;
        return (arvl) o.i();
    }
}
