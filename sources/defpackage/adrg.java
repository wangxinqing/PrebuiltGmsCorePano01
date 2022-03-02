package defpackage;

/* renamed from: adrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrg extends adri {
    private static final iwd c = adnt.h("IntegerKey");

    public adrg(String str, Integer num) {
        super(str, num);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            c.d("Unable to parse value: %s.", str);
            return (Integer) this.b;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return ((Integer) obj).toString();
    }
}
