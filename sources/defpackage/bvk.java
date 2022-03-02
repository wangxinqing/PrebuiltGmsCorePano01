package defpackage;

/* renamed from: bvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvk {
    public final bvj a = new bvj();
    public final buv b = new buv();
    private final bvg c = new bvg(this);

    public final void a() {
        long j = this.a.b;
        if (j != Long.MAX_VALUE) {
            long b2 = j - cbi.i().b();
            if (b2 <= 0) {
                this.b.a(this.c, bvq.a("TaskConsolidator#ExecuteOperation"));
            } else {
                this.b.a(this.c, b2, bvq.a("TaskConsolidator#ExecuteOperation"));
            }
        }
    }
}
