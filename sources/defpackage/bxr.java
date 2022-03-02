package defpackage;

import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxr implements cjn {
    public final HashMap a = new HashMap();

    public final void a(bsz bsz, juj juj) {
        if (bsz == null && juj.a() == 4) {
            try {
                byte[] c = juj.c();
                aubs c2 = aubs.c();
                this.a.put(juj.d().b(), (atpa) aucj.a((aucj) atpa.c, c, c2));
                new Object[1][0] = juj.d().b();
            } catch (auda e) {
                anih anih = (anih) bxk.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("bxr", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[KeyStore] Could not parse device registration from feature.");
            }
        }
    }

    public final byte[] a(String str) {
        iva.c(str);
        boolean containsKey = this.a.containsKey(str);
        atpa atpa = (atpa) this.a.get(str);
        if (atpa == null) {
            if (containsKey) {
                return null;
            }
            juk juk = new juk((bsz) null);
            juu juu = new juu();
            juu.b();
            TimeFilterImpl a2 = juu.a();
            juo juo = new juo();
            juo.a(str);
            juk.a(4, a2, juo.a());
            ArrayList a3 = cbi.q().a(juk.a());
            if (a3.isEmpty()) {
                this.a.put(str, (Object) null);
                return null;
            }
            if (a3.size() > 1) {
                ((anih) ((anih) bxk.a.b()).a("bxr", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[KeyStore] Got more than one key.");
            }
            try {
                atpa atpa2 = (atpa) aucj.a((aucj) atpa.c, ((juj) a3.get(0)).c(), aubs.c());
                this.a.put(str, atpa2);
                atpa = atpa2;
            } catch (auda e) {
                anih anih = (anih) bxk.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("bxr", "a", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[KeyStore] Could not parse encryption key data.");
                return null;
            }
        }
        return atpa.b.k();
    }
}
