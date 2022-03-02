package defpackage;

/* renamed from: awcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awcz {
    public static String a(avzd avzd) {
        int indexOf = avzd.e.indexOf(47, avzd.a.length() + 3);
        String str = avzd.e;
        String substring = avzd.e.substring(indexOf, avzd.a(str, indexOf, str.length(), "?#"));
        String f = avzd.f();
        if (f == null) {
            return substring;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + f.length());
        sb.append(substring);
        sb.append('?');
        sb.append(f);
        return sb.toString();
    }
}
