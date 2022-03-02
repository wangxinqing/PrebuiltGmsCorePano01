package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object a = new Object();

    public static Integer aW() {
        synchronized (a) {
        }
        return null;
    }

    public static boolean aX() {
        synchronized (a) {
        }
        return true;
    }
}
