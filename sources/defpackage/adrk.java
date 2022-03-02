package defpackage;

/* renamed from: adrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrk extends adri {
    private static final iwd c = adnt.h("LongKey");

    public adrk(String str, Long l) {
        super(str, l);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(String str) {
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            c.d("Unable to parse value: %s.", str);
            return (Long) this.b;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return ((Long) obj).toString();
    }
}
