package defpackage;

/* renamed from: aqjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjp {
    public long a = 0;

    public final aqjq a() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, (Object) "Cannot init SeedBox with zero master seed");
        return new aqjq(this);
    }

    public final void a(long j) {
        this.a = j ^ this.a;
    }
}
