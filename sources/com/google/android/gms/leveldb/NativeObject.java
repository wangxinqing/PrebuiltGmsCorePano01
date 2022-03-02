package com.google.android.gms.leveldb;

import java.io.Closeable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class NativeObject implements Closeable {
    private int a = 0;
    protected volatile long mPtr = 0;

    protected NativeObject(long j) {
        if (j != 0) {
            this.mPtr = j;
            this.a++;
            return;
        }
        throw new OutOfMemoryError();
    }

    /* access modifiers changed from: protected */
    public void assertOpen() {
        if (this.mPtr == 0) {
            throw new IllegalStateException();
        }
    }

    public synchronized void close() {
        unref();
    }

    /* access modifiers changed from: protected */
    public abstract void closeNativeObject();

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mPtr != 0) {
            closeNativeObject();
            this.mPtr = 0;
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    public synchronized void ref() {
        this.a++;
    }

    /* access modifiers changed from: protected */
    public synchronized void unref() {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            closeNativeObject();
            this.mPtr = 0;
        } else if (i < 0) {
            throw new IllegalStateException();
        }
    }
}
