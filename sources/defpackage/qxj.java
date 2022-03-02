package defpackage;

import android.os.Bundle;

/* renamed from: qxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qxj extends qxx {
    public final long a;
    public final long b;

    public qxj(Bundle bundle) {
        super(bundle);
        this.a = bundle.getLong("period");
        this.b = Math.min(bundle.getLong("period_flex"), this.a);
    }

    public final void a(Bundle bundle, int i) {
        super.a(bundle, i);
        bundle.putLong("period", this.a);
        bundle.putLong("period_flex", this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qxj) && super.equals(obj)) {
            qxj qxj = (qxj) obj;
            if (this.a == qxj.a && this.b == qxj.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(j);
        sb.append(" flex=");
        sb.append(j2);
        return sb.toString();
    }

    public qxj(qxi qxi) {
        super((qxw) qxi);
        long j = qxi.a;
        this.a = j;
        this.b = Math.min(qxi.b, j);
    }
}
