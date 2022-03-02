package defpackage;

import com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView;

/* renamed from: day  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class day implements Runnable {
    private final BottomNavMenuScrollView a;

    public day(BottomNavMenuScrollView bottomNavMenuScrollView) {
        this.a = bottomNavMenuScrollView;
    }

    public final void run() {
        BottomNavMenuScrollView bottomNavMenuScrollView = this.a;
        if (bottomNavMenuScrollView.c) {
            bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.b);
        } else {
            bottomNavMenuScrollView.smoothScrollTo(0, bottomNavMenuScrollView.a);
        }
    }
}
