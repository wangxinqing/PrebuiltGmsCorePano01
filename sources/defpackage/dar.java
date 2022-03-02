package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView;

/* renamed from: dar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dar implements Runnable {
    private final das a;
    private final AccessibilityManager b;

    public dar(das das, AccessibilityManager accessibilityManager) {
        this.a = das;
        this.b = accessibilityManager;
    }

    public final void run() {
        das das = this.a;
        AccessibilityManager accessibilityManager = this.b;
        BottomNavMenuScrollView bottomNavMenuScrollView = das.c.e;
        bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.a);
        dau dau = das.c;
        dim.a(dau.f, accessibilityManager, dau.i);
        if (das.c.g.getChildCount() > 0) {
            das.c.g.getChildAt(0).requestFocus();
        }
    }
}
