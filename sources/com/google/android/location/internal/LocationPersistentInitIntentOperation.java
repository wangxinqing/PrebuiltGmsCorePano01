package com.google.android.location.internal;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.location.persistent.LocationPersistentChimeraService;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationPersistentInitIntentOperation extends IntentOperation {
    private static boolean a(Context context) {
        return Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "gps") || Settings.Secure.isLocationProviderEnabled(context.getContentResolver(), "network");
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        int i;
        int i2 = 0;
        int intExtra = intent.getIntExtra("com.google.android.gms.location.internal.FLAGS", 0);
        if ((intExtra & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((intExtra & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LocationPersistentChimeraService.a((Context) this);
        Context applicationContext = getApplicationContext();
        jbs jbs = new jbs(applicationContext);
        Intent startIntent = IntentOperation.getStartIntent((Context) this, AnalyticsUploadChimeraIntentService.class, "com.google.android.location.internal.UPLOAD_ANALYTICS");
        if (IntentOperation.getPendingIntent(applicationContext, AnalyticsUploadChimeraIntentService.class, startIntent, 0, 536870912) == null) {
            jbs.a("AnalyticsUplIS", 2, SystemClock.elapsedRealtime() + 86400000, 86400000, IntentOperation.getPendingIntent(applicationContext, AnalyticsUploadChimeraIntentService.class, startIntent, 0, 0), "com.google.android.gms");
        }
        if (z || a(this)) {
            Intent a = GoogleLocationManagerChimeraService.a(this);
            a.putExtra("fromDeviceBoot", z);
            a.putExtra("fromGmsCoreInit", a(this));
            startService(a);
        }
        if (z || z2) {
            if (ayeh.a.a().savePlatformVersionO() && (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27)) {
                getSharedPreferences("platformVersionName", 0).edit().putBoolean("platformVersionO", true).apply();
            }
            if (ayeh.a.a().enablePlatformUpgradeDetection()) {
                SharedPreferences sharedPreferences = getSharedPreferences("platformVersionName", 0);
                int i3 = sharedPreferences.getInt("platformVersion", -1);
                int i4 = Build.VERSION.SDK_INT;
                if (jkr.h()) {
                    i4 = 29;
                }
                if (i3 != i4) {
                    sharedPreferences.edit().putInt("platformVersion", i4).apply();
                    if (i3 != -1) {
                        if ((i3 == 26 || i3 == 27) && i4 == 28) {
                            getSharedPreferences("platformVersionName", 0).edit().putBoolean("platformVersionO", true).apply();
                        } else if (i4 > 28) {
                            aioh aioh = new aioh(this);
                            List<Account> d = jgu.d(this, getPackageName());
                            ob obVar = new ob(d.size());
                            for (Account account : d) {
                                obVar.add(account.name);
                            }
                            aioh.a.edit().putStringSet("accountsToBeChecked", obVar).apply();
                        }
                    }
                }
            }
            aioq aioq = new aioq(getApplicationContext());
            if (jgu.f(aioq.a) && jkr.g() && ayeq.a.a().showScanningUpgradeNotification()) {
                SharedPreferences sharedPreferences2 = aioq.a.getSharedPreferences("platformVersionName", 0);
                if (sharedPreferences2 == null || !sharedPreferences2.getBoolean("platformVersionO", false)) {
                    i = 0;
                } else {
                    ContentResolver contentResolver = aioq.a.getContentResolver();
                    int i5 = Settings.Global.getInt(contentResolver, "wifi_scan_always_enabled", 0);
                    int i6 = Settings.Global.getInt(contentResolver, "ble_scan_always_enabled", 0);
                    i = (i5 == 0 || i6 == 0) ? i5 == 0 ? i6 == 0 ? 0 : R.string.scanning_upgrade_to_p_notification_ble_on : R.string.scanning_upgrade_to_p_notification_wifi_on : R.string.scanning_upgrade_to_p_notification_wifi_and_ble_on;
                }
                aioq.a(i);
            }
            if (jkr.h() && ayeh.a.a().locationHistoryNotificationForQ()) {
                Context applicationContext2 = getApplicationContext();
                iby a2 = rmf.a(applicationContext2);
                ajmm a3 = ajmm.a(applicationContext2);
                aioh aioh2 = new aioh(applicationContext2);
                Set<String> stringSet = aioh2.a.getStringSet("accountsToBeChecked", anfv.a);
                if (!stringSet.isEmpty()) {
                    List<Account> d2 = jgu.d(applicationContext2, applicationContext2.getPackageName());
                    ArrayList arrayList = new ArrayList();
                    for (Account account2 : d2) {
                        if (stringSet.contains(account2.name)) {
                            arrayList.add(account2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        iwq a4 = iwq.a(applicationContext2);
                        a4.a(new NotificationChannel("privacy-features-channel", applicationContext2.getText(R.string.notification_channel_name_location_privacy_features), 3));
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i2 < size) {
                            Account account3 = (Account) arrayList.get(i2);
                            aiog aiog = r11;
                            iby iby = a2;
                            acwa a5 = a2.a(account3);
                            aiog aiog2 = new aiog(a3, account3, applicationContext2, a4, i7, aioh2);
                            a5.a((acvv) aiog);
                            i2++;
                            i7++;
                            a2 = iby;
                            arrayList = arrayList;
                        }
                    } else if (!stringSet.isEmpty()) {
                        aioh2.a.edit().clear().apply();
                    }
                }
            }
            Intent intent2 = new Intent("init");
            intent2.putExtra("is_boot", z);
            intent2.putExtra("is_module_updated", z2);
            ajmi.a((Context) this, intent2);
        }
        NlpNetworkProviderSettingsUpdateChimeraReceiver.a(this);
        NanoAppUpdaterChimeraGcmTaskService.a((Context) this);
        ComponentName componentName = new ComponentName(this, "com.google.android.location.internal.LocationContentProvider");
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        ajfj.a();
        ajft.a();
    }
}
