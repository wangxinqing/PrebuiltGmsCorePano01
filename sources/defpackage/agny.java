package defpackage;

import android.content.Context;

/* renamed from: agny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class agny {
    @Deprecated
    public static agny a(Context context, String str) {
        return a(context.getPackageName(), str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String d() {
        String a = a();
        String c = c();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(c).length());
        sb.append(a);
        sb.append("#");
        sb.append(c);
        return sb.toString();
    }

    public final String e() {
        String a = a();
        String b = b();
        String c = c();
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(b).length() + String.valueOf(c).length());
        sb.append(a);
        sb.append("#");
        sb.append(b);
        sb.append("#");
        sb.append(c);
        return sb.toString();
    }

    public static agny a(String str, String str2) {
        return new agoe(str, str2);
    }
}
