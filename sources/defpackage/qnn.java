package defpackage;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qnn {
    public static final /* synthetic */ int a = 0;
    private static final long b = TimeUnit.DAYS.toMillis(7);

    public static void a(Context context) {
        Context context2 = context;
        ArrayList arrayList = new ArrayList();
        if (axvz.c()) {
            int i = 1;
            if (!jkr.b()) {
                Object[] objArr = {Integer.valueOf(Build.VERSION.SDK_INT), Boolean.valueOf(jkr.b())};
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences sharedPreferences = context2.getSharedPreferences("usage_stats_manager_prefs", 0);
                long j = sharedPreferences.getLong("usage_stats_timestamp", 0);
                sharedPreferences.edit().putLong("usage_stats_timestamp", currentTimeMillis).commit();
                try {
                    UsageEvents queryEvents = ((UsageStatsManager) context2.getSystemService("usagestats")).queryEvents(Math.max(j, currentTimeMillis - b), currentTimeMillis);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    HashSet hashSet = new HashSet();
                    String a2 = qnt.a(context.getPackageManager());
                    if (a2 != null) {
                        hashSet.add(a2);
                    }
                    UsageEvents.Event event = new UsageEvents.Event();
                    String str = null;
                    while (queryEvents.getNextEvent(event)) {
                        if (event.getEventType() == i && !TextUtils.isEmpty(event.getPackageName()) && !event.getPackageName().equals(str) && !hashSet.contains(event.getPackageName())) {
                            str = event.getPackageName();
                            List<String> list = (List) hashMap2.get(str);
                            if (list == null) {
                                list = qnt.a(qnt.b(context.getPackageManager(), str));
                                if (list.isEmpty()) {
                                    hashSet.add(str);
                                } else {
                                    hashMap2.put(str, list);
                                }
                            }
                            for (String str2 : list) {
                                String str3 = (String) hashMap.get(str2);
                                if (str3 == null) {
                                    str3 = qnt.a(ComponentName.unflattenFromString(str2));
                                    hashMap.put(str2, str3);
                                }
                                long timeStamp = event.getTimeStamp();
                                DocumentId documentId = new DocumentId("com.google.android.gms", "internal.3p:MobileApplication", str3);
                                duo duo = new duo();
                                duo.a = documentId;
                                duo.b = timeStamp;
                                duo.c = 0;
                                duo.e = true;
                                arrayList.add(duo.a());
                            }
                        }
                        i = 1;
                    }
                } catch (RuntimeException e) {
                    qoi.c("b/62250956. Bad implementation of UsageStatsManager.queryEvents onLeEco devices");
                    qoh.a().a(35);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            aucd o = ansz.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ansz) o.b).a = ansy.a(7);
            int size = arrayList.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((ansz) o.b).f = size;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            iby a3 = dsa.a(context);
            iha b2 = ihb.b();
            b2.a = new duy((UsageInfo[]) arrayList.toArray(new UsageInfo[arrayList.size()]));
            acwa a4 = a3.a(b2.a());
            a4.a((acvv) new qnk(o, arrayList));
            a4.a((acvs) new qnl(o));
            a4.a((acvp) new qnm(o, elapsedRealtime));
        }
    }
}
