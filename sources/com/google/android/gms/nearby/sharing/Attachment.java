package com.google.android.gms.nearby.sharing;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Attachment extends AbstractSafeParcelable {
    public abstract long a();

    public abstract int b();

    public final boolean c() {
        return f() == 2;
    }

    public final boolean d() {
        return f() == 3;
    }

    public final boolean e() {
        return f() == 4;
    }

    public abstract int f();
}
