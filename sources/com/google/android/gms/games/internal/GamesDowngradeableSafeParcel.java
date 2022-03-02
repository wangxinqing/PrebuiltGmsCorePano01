package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    public static boolean a(Integer num) {
        return num != null && num.intValue() >= 3200000;
    }
}
