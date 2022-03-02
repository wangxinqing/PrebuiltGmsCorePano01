package com.google.android.gms.common.app;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignalHandler {
    public static boolean a;
    public Context b;

    public SignalHandler(Context context) {
        this.b = context;
    }

    public static native boolean installShushSignalHandlers(String str, int i, int i2, int i3, boolean z);
}
