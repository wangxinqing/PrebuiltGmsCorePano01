package defpackage;

import com.google.android.gms.ads.internal.clearcut.b;
import com.google.android.gms.ads.internal.config.n;

/* renamed from: bgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bgl implements Runnable {
    final /* synthetic */ bgm a;

    public bgl(bgm bgm) {
        this.a = bgm;
    }

    public final void run() {
        boolean z;
        if (this.a.d == null) {
            synchronized (bgm.b) {
                if (this.a.d == null) {
                    boolean z2 = false;
                    try {
                        z = ((Boolean) n.b.a()).booleanValue();
                    } catch (IllegalStateException e) {
                        z = false;
                    }
                    if (z) {
                        try {
                            bgm.c = new b(this.a.a.a, "ADSHIELD");
                        } catch (Throwable th) {
                        }
                    }
                    z2 = z;
                    this.a.d = Boolean.valueOf(z2);
                    bgm.b.open();
                }
            }
        }
    }
}
