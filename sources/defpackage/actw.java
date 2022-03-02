package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.appusage.AppUsageResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: actw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class actw {
    public static long a = -1;
    private static SharedPreferences b;

    public static SharedPreferences a() {
        if (b == null) {
            b = ihs.b().getSharedPreferences("AppUsageUtilVersionHistory", 0);
        }
        return b;
    }

    public static List a(long j, long j2, List list) {
        actv actv = new actv(j, j2, list);
        actv.a();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : actv.a.keySet()) {
            arrayList.add(new AppUsageResult((String) pair.first, ((Integer) pair.second).intValue(), ((Long) actv.a.get(pair)).longValue()));
        }
        return arrayList;
    }

    public static List a(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : amsk.a("|").a((CharSequence) a().getString(str, ""))) {
            if (!str2.isEmpty()) {
                String[] split = str2.split(",");
                if (split != null && split.length == 2) {
                    try {
                        arrayList.add(Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Long.valueOf(Long.parseLong(split[1]))));
                    } catch (NumberFormatException e) {
                        String valueOf = String.valueOf(str2);
                        Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Unparsable versionTimestamp while parsing : ") : "Unparsable versionTimestamp while parsing : ".concat(valueOf));
                    }
                } else {
                    Log.e("AppUsageUtil", "Unpaired timestamp version in SharedPreferences ");
                }
            }
        }
        return arrayList;
    }
}
