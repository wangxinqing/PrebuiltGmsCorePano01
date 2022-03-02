package defpackage;

/* renamed from: aesz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aesz {
    private amzt a;
    private amzy b;

    public final aeta a() {
        amzt amzt = this.a;
        if (amzt != null) {
            this.b = amzt.a();
        } else if (this.b == null) {
            this.b = amzy.h();
        }
        return new aesr(this.b);
    }

    public final void a(byte[] bArr, int i) {
        if (this.a == null) {
            this.a = amzy.j();
        }
        this.a.c(new aesv(bArr, i));
    }
}
