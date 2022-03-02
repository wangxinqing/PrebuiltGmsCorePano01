package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: psd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psd {
    private static psd c;
    auql a;
    aurc b;

    private psd() {
    }

    public static synchronized psd a(Context context) {
        psd psd;
        synchronized (psd.class) {
            if (c == null) {
                Context applicationContext = context.getApplicationContext();
                c = new psd();
                pru pru = new pru();
                pse pse = new pse(applicationContext);
                awdx.a(pse);
                pru.a = pse;
                awdx.a((Object) pru.a, pse.class);
                prv prv = new prv(pru.a);
                psd psd2 = c;
                psd2.a = (auql) prv.a.a();
                psd2.b = (aurc) prv.b.a();
            }
            psd = c;
        }
        return psd;
    }

    public static psc b(Context context) {
        psc psc;
        if (!axrm.b()) {
            return null;
        }
        psc psc2 = (psc) psj.a.get();
        if (psc2 != null) {
            psc = new psc(psc2.a);
            psc2.a.a(psc2.b, psc.b);
        } else {
            psc = null;
        }
        if (psc != null) {
            return psc;
        }
        String str = (String) ozx.bP.c();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        psd a2 = a(context);
        auql auql = a2.a;
        amrl.a((Object) str);
        if (!auql.a(str)) {
            auql auql2 = a2.a;
            auqi auqi = new auqi();
            auqi.a = str;
            auql2.a(new auqj(auqi.a));
        }
        return new psc(a2.a.b(str));
    }

    public final void a() {
        aurc aurc = this.b;
        aosh f = aosh.f();
        acwa a2 = aurc.c.a(aurc.a, aurc.b, new String[]{"SHERLOG"}, (byte[]) null);
        if (a2 == null) {
            f.b((Object) aura.TIMEOUT);
        } else {
            a2.a((acvp) new prz(f));
        }
    }
}
