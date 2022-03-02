package defpackage;

import android.util.Log;

@Deprecated
/* renamed from: dph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dph {
    public static volatile dmz a = new dmz();

    public static void a(String str) {
        dpk dpk = dpk.a;
        if (dpk != null) {
            dpk.d(str);
        } else if (a()) {
            Log.w((String) doz.b.a(), str);
        }
        dmz dmz = a;
    }

    public static boolean a() {
        if (a == null) {
            return false;
        }
        int i = a.a;
        return true;
    }

    public static void a(String str, Object obj) {
        dpk dpk = dpk.a;
        if (dpk != null) {
            dpk.e(str, obj);
        } else if (a()) {
            if (obj != null) {
                String str2 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
            Log.e((String) doz.b.a(), str);
        }
        dmz dmz = a;
    }
}
