package defpackage;

import java.util.Arrays;

/* renamed from: atgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgf {
    private final String a;
    private final atge b;
    private atge c;

    private atgf(String str) {
        atge atge = new atge();
        this.b = atge;
        this.c = atge;
        iva.a((Object) str);
        this.a = str;
    }

    public static atgf a(Object obj) {
        return new atgf(obj.getClass().getSimpleName());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        atge atge = this.b.c;
        String str = "";
        while (atge != null) {
            Object obj = atge.b;
            sb.append(str);
            String str2 = atge.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            atge = atge.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final void a(String str, Object obj) {
        atge atge = new atge();
        this.c.c = atge;
        this.c = atge;
        atge.b = obj;
        iva.a((Object) str);
        atge.a = str;
    }
}
