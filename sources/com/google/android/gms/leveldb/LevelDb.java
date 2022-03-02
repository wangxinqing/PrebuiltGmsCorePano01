package com.google.android.gms.leveldb;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.leveldb.environment.LevelDbPlatform;
import java.io.File;
import java.util.NoSuchElementException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LevelDb extends NativeObject {
    static boolean b;
    final String a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Iterator extends NativeObject {
        public static final int ASCENDING = 0;
        public static final int DESCENDING = 1;
        private final Snapshot b;
        private boolean c = false;

        public Iterator(long j, Snapshot snapshot) {
            super(j);
            this.b = snapshot;
            if (snapshot != null) {
                snapshot.ref();
            }
            LevelDb.this.ref();
        }

        private final void a() {
            if (!this.c) {
                throw new NoSuchElementException();
            }
        }

        private native int nativeBufferedValue(long j, int i, byte[] bArr, byte[] bArr2);

        private native void nativeDestroy(long j);

        private native byte[] nativeKey(long j);

        private native boolean nativeNext(long j);

        private native boolean nativePrev(long j);

        private native boolean nativeSeek(long j, byte[] bArr);

        private native boolean nativeSeekToFirst(long j);

        private native boolean nativeSeekToLast(long j);

        private native byte[] nativeValue(long j);

        public boolean bufferedValue(int i, byte[] bArr, byte[] bArr2) {
            int nativeBufferedValue = nativeBufferedValue(this.mPtr, i, bArr, bArr2);
            this.c = nativeBufferedValue != 0;
            return nativeBufferedValue == 2;
        }

        /* access modifiers changed from: protected */
        public void closeNativeObject() {
            nativeDestroy(this.mPtr);
            Snapshot snapshot = this.b;
            if (snapshot != null) {
                snapshot.unref();
            }
            LevelDb.this.unref();
        }

        public boolean isValid() {
            assertOpen();
            return this.c;
        }

        public byte[] key() {
            assertOpen();
            a();
            return nativeKey(this.mPtr);
        }

        public void next() {
            assertOpen();
            a();
            this.c = nativeNext(this.mPtr);
        }

        public void prev() {
            assertOpen();
            a();
            this.c = nativePrev(this.mPtr);
        }

        public void seek(byte[] bArr) {
            assertOpen();
            if (bArr != null) {
                this.c = nativeSeek(this.mPtr, bArr);
                return;
            }
            throw null;
        }

        public void seekToFirst() {
            assertOpen();
            this.c = nativeSeekToFirst(this.mPtr);
        }

        public void seekToLast() {
            assertOpen();
            this.c = nativeSeekToLast(this.mPtr);
        }

        public String toString() {
            String str = LevelDb.this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
            sb.append("LevelDB.Iterator[");
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public byte[] value() {
            assertOpen();
            a();
            return nativeValue(this.mPtr);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Options {
        public int mBlockCacheCapacityBytes = 0;
        public int mBlockRestartInterval = 16;
        public int mBlockSize = FragmentTransaction.TRANSIT_ENTER_MASK;
        public int mBloomFilterBits = 10;
        public boolean mCreateIfMissing = true;
        public boolean mDeleteIfCorrupted = true;
        public boolean mErrorIfExists = false;
        public int mMaxOpenFiles = 80;
        public boolean mUseSnappy = true;
        public int mWriteBufferSize = 32768;
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Snapshot extends NativeObject {
        public Snapshot(long j) {
            super(j);
            LevelDb.this.ref();
        }

        /* access modifiers changed from: protected */
        public void closeNativeObject() {
            LevelDb.nativeReleaseSnapshot(LevelDb.this.mPtr, this.mPtr);
            LevelDb.this.unref();
        }

        public String toString() {
            String str = LevelDb.this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
            sb.append("LevelDB.Snapshot[");
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    static {
        b = false;
        try {
            b = !LevelDbPlatform.loadLibrary("leveldbjni");
        } catch (UnsatisfiedLinkError e) {
            b = true;
        }
    }

    protected LevelDb(long j, String str) {
        super(j);
        this.a = str;
    }

    public static void destroy(File file) {
        if (!b) {
            nativeDestroy(file.getPath());
        }
    }

    private static native void nativeClose(long j);

    private static native void nativeCompact(long j);

    private static native void nativeDelete(long j, byte[] bArr);

    private static native int nativeDeleteRange(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeDestroy(String str);

    private static native byte[] nativeGet(long j, long j2, byte[] bArr);

    private static native long nativeGetSnapshot(long j);

    private static native long nativeIterator(long j, long j2);

    private static native long nativeOpen(String str, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, boolean z3, int i6);

    private static native void nativePut(long j, byte[] bArr, byte[] bArr2);

    static native void nativeReleaseSnapshot(long j, long j2);

    private static native void nativeWrite(long j, long j2);

    public static LevelDb open(File file) {
        return open(file, new Options());
    }

    /* access modifiers changed from: protected */
    public void closeNativeObject() {
        nativeClose(this.mPtr);
    }

    public void compact() {
        nativeCompact(this.mPtr);
    }

    public void delete(byte[] bArr) {
        assertOpen();
        nativeDelete(this.mPtr, bArr);
    }

    public int deleteRange(byte[] bArr, byte[] bArr2) {
        assertOpen();
        return nativeDeleteRange(this.mPtr, bArr, bArr2);
    }

    public byte[] get(Snapshot snapshot, byte[] bArr) {
        assertOpen();
        return nativeGet(this.mPtr, snapshot != null ? snapshot.mPtr : 0, bArr);
    }

    public Snapshot getSnapshot() {
        assertOpen();
        return new Snapshot(nativeGetSnapshot(this.mPtr));
    }

    public Iterator iterator() {
        assertOpen();
        return iterator((Snapshot) null);
    }

    public void put(byte[] bArr, byte[] bArr2) {
        assertOpen();
        nativePut(this.mPtr, bArr, bArr2);
    }

    public String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append("LevelDB[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public void write(WriteBatch writeBatch) {
        assertOpen();
        nativeWrite(this.mPtr, writeBatch.mPtr);
    }

    public static LevelDb open(File file, Options options) {
        if (!b) {
            try {
                return new LevelDb(nativeOpen(file.getPath(), options.mCreateIfMissing, options.mErrorIfExists, options.mWriteBufferSize, options.mMaxOpenFiles, options.mBlockCacheCapacityBytes, options.mBlockSize, options.mBlockRestartInterval, options.mUseSnappy, options.mBloomFilterBits), file.getPath());
            } catch (LevelDbException e) {
                if (!options.mDeleteIfCorrupted || (LevelDbPlatform.restrictCorruptionMitigation() && !(e instanceof LevelDbCorruptionException))) {
                    throw e;
                }
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("Failed to open ");
                sb.append(valueOf);
                LevelDbPlatform.logWarning("LevelDb", sb.toString(), e);
                try {
                    destroy(file);
                } catch (LevelDbException e2) {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb2.append("Failed to destroy ");
                    sb2.append(valueOf2);
                    LevelDbPlatform.logWarning("LevelDb", sb2.toString(), e2);
                }
                return new LevelDb(nativeOpen(file.getPath(), options.mCreateIfMissing, options.mErrorIfExists, options.mWriteBufferSize, options.mMaxOpenFiles, options.mBlockCacheCapacityBytes, options.mBlockSize, options.mBlockRestartInterval, options.mUseSnappy, options.mBloomFilterBits), file.getPath());
            } catch (UnsatisfiedLinkError e3) {
                LevelDbPlatform.logError("LevelDb", "LevelDb failed to load (2), returning NoOpLevelDb", e3);
                return new qtz();
            }
        } else {
            LevelDbPlatform.logError("LevelDb", "LevelDb failed to load (1), returning NoOpLevelDb");
            return new qtz();
        }
    }

    public byte[] get(byte[] bArr) {
        return get((Snapshot) null, bArr);
    }

    public Iterator iterator(Snapshot snapshot) {
        assertOpen();
        return new Iterator(nativeIterator(this.mPtr, snapshot != null ? snapshot.mPtr : 0), snapshot);
    }
}
