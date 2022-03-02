package defpackage;

import java.io.IOException;

/* renamed from: bama  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class bama implements Runnable {
    final /* synthetic */ bamb b;

    public bama(bamb bamb) {
        this.b = bamb;
    }

    public abstract void a();

    public final void run() {
        try {
            if (this.b.f != null) {
                a();
                return;
            }
            throw new IOException("Unable to perform write due to unavailable sink.");
        } catch (Exception e) {
            this.b.c.a(e);
        }
    }
}
