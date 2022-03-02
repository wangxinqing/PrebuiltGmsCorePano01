package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/* renamed from: ykl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykl {
    private final SharedPreferences a;

    public ykl(Context context) {
        this.a = context.getSharedPreferences("platform_prefs", 0);
    }

    static String a(Set set) {
        return amre.a(":").a((Iterable) set);
    }

    static TreeSet a(String str) {
        TreeSet treeSet = new TreeSet();
        if (!TextUtils.isEmpty(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
            while (stringTokenizer.hasMoreTokens()) {
                treeSet.add(stringTokenizer.nextToken());
            }
        }
        return treeSet;
    }

    private final void a(String str, String str2) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public final String a(int i, String str, String str2) {
        if (str == null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return this.a.getString(str2, (String) null);
            } else {
                if (i2 == 1) {
                    return this.a.getString(str2.length() == 0 ? new String("_boot_") : "_boot_".concat(str2), (String) null);
                } else if (i != 0) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("unknown ConfigType: ");
                    sb.append(i2);
                    throw new RuntimeException(sb.toString());
                } else {
                    throw null;
                }
            }
        } else {
            SharedPreferences sharedPreferences = this.a;
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + str2.length());
            sb2.append(str);
            sb2.append(".");
            sb2.append(str2);
            return sharedPreferences.getString(sb2.toString(), (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, String str, String str2, String str3) {
        if (str == null) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                a(str2, str3);
            } else if (i2 == 1) {
                a(str2.length() == 0 ? new String("_boot_") : "_boot_".concat(str2), str3);
            }
        } else {
            StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            a(sb.toString(), str3);
        }
    }
}
