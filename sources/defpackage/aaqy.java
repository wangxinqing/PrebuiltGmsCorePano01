package defpackage;

import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.util.Collection;

/* renamed from: aaqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaqy {
    public final aanu[] a;
    public final aanu[] b;
    public final VerifyAppsSettingsChimeraActivity c;
    final /* synthetic */ VerifyAppsSettingsChimeraActivity d;
    public final jmw e;
    private Resources f;

    public aaqy(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, aanv aanv) {
        this.d = verifyAppsSettingsChimeraActivity;
        VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity2 = this.d;
        this.c = verifyAppsSettingsChimeraActivity2;
        this.e = ((jmz) verifyAppsSettingsChimeraActivity2.f).a;
        this.a = aanv.d;
        this.b = aanv.e;
        verifyAppsSettingsChimeraActivity.k = aanv.b;
        verifyAppsSettingsChimeraActivity.l = aanv.c;
        if (this.a != null || this.b != null) {
            try {
                this.f = verifyAppsSettingsChimeraActivity.getPackageManager().getResourcesForApplication("com.android.vending");
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
    }

    public final String a(aanu aanu) {
        int i;
        Resources resources;
        String str = aanu.b;
        if (!(str != null || (i = aanu.c) == 0 || (resources = this.f) == null)) {
            str = resources.getString(i);
        }
        return str == null ? this.d.getString(R.string.play_protect_generic_malware) : str;
    }

    public final void a(int i) {
        amzy a2 = amzy.a((Collection) this.e.g());
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            jmc jmc = (jmc) a2.get(i2);
            if (jmc.c() == i) {
                this.e.d(jmc);
            }
        }
    }

    public final void a(aaqm aaqm, boolean z, int i, PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            aaqm.c(this.d.getText(i));
            aaqm.i = new aaqx(this, pendingIntent, z, aaqm);
        }
    }
}
