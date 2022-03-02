package defpackage;

/* renamed from: imh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class imh {
    public final String a;

    protected imh(String str) {
        iva.c(str);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final String a() {
        String str = this.a;
        return str.substring(0, Math.min(str.length(), 23));
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(inb inb);
}
