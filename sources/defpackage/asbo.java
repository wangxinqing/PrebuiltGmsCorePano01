package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: asbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbo extends ashi {
    private final Context a;

    public asbo(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ashv a(asfs asfs) {
        if ((asfs.a & 16) == 0) {
            return null;
        }
        asft asft = asfs.e;
        if (asft == null) {
            asft = asft.c;
        }
        String a2 = asgt.a(asft.b.k());
        jjg jjg = asil.a;
        return new asbn(this.a, true, a2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ashv a(asfs asfs, Set set) {
        asft asft = asfs.e;
        if (asft == null) {
            asft = asft.c;
        }
        if ((asft.a & 1) != 0) {
            asft asft2 = asfs.e;
            if (asft2 == null) {
                asft2 = asft.c;
            }
            String a2 = asgt.a(asft2.b.k());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                asbn asbn = (asbn) it.next();
                if (asbn.a.equals(a2)) {
                    jjg jjg = asil.a;
                    return asbn;
                }
            }
            return null;
        }
        asfw asfw = asfs.c;
        if (asfw == null) {
            asfw = asfw.c;
        }
        if ((asfw.a & 1) == 0) {
            return null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            asbn asbn2 = (asbn) it2.next();
            asfw asfw2 = asfs.c;
            if (asfw2 == null) {
                asfw2 = asfw.c;
            }
            if (asfw2.equals(asbn2.g())) {
                jjg jjg2 = asil.a;
                asfw asfw3 = asfs.c;
                if (asfw3 == null) {
                    asfw3 = asfw.c;
                }
                String str = asfw3.b;
                return asbn2;
            }
        }
        return null;
    }
}
