package defpackage;

import android.text.TextUtils;

/* renamed from: asdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdd extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdd(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    private final String e() {
        String string = this.a.c.getString("deviceName", (String) null);
        if (string == null) {
            ((anih) ((anih) asil.a.b()).a("asdd", "e", 617, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: User bluetooth state not stored.");
        }
        return string;
    }

    public final asjt a() {
        if (!this.a.h.b() || this.a.g.b()) {
            return null;
        }
        return this.a.g;
    }

    public final boolean b() {
        if (this.a.h.b()) {
            return TextUtils.equals(e(), this.a.b.j());
        }
        return true;
    }

    public final boolean c() {
        if (this.a.h.b()) {
            return this.a.b.a(e());
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
