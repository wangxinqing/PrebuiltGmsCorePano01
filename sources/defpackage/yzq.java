package defpackage;

import android.widget.PopupWindow;

/* renamed from: yzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yzq implements Runnable {
    final /* synthetic */ yzz a;

    public yzq(yzz yzz) {
        this.a = yzz;
    }

    public final void run() {
        PopupWindow popupWindow;
        yzz yzz = this.a;
        if (yzz.n && (popupWindow = yzz.m) != null) {
            popupWindow.dismiss();
            this.a.m = null;
        }
    }
}
