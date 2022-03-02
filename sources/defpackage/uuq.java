package defpackage;

import android.net.LinkProperties;

/* renamed from: uuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uuq implements Runnable {
    private final uur a;
    private final LinkProperties b;
    private final int c;
    private final uue d;

    public uuq(uur uur, LinkProperties linkProperties, int i, uue uue) {
        this.a = uur;
        this.b = linkProperties;
        this.c = i;
        this.d = uue;
    }

    public final void run() {
        uur uur = this.a;
        uur.b.a(this.b, this.c, this.d);
    }
}
