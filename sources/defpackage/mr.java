package defpackage;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: mr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mr implements ms {
    private static final Locale[] c = new Locale[0];
    private final Locale[] a;
    private final String b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        mq.a("en-Latn");
    }

    public mr(Locale... localeArr) {
        int length = localeArr.length;
        if (length != 0) {
            Locale[] localeArr2 = new Locale[length];
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                int length2 = localeArr.length;
                if (i < length2) {
                    Locale locale = localeArr[i];
                    if (locale == null) {
                        throw new NullPointerException("list[" + i + "] is null");
                    } else if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        localeArr2[i] = locale2;
                        sb.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            sb.append('-');
                            sb.append(locale2.getCountry());
                        }
                        if (i < length2 - 1) {
                            sb.append(',');
                        }
                        hashSet.add(locale2);
                        i++;
                    } else {
                        throw new IllegalArgumentException("list[" + i + "] is a repetition");
                    }
                } else {
                    this.a = localeArr2;
                    this.b = sb.toString();
                    return;
                }
            }
        } else {
            this.a = c;
            this.b = "";
        }
    }

    public final Object a() {
        return null;
    }

    public final int b() {
        return this.a.length;
    }

    public final String c() {
        return this.b;
    }

    public final Locale d() {
        Locale[] localeArr = this.a;
        if (localeArr.length <= 0) {
            return null;
        }
        return localeArr[0];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mr) {
            Locale[] localeArr = ((mr) obj).a;
            if (this.a.length == localeArr.length) {
                int i = 0;
                while (true) {
                    Locale[] localeArr2 = this.a;
                    if (i >= localeArr2.length) {
                        return true;
                    }
                    if (!localeArr2[i].equals(localeArr[i])) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
