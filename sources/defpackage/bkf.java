package defpackage;

import com.google.android.chimera.BackupAgent;

/* renamed from: bkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkf extends bow {
    public bkf() {
        super(BackupAgent.class, 1);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bou bou, apxg apxg, String str, bov bov) {
        apxg O = apxg.O();
        int i = 0;
        if (O == null) {
            return false;
        }
        int d = O.d(6);
        if (d != 0) {
            i = O.d.getInt(d + O.c);
        }
        bov.c = i;
        int d2 = O.d(4);
        bov.d = d2 != 0 ? O.f(d2 + O.c) : null;
        return true;
    }
}
