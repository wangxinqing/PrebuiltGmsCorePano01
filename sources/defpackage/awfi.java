package defpackage;

/* renamed from: awfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awfi extends awfc {
    private final awfc b;

    public awfi(awfc awfc) {
        this.b = awfc;
    }

    public final awex a(awey awey) {
        try {
            awex a = this.b.a(awey);
            return a != null ? new awfg(a) : awex.a;
        } catch (RuntimeException e) {
            awfj.a(e, this.b, awey);
            return awex.a;
        }
    }
}
