package defpackage;

/* renamed from: adrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrj extends adri {
    private static final iwd c = adnt.h("LiteProtoKey");
    private final audx d;

    public adrj(String str, audx audx) {
        super(str, ampu.a);
        this.d = audx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(String str) {
        try {
            return !str.isEmpty() ? amri.b(this.d.ay().a(jhy.a(str)).i()) : ampu.a;
        } catch (auda e) {
            c.e("Unable to parse the proto value.", e, new Object[0]);
            return ampu.a;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        amri amri = (amri) obj;
        return amri.a() ? jhy.b(((audx) amri.b()).k()) : "";
    }
}
