package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aaxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaxc {
    private final Context a;
    private final AppOpsManager b;
    private final Method c = AppOpsManager.class.getMethod("getOpsForPackage", new Class[]{Integer.TYPE, String.class, int[].class});
    private Method d;

    public aaxc(Context context) {
        this.a = context;
        this.b = (AppOpsManager) context.getSystemService("appops");
    }

    public final ancq a(long j) {
        char c2;
        int i;
        ArrayList arrayList;
        if (this.b == null) {
            return amxc.p();
        }
        amxc p = amxc.p();
        int i2 = 0;
        List<PackageInfo> installedPackages = this.a.getPackageManager().getInstalledPackages(0);
        ArrayList arrayList2 = new ArrayList();
        Iterator<PackageInfo> it = installedPackages.iterator();
        while (true) {
            c2 = 1;
            if (!it.hasNext()) {
                break;
            }
            PackageInfo next = it.next();
            if (next.applicationInfo != null && (1 & next.applicationInfo.flags) == 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            PackageInfo packageInfo = (PackageInfo) arrayList2.get(i3);
            Method method = this.c;
            AppOpsManager appOpsManager = this.b;
            Object[] objArr = new Object[3];
            objArr[i] = Integer.valueOf(packageInfo.applicationInfo.uid);
            objArr[c2] = packageInfo.packageName;
            objArr[2] = null;
            List list = (List) method.invoke(appOpsManager, objArr);
            ArrayList arrayList3 = new ArrayList();
            if (list != null) {
                for (Object next2 : list) {
                    if (this.d == null) {
                        this.d = next2.getClass().getMethod("getOps", new Class[i]);
                    }
                    long max = Math.max(j, packageInfo.lastUpdateTime);
                    List<Object> list2 = (List) this.d.invoke(next2, new Object[i]);
                    if (list2 != null) {
                        for (Object aaxb : list2) {
                            aaxb aaxb2 = new aaxb(aaxb);
                            if (aaxb2.a != null) {
                                ArrayList arrayList4 = arrayList2;
                                if (aaxb2.b >= max || aaxb2.c >= max || aaxb2.d >= max) {
                                    arrayList3.add(aaxb2);
                                    arrayList2 = arrayList4;
                                } else {
                                    arrayList2 = arrayList4;
                                }
                            } else {
                                ArrayList arrayList5 = arrayList2;
                            }
                        }
                        ArrayList arrayList6 = arrayList2;
                        i = 0;
                    } else {
                        ArrayList arrayList7 = arrayList2;
                        i = 0;
                    }
                }
                long j2 = j;
                arrayList = arrayList2;
            } else {
                long j3 = j;
                arrayList = arrayList2;
            }
            if (!arrayList3.isEmpty()) {
                p.a((Object) packageInfo.packageName, (Iterable) arrayList3);
            }
            i3++;
            arrayList2 = arrayList;
            i2 = 0;
            c2 = 1;
        }
        return p;
    }
}
