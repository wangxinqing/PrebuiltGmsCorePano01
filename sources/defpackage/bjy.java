package defpackage;

import com.google.android.chimera.Activity;

/* renamed from: bjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjy extends bow {
    public bjy() {
        super(Activity.class, 25);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bou bou, apxg apxg, String str, bov bov) {
        apxg apxg2;
        int d = apxg.d(22);
        String str2 = null;
        if (d != 0) {
            apxg2 = apxg.a((apxg) null, apxg.h(d), str, apxg.d);
        } else {
            apxg2 = null;
        }
        if (apxg2 == null) {
            return false;
        }
        bov.c = apxg2.T();
        int d2 = apxg2.d(6);
        if (d2 != 0) {
            str2 = apxg2.f(d2 + apxg2.c);
        }
        bov.d = str2;
        return true;
    }
}
