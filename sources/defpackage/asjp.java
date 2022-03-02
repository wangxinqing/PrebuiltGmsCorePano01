package defpackage;

import android.content.Context;

/* renamed from: asjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asjp implements asjb {
    public final asgk a;
    public ashv b;
    private final ashu c;

    public asjp(Context context, asgk asgk) {
        this.c = (ashu) thl.a(context, ashu.class);
        this.a = asgk;
    }

    public final ashq a(asgs asgs) {
        ashu ashu = this.c;
        asfn asfn = this.a.b;
        if (asfn == null) {
            asfn = asfn.d;
        }
        ashv ashv = (ashv) ashu.a.get(asfn.b);
        this.b = ashv;
        if (ashv != null) {
            return new asjo(this);
        }
        throw new RuntimeException("Connection does not exist.");
    }

    public final /* bridge */ /* synthetic */ audx c() {
        return asgl.c;
    }

    public final void a(asiz asiz) {
        asiz.a();
    }
}
