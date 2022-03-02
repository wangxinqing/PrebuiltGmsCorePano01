package defpackage;

/* renamed from: wdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdf implements Runnable {
    private final wdh a;
    private final String b;

    public wdf(wdh wdh, String str) {
        this.a = wdh;
        this.b = str;
    }

    public final void run() {
        wdh wdh = this.a;
        wdh.a.a(this.b);
    }
}
