package defpackage;

/* renamed from: bagf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bagf implements baei {
    final babj a;
    private final baeg b;

    public bagf(babj babj, baeg baeg) {
        amrl.a(!babj.a(), (Object) "error must not be OK");
        this.a = babj;
        this.b = baeg;
    }

    public final baef a(baaj baaj, baaf baaf, azxh azxh) {
        return new bage(this.a, this.b);
    }

    public final azyx b() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
