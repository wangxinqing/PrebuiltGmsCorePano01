package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ogk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ogk extends Fragment implements View.OnClickListener {
    TextView a;
    HelpChimeraActivity b;
    public oab c;
    boolean d = false;

    static final void a(HelpChimeraActivity helpChimeraActivity, int i, String str, String str2) {
        okg.a((nzu) helpChimeraActivity, i, str, 0, str2);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = (HelpChimeraActivity) getActivity();
        a();
    }

    public void onClick(View view) {
        this.b.m();
        a(this.b, 30, this.c.e, "");
        ooe.a(this.b, this.c, 30, 0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gh_browse_all_articles_button, viewGroup, false);
        this.a = (TextView) inflate.findViewById(R.id.gh_browse_all_articles_title);
        return inflate;
    }

    private final void a(boolean z) {
        if (getActivity() != null) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            if (z) {
                beginTransaction.show(this);
            } else {
                beginTransaction.hide(this);
            }
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void a() {
        oab oab;
        HelpChimeraActivity helpChimeraActivity = this.b;
        if (helpChimeraActivity != null) {
            HelpConfig helpConfig = helpChimeraActivity.x;
            String v = helpConfig.v();
            oab oab2 = this.c;
            if (oab2 == null || !oab2.e.equals(v)) {
                if (!TextUtils.isEmpty(v)) {
                    oab = oab.a(v, oal.a(), helpConfig);
                } else {
                    oab = null;
                }
                this.c = oab;
                if (oab != null) {
                    a(true);
                    this.a.setOnClickListener(this);
                    if (!this.b.x.z() && this.d) {
                        a(this.b, 27, this.c.e, "");
                        return;
                    }
                    return;
                }
                a(false);
            } else if (!this.b.x.z() && this.d) {
                a(this.b, 27, this.c.e, "");
            }
        }
    }
}
