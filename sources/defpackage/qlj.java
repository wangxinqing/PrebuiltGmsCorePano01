package defpackage;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.instantapps.internal.AppInfo;
import com.google.android.gms.instantapps.internal.AtomInfo;
import com.google.android.gms.instantapps.internal.Route;
import com.google.android.gms.instantapps.internal.SharedLibInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: qlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlj {
    public static AppInfo a(qli qli, qik qik, String str, PackageInfo packageInfo) {
        ArrayList arrayList;
        List list;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        qik qik2 = qik;
        List emptyList = Collections.emptyList();
        qll qll = (qll) qli;
        if (qll.e) {
            aucx aucx = qik2.a;
            int i2 = 4;
            if (aucx == null || aucx.isEmpty()) {
                list = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList(aucx.size());
                int size = aucx.size();
                int i3 = 0;
                while (i3 < size) {
                    qiv qiv = (qiv) aucx.get(i3);
                    String str8 = qiv.c;
                    try {
                        i = Integer.parseInt(qiv.d);
                    } catch (NumberFormatException e) {
                        i = 0;
                    }
                    if (qiu.a(qiv.a) == i2) {
                        str5 = qiv.a != 3 ? "" : (String) qiv.b;
                    } else {
                        str5 = null;
                    }
                    if (qiu.a(qiv.a) == 5) {
                        str6 = qiv.a != i2 ? "" : (String) qiv.b;
                    } else {
                        str6 = null;
                    }
                    if (qiu.a(qiv.a) == 6) {
                        str7 = qiv.a != 5 ? "" : (String) qiv.b;
                    } else {
                        str7 = null;
                    }
                    if (qiu.a(qiv.a) == 9 && qiv.a == 8) {
                        String str9 = (String) qiv.b;
                    }
                    Route route = r14;
                    Route route2 = new Route(str8, i, str5, str6, str7, qiv.e, qiv.f);
                    arrayList2.add(route);
                    i3++;
                    i2 = 4;
                }
                list = arrayList2;
            }
            if (qll.h) {
                String str10 = qll.a;
                int i4 = qll.b;
                int i5 = qll.c;
                String str11 = qll.f;
                String str12 = qll.g;
                if (TextUtils.isEmpty(str10) || TextUtils.isEmpty(str12)) {
                    str2 = null;
                } else {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[5];
                    objArr[0] = str10;
                    objArr[1] = Integer.valueOf(i4);
                    objArr[2] = Integer.valueOf(i5);
                    if (TextUtils.isEmpty(str11)) {
                        str4 = "-";
                    } else {
                        str4 = str11;
                    }
                    objArr[3] = str4;
                    objArr[4] = str12;
                    str2 = String.format(locale, "/%s/%d/%d/%s/%s", objArr);
                }
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str12)) {
                    String valueOf = String.valueOf(str10);
                    Log.w("InstantApps", valueOf.length() == 0 ? new String("Failed to create synthetic route for ") : "Failed to create synthetic route for ".concat(valueOf));
                } else {
                    if (str11 == null) {
                        str3 = "";
                    } else {
                        str3 = str11;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new Route("instant.app", 0, str2, (String) null, (String) null, str3, str12));
                    arrayList3.addAll(list);
                    arrayList = arrayList3;
                }
            }
            arrayList = list;
        } else {
            arrayList = emptyList;
        }
        if (packageInfo == null) {
            return new AppInfo(qll.a, str, arrayList, a(qik2.b), b(qik2.c), qik2.d, qik2.e.k(), (PackageInfo) null, qik2.h.k());
        }
        return new AppInfo(qll.a, str, arrayList, a(qik2.b), b(qik2.c), qik2.d, (byte[]) null, packageInfo, qik2.h.k());
    }

    private static List b(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qiw qiw = (qiw) list.get(i);
            arrayList.add(new SharedLibInfo(qiw.a, qiw.b, qiw.c, qiw.d, qiw.e, qiw.f.k()));
        }
        return arrayList;
    }

    private static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qiq qiq = (qiq) list.get(i);
            String str = qiq.a;
            String str2 = qiq.b;
            String[] strArr = (String[]) qiq.c.toArray(new String[0]);
            int[] a = aoog.a((Collection) qiq.d);
            int i2 = qiq.e;
            byte[] k = qiq.f.k();
            if (k.length == 0) {
                k = null;
            }
            arrayList.add(new AtomInfo(str, str2, strArr, a, i2, k, qiq.g));
        }
        return arrayList;
    }
}
