package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

/* renamed from: xvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvi extends jeu {
    private final Context a;
    private xvh b;

    public xvi(Context context) {
        super(context.getApplicationContext(), false, "people");
        this.a = context;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 5380;
    }

    public final void onSyncCanceled() {
        Log.i("FSA2_GmsContactsSyncAdapter", "onSyncCanceled");
        xvh xvh = this.b;
        if (xvh == null) {
            super.onSyncCanceled();
        } else {
            xvh.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        Log.i("FSA2_GmsContactsSyncAdapter", "@onPerformSync");
        Context context = this.a;
        xpp a2 = xpp.a(context, context.getApplicationInfo().uid);
        Context applicationContext = this.a.getApplicationContext();
        ContentResolver contentResolver = this.a.getContentResolver();
        wss a3 = wss.a(this.a);
        ydd ydd = new ydd(this.a);
        xvg.a();
        xvh a4 = xvh.a(applicationContext, contentResolver, a2, a3, ydd);
        this.b = a4;
        a4.a(account, bundle, "com.android.contacts", syncResult);
    }
}
