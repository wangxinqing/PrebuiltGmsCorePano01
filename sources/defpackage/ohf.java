package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ohf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ohf implements View.OnClickListener {
    private final HelpConfig a;
    private final HelpChimeraActivity b;
    private final oab c;

    public ohf(HelpConfig helpConfig, HelpChimeraActivity helpChimeraActivity, oab oab) {
        this.a = helpConfig;
        this.b = helpChimeraActivity;
        this.c = oab;
    }

    public void onClick(View view) {
        HelpConfig helpConfig = this.a;
        HelpChimeraActivity helpChimeraActivity = this.b;
        oab oab = this.c;
        if (helpConfig != null) {
            okg.a((nzu) helpChimeraActivity, ohg.a(oab));
            String str = oab.e;
            if (!new oah(helpChimeraActivity).a(Uri.parse(str), 139)) {
                oab a2 = oab.a(str, oal.a(), helpConfig);
                if (a2 == null) {
                    opa.a((Activity) helpChimeraActivity, Uri.parse(str), helpConfig, helpChimeraActivity.y);
                } else {
                    ooe.a(helpChimeraActivity, a2, 139, -1);
                }
            }
        }
    }
}
