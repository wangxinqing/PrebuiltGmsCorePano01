package defpackage;

import android.content.ContentResolver;

/* renamed from: xti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xti implements ax {
    private final xtl a;

    public xti(xtl xtl) {
        this.a = xtl;
    }

    public final void a(Object obj) {
        xtl xtl = this.a;
        acwa acwa = (acwa) obj;
        xtl.a(3, acwa);
        if (acwa.b()) {
            if (ayqr.b()) {
                ContentResolver.cancelSync(xtl.a, "com.android.contacts");
            }
            xtl.a(10, false);
            if (ayqs.d()) {
                xtl.e.a((aj) xtl);
            }
            xtl.e = xtl.b.c();
            xtl.e.a(xtl, new xsz(xtl));
            xtl.a();
        } else if (ayqs.e()) {
            xtl.c();
        }
    }
}
