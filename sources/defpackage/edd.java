package defpackage;

import android.media.AudioTrack;

/* renamed from: edd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class edd implements Runnable {
    final /* synthetic */ edf a;
    private final AudioTrack b;
    private final int c;
    private final byte[] d;
    private final byte[] e;
    private final Runnable f;
    private final qvr g;
    private int h;
    private final int i;

    public edd(edf edf, AudioTrack audioTrack, int i2, byte[] bArr, byte[] bArr2, Runnable runnable, qvr qvr, int i3) {
        this.a = edf;
        this.b = audioTrack;
        this.c = i2;
        this.d = bArr;
        this.e = bArr2;
        this.f = runnable;
        this.g = qvr;
        this.h = edf.d(audioTrack.getSampleRate()) / 2;
        if (audioTrack.getAudioFormat() == 2) {
            int i4 = this.h;
            if (i4 % 2 != 0) {
                this.h = i4 + 1;
            }
        }
        this.i = i3;
    }

    public final void run() {
        try {
            if (this.b.getPlayState() != 3) {
                this.b.flush();
                this.b.play();
            }
            byte[] bArr = this.d;
            int i2 = this.h;
            int i3 = this.i;
            int i4 = 0;
            boolean z = false;
            while (!this.a.h[this.c]) {
                int length = bArr.length;
                int min = Math.min(i2, length - i4);
                this.b.write(bArr, i4, min);
                i4 += min;
                if (i4 >= length) {
                    if (z) {
                        if (i3 > 0) {
                            i3--;
                        }
                        if (i3 == 0) {
                            break;
                        }
                    } else {
                        bArr = this.e;
                        z = true;
                    }
                    i4 = 0;
                }
                i2 -= min;
                if (i2 == 0) {
                    i2 = this.h;
                }
            }
            this.b.pause();
        } finally {
            this.g.post(this.f);
        }
    }
}
