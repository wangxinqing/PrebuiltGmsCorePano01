package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.uiflows.common.FilteringRedirectChimeraActivity;
import java.util.List;

/* renamed from: ekb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ekb {
    public final Bundle a = new Bundle();

    private ekb() {
        fzj a2 = fzj.a();
        iva.a((Object) a2);
    }

    public static ekb a() {
        return new ekb();
    }

    public final Bundle b() {
        return new Bundle(this.a);
    }

    public final void a(int i, String str) {
        this.a.putInt("errorCode", i);
        if (!TextUtils.isEmpty(str)) {
            this.a.putString("errorMessage", str);
        }
    }

    public final void a(Account account) {
        this.a.putString("authAccount", account.name);
        this.a.putString("accountType", account.type);
    }

    public final void a(PendingIntent pendingIntent) {
        this.a.putParcelable("intent", fzm.a(pendingIntent));
    }

    public final void a(Context context, PendingIntent pendingIntent, AccountAuthenticatorResponse accountAuthenticatorResponse, List list) {
        a(FilteringRedirectChimeraActivity.a(context, pendingIntent, list, accountAuthenticatorResponse));
    }

    public final void a(Context context, Intent intent) {
        a(PendingIntent.getActivity(context.getApplicationContext(), 0, intent, 134217728));
    }

    public final void a(TokenData tokenData) {
        this.a.putString("authtoken", tokenData.b);
        Long l = tokenData.c;
        if (jkr.b() && l != null) {
            this.a.putLong("android.accounts.expiry", l.longValue() * 1000);
        }
    }

    public final void a(boolean z) {
        this.a.putBoolean("booleanResult", z);
    }
}
