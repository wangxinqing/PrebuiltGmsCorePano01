package defpackage;

import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlr {
    public static ActivityInfo a(ApplicationInfo applicationInfo, qgz qgz, int i) {
        String str;
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.applicationInfo = applicationInfo;
        activityInfo.packageName = applicationInfo.packageName;
        activityInfo.name = qgz.a;
        if (!qgz.b.isEmpty()) {
            activityInfo.targetActivity = qgz.b;
        }
        activityInfo.theme = qgz.c;
        activityInfo.configChanges = qgz.g;
        if (!qgz.h.isEmpty()) {
            str = qgz.h;
        } else {
            str = null;
        }
        activityInfo.parentActivityName = str;
        auck auck = qgz.i;
        if (auck != null) {
            activityInfo.screenOrientation = auck.a;
        }
        if ((i & 128) != 0) {
            activityInfo.metaData = a(qgz.d);
        }
        activityInfo.labelRes = qgz.e;
        if (!qgz.f.isEmpty()) {
            activityInfo.nonLocalizedLabel = qgz.f;
        }
        activityInfo.enabled = true;
        return activityInfo;
    }

    public static final String[] b(List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                qhh qhh = (qhh) list.get(i);
                int i2 = qhh.b;
                if (i2 <= 0 || i2 >= Build.VERSION.SDK_INT) {
                    arrayList.add(qhh.a);
                }
            }
            if (!arrayList.isEmpty()) {
                return (String[]) arrayList.toArray(new String[0]);
            }
        }
        return null;
    }

    public static final ApplicationInfo a(String str, int i, qhb qhb, Integer num) {
        if (qhb == null || qhb.d == null) {
            return null;
        }
        ApplicationInfo applicationInfo = new ApplicationInfo();
        qhi qhi = qhb.c;
        if (qhi != null) {
            int i2 = qhi.b;
            if (i2 == 0) {
                applicationInfo.targetSdkVersion = qhi.a;
            } else {
                applicationInfo.targetSdkVersion = i2;
            }
        }
        applicationInfo.flags = 4;
        qha qha = qhb.d;
        if (qha == null) {
            qha = qha.h;
        }
        if (!qha.g.isEmpty()) {
            qha qha2 = qhb.d;
            if (qha2 == null) {
                qha2 = qha.h;
            }
            applicationInfo.name = qha2.g;
            qha qha3 = qhb.d;
            if (qha3 == null) {
                qha3 = qha.h;
            }
            applicationInfo.className = qha3.g;
        }
        applicationInfo.packageName = str;
        applicationInfo.enabled = true;
        qha qha4 = qhb.d;
        if (qha4 == null) {
            qha4 = qha.h;
        }
        applicationInfo.icon = qha4.a;
        qha qha5 = qhb.d;
        if (qha5 == null) {
            qha5 = qha.h;
        }
        applicationInfo.labelRes = qha5.b;
        qha qha6 = qhb.d;
        if (qha6 == null) {
            qha6 = qha.h;
        }
        if (!qha6.c.isEmpty()) {
            qha qha7 = qhb.d;
            if (qha7 == null) {
                qha7 = qha.h;
            }
            applicationInfo.nonLocalizedLabel = qha7.c;
        }
        qha qha8 = qhb.d;
        if (qha8 == null) {
            qha8 = qha.h;
        }
        applicationInfo.logo = qha8.d;
        qha qha9 = qhb.d;
        if (qha9 == null) {
            qha9 = qha.h;
        }
        applicationInfo.theme = qha9.e;
        if (num != null) {
            applicationInfo.uid = num.intValue();
        }
        if ((i & 128) != 0) {
            qha qha10 = qhb.d;
            if (qha10 == null) {
                qha10 = qha.h;
            }
            applicationInfo.metaData = a(qha10.f);
        }
        return applicationInfo;
    }

    public static final ResolveInfo a(String str, qhb qhb, qgz qgz, qhd qhd, int i) {
        ApplicationInfo a;
        if (qgz == null || (a = a(str, i, qhb, (Integer) null)) == null) {
            return null;
        }
        ActivityInfo a2 = a(a, qgz, i);
        ResolveInfo resolveInfo = new ResolveInfo();
        resolveInfo.labelRes = a2.labelRes;
        resolveInfo.activityInfo = a2;
        resolveInfo.icon = a2.icon;
        if (qhd != null) {
            if ((i & 64) != 0) {
                IntentFilter intentFilter = new IntentFilter();
                aucx aucx = qhd.a;
                int size = aucx.size();
                for (int i2 = 0; i2 < size; i2++) {
                    intentFilter.addAction((String) aucx.get(i2));
                }
                aucx aucx2 = qhd.b;
                int size2 = aucx2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    intentFilter.addCategory((String) aucx2.get(i3));
                }
                intentFilter.setPriority(qhd.c);
                resolveInfo.filter = intentFilter;
            }
            resolveInfo.priority = qhd.c;
            resolveInfo.isDefault = qhd.b.contains("android.intent.category.DEFAULT");
        }
        resolveInfo.nonLocalizedLabel = a2.nonLocalizedLabel;
        return resolveInfo;
    }

    public static Bundle a(List list) {
        int i;
        if (list == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            qhe qhe = (qhe) list.get(i2);
            int i3 = qhe.b;
            if (i3 != 0) {
                i = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 6 : 5 : 4 : 3;
            } else {
                i = 2;
            }
            if (i == 0) {
                i = 1;
            }
            int i4 = i - 2;
            if (i4 == 1) {
                bundle.putString(qhe.a, qhe.c);
            } else if (i4 == 2) {
                bundle.putInt(qhe.a, qhe.d);
            } else if (i4 == 3) {
                bundle.putBoolean(qhe.a, qhe.e);
            } else if (i4 == 4) {
                bundle.putFloat(qhe.a, qhe.f);
            }
        }
        return bundle;
    }
}
