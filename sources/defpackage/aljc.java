package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: aljc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljc implements alhi {
    private final Handler a = new Handler(Looper.getMainLooper());
    private boolean b = false;
    private boolean c = false;

    private final void a() {
        this.a.post(new aljb());
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        if (!z) {
            a();
            this.b = false;
            this.c = true;
        } else if (!this.c) {
            a();
            this.b = true;
        }
    }
}
