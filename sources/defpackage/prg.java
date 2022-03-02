package defpackage;

import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: prg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class prg implements acvp {
    private final prh a;
    private final dux b;
    private final ActionImpl[] c;
    private final oxb d;

    public prg(prh prh, dux dux, ActionImpl[] actionImplArr, oxb oxb) {
        this.a = prh;
        this.b = dux;
        this.c = actionImplArr;
        this.d = oxb;
    }

    public final void a(acwa acwa) {
        String str;
        prh prh = this.a;
        dux dux = this.b;
        ActionImpl[] actionImplArr = this.c;
        oxb oxb = this.d;
        aolx aolx = aolx.NO_ERROR;
        Exception e = acwa.e();
        if (e == null) {
            str = null;
        } else {
            if (e instanceof oxa) {
                aolx = ((oxa) e).a;
            } else {
                aolx = aolx.INTERNAL_ERROR;
            }
            str = e.getMessage();
        }
        prh.a(dux, actionImplArr, aolx, oxb.a, str);
    }
}
