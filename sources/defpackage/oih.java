package defpackage;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oih implements Runnable {
    private final HelpChimeraActivity a;

    public oih(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final void run() {
        HelpChimeraActivity helpChimeraActivity = this.a;
        if (helpChimeraActivity.g.getVisibility() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(helpChimeraActivity.x.F())) {
            HelpConfig helpConfig = helpChimeraActivity.x;
            aucd o = avnq.j.o();
            aucd o2 = avnu.c.o();
            String e = helpChimeraActivity.x.e();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avnu avnu = (avnu) o2.b;
            e.getClass();
            avnu.a |= 4;
            avnu.b = e;
            avnu avnu2 = (avnu) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avnq avnq = (avnq) o.b;
            avnu2.getClass();
            avnq.h = avnu2;
            avnq.a |= 2048;
            helpConfig.a((avnq) o.i());
            oao.a(helpChimeraActivity);
            if (ofq.b(axpp.d())) {
                helpChimeraActivity.g.setVisibility(0);
            } else {
                helpChimeraActivity.finish();
            }
        } else if (helpChimeraActivity.o()) {
            helpChimeraActivity.p();
        } else {
            helpChimeraActivity.q();
        }
    }
}
