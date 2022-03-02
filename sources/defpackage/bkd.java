package defpackage;

/* renamed from: bkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkd {
    public static int a(bnm bnm, boy boy) {
        int a = bnj.a(bnm.b);
        if (a == 0) {
            a = 1;
        }
        int a2 = (a - 1) - boy.a();
        if (a2 != 0 || (a2 = bnm.c.compareTo(boy.b())) != 0) {
            return a2;
        }
        long d = boy.d();
        long j = bnm.d;
        if (j < d) {
            return -1;
        }
        if (j > d) {
            return 1;
        }
        int h = boy.h();
        int i = bnm.h;
        if (i < h) {
            return -1;
        }
        if (i <= h) {
            return 0;
        }
        return 1;
    }

    public static int a(boy boy, boy boy2, boolean z) {
        if (boy == boy2) {
            return 0;
        }
        int a = boy.a() - boy2.a();
        if (a != 0 || (a = boy.c().compareTo(boy2.c())) != 0) {
            return a;
        }
        if (z) {
            long d = boy.d();
            long d2 = boy2.d();
            if (d < d2) {
                return -1;
            }
            if (d > d2) {
                return 1;
            }
            int h = boy.h();
            int h2 = boy2.h();
            if (h < h2) {
                return -1;
            }
            if (h > h2) {
                return 1;
            }
        }
        return 0;
    }

    public static String a(bnm bnm) {
        int a = bnj.a(bnm.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return "ApkDescriptor(CONTAINER)";
        }
        if (i == 2) {
            String str = bnm.f;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
            sb.append("ApkDescriptor(INSTALLED, ");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        } else if (i == 3) {
            String str2 = bnm.c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb2.append("ApkDescriptor(FILE, ");
            sb2.append(str2);
            sb2.append(")");
            return sb2.toString();
        } else if (i != 4) {
            return "ApkDescriptor(UNKNOWN)";
        } else {
            String str3 = bnm.n;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22);
            sb3.append("ApkDescriptor(SPLIT, ");
            sb3.append(str3);
            sb3.append(")");
            return sb3.toString();
        }
    }
}
