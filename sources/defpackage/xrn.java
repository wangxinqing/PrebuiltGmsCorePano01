package defpackage;

import android.widget.Toast;

/* renamed from: xrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xrn implements Runnable {
    private final xro a;
    private final String b;

    public xrn(xro xro, String str) {
        this.a = xro;
        this.b = str;
    }

    public final void run() {
        xro xro = this.a;
        Toast.makeText(xro.a, this.b, 0).show();
    }
}
