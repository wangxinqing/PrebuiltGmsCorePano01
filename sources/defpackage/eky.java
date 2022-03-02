package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.gms.R;

/* renamed from: eky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eky extends jeu {
    private final ela a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eky(Context context) {
        super(context, "auth_account");
        ela ela = new ela(context);
        context.getString(R.string.auth_account_state_authority);
        this.a = ela;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1025;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        ela ela = this.a;
        if (!awly.b()) {
            ela.a.c("performSync(account=%s)", iwd.a((Object) account));
            acup.a(ela.b.getContentResolver(), account, str, "gaia-change", "gaia-change");
            ContentResolver.setIsSyncable(account, str, 1);
            ild.a(account, str);
            long n = ent.n();
            if (n > 0) {
                ild.a(account, str, Bundle.EMPTY, n);
            } else {
                ild.a(account, str, Bundle.EMPTY);
            }
            if (bundle != null && bundle.getBoolean("initialize_only", false)) {
                return;
            }
            if (!ent.m()) {
                ela.a.c("Skipping sync because account state sync is not enabled.", new Object[0]);
            } else {
                ela.a(account);
            }
        }
    }
}
