package defpackage;

import com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity;

/* renamed from: dif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dif implements ax {
    private final MainChimeraActivity a;

    public dif(MainChimeraActivity mainChimeraActivity) {
        this.a = mainChimeraActivity;
    }

    public final void a(Object obj) {
        MainChimeraActivity mainChimeraActivity = this.a;
        dih dih = (dih) obj;
        if (dio.a(dih) && !amqx.a(mainChimeraActivity.c.getString("google.account_settings.selected_account", (String) null), dih.a)) {
            mainChimeraActivity.c.edit().putString("google.account_settings.selected_account", dih.a).apply();
        }
    }
}
