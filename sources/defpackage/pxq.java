package defpackage;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/* renamed from: pxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxq {
    private static final List a = Arrays.asList(new String[]{"android", "com.android.systemui", "com.android.vending", "com.android.settings"});

    public static List a(Context context, long j) {
        List<ActivityManager.RunningTaskInfo> list;
        ArrayList arrayList = new ArrayList();
        int intValue = ((Long) ozx.aS.c()).intValue();
        if (intValue <= 0) {
            return arrayList;
        }
        if (!jkr.b()) {
            try {
                list = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(intValue);
            } catch (RuntimeException e) {
                oso.b("Error getting running tasks.");
                list = null;
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            for (ActivityManager.RunningTaskInfo runningTaskInfo : list) {
                ComponentName componentName = runningTaskInfo.topActivity;
                if (componentName != null && !TextUtils.isEmpty(componentName.getPackageName())) {
                    arrayList.add(componentName.getPackageName());
                }
            }
        } else if (jkr.b()) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            UsageEvents queryEvents = ((UsageStatsManager) context.getSystemService("usagestats")).queryEvents(j - ((Long) ozx.aT.c()).longValue(), j);
            UsageEvents.Event event = new UsageEvents.Event();
            TreeSet<String> treeSet = new TreeSet<>();
            while (queryEvents.hasNextEvent() && treeSet.size() <= intValue) {
                queryEvents.getNextEvent(event);
                String packageName = event.getPackageName();
                if (!TextUtils.isEmpty(packageName) && !a.contains(packageName)) {
                    treeSet.add(event.getPackageName());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : treeSet) {
                if (activityManager.getPackageImportance(str) <= 200) {
                    arrayList2.add(str);
                }
            }
            arrayList.addAll(arrayList2);
        } else {
            throw new IllegalStateException("Cannot use getUsageEvents on pre-M devices");
        }
        if (arrayList.isEmpty() || TextUtils.isEmpty((CharSequence) null)) {
            String valueOf = String.valueOf(arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Currently running apps: ");
            sb.append(valueOf);
            oso.d(sb.toString());
            return arrayList;
        }
        String str2 = (String) arrayList.get(0);
        throw null;
    }
}
