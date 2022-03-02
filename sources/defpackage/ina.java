package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ina  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ina {
    public aogr a = aogr.UNKNOWN;
    public Context b;
    public inx c;
    public amzy d;
    public amzy e = amzy.h();
    public Map f = new HashMap();
    public ilu g;
    public imz h;
    public boolean i;
    public boolean j;

    public ina() {
        amzy amzy;
        if (!axbk.e()) {
            this.i = true;
            amzy = amzy.h();
        } else {
            this.i = false;
            amzy = null;
        }
        this.d = amzy;
    }

    public final inb a() {
        boolean z;
        if (this.a != aogr.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Entry Point must be set.");
        Context context = this.b;
        iva.a((Object) context);
        if (this.c == null) {
            this.c = new inv(context);
        }
        return new inb(this);
    }

    public final void a(imt imt, int i2) {
        a(imt, i2, (aogt) null);
    }

    public final void a(imt imt, int i2, aogt aogt) {
        if (this.f.containsKey(imt.a)) {
            a(new imu(imt.a, i2, aogt));
            return;
        }
        String str = imt.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
        sb.append("Status of '");
        sb.append(str);
        sb.append("' cannot be updated since no original status was set.");
        throw new IllegalArgumentException(sb.toString());
    }

    public ina(inb inb) {
        this.a = inb.a;
        this.b = inb.b;
        this.c = inb.c;
        this.d = inb.d;
        this.e = inb.e;
        amzy e2 = inb.f.values().e();
        for (int i2 = 0; i2 < e2.size(); i2++) {
            imu imu = (imu) e2.get(i2);
            this.f.put(imu.a, imu);
        }
        this.g = inb.g;
        this.h = inb.h;
        this.i = inb.i;
        this.j = inb.j;
    }

    public final void a(imu imu) {
        this.f.put(imu.a, imu);
    }
}
