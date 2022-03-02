package defpackage;

import android.view.View;

/* renamed from: dex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dex extends dev {
    public final void a(dhj dhj) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(aqpp aqpp);

    /* access modifiers changed from: protected */
    public final View aD() {
        return getView();
    }

    public final dhh c() {
        return new dhh(getClass().getName(), getFragmentManager().saveFragmentInstanceState(this));
    }

    public final boolean a(csl csl) {
        aqsr aqsr = csl.a.d;
        if (aqsr == null) {
            aqsr = aqsr.d;
        }
        if (aqsr.equals(aC())) {
            return a(csl.b());
        }
        return false;
    }
}
