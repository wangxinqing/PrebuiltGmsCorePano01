package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: aaaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaaj {
    private static final String[] b = {"http", "https", "ftp"};
    public final Integer a;
    private final String c;
    private final Uri d;
    private final String e = a();
    private final Boolean f = Boolean.valueOf(b());

    public aaaj(String str) {
        int port;
        this.c = str;
        this.d = Uri.parse(str);
        Integer num = this.a;
        int i = -1;
        if (num == null) {
            Uri uri = this.d;
            if (!(uri == null || (port = uri.getPort()) == -1)) {
                i = port;
            }
        } else {
            i = num.intValue();
        }
        this.a = Integer.valueOf(i);
    }

    private static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                String[] strArr = b;
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals(str)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public final boolean b() {
        Boolean bool = this.f;
        if (bool == null) {
            return a(this.e);
        }
        return bool.booleanValue();
    }

    public final String a() {
        String str;
        String str2 = this.e;
        if (str2 != null) {
            return str2;
        }
        Uri uri = this.d;
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.c)) {
            int indexOf = this.c.indexOf(":");
            if (indexOf != -1) {
                String lowerCase = this.c.substring(0, indexOf).toLowerCase(Locale.US);
                if (a(lowerCase)) {
                    str = lowerCase;
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = !this.c.startsWith("www.") ? "http" : "http";
            }
        }
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return null;
    }
}
