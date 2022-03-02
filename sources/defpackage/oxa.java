package defpackage;

import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: oxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxa extends Exception {
    public final aolx a;
    public final aolv b;
    public final ActionImpl c;

    public oxa(aolv aolv, String str, ActionImpl actionImpl, aolx aolx) {
        super(str);
        iva.a((Object) actionImpl);
        this.b = aolv;
        this.c = actionImpl;
        this.a = aolx;
    }

    public oxa(aolv aolv, String str, ActionImpl actionImpl, aolx aolx, Throwable th) {
        super(str, th);
        iva.a((Object) actionImpl);
        this.b = aolv;
        this.c = actionImpl;
        this.a = aolx;
    }

    public oxa(String str, aolx aolx) {
        super(str);
        this.b = aolv.ACTION_START;
        this.c = null;
        this.a = aolx;
    }

    public oxa(String str, ActionImpl actionImpl, aolx aolx) {
        super(str);
        iva.a((Object) actionImpl);
        this.b = aolv.ACTION_START;
        this.c = actionImpl;
        this.a = aolx;
    }
}
