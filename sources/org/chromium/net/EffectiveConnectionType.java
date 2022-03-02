package org.chromium.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public @interface EffectiveConnectionType {
    public static final int TYPE_2G = 3;
    public static final int TYPE_3G = 4;
    public static final int TYPE_4G = 5;
    public static final int TYPE_LAST = 6;
    public static final int TYPE_OFFLINE = 1;
    public static final int TYPE_SLOW_2G = 2;
    public static final int TYPE_UNKNOWN = 0;
}
