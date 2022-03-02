package defpackage;

import android.widget.Toast;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: aaqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ VerifyAppsSettingsChimeraActivity b;

    public aaqw(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, int i) {
        this.b = verifyAppsSettingsChimeraActivity;
        this.a = i;
    }

    public final void run() {
        VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = this.b;
        Toast.makeText(verifyAppsSettingsChimeraActivity, verifyAppsSettingsChimeraActivity.getText(this.a).toString(), 1).show();
    }
}
