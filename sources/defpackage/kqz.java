package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: kqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kqz {
    public static final kqy a = a("1");
    public static final kqy b = a("0");

    public static kqy a(String str) {
        return new kqy(str, amzy.h());
    }

    public static kqy b(String str) {
        return a(String.valueOf(str).concat(" IS NULL"));
    }

    public static kqy c(String str) {
        return a(String.valueOf(str).concat(" IS NOT NULL"));
    }

    public static kqy d(String str, long j) {
        return d(str, Long.toString(j));
    }

    public static kqy e(String str, long j) {
        return e(str, Long.toString(j));
    }

    public static kqy f(String str, long j) {
        return f(str, Long.toString(j));
    }

    public static kqy g(String str, String str2) {
        return new kqy(String.valueOf(str).concat(" LIKE ?"), str2);
    }

    public static kqy h(String str, String str2) {
        return new kqy(String.valueOf(str).concat(" NOT LIKE ?"), str2);
    }

    public static kqy a(String str, long j) {
        return a(str, Long.toString(j));
    }

    public static kqy b(String str, long j) {
        return b(str, Long.toString(j));
    }

    public static kqy c(String str, long j) {
        return c(str, Long.toString(j));
    }

    public static kqy d(String str, String str2) {
        return new kqy(String.valueOf(str).concat("<=?"), str2);
    }

    public static kqy e(String str, String str2) {
        return new kqy(String.valueOf(str).concat(">?"), str2);
    }

    public static kqy f(String str, String str2) {
        return new kqy(String.valueOf(str).concat(">=?"), str2);
    }

    public static kqy a(String str, String str2) {
        return new kqy(String.valueOf(str).concat("=?"), str2);
    }

    public static kqy b(String str, String str2) {
        return new kqy(String.valueOf(str).concat("!=?"), str2);
    }

    public static kqy c(String str, String str2) {
        return new kqy(String.valueOf(str).concat("<?"), str2);
    }

    public static kqy a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + str2.length());
        sb.append(str);
        sb.append(" LIKE ? ESCAPE ");
        sb.append(str2);
        return new kqy(sb.toString(), str3);
    }

    private static kqy b(String str, List list) {
        if (list.size() == 1) {
            return (kqy) list.get(0);
        }
        amzt amzt = new amzt();
        amzt amzt2 = new amzt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kqy kqy = (kqy) it.next();
            amzt.c(kqy.a);
            amzt2.b((Iterable) kqy.b);
        }
        StringBuilder sb = new StringBuilder(str.length() + 4);
        sb.append(") ");
        sb.append(str);
        sb.append(" (");
        String join = TextUtils.join(sb.toString(), amzt.a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
        sb2.append('(');
        sb2.append(join);
        sb2.append(')');
        return new kqy(sb2.toString(), amzt2.a());
    }

    public static kqy a(String str, List list) {
        return new kqy(str, amzy.a((Collection) list));
    }

    public static kqy a(List list) {
        return !list.isEmpty() ? b("AND", list) : a;
    }

    public static kqy a(kqy... kqyArr) {
        return a((List) amzy.a((Object[]) kqyArr));
    }

    public static kqy b(List list) {
        return !list.isEmpty() ? b("OR", list) : b;
    }

    public static kqy b(kqy... kqyArr) {
        return b((List) amzy.a((Object[]) kqyArr));
    }
}
