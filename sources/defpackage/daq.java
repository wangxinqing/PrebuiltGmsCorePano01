package defpackage;

import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView;

/* renamed from: daq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class daq implements Runnable {
    private final das a;
    private final AccessibilityManager b;

    public daq(das das, AccessibilityManager accessibilityManager) {
        this.a = das;
        this.b = accessibilityManager;
    }

    public final void run() {
        das das = this.a;
        AccessibilityManager accessibilityManager = this.b;
        das.c.f.getLayoutParams().height = das.c.c.getHeight();
        das.c.f.requestLayout();
        das.c.d.setVisibility(0);
        BottomNavMenuScrollView bottomNavMenuScrollView = das.c.e;
        bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.a);
        new qvr(Looper.getMainLooper()).postDelayed(new dar(das, accessibilityManager), 500);
    }
}
