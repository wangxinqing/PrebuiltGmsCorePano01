package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: goj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class goj {
    public static final iwd a = ehv.a("MetricsLogger");
    public final goh b;
    public final fya c;
    private final Context d;

    public goj(Context context) {
        this.d = context.getApplicationContext();
        if (goh.b == null) {
            goh.b = new goh(context);
        }
        this.b = goh.b;
        this.c = fyp.b(this.d);
    }

    public static final String a(Context context) {
        String valueOf = String.valueOf(context.getFilesDir());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append("/auth_account_metrics");
        return sb.toString();
    }

    private final void c(anon anon) {
        if (goi.a == null) {
            goi.a = new goi();
        }
        acwa o = adrz.b(this.d).o();
        o.a((acvv) new god(this, anon));
        o.a((acvs) new goe(this));
        o.a((acvm) new gof(this));
    }

    public final void b(anon anon) {
        if (aljz.a(this.d)) {
            c(anon);
        }
    }

    public final void a(anon anon) {
        if (!aljz.a(this.d)) {
            aljv a2 = aljv.a(this.d);
            String a3 = a(this.d);
            aoru b2 = jfm.b(9);
            aoqw.c(aorl.a((Object) null));
            aljy a4 = aljy.a(a2.a, b2);
            if (a3 != null) {
                File file = new File(a4.c, a3);
                if (file.exists() || file.mkdirs()) {
                    a4.b = file;
                } else {
                    alkd alkd = aljy.a;
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Unable to create subdirectory = ");
                    sb.append(valueOf);
                    alkd.b(sb.toString());
                }
            }
            aorl.a(a4.a(anon.k()), new gog(this), jfm.b(9));
            return;
        }
        jix.g(this.d);
        c(anon);
    }
}
