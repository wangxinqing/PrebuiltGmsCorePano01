package com.google.android.gms.libs.vcdiff;

import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class VcDiffEncoderDecoder {
    private static final boolean a = a();

    static boolean a() {
        try {
            System.loadLibrary("vcdiffjni");
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            Log.e("VcDiffEncoderDecoder", "Unable to load vcdiffjni.so", e);
            return false;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (!a) {
            throw new IllegalStateException("Native vcdiff library failed to initialize");
        } else if (bArr == null) {
            throw new NullPointerException("dictionary should not be null");
        } else if (bArr2 != null) {
            try {
                byte[] nativeEncoder = nativeEncoder(bArr, bArr2);
                if (nativeEncoder != null) {
                    return nativeEncoder;
                }
                throw new rbp("Encoding failed");
            } catch (UnsatisfiedLinkError e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new NullPointerException("target should not be null");
        }
    }

    private static native byte[] nativeDecoder(byte[] bArr, byte[] bArr2);

    private static native byte[] nativeEncoder(byte[] bArr, byte[] bArr2);

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (!a) {
            throw new IllegalStateException("Native vcdiff library failed to initialize");
        } else if (bArr == null) {
            throw new NullPointerException("dictionary should not be null");
        } else if (bArr2 != null) {
            try {
                byte[] nativeDecoder = nativeDecoder(bArr, bArr2);
                if (nativeDecoder != null) {
                    return nativeDecoder;
                }
                throw new rbp("Decoding failed");
            } catch (UnsatisfiedLinkError e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new NullPointerException("encoded should not be null");
        }
    }
}
