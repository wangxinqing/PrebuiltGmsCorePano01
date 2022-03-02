package defpackage;

import java.io.IOException;

/* renamed from: utw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utw implements Runnable {
    private final uui a;
    private final uvi b;
    private final byte[] c;

    public utw(uui uui, uvi uvi, byte[] bArr) {
        this.a = uui;
        this.b = uvi;
        this.c = bArr;
    }

    public final void run() {
        uui uui = this.a;
        uvi uvi = this.b;
        byte[] bArr = this.c;
        jjg jjg = ulh.a;
        aymi.R();
        try {
            uui.a(uvi, uui.a(bArr));
        } catch (IOException e) {
        }
        uvi.close();
    }
}
