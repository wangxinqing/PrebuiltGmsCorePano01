package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.HandlerThread;
import com.google.android.gms.audiomodem.AudioPlayer$1;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: edf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edf {
    public final AudioTrack[] a;
    public final AudioManager b;
    public final qvr c;
    public final qvr[] d;
    public ede e;
    public final eew f;
    public boolean[] g;
    public volatile boolean[] h;
    public int[] i;
    public int j;
    public boolean k;
    private final Context l;
    private final eev m;
    private boolean n;
    private boolean o;
    private final IntentFilter p;
    private final BroadcastReceiver q = new AudioPlayer$1(this, "nearby");

    public edf(Context context, int i2, ede ede) {
        this.l = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = new qvr();
        this.m = new eev(this.b);
        this.f = (eew) thl.a(context, eew.class);
        IntentFilter intentFilter = new IntentFilter();
        this.p = intentFilter;
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        this.a = new AudioTrack[i2];
        this.d = new qvr[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("AudioTrackThread");
            sb.append(i3);
            HandlerThread handlerThread = new HandlerThread(sb.toString());
            handlerThread.start();
            this.d[i3] = new qvr(handlerThread.getLooper());
        }
        this.e = ede;
        this.g = new boolean[i2];
        this.h = new boolean[i2];
        this.i = new int[i2];
    }

    public static int d(int i2) {
        return AudioTrack.getMinBufferSize(i2, 4, 2);
    }

    public static final Encoding e(int i2) {
        return new Encoding(i2, (DsssEncoding) null, (DtmfEncoding) null);
    }

    public final int a(int i2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        if (!c(i2)) {
            if (i6 >= 0) {
                AudioTrack[] audioTrackArr = this.a;
                if (i6 < audioTrackArr.length) {
                    AudioTrack audioTrack = audioTrackArr[i6];
                    if (audioTrack == null) {
                        audioTrackArr[i6] = a(i7);
                    } else if (audioTrack.getSampleRate() != i7) {
                        this.a[i6].release();
                        this.a[i6] = a(i7);
                    }
                    AudioTrack audioTrack2 = this.a[i6];
                    if (audioTrack2 == null) {
                        this.f.a(9, e(i2));
                        ((anih) ((anih) edx.a.b()).a("edf", "a", 194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not create AudioTrack");
                        return 2;
                    }
                    this.g[i6] = true;
                    this.i[i6] = i4;
                    this.h[i6] = false;
                    b();
                    this.d[i6].post(new edd(this, audioTrack2, i2, bArr, bArr2, new edb(this, i2), this.c, i5));
                    return 0;
                }
            }
            ((anih) ((anih) edx.a.b()).a("edf", "a", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid track");
            return 2;
        }
        this.f.a(10, e(i2));
        jjg jjg = edx.a;
        return 1;
    }

    public final void b() {
        int i2;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            if (i3 >= this.a.length) {
                break;
            }
            if (c(i3)) {
                int i5 = this.i[i3];
                if (i5 == -1) {
                    i4 = -1;
                    break;
                }
                i4 = Math.max(i5, i4);
            }
            i3++;
        }
        if (i4 == -1) {
            if (this.n) {
                this.n = false;
                this.b.setStreamVolume(3, this.j, 0);
                jjg jjg = edx.a;
            }
            i2 = 0;
        } else if (!this.b.isMusicActive()) {
            this.n = true;
            this.j = this.b.getStreamVolume(3);
            this.b.setStreamVolume(3, i4, 0);
            jjg jjg2 = edx.a;
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.a.length) {
            if (c(i2) && this.i[i2] != -1) {
                if (!this.o) {
                    this.l.registerReceiver(this.q, this.p, (String) null, this.c);
                    this.o = true;
                }
                c();
                return;
            }
            i2++;
        }
        if (this.o) {
            this.l.unregisterReceiver(this.q);
            this.o = false;
        }
    }

    public final void c() {
        int i2;
        float f2;
        int streamVolume = this.b.getStreamVolume(3);
        if (streamVolume != 0) {
            for (int i3 = 0; i3 < this.a.length; i3++) {
                if (c(i3) && (i2 = this.i[i3]) != -1) {
                    AudioTrack audioTrack = this.a[i3];
                    eev eev = this.m;
                    if (i2 != streamVolume) {
                        f2 = eev.a(i2) / eev.a(streamVolume);
                    } else {
                        f2 = 1.0f;
                    }
                    if (((double) f2) <= 1.0d) {
                        jjg jjg = edx.a;
                        int i4 = this.i[i3];
                        int i5 = Build.VERSION.SDK_INT;
                        audioTrack.setVolume(f2);
                    }
                }
            }
        }
    }

    public final boolean c(int i2) {
        return this.g[i2];
    }

    public final void b(int i2) {
        if (c(i2)) {
            this.h[i2] = true;
        }
    }

    /* access modifiers changed from: protected */
    public final AudioTrack a(int i2) {
        AudioTrack audioTrack = new AudioTrack(3, i2, 4, 2, d(i2), 1);
        if (audioTrack.getState() != 0) {
            return audioTrack;
        }
        ((anih) ((anih) edx.a.b()).a("edf", "a", 137, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to initialize AudioTrack");
        audioTrack.release();
        return null;
    }

    public final boolean a() {
        for (int i2 = 0; i2 < this.a.length; i2++) {
            if (c(i2)) {
                return true;
            }
        }
        return false;
    }
}
