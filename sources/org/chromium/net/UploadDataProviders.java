package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new bauj(new baug(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new bauj(new bauf(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new bauh(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new bauh(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
