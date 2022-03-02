package defpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: lck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lck {
    public static final lck a = new lck("");
    public final String b;

    public lck(String str) {
        iva.a((Object) str);
        this.b = str;
    }

    public static lck a() {
        return c(lcw.l.a, "true");
    }

    public static lck b(String str, String str2) {
        return a(str, str2, "contains");
    }

    public static lck c(String str, String str2) {
        return a(str, str2, "=");
    }

    public static lck d(String str, String str2) {
        return a(str, str2, "<");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.b.equals(((lck) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public static lck a(String str) {
        return b(lcw.b.a, lso.b(str));
    }

    public static lck a(String str, String str2) {
        return a(str2, str, "in");
    }

    public static lck a(String str, String str2, String str3) {
        return new lck(String.format(Locale.US, "%s %s %s", new Object[]{str, str3, str2}));
    }

    public static lck a(String str, List list) {
        if (list.size() == 0) {
            iva.a(!str.equals("or"));
            return a;
        }
        String str2 = a.b;
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = true;
        while (it.hasNext()) {
            lck lck = (lck) it.next();
            if (a.equals(lck)) {
                if (str.equals("or")) {
                    return a;
                }
            } else if (!z2) {
                str2 = String.format(Locale.US, "%s %s %s", new Object[]{str2, str, lck.b});
                z = true;
            } else {
                str2 = lck.b;
                z2 = false;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
            sb.append("(");
            sb.append(str2);
            sb.append(")");
            str2 = sb.toString();
        }
        return new lck(str2);
    }

    public static lck a(Date date) {
        iva.a((Object) date);
        if (date.getTime() == Long.MAX_VALUE) {
            return a;
        }
        iva.b(date.getTime() <= 9223372036847575807L);
        long time = date.getTime();
        lsp lsp = new lsp("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        lsp.a(TimeZone.getTimeZone("UTC"));
        String a2 = lsp.a(new Date(time + 7200000));
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2);
        sb.append("'");
        sb.append(a2);
        sb.append("'");
        return d(lcw.f.a, sb.toString());
    }

    public static lck a(List list) {
        return a("and", list);
    }
}
