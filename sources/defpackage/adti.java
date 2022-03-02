package defpackage;

/* renamed from: adti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adti {
    private final String a;

    public adti(String str) {
        this.a = str;
    }

    public final void a(String str, String str2) {
        if (azuf.a.a().c() && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                if (!split[i].equals(this.a)) {
                    i++;
                } else {
                    return;
                }
            }
            String str3 = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 23 + str2.length());
            sb.append(str3);
            sb.append(" is not authorized for ");
            sb.append(str2);
            throw new SecurityException(sb.toString());
        }
    }
}
