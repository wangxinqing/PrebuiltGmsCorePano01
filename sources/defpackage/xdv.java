package defpackage;

import android.content.Context;

/* renamed from: xdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xdv {
    private static xdv c;
    public final Context a;
    public final ybt b;

    private xdv(Context context) {
        this.a = context;
        this.b = ybt.a(context);
    }

    public static String a(long j, boolean z) {
        String valueOf = String.valueOf(j);
        String str = !z ? "" : "-PAGE";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8 + str.length());
        sb.append("DEFAULT-");
        sb.append(valueOf);
        sb.append(str);
        return sb.toString();
    }

    public static synchronized xdv a(Context context) {
        xdv xdv;
        synchronized (xdv.class) {
            if (c == null) {
                c = new xdv(context);
            }
            xdv = c;
        }
        return xdv;
    }

    public final yci a(int i, boolean z) {
        String str;
        wss a2 = wss.a(this.a);
        long b2 = a2.b(z);
        long a3 = ycm.a(this.a).a() / 1000;
        if (!z) {
            str = aywy.a.a().G();
        } else {
            str = aywy.a.a().I();
        }
        String a4 = ycc.a(str);
        String a5 = a(b2, z);
        if (a3 - b2 >= aywy.a.a().H() || !this.b.a(a5, (String) null, a4)) {
            String a6 = a(a3, z);
            a(a6, (String) null, str, true);
            if (this.b.a(a6, (String) null, a4) && !a5.equals(a6)) {
                this.b.a(a5, (String) null);
                iva.b((String) null);
                a2.a.edit().putLong(wss.a(z), a3).commit();
                a5 = a6;
            }
        }
        return this.b.a(a5, (String) null, ycc.a(str), i);
    }

    public final void a(String str, String str2, String str3, boolean z) {
        if (!this.b.a(str, str2, ycc.a(str3))) {
            wmz a2 = wmz.a(this.a);
            amrl.a((Object) str3);
            byte[] a3 = a2.a(ybt.a(str3, z, a2.a), true);
            if (a3 != null && a3 != wpc.c && a3 != wpc.d) {
                this.b.a(str, str2, ycc.a(str3), a3);
            }
        }
    }
}
