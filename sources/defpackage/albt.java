package defpackage;

import com.google.android.gms.R;

/* renamed from: albt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class albt implements Runnable {
    final /* synthetic */ albv a;

    public albt(albv albv) {
        this.a = albv;
    }

    public final void run() {
        if (this.a.isVisible()) {
            albv albv = this.a;
            if (albv.f) {
                albv.a((int) R.string.common_unknown);
            }
        }
    }
}
