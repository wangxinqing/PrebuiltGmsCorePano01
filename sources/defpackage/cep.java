package defpackage;

import android.content.Intent;

/* renamed from: cep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cep {
    public final attw a;
    public final double b;

    public cep(Intent intent) {
        double d = -1.0d;
        if (intent == null) {
            this.a = attw.UNKNOWN;
            this.b = -1.0d;
            return;
        }
        int intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra == 1) {
            this.a = attw.CONNECTED_AC;
        } else if (intExtra == 2) {
            this.a = attw.CONNECTED_USB;
        } else if (intExtra != 4) {
            this.a = attw.DISCONNECTED;
        } else {
            this.a = attw.CONNECTED_WIRELESS;
        }
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            double d2 = (double) intExtra2;
            double d3 = (double) intExtra3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        }
        this.b = d;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("plug", Integer.valueOf(this.a.f));
        a2.a("battery", Double.valueOf(this.b));
        return a2.toString();
    }
}
