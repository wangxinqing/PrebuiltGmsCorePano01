package defpackage;

import android.view.View;
import android.view.WindowManager;

/* renamed from: ear  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ear implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ WindowManager b;
    final /* synthetic */ dxu c;

    public ear(View view, WindowManager windowManager, dxu dxu) {
        this.a = view;
        this.b = windowManager;
        this.c = dxu;
    }

    public final void run() {
        if (this.a.getParent() != null) {
            this.b.removeView(this.a);
            dxu dxu = this.c;
            if (dxu != null) {
                dxu.a();
            }
        }
    }
}
