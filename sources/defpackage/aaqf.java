package defpackage;

import com.google.android.gms.security.settings.SecuritySettingsChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: aaqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqf extends jfx {
    final /* synthetic */ SecuritySettingsChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaqf(SecuritySettingsChimeraActivity securitySettingsChimeraActivity) {
        super(9);
        this.a = securitySettingsChimeraActivity;
    }

    public final void run() {
        aanv aanv;
        if (new aaal(this.a).d()) {
            aanv = new aany(this.a).a(false, 5, TimeUnit.SECONDS);
        } else {
            aanv = null;
        }
        this.a.runOnUiThread(new aaqe(this, aanv));
    }
}
