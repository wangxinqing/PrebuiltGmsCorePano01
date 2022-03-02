package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SubscribedFeedsInitializer extends hec {
    private static boolean a(PackageManager packageManager, ComponentName componentName, boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 1;
        }
        if (packageManager.getComponentEnabledSetting(componentName) == i) {
            return false;
        }
        String valueOf = String.valueOf(componentName);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Setting ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(i);
        Log.i("SubscribedFeeds", sb.toString());
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        new acut(this).a();
        boolean z = false;
        for (Account a : qub.a((Context) this).a("com.google")) {
            acun.a(this, a);
        }
        PackageManager packageManager = getPackageManager();
        a(packageManager, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GcmReceiverService"), true);
        a(packageManager, new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsSubscribedFeedsProvider"), true);
        ComponentName componentName = new ComponentName(this, "com.google.android.gms.subscribedfeeds.SyncService");
        ComponentName componentName2 = new ComponentName(this, "com.google.android.gms.subscribedfeeds.GmsFeedsSyncService");
        try {
            z = a(packageManager, new ComponentName("com.google.android.gsf", "com.google.android.gsf.subscribedfeeds.SubscribedFeedsSyncAdapterService"), false);
        } catch (IllegalArgumentException e) {
        }
        if ((a(packageManager, componentName2, true) || (a(packageManager, componentName, true) | z)) || (i & 2) != 0) {
            int i2 = acun.a;
            ContentResolver.requestSync((Account) null, acun.b(), Bundle.EMPTY);
        }
    }
}
