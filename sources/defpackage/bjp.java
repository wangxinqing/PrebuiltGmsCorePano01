package defpackage;

import android.content.Context;
import android.location.SettingInjectorService;

/* renamed from: bjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjp extends SettingInjectorService {
    final /* synthetic */ com.google.android.chimera.SettingInjectorService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjp(com.google.android.chimera.SettingInjectorService settingInjectorService, String str) {
        super(str);
        this.a = settingInjectorService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    public final boolean onGetEnabled() {
        return this.a.onGetEnabled();
    }

    /* access modifiers changed from: protected */
    public final String onGetSummary() {
        return this.a.onGetSummary();
    }
}
