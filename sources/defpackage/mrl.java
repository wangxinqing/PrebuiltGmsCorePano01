package defpackage;

import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: mrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mrl {
    public static void a(Activity activity) {
        String a = arzd.a(aymt.a.a().M());
        GoogleHelp googleHelp = new GoogleHelp(aymq.a.a().r());
        googleHelp.q = Uri.parse(a);
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 1;
        googleHelp.s = themeSettings;
        mwc mwc = new mwc();
        mwc.a("culprit_module", "nearby", true);
        googleHelp.a(mwc.a(), activity.getContainerActivity().getCacheDir());
        new nyw(activity).a(googleHelp.a());
    }
}
