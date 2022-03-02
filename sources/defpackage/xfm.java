package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: xfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xfm extends jfx {
    final /* synthetic */ Context a;
    final /* synthetic */ Account e;
    final /* synthetic */ xfo f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xfm(Context context, Account account, xfo xfo) {
        super(10);
        this.a = context;
        this.e = account;
        this.f = xfo;
    }

    public final void run() {
        try {
            xfn.a = eig.c(this.a, this.e.name);
            xfo xfo = this.f;
            String str = xfn.a;
            String str2 = this.e.name;
            wss wss = xfo.a;
            long currentTimeMillis = System.currentTimeMillis();
            iva.b((String) null);
            SharedPreferences.Editor edit = wss.a.edit();
            String valueOf = String.valueOf(str);
            edit.putString(valueOf.length() == 0 ? new String("tickle_sync_gaia_cache_account_name_") : "tickle_sync_gaia_cache_account_name_".concat(valueOf), str2).commit();
            SharedPreferences.Editor edit2 = wss.a.edit();
            String valueOf2 = String.valueOf(str);
            edit2.putLong(valueOf2.length() == 0 ? new String("tickle_sync_gaia_id_cache_last_update_timestamp_") : "tickle_sync_gaia_id_cache_last_update_timestamp_".concat(valueOf2), currentTimeMillis).commit();
        } catch (eif | IOException e2) {
            xdt.b("People_AccountUtil", "Failed to get account ID. %s", e2.getMessage());
        }
    }
}
