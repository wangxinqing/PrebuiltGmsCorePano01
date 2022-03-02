package defpackage;

/* renamed from: aoxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoxh implements aoun {
    private final aouq a;
    private final byte[] b = {0};

    public aoxh(aouq aouq) {
        this.a = aouq;
    }

    public final byte[] a(byte[] bArr) {
        aoup aoup = this.a.c;
        if (aoup.c == 4) {
            return apbg.a(aoup.a(), ((aoun) this.a.c.a).a(apbg.a(bArr, this.b)));
        }
        return apbg.a(aoup.a(), ((aoun) this.a.c.a).a(bArr));
    }
}
