package defpackage;

/* renamed from: awfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awfh extends awfb {
    private final awfb b;

    public awfh(awfb awfb) {
        this.b = awfb;
    }

    public final awfc a(Object obj) {
        try {
            awfc a = this.b.a(obj);
            return a != null ? new awfi(a) : awfc.a;
        } catch (RuntimeException e) {
            awfj.a(e, this.b, obj);
            return awfc.a;
        }
    }
}
