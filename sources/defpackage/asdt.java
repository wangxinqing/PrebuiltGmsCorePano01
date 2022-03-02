package defpackage;

/* renamed from: asdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asdt extends asjt {
    final String a;
    final /* synthetic */ asdu b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public asdt(defpackage.asdu r5, java.lang.String r6) {
        /*
            r4 = this;
            r4.b = r5
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r1 = r0.length()
            java.lang.String r2 = "Name="
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0018
        L_0x0014:
            java.lang.String r0 = r2.concat(r0)
        L_0x0018:
            r1 = 2
            asjt[] r1 = new defpackage.asjt[r1]
            r2 = 0
            asjt r3 = r5.h
            r1[r2] = r3
            r2 = 1
            asjt r5 = r5.g
            r1[r2] = r5
            r4.<init>(r0, r1)
            r4.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asdt.<init>(asdu, java.lang.String):void");
    }

    public final boolean b() {
        return this.a.equals(this.b.b.j());
    }

    public final boolean c() {
        if (this.b.h.b()) {
            return this.b.b.a(this.a);
        }
        ((anih) ((anih) asil.a.b()).a("asdt", "c", 381, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothStates: Cannot set name if user settings not saved");
        return false;
    }

    public final long d() {
        auyy auyy = this.b.a.b.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.j;
    }
}
