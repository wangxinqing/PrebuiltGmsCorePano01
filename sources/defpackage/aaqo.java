package defpackage;

import android.content.Intent;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: aaqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqo implements aaqg {
    final /* synthetic */ Intent a;
    final /* synthetic */ VerifyAppsSettingsChimeraActivity b;

    public aaqo(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, Intent intent) {
        this.b = verifyAppsSettingsChimeraActivity;
        this.a = intent;
    }

    public final void a() {
        this.b.p.a(4, 3);
        this.b.startActivity(this.a);
    }
}
