package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: afw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afw implements ah {
    final /* synthetic */ afz a;

    public afw(afz afz) {
        this.a = afz;
    }

    public final void a(aj ajVar, ac acVar) {
        View view;
        if (acVar == ac.ON_STOP) {
            Window window = this.a.getWindow();
            if (window != null) {
                view = window.peekDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                view.cancelPendingInputEvents();
            }
        }
    }
}
