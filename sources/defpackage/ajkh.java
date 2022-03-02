package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ajkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajkh {
    public final Long a;
    public final Boolean b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final Boolean i = null;
    public final int j;
    private final List k;

    public ajkh(ajkg ajkg) {
        this.a = ajkg.a;
        this.b = ajkg.b;
        this.c = ajkg.c;
        this.d = ajkg.d;
        this.e = ajkg.e;
        this.f = ajkg.f;
        this.g = ajkg.g;
        this.h = ajkg.h;
        this.k = ajkg.i;
        this.j = ajkg.j;
    }

    public static int a(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown account type: ");
        sb.append(i2);
        String sb2 = sb.toString();
        ajix.b("GCoreUlr", sb2, (Throwable) new Exception(sb2));
        return 0;
    }

    public final List b() {
        return Collections.unmodifiableList(this.k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajkh) {
            ajkh ajkh = (ajkh) obj;
            if (atiu.a(this.a, ajkh.a) && atiu.a(this.b, ajkh.b) && atiu.a(this.c, ajkh.c) && atiu.a(this.d, ajkh.d) && atiu.a(this.e, ajkh.e) && atiu.a(this.k, ajkh.k)) {
                Boolean bool = ajkh.i;
                if (atiu.a((Object) null, (Object) null) && this.f == ajkh.f && this.g == ajkh.g && this.h == ajkh.h && this.j == ajkh.j) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.k, null, Integer.valueOf(this.j)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        String valueOf4 = String.valueOf(this.k);
        String valueOf5 = String.valueOf((Object) null);
        int i5 = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 242 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("GetSettingsResults{mModMillis=");
        sb.append(valueOf);
        sb.append(", mReportingEnabled=");
        sb.append(valueOf2);
        sb.append(", mReportingSource=");
        sb.append(str);
        sb.append(", mHistoryEnabled=");
        sb.append(valueOf3);
        sb.append(", mHistorySource=");
        sb.append(str2);
        sb.append(", mUserRestriction=");
        sb.append(i2);
        sb.append(", mSource=");
        sb.append(i3);
        sb.append(", mConcurrencyType=");
        sb.append(i4);
        sb.append(", mDeletions=");
        sb.append(valueOf4);
        sb.append(", mPrimaryDevice=");
        sb.append(valueOf5);
        sb.append(", mAccountType=");
        sb.append(i5);
        sb.append('}');
        return sb.toString();
    }

    public static ajkg a() {
        return new ajkg();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        if (r4 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (defpackage.aztb.v() != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ajkh a(android.accounts.Account r16, defpackage.atdl r17) {
        /*
            r0 = r17
            int r1 = r0.f
            int r1 = defpackage.atdi.a(r1)
            r2 = 1
            if (r1 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            r3 = 2
            if (r1 != r3) goto L_0x0049
            java.lang.String r4 = java.lang.String.valueOf(r17)
            java.lang.String r5 = defpackage.rmp.a((android.accounts.Account) r16)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 21
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "Server reports: "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " for "
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            java.lang.String r5 = "GCoreUlr"
            defpackage.ajix.b((java.lang.String) r5, (java.lang.String) r4)
        L_0x0049:
            int r4 = r0.a
            r4 = r4 & 8
            r5 = -1
            r6 = 0
            if (r4 == 0) goto L_0x00bc
            boolean r4 = defpackage.azsv.b()
            int r7 = r0.e
            int r7 = defpackage.atdk.a(r7)
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r7 = 1
        L_0x005f:
            int r7 = r7 + r5
            switch(r7) {
                case 1: goto L_0x0093;
                case 2: goto L_0x0091;
                case 3: goto L_0x008f;
                case 4: goto L_0x008d;
                case 5: goto L_0x008b;
                case 6: goto L_0x0089;
                case 7: goto L_0x0063;
                case 8: goto L_0x007f;
                case 9: goto L_0x007f;
                case 10: goto L_0x0075;
                case 11: goto L_0x006b;
                case 12: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            r7 = -1
            goto L_0x0094
        L_0x0065:
            if (r4 != 0) goto L_0x0069
            r7 = -1
            goto L_0x0094
        L_0x0069:
            r7 = 0
            goto L_0x0094
        L_0x006b:
            boolean r7 = defpackage.aztb.N()
            if (r7 != 0) goto L_0x0073
            r7 = -1
            goto L_0x0094
        L_0x0073:
            r7 = 0
            goto L_0x0094
        L_0x0075:
            boolean r7 = defpackage.aztb.v()
            if (r7 != 0) goto L_0x007d
            r7 = -1
            goto L_0x0094
        L_0x007d:
            r7 = 0
            goto L_0x0094
        L_0x007f:
            boolean r7 = defpackage.aztb.O()
            if (r7 != 0) goto L_0x0087
            r7 = -1
            goto L_0x0094
        L_0x0087:
            r7 = 0
            goto L_0x0094
        L_0x0089:
            r7 = 6
            goto L_0x0094
        L_0x008b:
            r7 = 5
            goto L_0x0094
        L_0x008d:
            r7 = 4
            goto L_0x0094
        L_0x008f:
            r7 = 3
            goto L_0x0094
        L_0x0091:
            r7 = 2
            goto L_0x0094
        L_0x0093:
            r7 = 1
        L_0x0094:
            int r8 = r0.e
            int r8 = defpackage.atdk.a(r8)
            if (r8 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = 1
        L_0x009e:
            int r8 = r8 + r5
            switch(r8) {
                case 8: goto L_0x00ba;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00a7;
                case 12: goto L_0x00a4;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r3 = 0
            goto L_0x00bb
        L_0x00a4:
            if (r4 == 0) goto L_0x00b7
            goto L_0x00b6
        L_0x00a7:
            boolean r4 = defpackage.aztb.N()
            if (r4 == 0) goto L_0x00ae
            goto L_0x00b9
        L_0x00ae:
            r3 = 0
            goto L_0x00bb
        L_0x00b0:
            boolean r4 = defpackage.aztb.v()
            if (r4 == 0) goto L_0x00b7
        L_0x00b6:
            goto L_0x00bb
        L_0x00b7:
            r3 = 0
            goto L_0x00bb
        L_0x00b9:
            goto L_0x00bb
        L_0x00ba:
            r3 = 1
        L_0x00bb:
            goto L_0x00be
        L_0x00bc:
            r3 = 0
            r7 = 0
        L_0x00be:
            ajkg r4 = a()
            long r8 = r0.b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.a = r8
            boolean r8 = r0.d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4.b = r8
            boolean r8 = r0.c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4.d = r8
            r4.f = r7
            int r1 = r1 + r5
            r4.g = r1
            int r1 = r0.g
            int r1 = defpackage.atdg.a(r1)
            if (r1 == 0) goto L_0x00e9
            r2 = r1
            goto L_0x00ea
        L_0x00e9:
        L_0x00ea:
            r4.h = r2
            aucx r0 = r0.h
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x0115
            int r2 = r0.size()
        L_0x00f9:
            if (r6 >= r2) goto L_0x0115
            java.lang.Object r5 = r0.get(r6)
            atca r5 = (defpackage.atca) r5
            com.google.android.gms.location.reporting.Deletion r15 = new com.google.android.gms.location.reporting.Deletion
            long r9 = r5.b
            long r11 = r5.c
            long r13 = r5.a
            r7 = r15
            r8 = r16
            r7.<init>(r8, r9, r11, r13)
            r1.add(r15)
            int r6 = r6 + 1
            goto L_0x00f9
        L_0x0115:
            r4.a(r1)
            r4.j = r3
            ajkh r0 = r4.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkh.a(android.accounts.Account, atdl):ajkh");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0187, code lost:
        if (r8 != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018e, code lost:
        if (defpackage.aztb.N() != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0195, code lost:
        if (defpackage.aztb.v() != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0199, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        if (defpackage.aztb.O() == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013f, code lost:
        if (r1 != 2) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0143, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ajkh a(android.accounts.Account r17, com.google.android.ulr.ApiSettings r18) {
        /*
            r0 = r18
            java.util.HashMap r1 = r0.b
            java.lang.String r2 = "source"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 3
            r3 = 1
            r5 = 2
            if (r1 == 0) goto L_0x004a
            java.lang.String r7 = "success"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x004a
            java.lang.String r7 = "noData"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0048
            java.lang.String r7 = "restricted"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = "concurrentUpdate"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0044
            java.lang.String r7 = "Unknown source from server: "
            int r8 = r1.length()
            if (r8 != 0) goto L_0x003f
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
            goto L_0x0042
        L_0x003f:
            r7.concat(r1)
        L_0x0042:
            r1 = -1
            goto L_0x004b
        L_0x0044:
            r1 = 3
            goto L_0x004b
        L_0x0046:
            r1 = 2
            goto L_0x004b
        L_0x0048:
            r1 = 1
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            java.lang.String r7 = "GCoreUlr"
            if (r1 != r3) goto L_0x0086
            java.lang.String r8 = java.lang.String.valueOf(r18)
            java.lang.String r9 = defpackage.rmp.a((android.accounts.Account) r17)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r10 = r10 + 21
            int r10 = r10 + r11
            r12.<init>(r10)
            java.lang.String r10 = "Server reports: "
            r12.append(r10)
            r12.append(r8)
            java.lang.String r8 = " for "
            r12.append(r8)
            r12.append(r9)
            java.lang.String r8 = r12.toString()
            defpackage.ajix.b((java.lang.String) r7, (java.lang.String) r8)
        L_0x0086:
            boolean r8 = defpackage.azsv.b()
            java.lang.String r9 = r18.b()
            r11 = 5
            java.lang.String r12 = "griffinParentOnly"
            java.lang.String r13 = "unicornParentOnly"
            java.lang.String r14 = "supervisedMemberRestricted"
            java.lang.String r15 = "unicornAllowed"
            java.lang.String r4 = "eponaRestricted"
            r6 = 4
            if (r9 == 0) goto L_0x013f
            int r16 = r9.hashCode()
            switch(r16) {
                case -2062891781: goto L_0x0102;
                case -2056159669: goto L_0x00f8;
                case -2026577620: goto L_0x00ee;
                case -1847287406: goto L_0x00e5;
                case -953793114: goto L_0x00db;
                case -470435171: goto L_0x00d1;
                case 888226288: goto L_0x00c9;
                case 910836953: goto L_0x00c0;
                case 947761710: goto L_0x00b8;
                case 1396332441: goto L_0x00af;
                case 2114381265: goto L_0x00a5;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            goto L_0x010c
        L_0x00a5:
            java.lang.String r10 = "dasherPolicy"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x010c
            r9 = 2
            goto L_0x010d
        L_0x00af:
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x010c
            r9 = 10
            goto L_0x010d
        L_0x00b8:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x010c
            r9 = 7
            goto L_0x010d
        L_0x00c0:
            boolean r9 = r9.equals(r14)
            if (r9 == 0) goto L_0x010c
            r9 = 9
            goto L_0x010d
        L_0x00c9:
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x010c
            r9 = 6
            goto L_0x010d
        L_0x00d1:
            java.lang.String r10 = "legalCountry"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x010c
            r9 = 3
            goto L_0x010d
        L_0x00db:
            java.lang.String r10 = "accountPurged"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x010c
            r9 = 5
            goto L_0x010d
        L_0x00e5:
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x010c
            r9 = 8
            goto L_0x010d
        L_0x00ee:
            java.lang.String r10 = "accountDeleted"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x010c
            r9 = 4
            goto L_0x010d
        L_0x00f8:
            java.lang.String r10 = "ageUnknown"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x010c
            r9 = 1
            goto L_0x010d
        L_0x0102:
            java.lang.String r10 = "ageUnder13"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x010c
            r9 = 0
            goto L_0x010d
        L_0x010c:
            r9 = -1
        L_0x010d:
            switch(r9) {
                case 0: goto L_0x013d;
                case 1: goto L_0x013b;
                case 2: goto L_0x0139;
                case 3: goto L_0x0137;
                case 4: goto L_0x0135;
                case 5: goto L_0x0133;
                case 6: goto L_0x012c;
                case 7: goto L_0x012c;
                case 8: goto L_0x0122;
                case 9: goto L_0x0118;
                case 10: goto L_0x0112;
                default: goto L_0x0110;
            }
        L_0x0110:
            r10 = -1
            goto L_0x0144
        L_0x0112:
            if (r8 != 0) goto L_0x0116
            r10 = -1
            goto L_0x0144
        L_0x0116:
            r10 = 0
            goto L_0x0144
        L_0x0118:
            boolean r9 = defpackage.aztb.N()
            if (r9 != 0) goto L_0x0120
            r10 = -1
            goto L_0x0144
        L_0x0120:
            r10 = 0
            goto L_0x0144
        L_0x0122:
            boolean r9 = defpackage.aztb.v()
            if (r9 != 0) goto L_0x012a
            r10 = -1
            goto L_0x0144
        L_0x012a:
            r10 = 0
            goto L_0x0144
        L_0x012c:
            boolean r9 = defpackage.aztb.O()
            if (r9 != 0) goto L_0x0141
            goto L_0x0143
        L_0x0133:
            r10 = 6
            goto L_0x0144
        L_0x0135:
            r10 = 5
            goto L_0x0144
        L_0x0137:
            r10 = 4
            goto L_0x0144
        L_0x0139:
            r10 = 3
            goto L_0x0144
        L_0x013b:
            r10 = 2
            goto L_0x0144
        L_0x013d:
            r10 = 1
            goto L_0x0144
        L_0x013f:
            if (r1 == r5) goto L_0x0143
        L_0x0141:
            r10 = 0
            goto L_0x0144
        L_0x0143:
            r10 = -1
        L_0x0144:
            java.lang.String r9 = r18.b()
            if (r9 == 0) goto L_0x019f
            int r11 = r9.hashCode()
            switch(r11) {
                case -1847287406: goto L_0x0172;
                case 888226288: goto L_0x016a;
                case 910836953: goto L_0x0162;
                case 947761710: goto L_0x015a;
                case 1396332441: goto L_0x0152;
                default: goto L_0x0151;
            }
        L_0x0151:
            goto L_0x017a
        L_0x0152:
            boolean r4 = r9.equals(r12)
            if (r4 == 0) goto L_0x017a
            r4 = 4
            goto L_0x017b
        L_0x015a:
            boolean r4 = r9.equals(r13)
            if (r4 == 0) goto L_0x017a
            r4 = 1
            goto L_0x017b
        L_0x0162:
            boolean r4 = r9.equals(r14)
            if (r4 == 0) goto L_0x017a
            r4 = 3
            goto L_0x017b
        L_0x016a:
            boolean r4 = r9.equals(r15)
            if (r4 == 0) goto L_0x017a
            r4 = 0
            goto L_0x017b
        L_0x0172:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x017a
            r4 = 2
            goto L_0x017b
        L_0x017a:
            r4 = -1
        L_0x017b:
            if (r4 == 0) goto L_0x019d
            if (r4 == r3) goto L_0x019b
            if (r4 == r5) goto L_0x0191
            if (r4 == r2) goto L_0x018a
            if (r4 == r6) goto L_0x0187
            r2 = 0
            goto L_0x01a0
        L_0x0187:
            if (r8 == 0) goto L_0x0199
            goto L_0x0197
        L_0x018a:
            boolean r2 = defpackage.aztb.N()
            if (r2 == 0) goto L_0x019f
            goto L_0x019b
        L_0x0191:
            boolean r2 = defpackage.aztb.v()
            if (r2 == 0) goto L_0x0199
        L_0x0197:
            r2 = 2
            goto L_0x01a0
        L_0x0199:
            r2 = 0
            goto L_0x01a0
        L_0x019b:
            r2 = 2
            goto L_0x01a0
        L_0x019d:
            r2 = 1
            goto L_0x01a0
        L_0x019f:
            r2 = 0
        L_0x01a0:
            ajkg r4 = a()
            java.util.HashMap r6 = r0.b
            java.lang.String r8 = "lastModifiedTimestampMs"
            java.lang.Object r6 = r6.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            r4.a = r6
            java.util.HashMap r6 = r0.b
            java.lang.String r8 = "reportingEnabled"
            java.lang.Object r6 = r6.get(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r4.b = r6
            java.util.HashMap r6 = r0.b
            java.lang.String r8 = "historyEnabled"
            java.lang.Object r6 = r6.get(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r4.d = r6
            r4.f = r10
            r4.g = r1
            java.util.HashMap r1 = r0.b
            java.lang.String r6 = "concurrencyType"
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0207
            java.lang.String r6 = "settingsChanged"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0206
            java.lang.String r3 = "deviceTagUnknown"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0204
            java.lang.String r3 = "Unknown concurrencyType from server: "
            int r5 = r1.length()
            if (r5 != 0) goto L_0x01f6
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
            goto L_0x01fa
        L_0x01f6:
            java.lang.String r1 = r3.concat(r1)
        L_0x01fa:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r1)
            defpackage.ajix.b((java.lang.String) r7, (java.lang.String) r1, (java.lang.Throwable) r3)
            r3 = -1
            goto L_0x0208
        L_0x0204:
            r3 = 2
            goto L_0x0208
        L_0x0206:
            goto L_0x0208
        L_0x0207:
            r3 = 0
        L_0x0208:
            r4.h = r3
            java.util.ArrayList r0 = r18.getDeleteOperations()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x025a
            int r3 = r0.size()
            r6 = 0
        L_0x021a:
            if (r6 >= r3) goto L_0x025a
            java.lang.Object r5 = r0.get(r6)
            com.google.android.ulr.ApiDeleteHistoryOperation r5 = (com.google.android.ulr.ApiDeleteHistoryOperation) r5
            com.google.android.gms.location.reporting.Deletion r15 = new com.google.android.gms.location.reporting.Deletion
            java.util.HashMap r7 = r5.b
            java.lang.String r8 = "firstTimestampMs"
            java.lang.Object r7 = r7.get(r8)
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.util.HashMap r7 = r5.b
            java.lang.String r8 = "lastTimestampMs"
            java.lang.Object r7 = r7.get(r8)
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            java.util.HashMap r5 = r5.b
            java.lang.String r7 = "operationTimestamp"
            java.lang.Object r5 = r5.get(r7)
            java.lang.Long r5 = (java.lang.Long) r5
            long r13 = r5.longValue()
            r7 = r15
            r8 = r17
            r7.<init>(r8, r9, r11, r13)
            r1.add(r15)
            int r6 = r6 + 1
            goto L_0x021a
        L_0x025a:
            r4.a(r1)
            r4.j = r2
            ajkh r0 = r4.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkh.a(android.accounts.Account, com.google.android.ulr.ApiSettings):ajkh");
    }
}
