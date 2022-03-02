package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class FenceState extends AbstractSafeParcelable {
    public static int a(boolean z) {
        return z ? 2 : 1;
    }

    public abstract int a();

    public abstract String b();

    public static String a(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 1) {
            return "FALSE";
        }
        if (i == 2) {
            return "TRUE";
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("unknown state = ");
        sb.append(i);
        return sb.toString();
    }
}
