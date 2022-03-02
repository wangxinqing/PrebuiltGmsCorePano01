package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataChannel {
    private long a;
    private long b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Buffer {
        public final ByteBuffer a;
        public final boolean b;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.a = byteBuffer;
            this.b = z;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Init {
        public boolean a = true;
        public int b = -1;
        public int c = -1;
        public String d = "";
        public int e = -1;

        /* access modifiers changed from: package-private */
        public int getId() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public int getMaxRetransmitTimeMs() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public int getMaxRetransmits() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public boolean getNegotiated() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getOrdered() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public String getProtocol() {
            return this.d;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public DataChannel(long j) {
        this.a = j;
    }

    private native long nativeRegisterObserver(Observer observer);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j);

    public final State a() {
        b();
        return nativeState();
    }

    public final void b() {
        if (this.a == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    /* access modifiers changed from: package-private */
    public long getNativeDataChannel() {
        return this.a;
    }

    public native long nativeBufferedAmount();

    public native void nativeClose();

    public native boolean nativeSend(byte[] bArr, boolean z);

    public final void a(Observer observer) {
        b();
        long j = this.b;
        if (j != 0) {
            nativeUnregisterObserver(j);
        }
        this.b = nativeRegisterObserver(observer);
    }
}
