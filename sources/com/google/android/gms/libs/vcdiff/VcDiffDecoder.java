package com.google.android.gms.libs.vcdiff;

import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VcDiffDecoder {
    public static boolean a;

    static {
        a = false;
        try {
            System.loadLibrary("vcdiffjni");
            a = true;
        } catch (Throwable th) {
            Log.e("VcDiffDecoder: ", "Unable to load vcdiffjni.so", th);
        }
    }

    public static native byte[] nativeDecoder(byte[] bArr, byte[] bArr2);
}
