package defpackage;

import android.content.Context;
import com.google.android.gms.audiomodem.AdsrParams;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: uzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uzh {
    private final ecu a;

    public uzh(Context context) {
        this.a = eci.a(context);
    }

    private static int a(boolean z, boolean z2) {
        if (z && z2) {
            return 3;
        }
        if (!z) {
            return z2 ? 2 : 0;
        }
        return 1;
    }

    public static Encoding b(Context context, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        vav vav = (vav) thl.a(context, vav.class);
        ecd ecd = new ecd();
        auyk auyk = vav.f.l;
        if (auyk == null) {
            auyk = auyk.k;
        }
        auyg auyg = auyk.h;
        if (auyg == null) {
            auyg = auyg.g;
        }
        long j = auyg.b;
        boolean z4 = false;
        iva.b(j >= 0, "attackTimeMillis must be non-negative");
        ecd.a = j;
        auyk auyk2 = vav.f.l;
        if (auyk2 == null) {
            auyk2 = auyk.k;
        }
        auyg auyg2 = auyk2.h;
        if (auyg2 == null) {
            auyg2 = auyg.g;
        }
        long j2 = auyg2.c;
        iva.b(j2 >= 0, "decayTimeMillis must be non-negative");
        ecd.b = j2;
        auyk auyk3 = vav.f.l;
        if (auyk3 == null) {
            auyk3 = auyk.k;
        }
        auyg auyg3 = auyk3.h;
        if (auyg3 == null) {
            auyg3 = auyg.g;
        }
        long j3 = auyg3.d;
        iva.b(j3 >= 0, "sustainTimeMillis must be non-negative");
        ecd.c = j3;
        auyk auyk4 = vav.f.l;
        if (auyk4 == null) {
            auyk4 = auyk.k;
        }
        auyg auyg4 = auyk4.h;
        if (auyg4 == null) {
            auyg4 = auyg.g;
        }
        long j4 = auyg4.e;
        iva.b(j4 >= 0, "releaseTimeMillis must be non-negative");
        ecd.d = j4;
        auyk auyk5 = vav.f.l;
        if (auyk5 == null) {
            auyk5 = auyk.k;
        }
        auyg auyg5 = auyk5.h;
        if (auyg5 == null) {
            auyg5 = auyg.g;
        }
        float f = (float) auyg5.f;
        iva.b(f >= 0.0f && ((double) f) <= 1.0d, "sustainAmplitude must be in [0, 1]");
        ecd.e = f;
        AdsrParams a2 = ecd.a();
        eds eds = new eds();
        eds.b(i);
        auyk auyk6 = vav.f.l;
        if (auyk6 == null) {
            auyk6 = auyk.k;
        }
        boolean z5 = auyk6.b;
        auyk auyk7 = vav.f.l;
        if (auyk7 == null) {
            auyk7 = auyk.k;
        }
        eds.a(a(z5, auyk7.c));
        auyk auyk8 = vav.f.l;
        if (auyk8 == null) {
            auyk8 = auyk.k;
        }
        float f2 = (float) auyk8.d;
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "coderSampleRate must be greater than zero");
        eds.a = f2;
        auyk auyk9 = vav.f.l;
        if (auyk9 == null) {
            auyk9 = auyk.k;
        }
        int i2 = auyk9.e;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "basebandDecimationFactor must be greater than zero");
        eds.b = i2;
        auyk auyk10 = vav.f.l;
        if (auyk10 == null) {
            auyk10 = auyk.k;
        }
        int i3 = auyk10.f;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.b(z3, "frequenciesPerSymbol must be greater than zero");
        eds.d = i3;
        auyk auyk11 = vav.f.l;
        if (auyk11 == null) {
            auyk11 = auyk.k;
        }
        int i4 = auyk11.g;
        if (i4 > 0) {
            z4 = true;
        }
        iva.b(z4, "windowDurationMillis must be greater than zero");
        eds.c = i4;
        iva.b(true, "adsrParams must not be null");
        eds.e = a2;
        return eds.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0138, code lost:
        if (r0 <= 3) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0141, code lost:
        if (r0 <= 2) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.audiomodem.Encoding a(android.content.Context r18, int r19) {
        /*
            r0 = r19
            java.lang.Class<vav> r1 = defpackage.vav.class
            r2 = r18
            java.lang.Object r1 = defpackage.thl.a((android.content.Context) r2, (java.lang.Class) r1)
            vav r1 = (defpackage.vav) r1
            edr r2 = new edr
            r2.<init>()
            r3 = 0
            r4 = 1
            if (r0 <= 0) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            java.lang.String r6 = "tokenLengthBytes must be greater than zero"
            defpackage.iva.b(r5, r6)
            r2.a = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            auyi r0 = defpackage.auyi.p
        L_0x0029:
            boolean r0 = r0.d
            r2.b = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            auyi r0 = defpackage.auyi.p
        L_0x0036:
            double r5 = r0.e
            float r0 = (float) r5
            r5 = 0
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            java.lang.String r7 = "desiredCarrierFrequency must be greater than zero"
            defpackage.iva.b(r6, r7)
            r2.g = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            auyi r0 = defpackage.auyi.p
        L_0x0052:
            boolean r0 = r0.c
            auyt r6 = r1.f
            auyi r6 = r6.f
            if (r6 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            auyi r6 = defpackage.auyi.p
        L_0x005d:
            boolean r6 = r6.f
            java.lang.String r7 = "Not a valid ErrorControlScheme"
            defpackage.iva.b(r4, r7)
            int r0 = a((boolean) r0, (boolean) r6)
            r2.k = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            auyi r0 = defpackage.auyi.p
        L_0x0073:
            int r0 = r0.g
            r6 = 5
            if (r0 < r6) goto L_0x0080
            r7 = 11
            if (r0 <= r7) goto L_0x007e
            r7 = 0
            goto L_0x0081
        L_0x007e:
            r7 = 1
            goto L_0x0081
        L_0x0080:
            r7 = 0
        L_0x0081:
            java.lang.String r8 = "numberOfTapsLfsr must be in the range [5, 11]"
            defpackage.iva.b(r7, r8)
            r2.c = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            auyi r0 = defpackage.auyi.p
        L_0x0092:
            int r0 = r0.h
            r2.d = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            auyi r0 = defpackage.auyi.p
        L_0x009f:
            double r7 = r0.i
            float r0 = (float) r7
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a8
            r5 = 1
            goto L_0x00a9
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            java.lang.String r7 = "coderSampleRate must be greater than zero"
            defpackage.iva.b(r5, r7)
            r2.e = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            auyi r0 = defpackage.auyi.p
        L_0x00ba:
            int r0 = r0.j
            r5 = 2
            if (r0 != r4) goto L_0x00c1
            r7 = 1
            goto L_0x00ce
        L_0x00c1:
            if (r0 == r5) goto L_0x00cd
            r7 = 4
            if (r0 == r7) goto L_0x00cd
            r7 = 8
            if (r0 != r7) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r7 = 0
            goto L_0x00ce
        L_0x00cd:
            r7 = 1
        L_0x00ce:
            java.lang.String r8 = "bitsPerSymbol must be 1, 2, 4, or 8"
            defpackage.iva.b(r7, r8)
            r2.h = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            auyi r0 = defpackage.auyi.p
        L_0x00df:
            int r0 = r0.k
            if (r0 <= 0) goto L_0x00e5
            r7 = 1
            goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            java.lang.String r8 = "minCyclesPerFrame must be greater than zero"
            defpackage.iva.b(r7, r8)
            r2.i = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            auyi r0 = defpackage.auyi.p
        L_0x00f7:
            int r0 = r0.l
            if (r0 <= 0) goto L_0x00fd
            r7 = 1
            goto L_0x00fe
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            java.lang.String r8 = "basebandDecimationFactor must be greater than zero"
            defpackage.iva.b(r7, r8)
            r2.j = r0
            auyt r0 = r1.f
            auyi r0 = r0.f
            if (r0 == 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            auyi r0 = defpackage.auyi.p
        L_0x010f:
            int r0 = r0.m
            if (r0 <= 0) goto L_0x0115
            r1 = 1
            goto L_0x0116
        L_0x0115:
            r1 = 0
        L_0x0116:
            java.lang.String r7 = "upsamplingFactor must be greater than zero"
            defpackage.iva.b(r1, r7)
            r2.f = r0
            int r1 = r2.j
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x0125
            r0 = 1
            goto L_0x0126
        L_0x0125:
            r0 = 0
        L_0x0126:
            java.lang.String r1 = "upsamplingFactor must be divisible by basebandDecimationFactor"
            defpackage.iva.b(r0, r1)
            int r0 = r2.c
            if (r0 != r6) goto L_0x0130
            goto L_0x013b
        L_0x0130:
            r1 = 6
            if (r0 == r1) goto L_0x013b
            int r0 = r2.d
            if (r0 < 0) goto L_0x0145
            r1 = 3
            if (r0 > r1) goto L_0x0145
            goto L_0x0143
        L_0x013b:
            int r0 = r2.d
            if (r0 >= 0) goto L_0x0141
            r0 = 0
            goto L_0x0146
        L_0x0141:
            if (r0 > r5) goto L_0x0145
        L_0x0143:
            r0 = 1
            goto L_0x0146
        L_0x0145:
            r0 = 0
        L_0x0146:
            java.lang.String r1 = "codeNumber must be in the range [0, 3], unless numberOfTapsLfsr is 5 or 6,in which case it must be in [0, 2]"
            defpackage.iva.b(r0, r1)
            float r0 = r2.g
            float r1 = r2.e
            r5 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r4 = 0
        L_0x0159:
            java.lang.String r0 = "desiredCarrierFrequency cannot exceed coderSampleRate / 2 (Nyquist rate)"
            defpackage.iva.b(r4, r0)
            com.google.android.gms.audiomodem.DsssEncoding r0 = new com.google.android.gms.audiomodem.DsssEncoding
            int r6 = r2.a
            int r1 = r2.k
            boolean r7 = com.google.android.gms.audiomodem.Encoding.a(r1)
            boolean r8 = r2.b
            int r9 = r2.c
            int r10 = r2.d
            float r11 = r2.e
            int r12 = r2.f
            float r13 = r2.g
            int r14 = r2.h
            int r15 = r2.i
            int r1 = r2.j
            int r2 = r2.k
            int r17 = com.google.android.gms.audiomodem.Encoding.b(r2)
            r5 = r0
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.google.android.gms.audiomodem.Encoding r1 = new com.google.android.gms.audiomodem.Encoding
            r2 = 0
            r1.<init>(r3, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzh.a(android.content.Context, int):com.google.android.gms.audiomodem.Encoding");
    }

    public final void a(eej eej) {
        ecu ecu = this.a;
        igc igc = ecu.a((Object) eej, eej.class.getName()).b;
        iva.a((Object) igc, (Object) "Key must not be null");
        ecu.a(igc).a((acvp) new uzg());
    }

    public final void a(eej eej, TokenBroadcaster$Params tokenBroadcaster$Params) {
        jjg jjg = tgc.a;
        jjp.a(tokenBroadcaster$Params.a);
        ecu ecu = this.a;
        ige a2 = ecu.a((Object) eej, eej.class.getName());
        efk efk = new efk(a2);
        ecm ecm = new ecm(efk, tokenBroadcaster$Params);
        ecn ecn = new ecn(efk);
        ign a3 = igo.a();
        a3.a = ecm;
        a3.b = ecn;
        a3.c = a2;
        ecu.a(a3.a()).a((acvp) new uzf());
    }

    public final void a(eet eet) {
        ecu ecu = this.a;
        igc igc = ecu.a((Object) eet, eet.class.getName()).b;
        iva.a((Object) igc, (Object) "Key must not be null");
        ecu.a(igc).a((acvp) new uze());
    }

    public final void a(eet eet, TokenReceiver$Params tokenReceiver$Params, boolean z, long j, eeg eeg) {
        ecu ecu = this.a;
        ige a2 = ecu.a((Object) eet, eet.class.getName());
        efn efn = new efn(a2);
        ecj ecj = new ecj(efn, tokenReceiver$Params);
        eck eck = new eck(efn);
        ign a3 = igo.a();
        a3.a = ecj;
        a3.b = eck;
        a3.c = a2;
        ecu.a(a3.a()).a((acvp) new uzc());
        if (eeg != null) {
            eeh eeh = new eeh(tokenReceiver$Params.a);
            if (z) {
                eeh.b = true;
            }
            if (j != -1) {
                iva.b(j > 0);
                eeh.c = true;
                eeh.d = j;
            }
            ecu ecu2 = this.a;
            ecl ecl = new ecl(ecu2.a((Object) eeg, eeg.class.getName()), new Snoop$Params(eeh.a, eeh.b, eeh.c, eeh.d));
            iha b = ihb.b();
            b.a = ecl;
            ecu2.a(b.a()).a((acvp) new uzd());
        }
    }
}
