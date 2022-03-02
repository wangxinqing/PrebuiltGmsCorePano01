package defpackage;

/* renamed from: uud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uud implements Runnable {
    private final uue a;
    private final uvi b;
    private final uvz c;
    private final tfu d;
    private final uvq e;

    public uud(uue uue, uvi uvi, uvz uvz, uvq uvq, tfu tfu) {
        this.a = uue;
        this.b = uvi;
        this.c = uvz;
        this.e = uvq;
        this.d = tfu;
    }

    public final void run() {
        uue uue = this.a;
        uvi uvi = this.b;
        uvz uvz = this.c;
        uvq uvq = this.e;
        tfu tfu = this.d;
        uui uui = uue.c;
        uvy uvy = uvi.a;
        tfu.b();
        uvz.a(new utu(uui, uvy));
        uvq.a.a(uvq.b, uvz);
    }
}
