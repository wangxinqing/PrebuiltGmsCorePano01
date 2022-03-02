package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: ycb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycb {
    public static final ycb a = new ycb();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private ycb() {
    }

    public static void a(Bundle bundle, String[] strArr, String[] strArr2) {
        bundle.putStringArray("config.url_uncompress.patterns", strArr);
        bundle.putStringArray("config.url_uncompress.replacements", strArr2);
    }

    public final synchronized String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                Pattern[] patternArr = this.b;
                if (i >= patternArr.length) {
                    break;
                }
                str = patternArr[i].matcher(str).replaceAll(this.c[i]);
                i++;
            }
        } else {
            str = null;
        }
        return str;
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        boolean z;
        int length = strArr.length;
        if (length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        this.b = new Pattern[length];
        this.c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.b[i] = Pattern.compile(strArr[i]);
        }
    }
}
