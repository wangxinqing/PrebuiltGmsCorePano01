package defpackage;

import com.google.android.chimera.BroadcastReceiver;

/* renamed from: bkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkk extends bow {
    public bkk() {
        super(BroadcastReceiver.class, 200);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bou bou, apxg apxg, String str, bov bov) {
        bsa bsa;
        int d = apxg.d(18);
        String str2 = null;
        if (d != 0) {
            bsa = bsa.a((bsa) null, apxg.h(d), str, apxg.d);
        } else {
            bsa = null;
        }
        if (bsa == null) {
            return false;
        }
        bov.c = bsa.T();
        int d2 = bsa.d(6);
        if (d2 != 0) {
            str2 = bsa.f(d2 + bsa.c);
        }
        bov.d = str2;
        return true;
    }
}
