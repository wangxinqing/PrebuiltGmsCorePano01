package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.EncodeResultsProtoHelper;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.NativeEncoder;
import java.util.Arrays;

/* renamed from: ees  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ees implements eed, ede {
    public final edf a;
    public final edn b;
    public Runnable c;
    private final boolean[] d = new boolean[2];
    private final eee e;
    private final eer f;
    private final eew g;
    private eep h;
    private int i = 0;

    public ees(Context context, eer eer) {
        this.a = new edf(context, 2, this);
        this.b = new edn();
        this.e = new eee(context);
        this.f = eer;
        this.g = (eew) thl.a(context, eew.class);
    }

    public final void a() {
        eee eee = this.e;
        eee.a();
        try {
            eee.a.unregisterReceiver(eee.l);
        } catch (IllegalArgumentException e2) {
        }
        eee.i.listen(eee.k, 0);
        edm edm = eee.e;
        int i2 = Build.VERSION.SDK_INT;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.closeProfileProxy(1, edm.b);
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b() {
        eep eep = this.h;
        if (eep != null) {
            if (eep.a) {
                NativeEncoder.nativeRelease();
            }
            this.h = null;
        }
    }

    public final void b(int i2) {
        eeq eeq;
        eeq eeq2;
        char c2;
        eeq a2 = this.b.a(i2);
        if (a2 != null) {
            int i3 = this.i;
            avou avou = null;
            if (i3 == 0) {
                eee eee = this.e;
                ((anih) ((anih) edx.a.c()).a("eee", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("requestStartPlayback() called during outstanding request");
                eee.c = this;
                if (!eee.f) {
                    eee.a.registerReceiver(eee.h, eee.g, (String) null, eee.b);
                    eee.f = true;
                }
                boolean b2 = eee.b();
                eee.d = b2;
                i3 = !b2 ? 2 : 1;
                this.i = i3;
            }
            if (i3 == 1) {
                Encoding encoding = a2.b;
                eep eep = this.h;
                if (eep == null || !encoding.equals(eep.b)) {
                    b();
                    this.h = new eep(encoding);
                }
                eep eep2 = this.h;
                byte[] bArr = a2.d;
                if (Arrays.equals(bArr, eep2.c)) {
                    avou = eep2.d;
                    eeq = a2;
                } else {
                    if (eea.a()) {
                        if (!eep2.a) {
                            Encoding encoding2 = eep2.b;
                            int i4 = encoding2.a;
                            if (i4 == 0) {
                                eeq = a2;
                                DsssEncoding dsssEncoding = encoding2.b;
                                jjg jjg = edx.a;
                                aymc.d();
                                eep eep3 = eep2;
                                DsssEncoding dsssEncoding2 = dsssEncoding;
                                if (!NativeEncoder.nativeInitializeDsss(dsssEncoding.a(), dsssEncoding.b, dsssEncoding.c, dsssEncoding.d, dsssEncoding.e, dsssEncoding.f, dsssEncoding.g, dsssEncoding.h, dsssEncoding.i, dsssEncoding.j, dsssEncoding.k, aymc.d(), AudioTrack.getNativeOutputSampleRate(3), ((float) aymc.a.a().u()) / 1000.0f)) {
                                    ((anih) ((anih) edx.a.b()).a("eep", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Native initialization of DSSS encoder failed");
                                } else {
                                    eep2 = eep3;
                                    eep2.e = dsssEncoding2.l;
                                }
                            } else if (i4 != 1) {
                                ((anih) ((anih) edx.a.c()).a("eep", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received an Encoder with unknown type");
                                eeq = a2;
                            } else {
                                DtmfEncoding dtmfEncoding = encoding2.c;
                                eeq = a2;
                                if (!NativeEncoder.nativeInitializeDtmf(dtmfEncoding.c(), dtmfEncoding.d, dtmfEncoding.e, dtmfEncoding.f, ((float) dtmfEncoding.g) / 1000.0f, dtmfEncoding.h, ((float) dtmfEncoding.a().a) / 1000.0f, ((float) dtmfEncoding.a().b) / 1000.0f, ((float) dtmfEncoding.a().c) / 1000.0f, ((float) dtmfEncoding.a().d) / 1000.0f, dtmfEncoding.a().e, dtmfEncoding.b())) {
                                    ((anih) ((anih) edx.a.b()).a("eep", "a", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Native initialization of DTMF encoder failed");
                                    avou = null;
                                } else {
                                    eep2.e = dtmfEncoding.i;
                                }
                            }
                            eep2.a = true;
                        } else {
                            eeq = a2;
                        }
                        EncodeResultsProtoHelper encodeResultsProtoHelper = new EncodeResultsProtoHelper();
                        NativeEncoder.nativeEncode(bArr, encodeResultsProtoHelper, eep2.e);
                        eep2.c = bArr;
                        eep2.d = encodeResultsProtoHelper.build();
                        avou = eep2.d;
                    } else {
                        eeq = a2;
                    }
                    avou = null;
                }
                if (avou != null) {
                    eeq eeq3 = eeq;
                    int i5 = eeq3.e;
                    edf edf = this.a;
                    byte[] k = avou.b.k();
                    byte[] k2 = avou.c.k();
                    int i6 = (int) avou.d;
                    int i7 = eeq3.c;
                    int i8 = -1;
                    if (i7 == -3) {
                        i7 = (int) aymc.a.a().b();
                    } else if (i7 == -2) {
                        i7 = (int) aymc.a.a().a();
                    } else if (i7 == -1 || i7 < 0 || i7 > this.a.b.getStreamMaxVolume(3)) {
                        i7 = -1;
                    }
                    if (i5 != -1) {
                        i8 = i5;
                    }
                    int i9 = i2;
                    if (edf.c(i9)) {
                        edf.f.a(10, edf.e(i2));
                        jjg jjg2 = edx.a;
                        eeq2 = eeq3;
                        c2 = 1;
                    } else {
                        if (i9 < 0) {
                            eeq2 = eeq3;
                        } else {
                            AudioTrack[] audioTrackArr = edf.a;
                            if (i9 < audioTrackArr.length) {
                                AudioTrack audioTrack = audioTrackArr[i9];
                                if (audioTrack == null) {
                                    audioTrackArr[i9] = edf.a(i6);
                                } else if (audioTrack.getSampleRate() != i6) {
                                    edf.a[i9].release();
                                    edf.a[i9] = edf.a(i6);
                                }
                                AudioTrack audioTrack2 = edf.a[i9];
                                if (audioTrack2 == null) {
                                    edf.f.a(9, edf.e(i2));
                                    ((anih) ((anih) edx.a.b()).a("edf", "a", 194, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not create AudioTrack");
                                    eeq2 = eeq3;
                                    c2 = 2;
                                } else {
                                    edf.g[i9] = true;
                                    edf.i[i9] = i7;
                                    edf.h[i9] = false;
                                    edf.b();
                                    edb edb = new edb(edf, i9);
                                    qvr qvr = edf.d[i9];
                                    eeq2 = eeq3;
                                    edd edd = r1;
                                    edd edd2 = new edd(edf, audioTrack2, i2, k, k2, edb, edf.c, i8);
                                    qvr.post(edd);
                                    c2 = 0;
                                }
                            } else {
                                eeq2 = eeq3;
                            }
                        }
                        ((anih) ((anih) edx.a.b()).a("edf", "a", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid track");
                        c2 = 2;
                    }
                    if (c2 == 0) {
                        this.d[i9] = false;
                        eeq2.a.a(0);
                    } else if (c2 == 1) {
                        ((anih) ((anih) edx.a.d()).a("ees", "b", 169, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Playing failed; will retry.");
                        this.d[i9] = true;
                    }
                } else {
                    eeq eeq4 = eeq;
                    eew eew = this.g;
                    if (eew != null) {
                        eew.a("", 8, eeq4);
                    }
                    ((anih) ((anih) edx.a.c()).a("ees", "b", 143, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to encode token");
                    eeq4.a.a(3);
                }
            } else {
                jjg jjg3 = edx.a;
                a2.a.a(3);
            }
        } else {
            jjg jjg4 = edx.a;
        }
    }

    public final void a(int i2) {
        eeq a2 = this.b.a(i2);
        int i3 = a2.f;
        int i4 = a2.e;
        if (i3 != 1) {
            if (i4 != -1) {
                eer eer = this.f;
                if (eer != null) {
                    eer.a(a2);
                }
            } else {
                return;
            }
        }
        int a3 = this.b.a(i2, a2);
        if (a3 == 0) {
            a2.a.a(1);
            edn edn = this.b;
            int i5 = 0;
            while (true) {
                eeq[] eeqArr = edn.a;
                if (i5 >= eeqArr.length) {
                    this.e.a();
                    this.i = 0;
                    return;
                } else if (eeqArr[i5] == null && edn.b[i5].isEmpty()) {
                    i5++;
                } else {
                    return;
                }
            }
        } else if (a3 == 1) {
            a2.a.a(1);
            b(i2);
        }
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (!z) {
            if (this.i == 1) {
                this.i = 2;
                while (i2 < 2) {
                    eeq a2 = this.b.a(i2);
                    if (a2 != null) {
                        a2.a.a(3);
                        this.a.b(i2);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        } else if (this.i == 2) {
            this.i = 1;
            while (i2 < 2) {
                b(i2);
                i2++;
            }
        }
    }
}
