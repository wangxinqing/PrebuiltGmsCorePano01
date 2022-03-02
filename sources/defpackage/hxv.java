package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hxv {
    public static final hxv a = new hxv(true, (String) null, (Throwable) null);
    final boolean b;
    final String c;
    final Throwable d;

    public hxv(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    static hxv a(String str) {
        return new hxv(false, str, (Throwable) null);
    }

    public String a() {
        return this.c;
    }

    public final void b() {
        if (!this.b) {
            String a2 = a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 35);
            sb.append("GoogleCertificatesRslt: ");
            sb.append(a2);
            sb.append(" (go/gsrlt)");
            String sb2 = sb.toString();
            Throwable th = this.d;
            if (th != null) {
                throw new SecurityException(sb2, th);
            }
            throw new SecurityException(sb2);
        }
    }

    static hxv a(String str, Throwable th) {
        return new hxv(false, str, th);
    }

    static hxv a(Callable callable) {
        return new hxu(callable);
    }

    static String a(String str, hxm hxm, boolean z, boolean z2) {
        String str2;
        if (!z2) {
            str2 = "not whitelisted";
        } else {
            str2 = "debug cert rejected";
        }
        StringBuilder sb = new StringBuilder(17);
        sb.append("201216073.true");
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{str2, str, jjp.a(jhh.a("SHA-1").digest(((hxn) hxm).a)), Boolean.valueOf(z), sb.toString()});
    }
}
