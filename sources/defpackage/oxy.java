package defpackage;

import com.google.firebase.appindexing.internal.Thing;

/* renamed from: oxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxy extends Exception {
    public final aolx a;
    public final Thing b;

    public oxy(String str, aolx aolx) {
        super(str);
        this.b = null;
        this.a = aolx;
    }

    public oxy(String str, Thing thing, aolx aolx) {
        super(str);
        iva.a((Object) thing);
        this.b = thing;
        this.a = aolx;
    }

    public oxy(String str, Thing thing, aolx aolx, Throwable th) {
        super(str, th);
        iva.a((Object) thing);
        this.b = thing;
        this.a = aolx;
    }
}
