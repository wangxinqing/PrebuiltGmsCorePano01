package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzd {
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final List d;
    public final String e;
    private final String g;
    private final String h;
    private final String i;

    public avzd(avzc avzc) {
        List list;
        this.a = avzc.a;
        this.g = a(avzc.b, false);
        this.h = a(avzc.c, false);
        this.b = avzc.d;
        this.c = avzc.a();
        a(avzc.f, false);
        List list2 = avzc.g;
        String str = null;
        if (list2 != null) {
            list = a(list2, true);
        } else {
            list = null;
        }
        this.d = list;
        String str2 = avzc.h;
        this.i = str2 != null ? a(str2, false) : str;
        this.e = avzc.toString();
    }

    static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    static List b(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add((Object) null);
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.g.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.e;
        return this.e.substring(length, a(str, length, str.length(), ":@"));
    }

    public final String d() {
        if (this.h.isEmpty()) {
            return "";
        }
        int indexOf = this.e.indexOf(58, this.a.length() + 3);
        return this.e.substring(indexOf + 1, this.e.indexOf(64));
    }

    public final List e() {
        int indexOf = this.e.indexOf(47, this.a.length() + 3);
        String str = this.e;
        int a2 = a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = a(this.e, i2, a2, "/");
            arrayList.add(this.e.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avzd) && ((avzd) obj).e.equals(this.e);
    }

    public final String f() {
        if (this.d == null) {
            return null;
        }
        int indexOf = this.e.indexOf(63) + 1;
        String str = this.e;
        return this.e.substring(indexOf, a(str, indexOf + 1, str.length(), "#"));
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

    public static int a(String str) {
        if (!str.equals("http")) {
            return !str.equals("https") ? -1 : 443;
        }
        return 80;
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4 = str;
        int i4 = i3;
        String str5 = str2;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str4.codePointAt(i5);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z3) && str5.indexOf(codePointAt) == -1 && ((codePointAt != 37 || z) && (codePointAt != 43 || !z2)))) {
                i5 += Character.charCount(codePointAt);
            } else {
                batd batd = new batd();
                batd.a(str4, i2, i5);
                batd batd2 = null;
                while (i5 < i4) {
                    int codePointAt2 = str4.codePointAt(i5);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z2) {
                            if (!z) {
                                str3 = "%2B";
                            } else {
                                str3 = "+";
                            }
                            batd.b(str3);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str5.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (batd2 == null) {
                                batd2 = new batd();
                            }
                            batd2.g(codePointAt2);
                            while (!batd2.b()) {
                                byte e2 = batd2.e() & 255;
                                batd.h(37);
                                batd.h((int) f[e2 >> 4]);
                                batd.h((int) f[e2 & 15]);
                            }
                        } else {
                            batd.g(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                }
                return batd.k();
            }
        }
        int i6 = i2;
        return str.substring(i2, i3);
    }

    public final URI b() {
        int i2;
        String str;
        try {
            avzc avzc = new avzc();
            avzc.a = this.a;
            avzc.b = c();
            avzc.c = d();
            avzc.d = this.b;
            if (this.c != a(this.a)) {
                i2 = this.c;
            } else {
                i2 = -1;
            }
            avzc.e = i2;
            avzc.f.clear();
            avzc.f.addAll(e());
            avzc.a(f());
            if (this.i != null) {
                str = this.e.substring(this.e.indexOf(35) + 1);
            } else {
                str = null;
            }
            avzc.h = str;
            int size = avzc.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                avzc.f.set(i3, a((String) avzc.f.get(i3), "[]", false, true));
            }
            List list = avzc.g;
            if (list != null) {
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = (String) avzc.g.get(i4);
                    if (str2 != null) {
                        avzc.g.set(i4, a(str2, "\\^`{|}", true, true));
                    }
                }
            }
            String str3 = avzc.h;
            if (str3 != null) {
                avzc.h = a(str3, " \"#<>\\^`{|}", false, false);
            }
            return new URI(avzc.toString());
        } catch (URISyntaxException e2) {
            String valueOf = String.valueOf(this.e);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("not valid as a java.net.URI: ") : "not valid as a java.net.URI: ".concat(valueOf));
        }
    }

    static String a(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i5++;
            } else {
                batd batd = new batd();
                batd.a(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int a2 = a(str.charAt(i5 + 1));
                        int a3 = a(str.charAt(i4));
                        if (!(a2 == -1 || a3 == -1)) {
                            batd.h((a2 << 4) + a3);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        batd.h(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    batd.g(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return batd.k();
            }
        }
        return str.substring(i2, i3);
    }

    static String a(String str, String str2, boolean z, boolean z2) {
        return a(str, 0, str.length(), str2, true, z, z2);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static final List a(List list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final URL a() {
        try {
            return new URL(this.e);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }
}
