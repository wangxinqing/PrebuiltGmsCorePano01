package defpackage;

/* renamed from: hlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlz extends hlv {
    private final auef c;

    public hlz(auef auef, String str) {
        super(str, ampu.a);
        iva.a((Object) auef);
        this.c = auef;
    }

    public final /* bridge */ /* synthetic */ amri a(Object obj) {
        amri amri = (amri) obj;
        return amri.a() ? amri.b(((audx) amri.b()).k()) : ampu.a;
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return amri.b((audx) this.c.b(bArr, aubs.c()));
        } catch (auda e) {
            throw new hjm(769, "Failed to parse the proto.", e);
        }
    }
}
