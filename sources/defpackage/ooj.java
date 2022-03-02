package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ooj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ooj implements Runnable {
    final /* synthetic */ ook a;

    public ooj(ook ook) {
        this.a = ook;
    }

    public final void run() {
        oab a2;
        ook ook = this.a;
        nzu nzu = ook.a;
        nzu.k();
        if (!jkf.b(((Context) nzu).getApplicationContext())) {
            for (oab oab : ook.d) {
                if ((TextUtils.isEmpty(oab.b) || oab.e() || oab.k()) && !oab.q && (a2 = omu.a(ook.a, oab, false, ook.c)) != null) {
                    if (!a2.i()) {
                        ook.b.a(a2, ook.a.f().b);
                        oab.l = a2.l;
                        ook.b.b(oab, ook.a.f().b);
                    }
                    oab.q = true;
                }
            }
        }
    }
}
