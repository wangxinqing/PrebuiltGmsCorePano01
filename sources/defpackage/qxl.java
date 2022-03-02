package defpackage;

import android.os.Bundle;

/* renamed from: qxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qxl {
    public static final qxl a = new qxl(0, 30, 3600);
    public final int b;
    public final int c;
    public final int d;

    static {
        new qxl(1, 30, 3600);
    }

    public qxl(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static qxl a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        qxk qxk = new qxk();
        qxk.a = bundle.getInt("retry_policy");
        qxk.b = bundle.getInt("initial_backoff_seconds");
        qxk.c = bundle.getInt("maximum_backoff_seconds");
        return qxk.a();
    }

    public final void b(Bundle bundle) {
        bundle.putInt("retry_policy", this.b);
        bundle.putInt("initial_backoff_seconds", this.c);
        bundle.putInt("maximum_backoff_seconds", this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qxl) {
            qxl qxl = (qxl) obj;
            return qxl.b == this.b && qxl.c == this.c && qxl.d == this.d;
        }
    }

    public final int hashCode() {
        return (((((this.b + 1) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i);
        sb.append(" initial_backoff=");
        sb.append(i2);
        sb.append(" maximum_backoff=");
        sb.append(i3);
        return sb.toString();
    }
}
