package defpackage;

import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity;

/* renamed from: dig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dig implements ax {
    private final MainChimeraActivity a;

    public dig(MainChimeraActivity mainChimeraActivity) {
        this.a = mainChimeraActivity;
    }

    public final void a(Object obj) {
        aqsr aqsr;
        MainChimeraActivity mainChimeraActivity = this.a;
        dgq dgq = (dgq) obj;
        if (deq.a((Activity) mainChimeraActivity, "navigation")) {
            return;
        }
        if (dgq == dgq.PENDING) {
            if (deq.a((Activity) mainChimeraActivity, "onboarding")) {
                FragmentManager supportFragmentManager = mainChimeraActivity.getSupportFragmentManager();
                supportFragmentManager.beginTransaction().remove(supportFragmentManager.findFragmentByTag("onboarding")).commitNow();
            }
        } else if (dgq == dgq.SPLASH && !deq.a((Activity) mainChimeraActivity, "splashScreen")) {
            mainChimeraActivity.a(new deo(), "splashScreen", dep.FADE_IN);
        } else if (dgq != dgq.ONBOARDING || deq.a((Activity) mainChimeraActivity, "onboarding")) {
            if (dgq == dgq.NAVIGATION) {
                if (deq.a((Activity) mainChimeraActivity, "onboarding")) {
                    aqsr = mainChimeraActivity.b.d.d();
                    if (aqsr == null) {
                        aqsp aqsp = (aqsp) aqsr.d.o();
                        if (aqsp.c) {
                            aqsp.c();
                            aqsp.c = false;
                        }
                        aqsr aqsr2 = (aqsr) aqsp.b;
                        aqsr2.a = 1 | aqsr2.a;
                        aqsr2.b = 0;
                        aqsr = (aqsr) aqsp.i();
                    }
                } else {
                    aqsr = MainChimeraActivity.a;
                }
                mainChimeraActivity.setRequestedOrientation(-1);
                mainChimeraActivity.a(dcv.a(aqsr), "navigation", mainChimeraActivity.e());
            }
        } else if (mainChimeraActivity.getResources().getConfiguration().orientation == 1) {
            mainChimeraActivity.setRequestedOrientation(1);
            mainChimeraActivity.a(new ddf(), "onboarding", dep.CROSS_FADE);
        } else {
            mainChimeraActivity.a(dcv.a(MainChimeraActivity.a), "navigation", mainChimeraActivity.e());
        }
    }
}
