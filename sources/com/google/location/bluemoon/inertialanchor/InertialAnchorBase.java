package com.google.location.bluemoon.inertialanchor;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InertialAnchorBase {
    public NativeJniWrapper g = null;
    public final List h = new ArrayList();
    protected final arcr i;
    protected final arcq j;
    protected volatile long k = 0;
    protected final Object l = new Object();
    protected arci m = null;

    protected InertialAnchorBase(arcr arcr, arcq arcq) {
        System.loadLibrary("inertial-anchor-jni");
        this.g = new NativeJniWrapper();
        this.i = arcr;
        this.j = arcq;
    }

    public final void a(arce arce) {
        synchronized (this.h) {
            this.h.remove(arce);
        }
    }

    public void a(PrintWriter printWriter) {
    }

    public final long e() {
        byte[] bArr;
        synchronized (this.l) {
            if (this.k != 0) {
                long j2 = this.k;
                return j2;
            }
            if (this.i == null) {
                this.k = this.g.newDefaultOnlineEstimator();
            } else {
                arcq arcq = this.j;
                if (arcq != null) {
                    bArr = arcq.k();
                } else {
                    bArr = null;
                }
                this.k = this.g.newOnlineEstimatorWithConfig(this.i.k(), bArr);
            }
            if (this.k != 0) {
                long j3 = this.k;
                return j3;
            }
            throw new OutOfMemoryError();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.l) {
            if (this.k != 0) {
                this.g.deleteOnlineEstimator(this.k);
                this.k = 0;
            }
        }
        super.finalize();
    }

    public final void a(arcv arcv) {
        this.g.configureMetadata(e(), arcv.k());
    }
}
