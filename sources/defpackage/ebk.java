package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

/* renamed from: ebk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebk extends jeu {
    public ebk(Context context) {
        super(context, "appstate");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 7425;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (awhx.a.a().c()) {
            getContext().deleteDatabase("app_state.db");
            ContentResolver.cancelSync(account, "com.google.android.gms.appstate");
            ContentResolver.setIsSyncable(account, "com.google.android.gms.appstate", 0);
        } else if (jgu.e(getContext())) {
            Log.i("AppStateSyncAdapter", "In restricted profile; skipping sync.");
        } else {
            if (bundle == null || bundle.getBoolean("initialize", false)) {
            }
        }
    }
}
