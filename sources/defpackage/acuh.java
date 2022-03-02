package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.subscribedfeeds.FeedsGcmReceiverChimeraService;
import java.util.concurrent.Future;

/* renamed from: acuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acuh implements Runnable {
    private final FeedsGcmReceiverChimeraService a;
    private final Intent b;

    public acuh(FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService, Intent intent) {
        this.a = feedsGcmReceiverChimeraService;
        this.b = intent;
    }

    public final void run() {
        Future a2;
        FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService = this.a;
        Intent intent = this.b;
        String stringExtra = intent.getStringExtra("collapse_key");
        String stringExtra2 = intent.getStringExtra("sync_hint");
        if (!TextUtils.isEmpty(stringExtra)) {
            String[] split = TextUtils.split(stringExtra, "_");
            Pair pair = null;
            if (split.length == 2) {
                try {
                    pair = Pair.create(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                } catch (NumberFormatException e) {
                }
            }
            if (pair != null) {
                Future a3 = feedsGcmReceiverChimeraService.a("QUERY_OPERATION_TYPE");
                Cursor query = feedsGcmReceiverChimeraService.getContentResolver().query(acuo.a, (String[]) null, "_id=?", new String[]{((Integer) pair.second).toString()}, (String) null);
                a3.cancel(false);
                int i = 2742;
                if (query != null) {
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("authority"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("feed"));
                            String string3 = query.getString(query.getColumnIndexOrThrow("_sync_account"));
                            String string4 = query.getString(query.getColumnIndexOrThrow("_sync_account_type"));
                            Account account = new Account(string3, string4);
                            if (azpv.c()) {
                                EventLog.writeEvent(i, string);
                            }
                            if (ContentResolver.getMasterSyncAutomatically()) {
                                if (ContentResolver.getSyncAutomatically(account, string)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("feed", string2);
                                    if (stringExtra2 != null) {
                                        bundle.putString("hint", stringExtra2);
                                    }
                                    ContentResolver.requestSync(account, string, bundle);
                                }
                            }
                            StringBuilder sb = new StringBuilder(String.valueOf(string3).length() + 102 + String.valueOf(string2).length());
                            sb.append("received tickle for a disabled feed, removing feed and forcing a subscribedfeeds sync: account ");
                            sb.append(string3);
                            sb.append(", feed ");
                            sb.append(string2);
                            Log.w("SubscribedFeeds", sb.toString());
                            a2 = feedsGcmReceiverChimeraService.a("DELETE_OPERATION_TYPE");
                            feedsGcmReceiverChimeraService.getContentResolver().delete(acuo.a, "_sync_account=? and _sync_account_type=? and authority=?", new String[]{string3, string4, string});
                            a2.cancel(false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("ignore_settings", true);
                            ContentResolver.requestSync(account, "com.google.android.gms.subscribedfeeds", bundle2);
                            i = 2742;
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    query.close();
                } else {
                    String valueOf = String.valueOf(stringExtra);
                    Log.w("SubscribedFeeds", valueOf.length() == 0 ? new String("received tickle for non-existent feed: ") : "received tickle for non-existent feed: ".concat(valueOf));
                    if (azpv.c()) {
                        EventLog.writeEvent(2742, "unknown");
                    }
                }
            }
        }
        feedsGcmReceiverChimeraService.a();
    }
}
