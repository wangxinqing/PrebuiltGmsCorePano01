package defpackage;

/* renamed from: amzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amzl extends anaf implements amxe {
    public final /* bridge */ /* synthetic */ amxe a() {
        throw null;
    }

    public abstract amzl b();

    /* renamed from: c */
    public final anax values() {
        return b().keySet();
    }

    public final /* bridge */ /* synthetic */ amzn d() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amzk(this);
    }
}
