package com.google.android.gms.people.sync.focus;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsSyncIntentOperation extends IntentOperation {
    public ContactsSyncIntentOperation() {
        xip.a();
    }

    private static final void a(Context context, Exception exc) {
        yde.a.a(context).a(exc, ((Double) xii.a.a()).doubleValue());
        Log.e("FSA2_ContactsSyncIntentOp", "Exception thrown when preparing for contacts sync", exc);
    }

    public final void onHandleIntent(Intent intent) {
        int i;
        long j;
        NetworkCapabilities networkCapabilities;
        Context applicationContext = getApplicationContext();
        if (aytd.a.a().B() && a(intent)) {
            xvm.a(applicationContext).e();
        }
        if (ayug.a.a().c() && a(intent)) {
            for (Account account : erc.b(intent)) {
                Log.i("FSA2_ContactsSyncIntentOp", "Cleared progress notification for non-existing account.");
                iwq.a(applicationContext).a("com.google.android.gms.people.sync.focus.notification.sync_progress.tag.".concat(account.name), 2);
            }
        }
        if (ayrw.b() && a(intent)) {
            List<Account> b = erc.b(intent);
            wss a = wss.a(applicationContext);
            for (Account account2 : b) {
                Log.i("FSA2_ContactsSyncIntentOp", "Clearing FSA2 sync status preference for removed account");
                a.h(account2.name);
            }
            if (ayrw.a.a().b()) {
                return;
            }
        }
        if (!ayxm.c()) {
            return;
        }
        if (ayua.a.a().a() && !xxb.a(applicationContext)) {
            Log.e("FSA2_ContactsSyncIntentOp", "Gms doesn't have contacts permission.");
        } else if (!"android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            try {
                xwm.a.a(applicationContext);
            } catch (xye e) {
                Log.e("FSA2_ContactsSyncIntentOp", "Failed to prepare for Contacts sync", e);
            } catch (SecurityException e2) {
                if (Boolean.valueOf(ayrj.a.a().u()).booleanValue()) {
                    a(applicationContext, e2);
                    return;
                }
                throw e2;
            } catch (Exception e3) {
                if (Boolean.valueOf(ayrj.a.a().t()).booleanValue()) {
                    a(applicationContext, e3);
                    return;
                }
                throw e3;
            }
        } else if (Boolean.valueOf(ayrj.a.a().bf()).booleanValue()) {
            xvj a2 = xvj.a();
            if (jkr.b()) {
                ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                } else {
                    networkCapabilities = null;
                }
                i = xvj.a(networkCapabilities);
                if (ayrt.d() && (networkCapabilities == null || !networkCapabilities.hasTransport(1))) {
                    xvj.a(4, xvj.a(networkCapabilities), (String) null);
                    return;
                }
            } else if (!ayrt.d()) {
                i = 1;
            } else if (!((ConnectivityManager) applicationContext.getSystemService("connectivity")).isActiveNetworkMetered()) {
                i = 1;
            } else {
                xvj.a(4, 1, (String) null);
                return;
            }
            wss a3 = wss.a(applicationContext);
            anax<Account> b2 = a2.b.b(applicationContext);
            aucd o = xle.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xle xle = (xle) o.b;
            xle.d = i - 1;
            xle.a = 4 | xle.a;
            for (Account account3 : b2) {
                if (ayrt.a.a().b()) {
                    try {
                        j = new xwn(new xwo(applicationContext.getContentResolver(), account3)).a();
                    } catch (xye e4) {
                        Log.e("FSA2_ContactsSyncOnChargingOp", "Exception thrown when getting last full sync timestamp", e4);
                        j = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long d = ayrt.a.a().d();
                    if (currentTimeMillis - j < TimeUnit.SECONDS.toMillis(d)) {
                        TimeUnit.SECONDS.toDays(d);
                        xvj.a(3, i, account3.name);
                    }
                }
                long j2 = a3.a.getLong(wss.d("focus_sync_timestamp_on_charging_", account3.name), 0);
                long currentTimeMillis2 = System.currentTimeMillis();
                wss wss = a3;
                long e5 = ayrt.a.a().e();
                if (currentTimeMillis2 - j2 < TimeUnit.SECONDS.toMillis(e5)) {
                    TimeUnit.SECONDS.toHours(e5);
                    xvj.a(2, i, account3.name);
                    a3 = wss;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("force", true);
                    bundle.putBoolean("expedited", true);
                    ContentResolver.requestSync(account3, "com.android.contacts", bundle);
                    String str = account3.name;
                    wss wss2 = wss;
                    wss2.a.edit().putLong(wss.d("focus_sync_timestamp_on_charging_", account3.name), System.currentTimeMillis()).apply();
                    if (ayrt.b()) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        xle xle2 = (xle) o.b;
                        xle2.b = 2;
                        xle2.a |= 1;
                        wml.a().a((xle) o.i(), account3.name);
                        a3 = wss2;
                    } else {
                        a3 = wss2;
                    }
                }
            }
        }
    }

    private static boolean a(Intent intent) {
        return "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
    }
}
