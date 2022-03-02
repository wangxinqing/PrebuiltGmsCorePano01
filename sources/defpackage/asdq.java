package defpackage;

import java.util.UUID;

/* renamed from: asdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asdq extends asjt {
    final /* synthetic */ asdu a;
    private final tgh b;
    private final boolean c;
    private volatile boolean d;
    private final aseu f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public asdq(defpackage.asdu r5, defpackage.tgh r6, boolean r7, defpackage.aseu r8) {
        /*
            r4 = this;
            r4.a = r5
            java.lang.String r0 = r6.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "BleAdvertiseTokenState token="
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x001c
        L_0x0018:
            java.lang.String r0 = r2.concat(r0)
        L_0x001c:
            r1 = 2
            asjt[] r1 = new defpackage.asjt[r1]
            asjt r2 = r5.h
            r3 = 0
            r1[r3] = r2
            r2 = 1
            asjt r5 = r5.g
            r1[r2] = r5
            r4.<init>(r0, r1)
            r4.d = r3
            r4.b = r6
            r4.c = r7
            r4.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asdq.<init>(asdu, tgh, boolean, aseu):void");
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        if (!this.a.h.b()) {
            ((anih) ((anih) asil.a.b()).a("asdq", "c", 521, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Cannot set name if user settings not saved");
            return false;
        }
        if (this.f != aseu.BLE_ADVERTISE_MANUFACTURER_DATA) {
            this.d = this.a.b.a(asda.a, this.b.a, this.c, this.f);
        } else {
            this.d = this.a.b.a((UUID) null, this.b.a, this.c, this.f);
        }
        return this.d;
    }

    public final long d() {
        auyy auyy = this.a.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
