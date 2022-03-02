package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: mq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mq {
    private final ms a;

    static {
        a(new Locale[0]);
    }

    private mq(ms msVar) {
        this.a = msVar;
    }

    public static mq a(LocaleList localeList) {
        return new mq(new mt(localeList));
    }

    public final String b() {
        return this.a.c();
    }

    public final Locale c() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mq) && this.a.equals(((mq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public static mq a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a(new LocaleList(localeArr));
        }
        return new mq(new mr(localeArr));
    }

    static void a(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            int length = split.length;
            if (length > 2) {
                new Locale(split[0], split[1], split[2]);
                return;
            } else if (length > 1) {
                new Locale(split[0], split[1]);
                return;
            } else if (length == 1) {
                new Locale(split[0]);
                return;
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            int length2 = split2.length;
            if (length2 > 2) {
                new Locale(split2[0], split2[1], split2[2]);
                return;
            } else if (length2 > 1) {
                new Locale(split2[0], split2[1]);
                return;
            } else if (length2 == 1) {
                new Locale(split2[0]);
                return;
            }
        } else {
            new Locale(str);
            return;
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public final int a() {
        return this.a.b();
    }
}
