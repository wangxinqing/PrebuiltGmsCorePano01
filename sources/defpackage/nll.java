package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: nll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nll extends jeu {
    public nll(Context context) {
        super(context, "games_stub");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 3586;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        nmf.a("GamesStubSyncAdapter", "Syncing for no-op authority; exiting");
    }
}
