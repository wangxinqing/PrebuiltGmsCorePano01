package defpackage;

/* renamed from: apys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apys extends Exception {
    public apys(String str, Throwable th) {
        super(str, th);
        amrl.a((Object) th, (Object) "Must provide cause");
    }

    public apys(Throwable th) {
        super(th);
        amrl.a((Object) th, (Object) "Must provide cause");
    }
}
