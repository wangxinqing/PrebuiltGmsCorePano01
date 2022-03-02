package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oif implements View.OnClickListener {
    private final HelpChimeraActivity a;
    private final View b;

    public oif(HelpChimeraActivity helpChimeraActivity, View view) {
        this.a = helpChimeraActivity;
        this.b = view;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        View view2 = this.b;
        okg.i(helpChimeraActivity);
        MenuItem menuItem = helpChimeraActivity.r;
        if (menuItem != null) {
            menuItem.setVisible(false);
            helpChimeraActivity.r.expandActionView();
            helpChimeraActivity.h.setVisibility(8);
            view2.setVisibility(8);
            helpChimeraActivity.m();
        }
    }
}
