package defpackage;

import android.content.Context;
import com.google.android.chimera.Loader;

/* renamed from: abmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abmh extends Loader implements icm {
    private final String a;
    private final String b;
    private final iby c;

    public abmh(Context context, String str, String str2, int i) {
        super(context);
        wlr a2 = wls.a();
        a2.a = i;
        this.c = wlt.d(context, a2.a());
        this.a = str;
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        xfh b2;
        wla wla = (wla) icl;
        if (wla.aO().c() && (b2 = wla.b()) != null) {
            try {
                int a2 = b2.a();
                for (int i = 0; i < a2; i++) {
                    xaa b3 = b2.a(i);
                    if (this.a.equals(b3.c())) {
                        String str = this.b;
                        if (str != null) {
                            if (str.equals(b3.j())) {
                            }
                        }
                        deliverResult(new abmg(b3.h()));
                        return;
                    }
                }
                b2.c();
            } finally {
                b2.c();
            }
        }
        deliverResult((Object) null);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        if (this.a == null) {
            deliverResult((Object) null);
            return;
        }
        takeContentChanged();
        wkz wkz = new wkz();
        wkz.b = true;
        this.c.a(wkz).a((icm) this);
    }
}
