package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView;

/* renamed from: dax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dax implements Runnable {
    private final BottomNavMenuScrollView a;

    public dax(BottomNavMenuScrollView bottomNavMenuScrollView) {
        this.a = bottomNavMenuScrollView;
    }

    public final void run() {
        BottomNavMenuScrollView bottomNavMenuScrollView = this.a;
        bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.a);
    }
}
