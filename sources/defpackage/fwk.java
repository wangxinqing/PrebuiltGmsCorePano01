package defpackage;

/* renamed from: fwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwk {
    public int a = 1;

    public final void a(Object obj) {
        this.a = (this.a * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final void a(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
    }
}
