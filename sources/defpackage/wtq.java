package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wtq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtq {
    public static String a(String str) {
        return String.format("DROP TABLE IF EXISTS %s;", new Object[]{str});
    }

    public static String b(String str) {
        return String.format("DROP INDEX IF EXISTS %s;", new Object[]{str});
    }

    public static List c(String... strArr) {
        ArrayList arrayList = new ArrayList(r0);
        for (String a : strArr) {
            arrayList.add(a(a));
        }
        return arrayList;
    }

    public static String a(String str, String str2, String str3) {
        return a(amzy.a((Object) str), str2, amzy.a((Object) str3), 1);
    }

    public static String b(String str, String str2, String... strArr) {
        boolean z;
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must provide at least one column.");
        return String.format("CREATE INDEX IF NOT EXISTS %s ON %s (%s);", new Object[]{str, str2, TextUtils.join(",", strArr)});
    }

    public static String a(String str, String str2, String... strArr) {
        boolean z;
        if (strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must provide at least one column.");
        return String.format("CREATE INDEX %s ON %s (%s);", new Object[]{str, str2, TextUtils.join(",", strArr)});
    }

    public static String b(String... strArr) {
        iva.b(strArr.length > 0, "Must name at least one column.");
        return String.format("UNIQUE (%s) ON CONFLICT IGNORE", new Object[]{TextUtils.join(",", strArr)});
    }

    public static String a(String str, String... strArr) {
        iva.b(strArr.length > 0, "Must define at least one column.");
        return String.format("CREATE TABLE %s (%s);", new Object[]{str, TextUtils.join(",", strArr)});
    }

    public static String a(List list, String str, List list2, int i) {
        boolean z;
        String str2;
        iva.b(!list.isEmpty(), "Must have at least one column.");
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must have same number of columns in each table (%d vs. %d).", Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.join(",", list);
        objArr[1] = str;
        objArr[2] = TextUtils.join(",", list2);
        if (i == 0) {
            str2 = "";
        } else {
            str2 = " ON DELETE CASCADE";
        }
        objArr[3] = str2;
        return String.format("FOREIGN KEY (%s) REFERENCES %s(%s)%s", objArr);
    }

    public static String a(String... strArr) {
        iva.b(strArr.length > 0, "Must name at least one column.");
        return String.format("UNIQUE (%s)", new Object[]{TextUtils.join(",", strArr)});
    }
}
