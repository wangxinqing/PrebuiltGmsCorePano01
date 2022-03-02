package defpackage;

/* renamed from: apad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apad implements aouu {
    private final aouq a;

    public apad(aouq aouq) {
        this.a = aouq;
    }

    public final byte[] a(byte[] bArr) {
        aoup aoup = this.a.c;
        if (aoup.c == 4) {
            return apbg.a(aoup.a(), ((aouu) this.a.c.a).a(apbg.a(bArr, new byte[]{0})));
        }
        return apbg.a(aoup.a(), ((aouu) this.a.c.a).a(bArr));
    }
}
