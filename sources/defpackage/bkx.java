package defpackage;

import android.os.Build;
import com.google.android.chimera.ContentProvider;

/* renamed from: bkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkx extends bow {
    public bkx() {
        super(ContentProvider.class, 0);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bou bou, apxg apxg, String str, bov bov) {
        brz brz;
        int d;
        bky bky = (bky) bou;
        int d2 = apxg.d(20);
        String str2 = null;
        if (d2 != 0) {
            brz = brz.a((brz) null, apxg.h(d2), str, apxg.d);
        } else {
            brz = null;
        }
        boolean z = false;
        if (brz != null) {
            bov.c = brz.T();
            int d3 = brz.d(6);
            if (d3 != 0) {
                str2 = brz.f(d3 + brz.c);
            }
            bov.d = str2;
            String[] strArr = bky.a;
            if (bky.c && ((d = brz.d(10)) == 0 || brz.d.get(d + brz.c) == 0)) {
                z = true;
            }
            bov.g = z;
            return true;
        } else if (Build.VERSION.SDK_INT >= 28) {
            return false;
        } else {
            String[] strArr2 = bky.a;
            return bnd.a(bky.c, apxg, str, bov);
        }
    }
}
