package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: dvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvu implements View.OnFocusChangeListener {
    final /* synthetic */ AppInviteChimeraActivity a;

    public dvu(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.a = appInviteChimeraActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        boolean z2;
        Resources resources = this.a.getResources();
        if (!z) {
            this.a.c.s.setTextColor(resources.getColor(R.color.appinvite_medium_black));
            View view2 = this.a.c.u;
            view2.setLayoutParams(new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.appinvite_separator)));
            view2.setBackgroundColor(resources.getColor(R.color.appinvite_separator));
            this.a.e.setText("");
            AppInviteChimeraActivity appInviteChimeraActivity = this.a;
            if (appInviteChimeraActivity.l) {
                appInviteChimeraActivity.l = false;
                int length = ((EditText) view).getText().length();
                dwe dwe = this.a.k;
                if (100 - length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aucd o = anrn.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anrn anrn = (anrn) o.b;
                int i = 1 | anrn.a;
                anrn.a = i;
                anrn.b = z2;
                anrn.a = i | 2;
                anrn.c = length;
                dwe.a((anrn) o.i(), 4, dwe.b);
                return;
            }
            return;
        }
        AppInviteChimeraActivity appInviteChimeraActivity2 = this.a;
        if (!appInviteChimeraActivity2.m) {
            appInviteChimeraActivity2.m = true;
            appInviteChimeraActivity2.f.post(new dvt(this));
        }
        int color = resources.getColor(R.color.material_google_blue_800);
        this.a.c.s.setTextColor(color);
        View view3 = this.a.c.u;
        view3.setLayoutParams(new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.appinvite_separator_bold)));
        view3.setBackgroundColor(color);
    }
}
