package defpackage;

/* renamed from: asde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asde extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asde(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    private final boolean e() {
        return this.a.c.getBoolean("bluetoothEnabled", true);
    }

    public final boolean b() {
        if (!this.a.e.b() || e() || !this.a.b.k()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (!this.a.c.contains("bluetoothEnabled")) {
            jjg jjg = asil.a;
            return true;
        }
        jjg jjg2 = asil.a;
        e();
        this.a.b.k();
        if (!e()) {
            return this.a.b.h();
        }
        return true;
    }

    public final long d() {
        if (!e()) {
            auyo auyo = this.a.a.b.g;
            if (auyo == null) {
                auyo = auyo.j;
            }
            return auyo.c;
        }
        auyo auyo2 = this.a.a.b.g;
        if (auyo2 == null) {
            auyo2 = auyo.j;
        }
        return auyo2.d;
    }
}
