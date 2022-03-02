package defpackage;

import android.util.Log;

/* renamed from: iog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iog extends imt {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public iog() {
        /*
            r3 = this;
            java.lang.String r0 = defpackage.jkt.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "RestartProcessFix_"
            if (r1 != 0) goto L_0x0016
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x001a
        L_0x0016:
            java.lang.String r0 = r2.concat(r0)
        L_0x001a:
            awyw r1 = defpackage.awyw.a
            awyx r1 = r1.a()
            long r1 = r1.C()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iog.<init>():void");
    }

    public final boolean a(inb inb) {
        return awyw.a.a().B();
    }

    public final inb b(inb inb) {
        String valueOf = String.valueOf(this.a);
        Log.w("RestartProcessFix", valueOf.length() == 0 ? new String("Applying ") : "Applying ".concat(valueOf));
        ina d = inb.d();
        d.j = true;
        d.a(this, 3);
        return d.a();
    }
}
