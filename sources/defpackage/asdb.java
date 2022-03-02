package defpackage;

/* renamed from: asdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdb extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdb(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    private final int e() {
        int i = this.a.c.getInt("discoverableTimeout", -1);
        if (i != -1) {
            return i;
        }
        ((anih) ((anih) asil.a.b()).a("asdb", "e", 482, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: User discoverable timeout not stored.");
        return -1;
    }

    private final int f() {
        int i = this.a.c.getInt("scanMode", -1);
        if (i != -1) {
            return i;
        }
        ((anih) ((anih) asil.a.b()).a("asdb", "f", 490, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Scan mode not stored.");
        return -1;
    }

    public final asjt a() {
        if (this.a.h.b() && !this.a.g.b()) {
            return this.a.g;
        }
        if (!this.a.h.b() || this.a.n.b()) {
            return null;
        }
        return this.a.n;
    }

    public final boolean b() {
        if (!this.a.h.b()) {
            return true;
        }
        if (this.a.b.k() && e() == this.a.b.l() && f() == this.a.b.d()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.a.h.b()) {
            return this.a.b.a(f(), e());
        }
        return true;
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
