package defpackage;

/* renamed from: adri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adri {
    public final String a;
    public final Object b;

    protected adri(String str, Object obj) {
        iva.c(str);
        this.a = str;
        this.b = obj;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(String str);

    /* access modifiers changed from: protected */
    public abstract String a(Object obj);

    public final adrc b(Object obj) {
        return new adrc(this, obj);
    }
}
