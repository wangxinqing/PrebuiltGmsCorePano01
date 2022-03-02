package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oig implements View.OnClickListener {
    private final HelpChimeraActivity a;

    public oig(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        okg.i(helpChimeraActivity);
        MenuItem menuItem = helpChimeraActivity.r;
        if (menuItem != null) {
            menuItem.setVisible(false);
            helpChimeraActivity.r.expandActionView();
            helpChimeraActivity.h.setVisibility(8);
        }
    }
}
