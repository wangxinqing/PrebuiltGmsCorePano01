package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: aaqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqx implements aaqg {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aaqm c;
    final /* synthetic */ aaqy d;

    public aaqx(aaqy aaqy, PendingIntent pendingIntent, boolean z, aaqm aaqm) {
        this.d = aaqy;
        this.a = pendingIntent;
        this.b = z;
        this.c = aaqm;
    }

    public final void a() {
        try {
            this.a.send();
            if (this.b) {
                VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = this.d.d;
                int i = VerifyAppsSettingsChimeraActivity.r;
                int i2 = verifyAppsSettingsChimeraActivity.k;
                if (i2 > 0) {
                    verifyAppsSettingsChimeraActivity.l++;
                    verifyAppsSettingsChimeraActivity.k = i2 - 1;
                }
            } else {
                VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity2 = this.d.d;
                int i3 = VerifyAppsSettingsChimeraActivity.r;
                int i4 = verifyAppsSettingsChimeraActivity2.l;
                if (i4 > 0) {
                    verifyAppsSettingsChimeraActivity2.l = i4 - 1;
                }
            }
            this.d.e.d(this.c);
            this.d.d.f();
        } catch (PendingIntent.CanceledException e) {
        }
    }
}
