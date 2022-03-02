package defpackage;

/* renamed from: npb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npb {
    public final nps a;
    private final noa b;

    public npb(nps nps, noa noa) {
        this.a = nps;
        this.b = noa;
    }

    public final void a(int i, long j) {
        noa noa = this.b;
        if (noa != null) {
            noa.a(i, System.currentTimeMillis() - j);
        }
    }
}
