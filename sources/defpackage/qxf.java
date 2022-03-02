package defpackage;

/* renamed from: qxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qxf extends qxw {
    public long a = -1;
    public long b = -1;

    public qxf() {
        this.n = false;
    }

    public final void a(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* renamed from: a */
    public final qxg b() {
        super.d();
        long j = this.a;
        if (j != -1) {
            long j2 = this.b;
            if (j2 != -1) {
                if (j < j2) {
                    c();
                    return new qxg(this);
                }
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            }
        }
        throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }
}
