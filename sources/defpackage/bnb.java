package defpackage;

import com.google.android.chimera.Service;

/* renamed from: bnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bnb extends bow {
    public bnb() {
        super(Service.class, 100);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bou bou, apxg apxg, String str, bov bov) {
        bsb b = apxg.b(str);
        if (b == null) {
            return false;
        }
        bov.c = b.T();
        int d = b.d(6);
        bov.d = d != 0 ? b.f(d + b.c) : null;
        return true;
    }
}
