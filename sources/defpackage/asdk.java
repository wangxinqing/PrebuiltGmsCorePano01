package defpackage;

/* renamed from: asdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asdk extends asjt {
    final /* synthetic */ asdu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asdk(asdu asdu, String str, asjt... asjtArr) {
        super(str, asjtArr);
        this.a = asdu;
    }

    public final boolean b() {
        return (!this.a.c.contains("bluetoothEnabled") || this.a.c.getInt("discoverableTimeout", -1) == -1 || this.a.c.getInt("scanMode", -1) == -1 || this.a.c.getString("deviceName", (String) null) == null || this.a.c.getLong("updated", 0) == 0) ? false : true;
    }

    public final boolean c() {
        if (!this.a.e.b()) {
            ((anih) ((anih) asil.a.b()).a("asdk", "c", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Cannot save user prefs if enabled state not saved.");
            return false;
        } else if (!this.a.g.b()) {
            ((anih) ((anih) asil.a.b()).a("asdk", "c", 173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Cannot save user prefs if bluetooth not enabled.");
            return false;
        } else {
            int l = this.a.b.l();
            int d = this.a.b.d();
            if (d == 23 && l != 0) {
                d = 21;
            }
            asdu asdu = this.a;
            return asdu.a(asdu.c.edit().putInt("discoverableTimeout", l).putInt("scanMode", d).putString("deviceName", this.a.b.j()), "save name and discoverable state");
        }
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
