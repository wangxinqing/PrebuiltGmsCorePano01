package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: aaou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaou {
    public static final String a = "www.gstatic.com/recaptcha,www.google.com/recaptcha,www.google.com/js/bg";
    private static final Object b = new Object();

    static {
        aaou.class.getSimpleName();
    }

    public final boolean a(Uri uri) {
        List asList;
        if (uri != null && !TextUtils.isEmpty(uri.toString()) && "https".equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            String uri2 = uri.toString();
            String str = a;
            synchronized (b) {
                asList = Arrays.asList(str.split(","));
                int size = asList.size();
                for (int i = 0; i < size; i++) {
                    String str2 = (String) asList.get(i);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 9);
                    sb.append("https://");
                    sb.append(str2);
                    sb.append("/");
                    asList.set(i, sb.toString());
                }
            }
            int size2 = asList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (uri2.startsWith((String) asList.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }
}
