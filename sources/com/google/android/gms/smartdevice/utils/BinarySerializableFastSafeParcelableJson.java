package com.google.android.gms.smartdevice.utils;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BinarySerializableFastSafeParcelableJson extends FastSafeParcelableJsonResponse {
    public final void e(byte[] bArr) {
        try {
            new jas().a((InputStream) new ByteArrayInputStream(bArr), (jag) this);
        } catch (jaq e) {
            throw new acpi(e.getMessage());
        }
    }

    public final byte[] h() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("SmartDevice", "Error serializing object.", e);
            return null;
        }
    }
}
