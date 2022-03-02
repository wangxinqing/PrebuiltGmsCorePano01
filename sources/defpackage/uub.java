package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: uub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uub implements Runnable {
    private final uui a;
    private final uvi b;
    private final tfu c;
    private final short d;

    public uub(uui uui, uvi uvi, tfu tfu, short s) {
        this.a = uui;
        this.b = uvi;
        this.c = tfu;
        this.d = s;
    }

    public final void run() {
        uui uui = this.a;
        uvi uvi = this.b;
        tfu tfu = this.c;
        short s = this.d;
        while (!uvi.b) {
            try {
                uui.a((InputStream) uvi.c, 5);
                jjg jjg = ulh.a;
                tfu.b();
                uvi.close();
                uui.a.b(uvi.a);
                uui.f.c(s);
            } catch (IOException e) {
            }
        }
    }
}
