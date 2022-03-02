package defpackage;

import android.text.TextUtils;

/* renamed from: exy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exy implements aoqb {
    private final eyf a;

    public exy(eyf eyf) {
        this.a = eyf;
    }

    public final aorr a(Object obj) {
        eyf eyf = this.a;
        Void voidR = (Void) obj;
        if ((awnv.a.a().d() || TextUtils.isEmpty(eyf.n.g.f)) && eyf.o.size() > 1 && eyf.n.a()) {
            return aorl.a((Object) amri.b(qcp.COMPLETE_SIGN_IN_AND_START_CONFIRMATION));
        }
        eyf.k.c(2);
        eyf.i.c(amzy.a((Object) eyf.n));
        return eyf.a(qcp.COMPLETE_SIGN_IN_AND_START_CONFIRMATION);
    }
}
