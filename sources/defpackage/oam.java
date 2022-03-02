package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class oam implements View.OnClickListener {
    private final HelpChimeraActivity a;
    private final int b;

    public oam(HelpChimeraActivity helpChimeraActivity, int i) {
        this.a = helpChimeraActivity;
        this.b = i;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        int i = this.b;
        HelpConfig helpConfig = helpChimeraActivity.x;
        oab a2 = oab.a(helpConfig.G(), oal.a(), helpConfig);
        if (a2 == null) {
            String G = helpConfig.G();
            StringBuilder sb = new StringBuilder(String.valueOf(G).length() + 38);
            sb.append("Error, could not load community for '");
            sb.append(G);
            sb.append("'");
            Log.e("gH_NeedMoreHelpUtil", sb.toString());
        } else {
            ooe.a(helpChimeraActivity, a2, 13, 0);
        }
        okg.b((nzu) helpChimeraActivity, i);
    }
}
