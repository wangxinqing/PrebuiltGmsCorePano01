package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: suo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class suo extends sxi {
    aoub a;

    public suo(sze sze) {
        super(sze);
    }

    public final String a(String str, String str2) {
        iva.a((Object) str);
        if (str2 == null) {
            str2 = "";
        }
        aoub aoub = this.a;
        if (aoub != null) {
            try {
                return Base64.encodeToString(aoub.a(str.getBytes("UTF-8"), str2.getBytes("UTF-8")), 0);
            } catch (Exception e) {
                E().j.a("Error during encryption of value", e.getMessage());
                throw new SecurityException("Failed to encrypt data.", e);
            }
        } else {
            throw new SecurityException("Failed to get encryption primitive.");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02a7, code lost:
        if (r8 == 1) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02aa, code lost:
        if (r8 == 2) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ad, code lost:
        if (r8 == 3) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02b0, code lost:
        if (r8 == 4) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02b2, code lost:
        r6 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b5, code lost:
        r6 = r23 + 1;
        r5[r23] = (byte) (r21 >> 10);
        r5[r6] = (byte) (r21 >> 2);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02c7, code lost:
        r6 = r23 + 1;
        r5[r23] = (byte) (r21 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02d0, code lost:
        r7.b = r8;
        r5 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d5, code lost:
        if (r6 == r5.length) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02d7, code lost:
        r7 = new byte[r6];
        java.lang.System.arraycopy(r5, 0, r7, 0, r6);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02e0, code lost:
        r6 = defpackage.aoyu.d.o();
        r7 = r12.getString("typeUrl");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ec, code lost:
        if (r6.c != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ef, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f5, code lost:
        r7.getClass();
        ((defpackage.aoyu) r6.b).a = r7;
        r5 = defpackage.auay.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0304, code lost:
        if (r6.c != false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0307, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x030d, code lost:
        r5.getClass();
        ((defpackage.aoyu) r6.b).b = r5;
        r5 = r12.getString("keyMaterialType");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0320, code lost:
        if (r5.equals("SYMMETRIC") != false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0328, code lost:
        if (r5.equals("ASYMMETRIC_PRIVATE") != false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0330, code lost:
        if (r5.equals("ASYMMETRIC_PUBLIC") != false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0338, code lost:
        if (r5.equals("REMOTE") != false) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x033a, code lost:
        r3 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0346, code lost:
        if (r3.length() != 0) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0348, code lost:
        r3 = new java.lang.String("unknown key material type: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x034e, code lost:
        r3 = "unknown key material type: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0355, code lost:
        throw new org.json.JSONException(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0356, code lost:
        r7 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0358, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x035a, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x035c, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x035f, code lost:
        if (r6.c != false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0362, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0368, code lost:
        ((defpackage.aoyu) r6.b).c = defpackage.aoyt.a(r7);
        r1 = (defpackage.aoyu) r6.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x037a, code lost:
        if (r13.c != false) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x037e, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0384, code lost:
        r1.getClass();
        ((defpackage.aoyz) r13.b).a = r1;
        r11.a((defpackage.aoyz) r13.i());
        r10 = r10 + 1;
        r1 = r27;
        r7 = r16;
        r5 = r19;
        r3 = r20;
        r6 = r22;
        r8 = r24;
        r9 = r25;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.InputStream r28) {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "keyMaterialType"
            java.lang.String r3 = "value"
            java.lang.String r4 = "typeUrl"
            java.lang.String r5 = "outputPrefixType"
            java.lang.String r6 = "keyId"
            java.lang.String r7 = "status"
            java.lang.String r8 = "keyData"
            java.lang.String r9 = "primaryKeyId"
            java.lang.String r10 = "key"
            defpackage.iva.a((java.lang.Object) r28)
            defpackage.aowl.a()     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            aouc r11 = new aouc     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            r12 = r28
            r11.<init>(r12)     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r13 = new java.lang.String     // Catch:{ JSONException -> 0x03c9 }
            java.io.InputStream r11 = r11.b     // Catch:{ JSONException -> 0x03c9 }
            byte[] r11 = defpackage.aovc.a((java.io.InputStream) r11)     // Catch:{ JSONException -> 0x03c9 }
            java.nio.charset.Charset r14 = defpackage.aouc.a     // Catch:{ JSONException -> 0x03c9 }
            r13.<init>(r11, r14)     // Catch:{ JSONException -> 0x03c9 }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x03c9 }
            boolean r11 = r12.has(r10)     // Catch:{ JSONException -> 0x03c9 }
            if (r11 == 0) goto L_0x03c1
            org.json.JSONArray r11 = r12.getJSONArray(r10)     // Catch:{ JSONException -> 0x03c9 }
            int r11 = r11.length()     // Catch:{ JSONException -> 0x03c9 }
            if (r11 == 0) goto L_0x03c1
            aoza r11 = defpackage.aoza.c     // Catch:{ JSONException -> 0x03c9 }
            aucd r11 = r11.o()     // Catch:{ JSONException -> 0x03c9 }
            aoyy r11 = (defpackage.aoyy) r11     // Catch:{ JSONException -> 0x03c9 }
            boolean r13 = r12.has(r9)     // Catch:{ JSONException -> 0x03c9 }
            r14 = 0
            if (r13 == 0) goto L_0x0066
            int r9 = r12.getInt(r9)     // Catch:{ JSONException -> 0x03c9 }
            boolean r13 = r11.c     // Catch:{ JSONException -> 0x03c9 }
            if (r13 != 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            r11.c()     // Catch:{ JSONException -> 0x03c9 }
            r11.c = r14     // Catch:{ JSONException -> 0x03c9 }
        L_0x0060:
            aucj r13 = r11.b     // Catch:{ JSONException -> 0x03c9 }
            aoza r13 = (defpackage.aoza) r13     // Catch:{ JSONException -> 0x03c9 }
            r13.a = r9     // Catch:{ JSONException -> 0x03c9 }
        L_0x0066:
            org.json.JSONArray r9 = r12.getJSONArray(r10)     // Catch:{ JSONException -> 0x03c9 }
            r10 = 0
        L_0x006c:
            int r12 = r9.length()     // Catch:{ JSONException -> 0x03c9 }
            if (r10 < r12) goto L_0x0086
            aucj r2 = r11.i()     // Catch:{ JSONException -> 0x03c9 }
            aoza r2 = (defpackage.aoza) r2     // Catch:{ JSONException -> 0x03c9 }
            defpackage.aouo.a((defpackage.aoza) r2)     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            aouj r2 = defpackage.aouj.a((defpackage.aoza) r2)     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            aoub r2 = defpackage.aowo.a(r2)     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            r1.a = r2     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            return
        L_0x0086:
            org.json.JSONObject r12 = r9.getJSONObject(r10)     // Catch:{ JSONException -> 0x03c9 }
            boolean r13 = r12.has(r8)     // Catch:{ JSONException -> 0x03c9 }
            if (r13 == 0) goto L_0x03b9
            boolean r13 = r12.has(r7)     // Catch:{ JSONException -> 0x03c9 }
            if (r13 == 0) goto L_0x03b9
            boolean r13 = r12.has(r6)     // Catch:{ JSONException -> 0x03c9 }
            if (r13 == 0) goto L_0x03b9
            boolean r13 = r12.has(r5)     // Catch:{ JSONException -> 0x03c9 }
            if (r13 == 0) goto L_0x03b9
            aoyz r13 = defpackage.aoyz.e     // Catch:{ JSONException -> 0x03c9 }
            aucd r13 = r13.o()     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r15 = r12.getString(r7)     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r14 = "ENABLED"
            boolean r14 = r15.equals(r14)     // Catch:{ JSONException -> 0x03c9 }
            r16 = r7
            if (r14 != 0) goto L_0x00dd
            java.lang.String r14 = "DISABLED"
            boolean r14 = r15.equals(r14)     // Catch:{ JSONException -> 0x03c9 }
            if (r14 != 0) goto L_0x00db
            org.json.JSONException r2 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r4 = "unknown status: "
            int r5 = r3.length()     // Catch:{ JSONException -> 0x03c9 }
            if (r5 != 0) goto L_0x00d3
            java.lang.String r3 = new java.lang.String     // Catch:{ JSONException -> 0x03c9 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x03c9 }
            goto L_0x00d7
        L_0x00d3:
            java.lang.String r3 = r4.concat(r3)     // Catch:{ JSONException -> 0x03c9 }
        L_0x00d7:
            r2.<init>(r3)     // Catch:{ JSONException -> 0x03c9 }
            throw r2     // Catch:{ JSONException -> 0x03c9 }
        L_0x00db:
            r14 = 4
            goto L_0x00de
        L_0x00dd:
            r14 = 3
        L_0x00de:
            boolean r15 = r13.c     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            r13.c()     // Catch:{ JSONException -> 0x03c9 }
            r15 = 0
            r13.c = r15     // Catch:{ JSONException -> 0x03c9 }
        L_0x00e9:
            aucj r15 = r13.b     // Catch:{ JSONException -> 0x03c9 }
            aoyz r15 = (defpackage.aoyz) r15     // Catch:{ JSONException -> 0x03c9 }
            int r14 = defpackage.aoyv.a(r14)     // Catch:{ JSONException -> 0x03c9 }
            r15.b = r14     // Catch:{ JSONException -> 0x03c9 }
            int r14 = r12.getInt(r6)     // Catch:{ JSONException -> 0x03c9 }
            boolean r15 = r13.c     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            r13.c()     // Catch:{ JSONException -> 0x03c9 }
            r15 = 0
            r13.c = r15     // Catch:{ JSONException -> 0x03c9 }
        L_0x0102:
            aucj r15 = r13.b     // Catch:{ JSONException -> 0x03c9 }
            aoyz r15 = (defpackage.aoyz) r15     // Catch:{ JSONException -> 0x03c9 }
            r15.c = r14     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r14 = r12.getString(r5)     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r15 = "TINK"
            boolean r15 = r14.equals(r15)     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x014e
            java.lang.String r15 = "RAW"
            boolean r15 = r14.equals(r15)     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x014c
            java.lang.String r15 = "LEGACY"
            boolean r15 = r14.equals(r15)     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x014a
            java.lang.String r15 = "CRUNCHY"
            boolean r15 = r14.equals(r15)     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x0148
            org.json.JSONException r2 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r4 = "unknown output prefix type: "
            int r5 = r3.length()     // Catch:{ JSONException -> 0x03c9 }
            if (r5 != 0) goto L_0x0140
            java.lang.String r3 = new java.lang.String     // Catch:{ JSONException -> 0x03c9 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x03c9 }
            goto L_0x0144
        L_0x0140:
            java.lang.String r3 = r4.concat(r3)     // Catch:{ JSONException -> 0x03c9 }
        L_0x0144:
            r2.<init>(r3)     // Catch:{ JSONException -> 0x03c9 }
            throw r2     // Catch:{ JSONException -> 0x03c9 }
        L_0x0148:
            r14 = 6
            goto L_0x014f
        L_0x014a:
            r14 = 4
            goto L_0x014f
        L_0x014c:
            r14 = 5
            goto L_0x014f
        L_0x014e:
            r14 = 3
        L_0x014f:
            boolean r15 = r13.c     // Catch:{ JSONException -> 0x03c9 }
            if (r15 != 0) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            r13.c()     // Catch:{ JSONException -> 0x03c9 }
            r15 = 0
            r13.c = r15     // Catch:{ JSONException -> 0x03c9 }
        L_0x015a:
            aucj r15 = r13.b     // Catch:{ JSONException -> 0x03c9 }
            aoyz r15 = (defpackage.aoyz) r15     // Catch:{ JSONException -> 0x03c9 }
            int r14 = defpackage.aozh.a(r14)     // Catch:{ JSONException -> 0x03c9 }
            r15.d = r14     // Catch:{ JSONException -> 0x03c9 }
            org.json.JSONObject r12 = r12.getJSONObject(r8)     // Catch:{ JSONException -> 0x03c9 }
            boolean r14 = r12.has(r4)     // Catch:{ JSONException -> 0x03c9 }
            if (r14 == 0) goto L_0x03b1
            boolean r14 = r12.has(r3)     // Catch:{ JSONException -> 0x03c9 }
            if (r14 == 0) goto L_0x03b1
            boolean r14 = r12.has(r2)     // Catch:{ JSONException -> 0x03c9 }
            if (r14 == 0) goto L_0x03b1
            java.lang.String r14 = r12.getString(r3)     // Catch:{ JSONException -> 0x03c9 }
            java.nio.charset.Charset r15 = defpackage.apbf.a     // Catch:{ JSONException -> 0x03c9 }
            byte[] r14 = r14.getBytes(r15)     // Catch:{ JSONException -> 0x03c9 }
            int r15 = r14.length     // Catch:{ JSONException -> 0x03c9 }
            apbe r7 = new apbe     // Catch:{ JSONException -> 0x03c9 }
            int r19 = r15 * 3
            r20 = r3
            r17 = 4
            int r3 = r19 / 4
            byte[] r3 = new byte[r3]     // Catch:{ JSONException -> 0x03c9 }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x03c9 }
            int r3 = r7.b     // Catch:{ JSONException -> 0x03c9 }
            r19 = r5
            r5 = 6
            if (r3 == r5) goto L_0x03a9
            byte[] r5 = r7.a     // Catch:{ JSONException -> 0x03c9 }
            r21 = r3
            int[] r3 = r7.c     // Catch:{ JSONException -> 0x03c9 }
            r22 = r6
            r24 = r8
            r8 = r21
            r6 = 0
            r21 = 0
            r23 = 0
        L_0x01ad:
            r25 = r9
            if (r6 >= r15) goto L_0x02a5
            if (r8 == 0) goto L_0x01b4
            goto L_0x0206
        L_0x01b4:
        L_0x01b5:
            int r9 = r6 + 4
            if (r9 > r15) goto L_0x0202
            r26 = r9
            byte r9 = r14[r6]     // Catch:{ JSONException -> 0x03c9 }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r3[r9]     // Catch:{ JSONException -> 0x03c9 }
            int r9 = r9 << 18
            int r21 = r6 + 1
            byte r1 = r14[r21]     // Catch:{ JSONException -> 0x03c9 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r3[r1]     // Catch:{ JSONException -> 0x03c9 }
            int r1 = r1 << 12
            r1 = r1 | r9
            int r9 = r6 + 2
            byte r9 = r14[r9]     // Catch:{ JSONException -> 0x03c9 }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r3[r9]     // Catch:{ JSONException -> 0x03c9 }
            r18 = 6
            int r9 = r9 << 6
            r1 = r1 | r9
            int r9 = r6 + 3
            byte r9 = r14[r9]     // Catch:{ JSONException -> 0x03c9 }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r3[r9]     // Catch:{ JSONException -> 0x03c9 }
            r1 = r1 | r9
            if (r1 < 0) goto L_0x0200
            int r6 = r23 + 2
            byte r9 = (byte) r1     // Catch:{ JSONException -> 0x03c9 }
            r5[r6] = r9     // Catch:{ JSONException -> 0x03c9 }
            int r6 = r23 + 1
            int r9 = r1 >> 8
            byte r9 = (byte) r9     // Catch:{ JSONException -> 0x03c9 }
            r5[r6] = r9     // Catch:{ JSONException -> 0x03c9 }
            int r6 = r1 >> 16
            byte r6 = (byte) r6     // Catch:{ JSONException -> 0x03c9 }
            r5[r23] = r6     // Catch:{ JSONException -> 0x03c9 }
            int r23 = r23 + 3
            r21 = r1
            r6 = r26
            r1 = r27
            goto L_0x01b5
        L_0x0200:
            r21 = r1
        L_0x0202:
            if (r6 < r15) goto L_0x0206
            goto L_0x02a6
        L_0x0206:
            int r1 = r6 + 1
            byte r6 = r14[r6]     // Catch:{ JSONException -> 0x03c9 }
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r3[r6]     // Catch:{ JSONException -> 0x03c9 }
            if (r8 == 0) goto L_0x0293
            r9 = 1
            if (r8 == r9) goto L_0x0285
            r9 = 2
            if (r8 == r9) goto L_0x0269
            r9 = 3
            if (r8 == r9) goto L_0x0236
            r9 = 4
            if (r8 == r9) goto L_0x0225
            r9 = 5
            if (r8 == r9) goto L_0x0221
        L_0x021f:
            goto L_0x029e
        L_0x0221:
            r9 = -1
            if (r6 != r9) goto L_0x0231
            goto L_0x021f
        L_0x0225:
            r9 = -2
            if (r6 != r9) goto L_0x022d
            int r6 = r8 + 1
            r8 = r6
            goto L_0x029e
        L_0x022d:
            r9 = -1
            if (r6 != r9) goto L_0x0231
            goto L_0x021f
        L_0x0231:
            r1 = 6
            r7.b = r1     // Catch:{ JSONException -> 0x03c9 }
            goto L_0x03a9
        L_0x0236:
            if (r6 < 0) goto L_0x0252
            int r8 = r21 << 6
            r6 = r6 | r8
            int r8 = r23 + 2
            byte r9 = (byte) r6     // Catch:{ JSONException -> 0x03c9 }
            r5[r8] = r9     // Catch:{ JSONException -> 0x03c9 }
            int r8 = r23 + 1
            int r9 = r6 >> 8
            byte r9 = (byte) r9     // Catch:{ JSONException -> 0x03c9 }
            r5[r8] = r9     // Catch:{ JSONException -> 0x03c9 }
            int r8 = r6 >> 16
            byte r8 = (byte) r8     // Catch:{ JSONException -> 0x03c9 }
            r5[r23] = r8     // Catch:{ JSONException -> 0x03c9 }
            int r23 = r23 + 3
            r21 = r6
            r8 = 0
            goto L_0x029e
        L_0x0252:
            r9 = -2
            if (r6 != r9) goto L_0x0265
            int r6 = r23 + 1
            int r8 = r21 >> 2
            byte r8 = (byte) r8     // Catch:{ JSONException -> 0x03c9 }
            r5[r6] = r8     // Catch:{ JSONException -> 0x03c9 }
            int r6 = r21 >> 10
            byte r6 = (byte) r6     // Catch:{ JSONException -> 0x03c9 }
            r5[r23] = r6     // Catch:{ JSONException -> 0x03c9 }
            int r23 = r23 + 2
            r8 = 5
            goto L_0x029e
        L_0x0265:
            r9 = -1
            if (r6 != r9) goto L_0x0231
            goto L_0x029e
        L_0x0269:
            if (r6 < 0) goto L_0x0273
            int r9 = r21 << 6
            r6 = r6 | r9
            int r8 = r8 + 1
            r21 = r6
            goto L_0x029e
        L_0x0273:
            r9 = -2
            if (r6 != r9) goto L_0x0281
            int r6 = r23 + 1
            int r8 = r21 >> 4
            byte r8 = (byte) r8     // Catch:{ JSONException -> 0x03c9 }
            r5[r23] = r8     // Catch:{ JSONException -> 0x03c9 }
            r23 = r6
            r8 = 4
            goto L_0x029e
        L_0x0281:
            r9 = -1
            if (r6 != r9) goto L_0x0231
            goto L_0x0292
        L_0x0285:
            if (r6 < 0) goto L_0x028f
            int r9 = r21 << 6
            r6 = r6 | r9
            int r8 = r8 + 1
            r21 = r6
            goto L_0x029e
        L_0x028f:
            r9 = -1
            if (r6 != r9) goto L_0x0231
        L_0x0292:
            goto L_0x029e
        L_0x0293:
            if (r6 < 0) goto L_0x029a
            int r8 = r8 + 1
            r21 = r6
            goto L_0x029e
        L_0x029a:
            r9 = -1
            if (r6 != r9) goto L_0x0231
            goto L_0x021f
        L_0x029e:
            r6 = r1
            r9 = r25
            r1 = r27
            goto L_0x01ad
        L_0x02a5:
        L_0x02a6:
            r1 = 1
            if (r8 == r1) goto L_0x0231
            r1 = 2
            if (r8 == r1) goto L_0x02c7
            r1 = 3
            if (r8 == r1) goto L_0x02b5
            r3 = 4
            if (r8 == r3) goto L_0x0231
            r6 = r23
            goto L_0x02d0
        L_0x02b5:
            r3 = 4
            int r6 = r23 + 1
            int r9 = r21 >> 10
            byte r9 = (byte) r9     // Catch:{ JSONException -> 0x03c9 }
            r5[r23] = r9     // Catch:{ JSONException -> 0x03c9 }
            int r23 = r6 + 1
            int r9 = r21 >> 2
            byte r9 = (byte) r9     // Catch:{ JSONException -> 0x03c9 }
            r5[r6] = r9     // Catch:{ JSONException -> 0x03c9 }
            r6 = r23
            goto L_0x02d0
        L_0x02c7:
            r1 = 3
            r3 = 4
            int r6 = r23 + 1
            int r9 = r21 >> 4
            byte r9 = (byte) r9     // Catch:{ JSONException -> 0x03c9 }
            r5[r23] = r9     // Catch:{ JSONException -> 0x03c9 }
        L_0x02d0:
            r7.b = r8     // Catch:{ JSONException -> 0x03c9 }
            byte[] r5 = r7.a     // Catch:{ JSONException -> 0x03c9 }
            int r7 = r5.length     // Catch:{ JSONException -> 0x03c9 }
            if (r6 == r7) goto L_0x02df
            byte[] r7 = new byte[r6]     // Catch:{ JSONException -> 0x03c9 }
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r7, r8, r6)     // Catch:{ JSONException -> 0x03c9 }
            r5 = r7
            goto L_0x02e0
        L_0x02df:
        L_0x02e0:
            aoyu r6 = defpackage.aoyu.d     // Catch:{ JSONException -> 0x03c9 }
            aucd r6 = r6.o()     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r7 = r12.getString(r4)     // Catch:{ JSONException -> 0x03c9 }
            boolean r8 = r6.c     // Catch:{ JSONException -> 0x03c9 }
            if (r8 != 0) goto L_0x02ef
            goto L_0x02f5
        L_0x02ef:
            r6.c()     // Catch:{ JSONException -> 0x03c9 }
            r8 = 0
            r6.c = r8     // Catch:{ JSONException -> 0x03c9 }
        L_0x02f5:
            aucj r8 = r6.b     // Catch:{ JSONException -> 0x03c9 }
            aoyu r8 = (defpackage.aoyu) r8     // Catch:{ JSONException -> 0x03c9 }
            r7.getClass()     // Catch:{ JSONException -> 0x03c9 }
            r8.a = r7     // Catch:{ JSONException -> 0x03c9 }
            auay r5 = defpackage.auay.a((byte[]) r5)     // Catch:{ JSONException -> 0x03c9 }
            boolean r7 = r6.c     // Catch:{ JSONException -> 0x03c9 }
            if (r7 != 0) goto L_0x0307
            goto L_0x030d
        L_0x0307:
            r6.c()     // Catch:{ JSONException -> 0x03c9 }
            r7 = 0
            r6.c = r7     // Catch:{ JSONException -> 0x03c9 }
        L_0x030d:
            aucj r7 = r6.b     // Catch:{ JSONException -> 0x03c9 }
            aoyu r7 = (defpackage.aoyu) r7     // Catch:{ JSONException -> 0x03c9 }
            r5.getClass()     // Catch:{ JSONException -> 0x03c9 }
            r7.b = r5     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r5 = r12.getString(r2)     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r7 = "SYMMETRIC"
            boolean r7 = r5.equals(r7)     // Catch:{ JSONException -> 0x03c9 }
            if (r7 != 0) goto L_0x035c
            java.lang.String r1 = "ASYMMETRIC_PRIVATE"
            boolean r1 = r5.equals(r1)     // Catch:{ JSONException -> 0x03c9 }
            if (r1 != 0) goto L_0x035a
            java.lang.String r1 = "ASYMMETRIC_PUBLIC"
            boolean r1 = r5.equals(r1)     // Catch:{ JSONException -> 0x03c9 }
            if (r1 != 0) goto L_0x0358
            java.lang.String r1 = "REMOTE"
            boolean r1 = r5.equals(r1)     // Catch:{ JSONException -> 0x03c9 }
            if (r1 != 0) goto L_0x0356
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r2 = "unknown key material type: "
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x03c9 }
            int r4 = r3.length()     // Catch:{ JSONException -> 0x03c9 }
            if (r4 != 0) goto L_0x034e
            java.lang.String r3 = new java.lang.String     // Catch:{ JSONException -> 0x03c9 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x03c9 }
            goto L_0x0352
        L_0x034e:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ JSONException -> 0x03c9 }
        L_0x0352:
            r1.<init>(r3)     // Catch:{ JSONException -> 0x03c9 }
            throw r1     // Catch:{ JSONException -> 0x03c9 }
        L_0x0356:
            r7 = 6
            goto L_0x035d
        L_0x0358:
            r7 = 5
            goto L_0x035d
        L_0x035a:
            r7 = 4
            goto L_0x035d
        L_0x035c:
            r7 = 3
        L_0x035d:
            boolean r1 = r6.c     // Catch:{ JSONException -> 0x03c9 }
            if (r1 != 0) goto L_0x0362
            goto L_0x0368
        L_0x0362:
            r6.c()     // Catch:{ JSONException -> 0x03c9 }
            r1 = 0
            r6.c = r1     // Catch:{ JSONException -> 0x03c9 }
        L_0x0368:
            aucj r1 = r6.b     // Catch:{ JSONException -> 0x03c9 }
            aoyu r1 = (defpackage.aoyu) r1     // Catch:{ JSONException -> 0x03c9 }
            int r3 = defpackage.aoyt.a(r7)     // Catch:{ JSONException -> 0x03c9 }
            r1.c = r3     // Catch:{ JSONException -> 0x03c9 }
            aucj r1 = r6.i()     // Catch:{ JSONException -> 0x03c9 }
            aoyu r1 = (defpackage.aoyu) r1     // Catch:{ JSONException -> 0x03c9 }
            boolean r3 = r13.c     // Catch:{ JSONException -> 0x03c9 }
            if (r3 != 0) goto L_0x037e
            r3 = 0
            goto L_0x0384
        L_0x037e:
            r13.c()     // Catch:{ JSONException -> 0x03c9 }
            r3 = 0
            r13.c = r3     // Catch:{ JSONException -> 0x03c9 }
        L_0x0384:
            aucj r5 = r13.b     // Catch:{ JSONException -> 0x03c9 }
            aoyz r5 = (defpackage.aoyz) r5     // Catch:{ JSONException -> 0x03c9 }
            r1.getClass()     // Catch:{ JSONException -> 0x03c9 }
            r5.a = r1     // Catch:{ JSONException -> 0x03c9 }
            aucj r1 = r13.i()     // Catch:{ JSONException -> 0x03c9 }
            aoyz r1 = (defpackage.aoyz) r1     // Catch:{ JSONException -> 0x03c9 }
            r11.a(r1)     // Catch:{ JSONException -> 0x03c9 }
            int r10 = r10 + 1
            r14 = 0
            r1 = r27
            r7 = r16
            r5 = r19
            r3 = r20
            r6 = r22
            r8 = r24
            r9 = r25
            goto L_0x006c
        L_0x03a9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r2 = "bad base-64"
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03c9 }
            throw r1     // Catch:{ JSONException -> 0x03c9 }
        L_0x03b1:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r2 = "invalid keyData"
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03c9 }
            throw r1     // Catch:{ JSONException -> 0x03c9 }
        L_0x03b9:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r2 = "invalid key"
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03c9 }
            throw r1     // Catch:{ JSONException -> 0x03c9 }
        L_0x03c1:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ JSONException -> 0x03c9 }
            java.lang.String r2 = "invalid keyset"
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03c9 }
            throw r1     // Catch:{ JSONException -> 0x03c9 }
        L_0x03c9:
            r0 = move-exception
            r1 = r0
            java.io.IOException r2 = new java.io.IOException     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            r2.<init>(r1)     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
            throw r2     // Catch:{ GeneralSecurityException -> 0x03d3, IOException -> 0x03d1 }
        L_0x03d1:
            r0 = move-exception
            goto L_0x03d4
        L_0x03d3:
            r0 = move-exception
        L_0x03d4:
            r1 = r0
            sut r2 = r27.E()
            sur r2 = r2.j
            java.lang.String r1 = r1.getMessage()
            java.lang.String r3 = "Failed to initialize encryption primitives"
            r2.a(r3, r1)
            r1 = 0
            r2 = r27
            r2.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suo.a(java.io.InputStream):void");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        InputStream open;
        Context n = this.j.n();
        iva.a((Object) n, (Object) "Context passed for initialization is null");
        try {
            open = n.getAssets().open("public_keys/public-keyset-prod.json");
            a(open);
            if (open == null) {
                return false;
            }
            open.close();
            return false;
        } catch (IOException e) {
            E().j.a("Failed to read public key for encryption");
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
