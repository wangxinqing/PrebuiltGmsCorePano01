package com.google.android.gms.audiomodem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class EncodeResultsProtoHelper {
    private final avot results = ((avot) avou.e.o());

    public avou build() {
        return (avou) this.results.i();
    }

    /* access modifiers changed from: package-private */
    public void setEncodeResults(byte[] bArr, byte[] bArr2, float f) {
        avot avot = this.results;
        auay a = auay.a(bArr);
        if (avot.c) {
            avot.c();
            avot.c = false;
        }
        avou avou = (avou) avot.b;
        avou avou2 = avou.e;
        a.getClass();
        avou.a |= 1;
        avou.b = a;
        avot avot2 = this.results;
        auay a2 = auay.a(bArr2);
        if (avot2.c) {
            avot2.c();
            avot2.c = false;
        }
        avou avou3 = (avou) avot2.b;
        a2.getClass();
        avou3.a |= 2;
        avou3.c = a2;
        avot avot3 = this.results;
        if (avot3.c) {
            avot3.c();
            avot3.c = false;
        }
        avou avou4 = (avou) avot3.b;
        avou4.a |= 4;
        avou4.d = f;
    }
}
