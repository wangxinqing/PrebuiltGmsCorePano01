package defpackage;

import android.content.Context;

/* renamed from: cby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cby extends cbv {
    private final atxw f;

    public cby(Context context, bsz bsz, atxw atxw, cbm cbm, but but) {
        super(context, "ReadFootprintsContextTask", bsz, "readfootprintscontext", 12550, 11, atqg.d, awwb.b(), cbm, but, (String) null);
        this.f = atxw;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ atqk a(audx audx) {
        atqk atqk = ((atqg) audx).a;
        return atqk == null ? atqk.c : atqk;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c() {
        aucd o = atqf.d.o();
        atqj a = cbn.a(this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqf atqf = (atqf) o.b;
        a.getClass();
        atqf.b = a;
        int i = atqf.a | 1;
        atqf.a = i;
        atxw atxw = this.f;
        if (atxw != null) {
            atxw.getClass();
            atqf.c = atxw;
            atqf.a = i | 2;
        }
        return (atqf) o.i();
    }
}
