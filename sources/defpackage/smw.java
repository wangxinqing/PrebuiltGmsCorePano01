package defpackage;

/* renamed from: smw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class smw implements Runnable {
    final /* synthetic */ smx a;

    public smw(smx smx) {
        this.a = smx;
    }

    public final void run() {
        smh.a(new avuj[]{avuj.UNPAIR_TIMEOUT}, this.a.g, false, snh.a());
        this.a.stopSelf();
    }
}
