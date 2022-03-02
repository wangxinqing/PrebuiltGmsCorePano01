package defpackage;

import android.graphics.Typeface;

/* renamed from: ajxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajxv extends ajyr {
    final /* synthetic */ ajxx a;

    public ajxv(ajxx ajxx) {
        this.a = ajxx;
    }

    public final void a(int i) {
        this.a.f = true;
        ajxw ajxw = (ajxw) this.a.c.get();
        if (ajxw != null) {
            ajxw.c();
        }
    }

    public final void a(Typeface typeface, boolean z) {
        if (!z) {
            this.a.f = true;
            ajxw ajxw = (ajxw) this.a.c.get();
            if (ajxw != null) {
                ajxw.c();
            }
        }
    }
}
