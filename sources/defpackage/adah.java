package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: adah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adah implements afun {
    private final adai a;

    public adah(adai adai) {
        this.a = adai;
    }

    public final aorr a() {
        atxi atxi;
        adai adai = this.a;
        adev adev = adai.c;
        ClientContext clientContext = adai.b;
        if (adai.l.a()) {
            atxi atxi2 = adai.k;
            aucd aucd = (aucd) atxi2.c(5);
            aucd.a((aucj) atxi2);
            atvp b = adai.l.b();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            atxi atxi3 = (atxi) aucd.b;
            atxi atxi4 = atxi.f;
            b.getClass();
            atxi3.c = b;
            atxi3.a |= 4;
            atxi = (atxi) aucd.i();
        } else {
            atxi = adai.k;
        }
        return aorl.a((Object) adev.a(clientContext, atxi, false));
    }
}
