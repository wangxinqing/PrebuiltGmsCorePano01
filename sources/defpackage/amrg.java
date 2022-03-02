package defpackage;

import java.util.Arrays;

/* renamed from: amrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrg {
    private final String a;
    private final amrf b;
    private amrf c;
    private boolean d = false;

    public amrg(String str) {
        amrf amrf = new amrf();
        this.b = amrf;
        this.c = amrf;
        amrl.a((Object) str);
        this.a = str;
    }

    private final amrf b() {
        amrf amrf = new amrf();
        this.c.c = amrf;
        this.c = amrf;
        return amrf;
    }

    public final void a() {
        this.d = true;
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (amrf amrf = this.b.c; amrf != null; amrf = amrf.c) {
            Object obj = amrf.b;
            if (!z || obj != null) {
                sb.append(str);
                String str2 = amrf.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final void a(Object obj) {
        b().b = obj;
    }

    public final void a(String str, double d2) {
        a(str, (Object) String.valueOf(d2));
    }

    public final void a(String str, int i) {
        a(str, (Object) String.valueOf(i));
    }

    public final void a(String str, long j) {
        a(str, (Object) String.valueOf(j));
    }

    public final void a(String str, Object obj) {
        amrf b2 = b();
        b2.b = obj;
        amrl.a((Object) str);
        b2.a = str;
    }

    public final void a(String str, boolean z) {
        a(str, (Object) String.valueOf(z));
    }
}
