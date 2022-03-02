package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;

/* renamed from: aioh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aioh {
    public final SharedPreferences a;

    public aioh(Context context) {
        this.a = context.getSharedPreferences("locationHistoryUpgradeNotificationPrefs", 0);
    }

    public final void a(Account account) {
        ob obVar = new ob((Collection) this.a.getStringSet("accountsToBeChecked", anfv.a));
        obVar.remove(account.name);
        this.a.edit().putStringSet("accountsToBeChecked", obVar).apply();
    }
}
