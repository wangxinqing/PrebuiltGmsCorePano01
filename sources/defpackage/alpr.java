package defpackage;

import java.util.HashMap;
import java.util.logging.Level;

/* renamed from: alpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpr implements alpw {
    public boolean a;
    public final alqr b;
    public final alpz c;
    public String d;
    public long e;
    public alpo f;
    public alpo g;
    public alpo h;
    public alpo i;

    public alpr() {
    }

    public final void a() {
        this.a = true;
        this.b.b();
    }

    public final alpx b() {
        String str = this.d;
        if (str != null) {
            return new alpx(str, this.e);
        }
        return null;
    }

    public alpr(alqf alqf, alpx alpx, alqt alqt, boolean z) {
        String str;
        this.e = -1;
        this.c = new alpz();
        HashMap hashMap = new HashMap();
        hashMap.put("VER", "8");
        String str2 = "0";
        if (alpx != null) {
            this.d = alpx.a;
            this.e = alpx.b;
            hashMap.put("SID", this.d);
            hashMap.put("AID", Long.toString(this.e));
            hashMap.put("RID", "rpc");
        } else {
            hashMap.put("RID", str2);
        }
        hashMap.put("CI", !z ? "1" : str2);
        alqx alqx = alpx == null ? alqx.POST : alqx.GET;
        if (alqx == alqx.POST) {
            str = "";
        } else {
            str = null;
        }
        alqr a2 = alqt.a(alqy.a(alqf, alqf.d.a(alqc.BIND), hashMap, alqx, str));
        this.b = a2;
        a2.a(new alps(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(alpv alpv) {
        alrg alrg;
        alpo alpo = this.h;
        if (!alpo.a.c()) {
            alpq.a.logp(Level.WARNING, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onError", "Error in bind request.", alpv.a);
            int i2 = alpv.d;
            if (i2 == 1) {
                alrg = alrg.FAILURE;
            } else if (i2 == 3) {
                alrg = alrg.BACKOFF;
            } else {
                alpo.a.b();
                alpo.a.f.a(alpv.d, alpv.b);
            }
            alpq alpq = alpo.a;
            alpq.e.a(alrg, new alpm(alpq, alpv.c));
            alpo.a.f.a(alpv.d, alpv.b);
        }
        a();
    }
}
