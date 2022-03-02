package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncRequest;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: xwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwr {
    private static xwr f = null;
    public final Object a = new Object();
    public String b;
    public xvd c;
    public String d;
    public long e = 0;
    private final Context g;

    public xwr(Context context) {
        this.g = context.getApplicationContext();
    }

    public static synchronized xwr a(Context context) {
        xwr xwr;
        synchronized (xwr.class) {
            if (f == null) {
                f = new xwr(context);
            }
            xwr = f;
        }
        return xwr;
    }

    public static void a(Bundle bundle, Account account) {
        int i = bundle.getInt("NUM_REMAINING_RETRIES_ON_CANCEL", (int) ayrz.a.a().e());
        if (i > 0) {
            SyncRequest.Builder builder = new SyncRequest.Builder();
            builder.setSyncAdapter(account, "com.android.contacts");
            builder.setDisallowMetered(ayrz.a.a().c());
            if (jkr.c()) {
                builder.setRequiresCharging(ayrz.a.a().h());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("NUM_REMAINING_RETRIES_ON_CANCEL", i - 1);
            builder.setExtras(bundle2);
            ContentResolver.requestSync(builder.build());
            String str = account.name;
        }
    }

    public final synchronized void a(String str, String str2, SyncResult syncResult) {
        Intent intent = new Intent("android.intent.action.RUN");
        intent.setPackage("com.google.android.syncadapters.contacts");
        intent.putExtra("syncId", str);
        intent.putExtra("response", str2);
        if (syncResult != null) {
            intent.putExtra("result", syncResult);
        }
        if (jkr.h()) {
            xip.a();
            if (Boolean.valueOf(ayrj.a.a().bi()).booleanValue()) {
                intent.setAction("com.google.android.syncadapters.contacts.DELEGATION");
                this.g.sendBroadcast(intent);
                return;
            }
        }
        this.g.startService(intent);
    }
}
