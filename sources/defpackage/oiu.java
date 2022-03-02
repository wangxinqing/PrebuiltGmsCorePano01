package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oiu implements pj {
    final /* synthetic */ HelpChimeraActivity a;

    public oiu(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final boolean a() {
        this.a.r.setVisible(false);
        this.a.h.setVisibility(0);
        HelpChimeraActivity helpChimeraActivity = this.a;
        if (helpChimeraActivity.v.peek() == avmw.HELP_SUB_CONSOLE || helpChimeraActivity.z()) {
            this.a.onBackPressed();
            return true;
        } else if (!ofq.a(axof.b()) || !this.a.L()) {
            return true;
        } else {
            this.a.findViewById(R.id.gh_search_box).setVisibility(0);
            this.a.A();
            return true;
        }
    }

    public final boolean b() {
        this.a.r.setVisible(false);
        return true;
    }
}
