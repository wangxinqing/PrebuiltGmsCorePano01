package defpackage;

import java.io.IOException;

/* renamed from: bar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bar {
    final String[] a;
    final batr b;

    private bar(String[] strArr, batr batr) {
        this.a = strArr;
        this.b = batr;
    }

    public static bar a(String... strArr) {
        String str;
        try {
            batg[] batgArr = new batg[strArr.length];
            batd batd = new batd();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = bat.a;
                batd.h(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i2 < i3) {
                        batd.a(str2, i2, i3);
                    }
                    batd.b(str);
                    i2 = i3 + 1;
                }
                if (i2 < length) {
                    batd.a(str2, i2, length);
                }
                batd.h(34);
                batd.e();
                batgArr[i] = batd.j();
            }
            return new bar((String[]) strArr.clone(), batr.a(batgArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
