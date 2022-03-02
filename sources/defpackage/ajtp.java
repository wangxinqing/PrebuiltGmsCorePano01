package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: ajtp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajtp implements Runnable {
    public boolean a;
    public int b;
    final /* synthetic */ BottomSheetBehavior c;
    private final View d;

    public ajtp(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.d = view;
        this.b = i;
    }

    public final void run() {
        sd sdVar = this.c.n;
        if (sdVar != null && sdVar.b()) {
            qb.a(this.d, (Runnable) this);
        } else {
            this.c.d(this.b);
        }
        this.a = false;
    }
}
