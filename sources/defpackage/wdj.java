package defpackage;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: wdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdj implements Runnable {
    private final wdk a;
    private final String b;
    private final PayloadTransferUpdate c;

    public wdj(wdk wdk, String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.a = wdk;
        this.b = str;
        this.c = payloadTransferUpdate;
    }

    public final void run() {
        wdk wdk = this.a;
        wdk.a.a(this.b, this.c);
    }
}
