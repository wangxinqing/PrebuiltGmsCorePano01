package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract long a();

    public abstract StatsEvent a(StatsEvent statsEvent);

    public abstract int b();

    public abstract String c();

    public abstract long d();

    public abstract long e();

    public abstract String f();

    public abstract void g();

    public final String toString() {
        long a = a();
        int b = b();
        long d = d();
        String f = f();
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(d);
        sb.append(f);
        return sb.toString();
    }
}
