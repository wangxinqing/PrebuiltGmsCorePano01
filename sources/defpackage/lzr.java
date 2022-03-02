package defpackage;

import android.util.Log;

/* renamed from: lzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lzr implements Runnable {
    final /* synthetic */ lzs a;

    public lzr(lzs lzs) {
        this.a = lzs;
    }

    public final void run() {
        if (this.a.a != null) {
            lzs lzs = this.a;
            lzt lzt = lzs.c;
            lzt.b--;
            try {
                lzs.a.b();
            } catch (Exception e) {
                Log.e("DGProcessor", "Error while closing handle.");
            }
            this.a.a = null;
            this.a.c.a();
        }
    }
}
