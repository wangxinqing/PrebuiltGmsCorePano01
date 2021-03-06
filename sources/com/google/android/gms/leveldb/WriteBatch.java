package com.google.android.gms.leveldb;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WriteBatch extends NativeObject {
    private WriteBatch() {
        super(nativeCreate());
    }

    public static WriteBatch create() {
        if (LevelDb.b) {
            return new qua();
        }
        return new WriteBatch();
    }

    private static native void nativeBufferedPut(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeClear(long j);

    private static native long nativeCreate();

    private static native void nativeDelete(long j, byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native void nativePut(long j, byte[] bArr, byte[] bArr2);

    public void bufferedPut(byte[] bArr, byte[] bArr2) {
        assertOpen();
        nativeBufferedPut(this.mPtr, bArr, bArr2);
    }

    public void clear() {
        assertOpen();
        nativeClear(this.mPtr);
    }

    /* access modifiers changed from: protected */
    public void closeNativeObject() {
        nativeDestroy(this.mPtr);
    }

    public void delete(byte[] bArr) {
        assertOpen();
        nativeDelete(this.mPtr, bArr);
    }

    public void put(byte[] bArr, byte[] bArr2) {
        assertOpen();
        nativePut(this.mPtr, bArr, bArr2);
    }

    protected WriteBatch(long j) {
        super(j);
    }
}
