package defpackage;

import android.os.Build;
import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;

/* renamed from: zg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zg implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ AppCompatSpinner a;

    public zg(AppCompatSpinner appCompatSpinner) {
        this.a = appCompatSpinner;
    }

    public final void onGlobalLayout() {
        if (!this.a.b.e()) {
            this.a.a();
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            int i = Build.VERSION.SDK_INT;
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
