package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: nzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzf {
    public static void a(bjs bjs, boolean z) {
        sg aE = bjs.aE();
        if (aE != null) {
            aE.c(ofx.b(kf.a((Context) bjs, (int) R.drawable.quantum_ic_close_white_24), (Context) bjs, ofy.b() ? ofy.a(bjs, R.attr.ghf_greyIconColor) : kf.b(bjs, R.color.google_grey700)));
            aE.e((int) R.string.close_button_label);
            aE.b(true);
            aE.c(z);
        }
    }

    public static boolean a(HelpConfig helpConfig) {
        return helpConfig.A.b == 0;
    }
}
