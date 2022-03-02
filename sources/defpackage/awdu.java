package defpackage;

/* renamed from: awdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdu implements awdt, awdn {
    public final Object a;

    static {
        new awdu((Object) null);
    }

    private awdu(Object obj) {
        this.a = obj;
    }

    public static awdt a(Object obj) {
        awdx.a(obj, "instance cannot be null");
        return new awdu(obj);
    }

    public final Object a() {
        return this.a;
    }
}
