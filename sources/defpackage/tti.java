package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: tti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class tti extends thj {
    public tti(Context context, String str) {
        super(context, "nearby-discovery", str);
    }

    public abstract boolean b(audx audx);

    public abstract boolean c(audx audx);

    /* access modifiers changed from: protected */
    public final boolean d(audx audx) {
        return !b(audx) && super.d(audx);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        for (audx audx : d()) {
            if (!b(audx)) {
                d(audx);
            }
        }
    }

    public final Collection f() {
        ArrayList arrayList = new ArrayList();
        for (audx audx : d()) {
            if (c(audx)) {
                arrayList.add(audx);
            }
        }
        return arrayList;
    }
}
