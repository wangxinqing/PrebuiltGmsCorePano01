package defpackage;

/* renamed from: ygb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygb {
    public static String a(String str) {
        int indexOf = str.indexOf(35);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    public static String b(String str) {
        return str.replace("_", "_u_").replace(".", "_d_").replace("#", "_p_");
    }

    public static apgj c(String str) {
        agxg b = ayyx.a.a().b();
        String valueOf = String.valueOf(b(str));
        return (apgj) b.a(valueOf.length() == 0 ? new String("ph_pkgcfg_") : "ph_pkgcfg_".concat(valueOf), apgj.d, yfz.a);
    }

    public static String a(String str, String str2) {
        String str3;
        String str4;
        if (amrk.a(str) || str.equals("com.google.EMPTY") || str.equals("all") || !azam.b() || "com.google.android.apps.mobileutilities".equals(str2)) {
            return str;
        }
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str3 = str.substring(0, indexOf);
            str4 = str.substring(indexOf + 1);
        } else {
            str3 = str;
            str4 = str2;
        }
        apgj c = c(str3);
        if ((c.a & 2) == 0) {
            return str;
        }
        apgh apgh = c.c;
        if (apgh == null) {
            apgh = apgh.b;
        }
        if (!apgh.a) {
            str2 = str4;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
        sb.append(str3);
        sb.append('#');
        sb.append(str2);
        return sb.toString();
    }
}
