package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ajqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajqo {
    public final Handler c;
    public final acrz d;
    public final Handler e = new ajqn(this, this.c.getLooper());

    public ajqo(Handler handler, acrz acrz) {
        this.c = handler;
        this.d = acrz;
    }

    public final Looper a() {
        return this.c.getLooper();
    }

    public final boolean a(Runnable runnable) {
        acrz acrz = this.d;
        if (acrz == null) {
            return this.c.post(runnable);
        }
        acrz.a(60000);
        if (this.e.post(runnable)) {
            return true;
        }
        if (!this.d.e()) {
            return false;
        }
        this.d.c();
        return false;
    }
}
