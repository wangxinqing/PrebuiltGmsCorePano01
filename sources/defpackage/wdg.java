package defpackage;

/* renamed from: wdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdg implements Runnable {
    private final wdh a;
    private final String b;
    private final tiy c;

    public wdg(wdh wdh, String str, tiy tiy) {
        this.a = wdh;
        this.b = str;
        this.c = tiy;
    }

    public final void run() {
        wdh wdh = this.a;
        wdh.a.a(this.b, this.c);
    }
}
