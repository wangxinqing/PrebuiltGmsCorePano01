package defpackage;

import java.util.Arrays;

/* renamed from: oxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxe {
    private static final anaf d = anaf.a(1, "_no_gsa", 2, "", 3, "_cross_device");
    public final ovo a;
    public final String b;
    public final int c;

    public oxe(ovo ovo, String str, int i) {
        StringBuilder sb = new StringBuilder(69);
        sb.append("The scope of this indexable is not valid, scope value is ");
        sb.append(i);
        sb.append(".");
        iva.b(aplx.a(i), sb.toString());
        this.a = ovo;
        this.b = str;
        this.c = i;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_seq_table");
        return sb.toString();
    }

    public final String c() {
        String valueOf = String.valueOf(this.a.b);
        String valueOf2 = String.valueOf((String) d.get(Integer.valueOf(this.c)));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oxe) {
            oxe oxe = (oxe) obj;
            return ius.a(this.a.b, oxe.a.b) && ius.a(this.b, oxe.b) && ius.a(Integer.valueOf(this.c), Integer.valueOf(oxe.c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.b, this.b, Integer.valueOf(this.c)});
    }

    public static oxe a(String str, String str2, oyb oyb) {
        if (str.startsWith("internal.3p:")) {
            return b(str.substring(12), str2, oyb);
        }
        return null;
    }

    public static oxd b(String str) {
        int i;
        if (!str.endsWith("_no_gsa")) {
            i = str.endsWith("_cross_device") ? 3 : 2;
        } else {
            i = 1;
        }
        return new oxd(str.substring(0, str.length() - ((String) d.get(Integer.valueOf(i))).length()), i);
    }

    public static boolean a(String str) {
        return str.startsWith("internal.3p:");
    }

    public static oxe b(String str, String str2, oyb oyb) {
        oxd b2 = b(str);
        return new oxe(oyb.b(b2.a), str2, b2.b);
    }

    public final String a() {
        return a(c(), this.b);
    }

    public final String b() {
        String valueOf = String.valueOf(c());
        return valueOf.length() == 0 ? new String("internal.3p:") : "internal.3p:".concat(valueOf);
    }
}
