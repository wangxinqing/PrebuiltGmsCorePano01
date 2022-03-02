package defpackage;

/* renamed from: wde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wde implements Runnable {
    private final wdh a;
    private final String b;
    private final tiv c;

    public wde(wdh wdh, String str, tiv tiv) {
        this.a = wdh;
        this.b = str;
        this.c = tiv;
    }

    public final void run() {
        wdh wdh = this.a;
        wdh.a.a(this.b, this.c);
    }
}
