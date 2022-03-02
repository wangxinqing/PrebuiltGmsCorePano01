package defpackage;

import android.view.View;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: aaqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqh implements View.OnClickListener {
    final /* synthetic */ aaqm a;

    public aaqh(aaqm aaqm) {
        this.a = aaqm;
    }

    public void onClick(View view) {
        aaqp aaqp = this.a.s;
        if (aaqp != null) {
            VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = aaqp.a;
            verifyAppsSettingsChimeraActivity.o = true;
            verifyAppsSettingsChimeraActivity.f();
            aaqp.a.a(true);
            aaqp.a.p.a(4, 6);
        }
    }
}
