package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: avyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyv {
    public static String a(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String valueOf = String.valueOf(batg.a(sb.toString().getBytes("ISO-8859-1")).b());
            return valueOf.length() == 0 ? new String("Basic ") : "Basic ".concat(valueOf);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError();
        }
    }
}
