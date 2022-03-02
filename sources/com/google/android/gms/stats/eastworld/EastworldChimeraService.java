package com.google.android.gms.stats.eastworld;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.gms.appusage.AppUsageResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EastworldChimeraService extends Service {
    acsl a;
    private BroadcastReceiver b;
    private PackageUpdateBroadcastReceiver c;
    private AppUsageOrderedBroadcastReceiver d;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class AppUsageOrderedBroadcastReceiver extends nla {
        public AppUsageOrderedBroadcastReceiver() {
            super("stats");
        }

        public final void a(Context context, Intent intent) {
            ArrayList arrayList;
            long j;
            long longExtra = intent.getLongExtra("appUsage_startTime", -1);
            long longExtra2 = intent.getLongExtra("appUsage_endTime", -1);
            if (longExtra >= 0 && longExtra2 >= 0) {
                List a = actw.a(longExtra, longExtra2, intent.getStringArrayListExtra("appUsage_packageNames"));
                Bundle resultExtras = getResultExtras(true);
                Parcelable.Creator creator = AppUsageResult.CREATOR;
                ArrayList arrayList2 = (ArrayList) resultExtras.getSerializable("appUageResult");
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2.size());
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(ivy.a((byte[]) arrayList2.get(i), creator));
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList.addAll(a);
                    HashMap hashMap = new HashMap();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        AppUsageResult appUsageResult = (AppUsageResult) arrayList.get(i2);
                        Pair create = Pair.create(appUsageResult.a, Integer.valueOf(appUsageResult.b));
                        if (hashMap.containsKey(create)) {
                            j = ((Long) hashMap.get(create)).longValue();
                        } else {
                            j = 0;
                        }
                        hashMap.put(create, Long.valueOf(j + appUsageResult.c));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Pair pair : hashMap.keySet()) {
                        arrayList3.add(new AppUsageResult((String) pair.first, ((Integer) pair.second).intValue(), ((Long) hashMap.get(pair)).longValue()));
                    }
                    ivy.a((Iterable) arrayList3, resultExtras, "appUageResult");
                } else {
                    ivy.a((Iterable) new ArrayList(a), resultExtras, "appUageResult");
                }
                setResultExtras(resultExtras);
                return;
            }
            StringBuilder sb = new StringBuilder(126);
            sb.append("Didn't get correct time range parameters from app usage broadcast, startTime:");
            sb.append(longExtra);
            sb.append(" endTime:");
            sb.append(longExtra2);
            Log.e("EastworldChimeraService", sb.toString());
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class EastworldBroadcastReceiver extends nla {
        public EastworldBroadcastReceiver() {
            super("stats");
        }

        public final void a(Context context, Intent intent) {
            EastworldChimeraService.this.a.a(intent);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class PackageUpdateBroadcastReceiver extends nla {
        public PackageUpdateBroadcastReceiver() {
            super("stats");
        }

        public final void a(Context context, Intent intent) {
            if (!intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                Intent intent2 = intent;
            } else if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                return;
            }
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (actw.a()) {
                if (currentTimeMillis - actw.a > TimeUnit.DAYS.toMillis(1)) {
                    Map<String, ?> all = actw.a().getAll();
                    SharedPreferences.Editor edit = actw.a().edit();
                    for (String next : all.keySet()) {
                        List a = actw.a(next);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) it.next();
                            if (currentTimeMillis - ((Long) pair.second).longValue() < TimeUnit.DAYS.toMillis(30)) {
                                sb.append(pair.first);
                                sb.append(",");
                                sb.append(pair.second);
                                sb.append("|");
                            } else if (!sb.toString().isEmpty()) {
                                edit.putString(next, sb.toString());
                            } else {
                                edit.remove(next);
                            }
                        }
                    }
                    edit.apply();
                    actw.a = currentTimeMillis;
                }
                try {
                    int i = ihs.b().getPackageManager().getPackageInfo(schemeSpecificPart, 0).versionCode;
                    StringBuilder sb2 = new StringBuilder(actw.a().getString(schemeSpecificPart, ""));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(",");
                    sb3.append(currentTimeMillis);
                    sb3.append("|");
                    sb2.insert(0, sb3);
                    SharedPreferences.Editor edit2 = actw.a().edit();
                    edit2.putString(schemeSpecificPart, sb2.toString());
                    edit2.apply();
                } catch (PackageManager.NameNotFoundException e) {
                    String valueOf = String.valueOf(schemeSpecificPart);
                    Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Cannot get updated packageInfo of ") : "Cannot get updated packageInfo of ".concat(valueOf));
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (acub.a()) {
            this.b = new EastworldBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            if (aznq.a.a().h()) {
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            }
            if (aznq.a.a().i()) {
                intentFilter.addAction("android.intent.action.DROPBOX_ENTRY_ADDED");
            }
            registerReceiver(this.b, intentFilter);
        }
        if (azmn.b()) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter2.addDataScheme("package");
            PackageUpdateBroadcastReceiver packageUpdateBroadcastReceiver = new PackageUpdateBroadcastReceiver();
            this.c = packageUpdateBroadcastReceiver;
            registerReceiver(packageUpdateBroadcastReceiver, intentFilter2);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.appusage.report_app_usage.ACTION");
            AppUsageOrderedBroadcastReceiver appUsageOrderedBroadcastReceiver = new AppUsageOrderedBroadcastReceiver();
            this.d = appUsageOrderedBroadcastReceiver;
            registerReceiver(appUsageOrderedBroadcastReceiver, intentFilter3);
        }
        this.a = acsl.a();
    }

    public final void onDestroy() {
        if (acub.a()) {
            unregisterReceiver(this.b);
        }
        if (azmn.b()) {
            unregisterReceiver(this.c);
            unregisterReceiver(this.d);
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
