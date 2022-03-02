package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ohg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohg {
    public static String a(oab oab) {
        avna x = oab.x();
        iva.a((Object) x);
        return String.format("%s?%s=%s&%s=%s", new Object[]{oab.e, "promotionVersion", Integer.toString(oab.v), "placement", Integer.toString(x.d)});
    }

    public static void a(Context context, HelpConfig helpConfig) {
        nzp a = new nzr(context, helpConfig).a();
        a.a("promoted_content_title");
        a.a("promoted_content_snippet");
        a.a("promoted_content_url");
        a.a("promoted_content_image_base64");
        a.a("promoted_content_external_link_text");
        a.a("promoted_content_version");
        a.a("promoted_content_placement");
        a.a();
    }

    public static void a(View view, HelpChimeraActivity helpChimeraActivity, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
