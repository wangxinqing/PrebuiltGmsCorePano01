package defpackage;

/* renamed from: audq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class audq {
    public final audp a;

    private audq(aufw aufw, Object obj, aufw aufw2, Object obj2) {
        this.a = new audp(aufw, obj, aufw2, obj2);
    }

    static int a(audp audp, Object obj, Object obj2) {
        return aubx.a(audp.a, 1, obj) + aubx.a(audp.c, 2, obj2);
    }

    public static audq a(aufw aufw, Object obj, aufw aufw2, Object obj2) {
        return new audq(aufw, obj, aufw2, obj2);
    }

    static void a(aubk aubk, audp audp, Object obj, Object obj2) {
        aubx.a(aubk, audp.a, 1, obj);
        aubx.a(aubk, audp.c, 2, obj2);
    }
}
