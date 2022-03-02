package defpackage;

import android.graphics.Bitmap;

/* renamed from: agbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agbn implements icm {
    private final agbo a;
    private final agcl b;

    public agbn(agbo agbo, agcl agcl) {
        this.a = agbo;
        this.b = agcl;
    }

    public final void a(icl icl) {
        agbo agbo = this.a;
        agcl agcl = this.b;
        wlj wlj = (wlj) icl;
        if (!wlj.aO().c() || wlj.b() == null) {
            agcl.a((Bitmap) null);
        } else {
            new agbj(wlj.b(), agcl).executeOnExecutor(agbo.a, new Void[0]);
        }
    }
}
