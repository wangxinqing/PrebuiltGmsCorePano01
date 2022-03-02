package defpackage;

import android.os.Bundle;

/* renamed from: qxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qxg extends qxx {
    public final long a;
    public final long b;

    public qxg(Bundle bundle) {
        super(bundle);
        this.a = bundle.getLong("window_start");
        this.b = bundle.getLong("window_end");
    }

    public final void a(Bundle bundle, int i) {
        super.a(bundle, i);
        bundle.putLong("window_start", this.a);
        bundle.putLong("window_end", this.b);
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(j);
        sb.append(" windowEnd=");
        sb.append(j2);
        return sb.toString();
    }

    public qxg(qxf qxf) {
        super((qxw) qxf);
        this.a = qxf.a;
        this.b = qxf.b;
    }
}
