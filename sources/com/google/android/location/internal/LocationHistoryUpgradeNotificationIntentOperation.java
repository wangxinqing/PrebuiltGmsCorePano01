package com.google.android.location.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.reporting.ReportingState;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationHistoryUpgradeNotificationIntentOperation extends IntentOperation {
    public static PendingIntent a(Context context, Account account, String str, int i) {
        Class<LocationHistoryUpgradeNotificationIntentOperation> cls = LocationHistoryUpgradeNotificationIntentOperation.class;
        Intent startIntent = IntentOperation.getStartIntent(context, (Class) cls, str);
        amrl.a((Object) startIntent);
        startIntent.putExtra("account", account);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, (Class) cls, startIntent, i, 268435456);
        amrl.a((Object) pendingIntent);
        return pendingIntent;
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        Context applicationContext = getApplicationContext();
        aioh aioh = new aioh(applicationContext);
        if ("com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLICKED".equals(intent.getAction())) {
            z = true;
        } else if ("com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLEARED".equals(intent.getAction())) {
            z = false;
        } else {
            return;
        }
        Account account = (Account) intent.getParcelableExtra("account");
        if (account != null) {
            aioh.a(account);
            if (z) {
                rmf.a(applicationContext).a(account).a((acvv) new aiof(this, account, applicationContext));
            }
        }
    }

    public final /* synthetic */ void a(Account account, Context context, ReportingState reportingState) {
        if (reportingState.a) {
            if (Log.isLoggable("LHUpgradeNotification", 4)) {
                String valueOf = String.valueOf(account.name);
                Log.i("LHUpgradeNotification", valueOf.length() == 0 ? new String("Launching Location History settings for: ") : "Launching Location History settings for: ".concat(valueOf));
            }
            Intent putExtra = new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(getPackageName()).putExtra("extra.screenId", 227).putExtra("extra.accountName", account.name).putExtra("style", 1);
            putExtra.setFlags(268468224);
            try {
                context.startActivity(putExtra);
            } catch (ActivityNotFoundException e) {
                Log.wtf("LHUpgradeNotification", "Problem while starting Location History settings", e);
            }
        }
    }
}
