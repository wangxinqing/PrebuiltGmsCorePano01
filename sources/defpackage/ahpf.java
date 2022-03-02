package defpackage;

/* renamed from: ahpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpf {
    public static final String[] M = {"meanLightLevel", "meanLightLevelDiff0To6", "meanLightLevelDiff6To12", "meanLightLevelDiff12To18", "accelGravityDirDiff0To6", "accelGravityDirDiff6To12", "accelGravityDirDiff12To18", "soundMeanLogEnergy", "soundLogStdEnergy", "soundStdOverMeanEnergy", "soundMeanLogBark1", "soundMeanLogBark2", "soundMeanLogBark3", "soundMeanLogBark4", "soundMeanLogBark5", "soundMeanLogBark6", "soundMeanLogBark7", "soundMeanLogBark8", "soundMeanLogBark9", "soundMeanLogBark10", "soundMeanLogBark11", "soundMeanLogBark12", "soundMeanLogBark13", "soundMeanLogBark14", "soundMeanLogBark15", "soundMeanLogBark16", "soundMeanLogBark17", "soundMeanLogBark18", "soundMeanLogBark19", "soundMeanLogBark20", "soundMeanLogBark21", "soundMeanLogBark22", "soundMeanLogBarkDiff0To6", "soundMeanLogBarkDiff6To12", "soundMeanLogBarkDiff12To18", "hourOfDay", "presenceConfidence"};
    public static final String[] a = {"Diff0To6", "Diff6To12", "Diff12To18"};
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K;
    public float L;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public final float a(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = M;
            if (i2 < strArr.length) {
                if (strArr[i2].equals(str)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            return new float[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L}[i2];
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r3, float r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1828326989: goto L_0x01b2;
                case -1736553562: goto L_0x01a8;
                case -1718764585: goto L_0x019e;
                case -1658016987: goto L_0x0193;
                case -1209605670: goto L_0x0189;
                case -1075356074: goto L_0x017e;
                case -731934941: goto L_0x0174;
                case -410643883: goto L_0x0169;
                case -34209264: goto L_0x015e;
                case 839618520: goto L_0x0154;
                case 981639675: goto L_0x0149;
                case 985252545: goto L_0x013d;
                case 1083120101: goto L_0x0131;
                case 1608904824: goto L_0x0125;
                case 1826124207: goto L_0x011a;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r0) {
                case 578128169: goto L_0x010e;
                case 578128170: goto L_0x0102;
                case 578128171: goto L_0x00f6;
                case 578128172: goto L_0x00ea;
                case 578128173: goto L_0x00de;
                case 578128174: goto L_0x00d2;
                case 578128175: goto L_0x00c6;
                case 578128176: goto L_0x00ba;
                case 578128177: goto L_0x00ae;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r0) {
                case 742104103: goto L_0x00a2;
                case 742104104: goto L_0x0096;
                case 742104105: goto L_0x008a;
                case 742104106: goto L_0x007e;
                case 742104107: goto L_0x0072;
                case 742104108: goto L_0x0066;
                case 742104109: goto L_0x005a;
                case 742104110: goto L_0x004e;
                case 742104111: goto L_0x0042;
                case 742104112: goto L_0x0036;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case 742104134: goto L_0x002a;
                case 742104135: goto L_0x001e;
                case 742104136: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x01bc
        L_0x0012:
            java.lang.String r0 = "soundMeanLogBark22"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 31
            goto L_0x01bd
        L_0x001e:
            java.lang.String r0 = "soundMeanLogBark21"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 30
            goto L_0x01bd
        L_0x002a:
            java.lang.String r0 = "soundMeanLogBark20"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 29
            goto L_0x01bd
        L_0x0036:
            java.lang.String r0 = "soundMeanLogBark19"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 28
            goto L_0x01bd
        L_0x0042:
            java.lang.String r0 = "soundMeanLogBark18"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 27
            goto L_0x01bd
        L_0x004e:
            java.lang.String r0 = "soundMeanLogBark17"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 26
            goto L_0x01bd
        L_0x005a:
            java.lang.String r0 = "soundMeanLogBark16"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 25
            goto L_0x01bd
        L_0x0066:
            java.lang.String r0 = "soundMeanLogBark15"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 24
            goto L_0x01bd
        L_0x0072:
            java.lang.String r0 = "soundMeanLogBark14"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 23
            goto L_0x01bd
        L_0x007e:
            java.lang.String r0 = "soundMeanLogBark13"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 22
            goto L_0x01bd
        L_0x008a:
            java.lang.String r0 = "soundMeanLogBark12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 21
            goto L_0x01bd
        L_0x0096:
            java.lang.String r0 = "soundMeanLogBark11"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 20
            goto L_0x01bd
        L_0x00a2:
            java.lang.String r0 = "soundMeanLogBark10"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 19
            goto L_0x01bd
        L_0x00ae:
            java.lang.String r0 = "soundMeanLogBark9"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 18
            goto L_0x01bd
        L_0x00ba:
            java.lang.String r0 = "soundMeanLogBark8"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 17
            goto L_0x01bd
        L_0x00c6:
            java.lang.String r0 = "soundMeanLogBark7"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 16
            goto L_0x01bd
        L_0x00d2:
            java.lang.String r0 = "soundMeanLogBark6"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 15
            goto L_0x01bd
        L_0x00de:
            java.lang.String r0 = "soundMeanLogBark5"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 14
            goto L_0x01bd
        L_0x00ea:
            java.lang.String r0 = "soundMeanLogBark4"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 13
            goto L_0x01bd
        L_0x00f6:
            java.lang.String r0 = "soundMeanLogBark3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 12
            goto L_0x01bd
        L_0x0102:
            java.lang.String r0 = "soundMeanLogBark2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 11
            goto L_0x01bd
        L_0x010e:
            java.lang.String r0 = "soundMeanLogBark1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 10
            goto L_0x01bd
        L_0x011a:
            java.lang.String r0 = "accelGravityDirDiff12To18"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 6
            goto L_0x01bd
        L_0x0125:
            java.lang.String r0 = "soundMeanLogBarkDiff0To6"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 32
            goto L_0x01bd
        L_0x0131:
            java.lang.String r0 = "presenceConfidence"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 36
            goto L_0x01bd
        L_0x013d:
            java.lang.String r0 = "hourOfDay"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 35
            goto L_0x01bd
        L_0x0149:
            java.lang.String r0 = "meanLightLevelDiff12To18"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 3
            goto L_0x01bd
        L_0x0154:
            java.lang.String r0 = "soundMeanLogEnergy"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 7
            goto L_0x01bd
        L_0x015e:
            java.lang.String r0 = "soundMeanLogBarkDiff12To18"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 34
            goto L_0x01bd
        L_0x0169:
            java.lang.String r0 = "soundStdOverMeanEnergy"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 9
            goto L_0x01bd
        L_0x0174:
            java.lang.String r0 = "meanLightLevelDiff0To6"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 1
            goto L_0x01bd
        L_0x017e:
            java.lang.String r0 = "soundLogStdEnergy"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 8
            goto L_0x01bd
        L_0x0189:
            java.lang.String r0 = "meanLightLevelDiff6To12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 2
            goto L_0x01bd
        L_0x0193:
            java.lang.String r0 = "soundMeanLogBarkDiff6To12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 33
            goto L_0x01bd
        L_0x019e:
            java.lang.String r0 = "accelGravityDirDiff0To6"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 4
            goto L_0x01bd
        L_0x01a8:
            java.lang.String r0 = "accelGravityDirDiff6To12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 5
            goto L_0x01bd
        L_0x01b2:
            java.lang.String r0 = "meanLightLevel"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01bc
            r0 = 0
            goto L_0x01bd
        L_0x01bc:
            r0 = -1
        L_0x01bd:
            switch(r0) {
                case 0: goto L_0x0240;
                case 1: goto L_0x023d;
                case 2: goto L_0x023a;
                case 3: goto L_0x0237;
                case 4: goto L_0x0234;
                case 5: goto L_0x0231;
                case 6: goto L_0x022e;
                case 7: goto L_0x022b;
                case 8: goto L_0x0228;
                case 9: goto L_0x0225;
                case 10: goto L_0x0222;
                case 11: goto L_0x021f;
                case 12: goto L_0x021c;
                case 13: goto L_0x0219;
                case 14: goto L_0x0216;
                case 15: goto L_0x0213;
                case 16: goto L_0x0210;
                case 17: goto L_0x020d;
                case 18: goto L_0x020a;
                case 19: goto L_0x0207;
                case 20: goto L_0x0204;
                case 21: goto L_0x0201;
                case 22: goto L_0x01fe;
                case 23: goto L_0x01fb;
                case 24: goto L_0x01f8;
                case 25: goto L_0x01f5;
                case 26: goto L_0x01f2;
                case 27: goto L_0x01ef;
                case 28: goto L_0x01ec;
                case 29: goto L_0x01e9;
                case 30: goto L_0x01e6;
                case 31: goto L_0x01e3;
                case 32: goto L_0x01e0;
                case 33: goto L_0x01dd;
                case 34: goto L_0x01da;
                case 35: goto L_0x01d7;
                case 36: goto L_0x01d4;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Invalid feature name: "
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0243
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x0247
        L_0x01d4:
            r2.L = r4
            return
        L_0x01d7:
            r2.K = r4
            return
        L_0x01da:
            r2.J = r4
            return
        L_0x01dd:
            r2.I = r4
            return
        L_0x01e0:
            r2.H = r4
            return
        L_0x01e3:
            r2.G = r4
            return
        L_0x01e6:
            r2.F = r4
            return
        L_0x01e9:
            r2.E = r4
            return
        L_0x01ec:
            r2.D = r4
            return
        L_0x01ef:
            r2.C = r4
            return
        L_0x01f2:
            r2.B = r4
            return
        L_0x01f5:
            r2.A = r4
            return
        L_0x01f8:
            r2.z = r4
            return
        L_0x01fb:
            r2.y = r4
            return
        L_0x01fe:
            r2.x = r4
            return
        L_0x0201:
            r2.w = r4
            return
        L_0x0204:
            r2.v = r4
            return
        L_0x0207:
            r2.u = r4
            return
        L_0x020a:
            r2.t = r4
            return
        L_0x020d:
            r2.s = r4
            return
        L_0x0210:
            r2.r = r4
            return
        L_0x0213:
            r2.q = r4
            return
        L_0x0216:
            r2.p = r4
            return
        L_0x0219:
            r2.o = r4
            return
        L_0x021c:
            r2.n = r4
            return
        L_0x021f:
            r2.m = r4
            return
        L_0x0222:
            r2.l = r4
            return
        L_0x0225:
            r2.k = r4
            return
        L_0x0228:
            r2.j = r4
            return
        L_0x022b:
            r2.i = r4
            return
        L_0x022e:
            r2.h = r4
            return
        L_0x0231:
            r2.g = r4
            return
        L_0x0234:
            r2.f = r4
            return
        L_0x0237:
            r2.e = r4
            return
        L_0x023a:
            r2.d = r4
            return
        L_0x023d:
            r2.c = r4
            return
        L_0x0240:
            r2.b = r4
            return
        L_0x0243:
            java.lang.String r3 = r0.concat(r3)
        L_0x0247:
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpf.a(java.lang.String, float):void");
    }
}
