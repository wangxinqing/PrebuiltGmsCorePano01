package defpackage;

import android.content.SharedPreferences;

/* renamed from: asdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdh extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdh(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        return this.a.c.contains("bluetoothEnabled");
    }

    public final boolean c() {
        SharedPreferences.Editor edit = this.a.c.edit();
        int e = this.a.b.e();
        boolean z = true;
        if (!(e == 11 || e == 12)) {
            z = false;
        }
        asdu asdu = this.a;
        SharedPreferences.Editor putBoolean = edit.putBoolean("bluetoothEnabled", z);
        StringBuilder sb = new StringBuilder(29);
        sb.append("save user enabled state ");
        sb.append(z);
        return asdu.a(putBoolean, sb.toString());
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
