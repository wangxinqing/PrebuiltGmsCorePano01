package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.security.settings.SecuritySettingsChimeraActivity;

/* renamed from: aaqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqe implements Runnable {
    final /* synthetic */ aanv a;
    final /* synthetic */ aaqf b;

    public aaqe(aaqf aaqf, aanv aanv) {
        this.b = aaqf;
        this.a = aanv;
    }

    public final void run() {
        String str;
        SecuritySettingsChimeraActivity securitySettingsChimeraActivity = this.b.a;
        int i = SecuritySettingsChimeraActivity.b;
        jmc jmc = securitySettingsChimeraActivity.a;
        aanv aanv = this.a;
        if (aanv != null) {
            str = aanv.a(securitySettingsChimeraActivity);
        } else {
            str = null;
        }
        if (str == null) {
            jmc.c(R.string.verify_apps_summary);
        } else {
            jmc.b((CharSequence) str);
        }
    }
}
