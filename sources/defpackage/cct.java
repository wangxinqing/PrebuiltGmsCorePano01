package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.util.Set;

/* renamed from: cct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cct extends ccy {
    public static final ccj b = new ccj(new ccs(), "AudioStateProducer", new int[]{24}, (int[]) null, true);
    private static final Set k = jir.a("android.intent.action.HEADSET_PLUG", "android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED");
    private atna l;

    public cct(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        a(24);
    }

    private final void a(atna atna, long j) {
        this.l = atna;
        jti jti = new jti(7, 24, 1);
        jti.a(jut.b(j));
        jti.a(atna.i, this.l);
        d(jti.a());
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : k) {
            intentFilter.addAction(addAction);
        }
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    /* access modifiers changed from: package-private */
    public final atna a(Intent intent) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        atna atna;
        AudioManager audioManager = (AudioManager) this.d.getSystemService("audio");
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        int i5 = 3;
        if (intent != null && "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            if ((intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 1 || intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 3) && (atna = this.l) != null) {
                return atna;
            }
            if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2) {
                z = false;
            } else {
                z = true;
            }
            isBluetoothScoOn |= !z;
            if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 0) {
                isBluetoothScoOn = false;
            }
        }
        aucd o = atna.h.o();
        if (!audioManager.isWiredHeadsetOn()) {
            i = 3;
        } else {
            i = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atna atna2 = (atna) o.b;
        atna2.b = i - 1;
        int i6 = 1 | atna2.a;
        atna2.a = i6;
        if (!isBluetoothScoOn) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        atna2.c = i2 - 1;
        atna2.a = i6 | 2;
        if (!audioManager.isBluetoothScoOn()) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atna atna3 = (atna) o.b;
        atna3.d = i3 - 1;
        atna3.a |= 4;
        if (!audioManager.isMicrophoneMute()) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atna atna4 = (atna) o.b;
        atna4.e = i4 - 1;
        atna4.a |= 8;
        int i7 = !audioManager.isMusicActive() ? 3 : 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atna atna5 = (atna) o.b;
        atna5.f = i7 - 1;
        atna5.a |= 16;
        if (audioManager.isSpeakerphoneOn()) {
            i5 = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atna atna6 = (atna) o.b;
        atna6.g = i5 - 1;
        atna6.a |= 32;
        return (atna) o.i();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a(a((Intent) null), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.l = null;
    }

    public final void a(Context context, Intent intent) {
        if (k.contains(intent.getAction())) {
            atna a = a(intent);
            if (!g()) {
                ((anih) ((anih) bxk.a.c()).a("cct", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AudioStateProducer] No ongoing data. Inserting new context.");
                a(a, cbi.i().a());
                return;
            }
            atna atna = this.l;
            int a2 = atmt.a(a.b);
            int i = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = atmt.a(atna.b);
            if (a3 == 0) {
                a3 = 1;
            }
            if (a2 == a3) {
                int a4 = atmz.a(a.g);
                if (a4 == 0) {
                    a4 = 1;
                }
                int a5 = atmz.a(atna.g);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (a4 == a5) {
                    int a6 = atmx.a(a.f);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    int a7 = atmx.a(atna.f);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    if (a6 == a7) {
                        int a8 = atmv.a(a.e);
                        if (a8 == 0) {
                            a8 = 1;
                        }
                        int a9 = atmv.a(atna.e);
                        if (a9 == 0) {
                            a9 = 1;
                        }
                        if (a8 == a9) {
                            int a10 = atmp.a(a.c);
                            if (a10 == 0) {
                                a10 = 1;
                            }
                            int a11 = atmp.a(atna.c);
                            if (a11 == 0) {
                                a11 = 1;
                            }
                            if (a10 == a11) {
                                int a12 = atmr.a(a.d);
                                if (a12 == 0) {
                                    a12 = 1;
                                }
                                int a13 = atmr.a(atna.d);
                                if (a13 != 0) {
                                    i = a13;
                                }
                                if (a12 == i) {
                                    ((anih) ((anih) bxk.a.c()).a("cct", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AudioStateProducer] No state change for audio state context");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            long a14 = cbi.i().a();
            a(a14);
            a(a, a14 + 1);
        }
    }
}
