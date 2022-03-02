package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* renamed from: yz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yz extends PopupWindow {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    public yz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        aev a = aev.a(context, attributeSet, uh.t, i, 0);
        if (a.f(2)) {
            rw.a((PopupWindow) this, a.a(2, false));
        }
        setBackgroundDrawable(a.a(0));
        a.a();
    }
}
