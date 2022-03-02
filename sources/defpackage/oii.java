package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oii implements Runnable {
    private final HelpChimeraActivity a;

    public oii(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final void run() {
        HelpChimeraActivity helpChimeraActivity = this.a;
        helpChimeraActivity.e(helpChimeraActivity.x.U);
        if (ofq.a(axof.b())) {
            helpChimeraActivity.findViewById(R.id.gh_search_box).setVisibility(8);
            helpChimeraActivity.m();
        }
        helpChimeraActivity.g.setVisibility(0);
    }
}
