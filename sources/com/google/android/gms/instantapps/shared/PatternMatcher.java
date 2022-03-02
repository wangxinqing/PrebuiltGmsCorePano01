package com.google.android.gms.instantapps.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PatternMatcher implements Parcelable {
    public static final Parcelable.Creator CREATOR = new qls();
    private static final int[] d = new int[2048];
    private final String a;
    private final int b;
    private final int[] c;

    public PatternMatcher(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.createIntArray();
    }

    private static boolean a(int i) {
        return i == -8 || i == -7 || i == -6 || i == -5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e A[Catch:{ NumberFormatException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0181 A[Catch:{ NumberFormatException -> 0x0165 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized int[] b(java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.instantapps.shared.PatternMatcher> r0 = com.google.android.gms.instantapps.shared.PatternMatcher.class
            monitor-enter(r0)
            int r1 = r15.length()     // Catch:{ all -> 0x01de }
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000e:
            if (r4 >= r1) goto L_0x01cc
            r9 = 2045(0x7fd, float:2.866E-42)
            if (r6 > r9) goto L_0x01c4
            char r9 = r15.charAt(r4)     // Catch:{ all -> 0x01de }
            r10 = 42
            r11 = 125(0x7d, float:1.75E-43)
            r12 = -1
            if (r9 == r10) goto L_0x00f1
            r10 = 43
            if (r9 == r10) goto L_0x00cc
            r10 = 46
            if (r9 == r10) goto L_0x00c1
            r10 = 123(0x7b, float:1.72E-43)
            if (r9 == r10) goto L_0x0098
            if (r9 == r11) goto L_0x008c
            r10 = -2
            switch(r9) {
                case 91: goto L_0x006a;
                case 92: goto L_0x0057;
                case 93: goto L_0x0034;
                default: goto L_0x0031;
            }     // Catch:{ all -> 0x01de }
        L_0x0031:
            r10 = 1
            goto L_0x010c
        L_0x0034:
            if (r5 != 0) goto L_0x0039
            r10 = 1
            goto L_0x010c
        L_0x0039:
            int[] r5 = d     // Catch:{ all -> 0x01de }
            int r8 = r6 + -1
            r5 = r5[r8]     // Catch:{ all -> 0x01de }
            if (r5 == r12) goto L_0x004f
            if (r5 == r10) goto L_0x004f
            int r5 = r6 + 1
            int[] r8 = d     // Catch:{ all -> 0x01de }
            r10 = -3
            r8[r6] = r10     // Catch:{ all -> 0x01de }
            r6 = r5
            r5 = 0
            r8 = 0
            goto L_0x00f3
        L_0x004f:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "You must define characters in a set."
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x0057:
            int r4 = r4 + 1
            if (r4 >= r1) goto L_0x0062
            char r9 = r15.charAt(r4)     // Catch:{ all -> 0x01de }
            r10 = 1
            goto L_0x010c
        L_0x0062:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Escape found at end of pattern!"
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x006a:
            if (r5 == 0) goto L_0x006f
            r10 = 1
            goto L_0x010c
        L_0x006f:
            int r5 = r4 + 1
            char r9 = r15.charAt(r5)     // Catch:{ all -> 0x01de }
            r11 = 94
            if (r9 != r11) goto L_0x0082
            int r4 = r6 + 1
            int[] r9 = d     // Catch:{ all -> 0x01de }
            r9[r6] = r10     // Catch:{ all -> 0x01de }
            r6 = r4
            r4 = r5
            goto L_0x0089
        L_0x0082:
            int r5 = r6 + 1
            int[] r9 = d     // Catch:{ all -> 0x01de }
            r9[r6] = r12     // Catch:{ all -> 0x01de }
            r6 = r5
        L_0x0089:
            int r4 = r4 + r3
            r5 = 1
            goto L_0x000e
        L_0x008c:
            if (r7 == 0) goto L_0x009a
            int r7 = r6 + 1
            int[] r10 = d     // Catch:{ all -> 0x01de }
            r13 = -6
            r10[r6] = r13     // Catch:{ all -> 0x01de }
            r6 = r7
            r7 = 0
            goto L_0x009b
        L_0x0098:
            if (r5 == 0) goto L_0x009e
        L_0x009a:
        L_0x009b:
            r10 = 0
            goto L_0x010c
        L_0x009e:
            if (r6 == 0) goto L_0x00b9
            int[] r7 = d     // Catch:{ all -> 0x01de }
            int r10 = r6 + -1
            r7 = r7[r10]     // Catch:{ all -> 0x01de }
            boolean r7 = a((int) r7)     // Catch:{ all -> 0x01de }
            if (r7 != 0) goto L_0x00b9
            int r7 = r6 + 1
            int[] r10 = d     // Catch:{ all -> 0x01de }
            r13 = -5
            r10[r6] = r13     // Catch:{ all -> 0x01de }
            int r4 = r4 + 1
            r6 = r7
            r7 = 1
            r10 = 0
            goto L_0x010c
        L_0x00b9:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Modifier must follow a token."
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x00c1:
            if (r5 != 0) goto L_0x00ce
            int r10 = r6 + 1
            int[] r13 = d     // Catch:{ all -> 0x01de }
            r14 = -4
            r13[r6] = r14     // Catch:{ all -> 0x01de }
            r6 = r10
            goto L_0x00cf
        L_0x00cc:
            if (r5 == 0) goto L_0x00d1
        L_0x00ce:
        L_0x00cf:
            r10 = 0
            goto L_0x010c
        L_0x00d1:
            if (r6 == 0) goto L_0x00e9
            int[] r10 = d     // Catch:{ all -> 0x01de }
            int r13 = r6 + -1
            r10 = r10[r13]     // Catch:{ all -> 0x01de }
            boolean r10 = a((int) r10)     // Catch:{ all -> 0x01de }
            if (r10 != 0) goto L_0x00e9
            int r10 = r6 + 1
            int[] r13 = d     // Catch:{ all -> 0x01de }
            r14 = -8
            r13[r6] = r14     // Catch:{ all -> 0x01de }
            r6 = r10
            r10 = 0
            goto L_0x010c
        L_0x00e9:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Modifier must follow a token."
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x00f1:
            if (r5 == 0) goto L_0x00f5
        L_0x00f3:
            r10 = 0
            goto L_0x010c
        L_0x00f5:
            if (r6 == 0) goto L_0x01bc
            int[] r10 = d     // Catch:{ all -> 0x01de }
            int r13 = r6 + -1
            r10 = r10[r13]     // Catch:{ all -> 0x01de }
            boolean r10 = a((int) r10)     // Catch:{ all -> 0x01de }
            if (r10 != 0) goto L_0x01bc
            int r10 = r6 + 1
            int[] r13 = d     // Catch:{ all -> 0x01de }
            r14 = -7
            r13[r6] = r14     // Catch:{ all -> 0x01de }
            r6 = r10
            r10 = 0
        L_0x010c:
            if (r5 != 0) goto L_0x0181
            if (r7 == 0) goto L_0x0176
            int r9 = r15.indexOf(r11, r4)     // Catch:{ all -> 0x01de }
            if (r9 < 0) goto L_0x016e
            java.lang.String r4 = r15.substring(r4, r9)     // Catch:{ all -> 0x01de }
            r10 = 44
            int r10 = r4.indexOf(r10)     // Catch:{ all -> 0x01de }
            if (r10 >= 0) goto L_0x0128
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0165 }
            r10 = r4
            goto L_0x014c
        L_0x0128:
            java.lang.String r11 = r4.substring(r2, r10)     // Catch:{ NumberFormatException -> 0x0165 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0165 }
            int r13 = r4.length()     // Catch:{ NumberFormatException -> 0x0165 }
            int r13 = r13 + r12
            if (r10 == r13) goto L_0x0145
            int r10 = r10 + 1
            java.lang.String r4 = r4.substring(r10)     // Catch:{ NumberFormatException -> 0x0165 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0165 }
            r10 = r4
            r4 = r11
            goto L_0x014c
        L_0x0145:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r4 = r11
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x014c:
            if (r4 > r10) goto L_0x015d
            int[] r11 = d     // Catch:{ NumberFormatException -> 0x0165 }
            int r12 = r6 + 1
            r11[r6] = r4     // Catch:{ NumberFormatException -> 0x0165 }
            int[] r4 = d     // Catch:{ NumberFormatException -> 0x0165 }
            int r6 = r12 + 1
            r4[r12] = r10     // Catch:{ NumberFormatException -> 0x0165 }
            r4 = r9
            goto L_0x000e
        L_0x015d:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x0165 }
            java.lang.String r1 = "Range quantifier minimum is greater than maximum"
            r15.<init>(r1)     // Catch:{ NumberFormatException -> 0x0165 }
            throw r15     // Catch:{ NumberFormatException -> 0x0165 }
        L_0x0165:
            r15 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "Range number format incorrect"
            r1.<init>(r2, r15)     // Catch:{ all -> 0x01de }
            throw r1     // Catch:{ all -> 0x01de }
        L_0x016e:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Range not ended with '}'"
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x0176:
            if (r10 == 0) goto L_0x0180
            int r10 = r6 + 1
            int[] r11 = d     // Catch:{ all -> 0x01de }
            r11[r6] = r9     // Catch:{ all -> 0x01de }
            r6 = r10
            goto L_0x01b9
        L_0x0180:
            goto L_0x01b9
        L_0x0181:
            if (r8 == 0) goto L_0x018c
            int r8 = r6 + 1
            int[] r10 = d     // Catch:{ all -> 0x01de }
            r10[r6] = r9     // Catch:{ all -> 0x01de }
            r6 = r8
            r8 = 0
            goto L_0x01b9
        L_0x018c:
            int r10 = r4 + 2
            if (r10 < r1) goto L_0x0191
            goto L_0x01ad
        L_0x0191:
            int r11 = r4 + 1
            char r12 = r15.charAt(r11)     // Catch:{ all -> 0x01de }
            r13 = 45
            if (r12 != r13) goto L_0x01ad
            char r10 = r15.charAt(r10)     // Catch:{ all -> 0x01de }
            r12 = 93
            if (r10 == r12) goto L_0x01ad
            int r4 = r6 + 1
            int[] r8 = d     // Catch:{ all -> 0x01de }
            r8[r6] = r9     // Catch:{ all -> 0x01de }
            r6 = r4
            r4 = r11
            r8 = 1
            goto L_0x01b9
        L_0x01ad:
            int r10 = r6 + 1
            int[] r11 = d     // Catch:{ all -> 0x01de }
            r11[r6] = r9     // Catch:{ all -> 0x01de }
            int r6 = r10 + 1
            int[] r11 = d     // Catch:{ all -> 0x01de }
            r11[r10] = r9     // Catch:{ all -> 0x01de }
        L_0x01b9:
            int r4 = r4 + r3
            goto L_0x000e
        L_0x01bc:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Modifier must follow a token."
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x01c4:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Pattern is too large!"
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x01cc:
            if (r5 != 0) goto L_0x01d6
            int[] r15 = d     // Catch:{ all -> 0x01de }
            int[] r15 = java.util.Arrays.copyOf(r15, r6)     // Catch:{ all -> 0x01de }
            monitor-exit(r0)
            return r15
        L_0x01d6:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01de }
            java.lang.String r1 = "Set was not terminated!"
            r15.<init>(r1)     // Catch:{ all -> 0x01de }
            throw r15     // Catch:{ all -> 0x01de }
        L_0x01de:
            r15 = move-exception
            monitor-exit(r0)
            goto L_0x01e2
        L_0x01e1:
            throw r15
        L_0x01e2:
            goto L_0x01e1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.shared.PatternMatcher.b(java.lang.String):int[]");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "? " : "ADVANCED: " : "GLOB: " : "PREFIX: " : "LITERAL: ";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 16 + String.valueOf(str2).length());
        sb.append("PatternMatcher{");
        sb.append(str);
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeIntArray(this.c);
    }

    public PatternMatcher(String str, int i) {
        this.a = str;
        this.b = i;
        if (i == 3) {
            this.c = b(str);
        } else {
            this.c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d A[LOOP:1: B:43:0x008d->B:46:0x0095, LOOP_START, PHI: r10 
      PHI: (r10v17 int) = (r10v12 int), (r10v20 int) binds: [B:152:0x008d, B:46:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae A[LOOP:2: B:54:0x00ae->B:57:0x00b6, LOOP_START, PHI: r10 
      PHI: (r10v14 int) = (r10v12 int), (r10v16 int) binds: [B:155:0x00ae, B:57:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = r0.a
            int[] r3 = r0.c
            int r4 = r0.b
            r5 = 0
            r6 = 1
            if (r1 != 0) goto L_0x0010
            goto L_0x01b8
        L_0x0010:
            if (r4 != 0) goto L_0x0018
            boolean r5 = r2.equals(r1)
            goto L_0x01b8
        L_0x0018:
            if (r4 != r6) goto L_0x0020
            boolean r5 = r1.startsWith(r2)
            goto L_0x01b8
        L_0x0020:
            r7 = -2
            r8 = 2
            if (r4 != r8) goto L_0x00e4
            int r3 = r2.length()
            if (r3 > 0) goto L_0x0033
            int r1 = r18.length()
            if (r1 <= 0) goto L_0x0032
            goto L_0x01b8
        L_0x0032:
            return r6
        L_0x0033:
            int r4 = r18.length()
            char r8 = r2.charAt(r5)
            r9 = 0
            r10 = 0
        L_0x003d:
            r11 = 42
            r12 = 46
            if (r9 >= r3) goto L_0x00c8
            if (r10 >= r4) goto L_0x00c8
            int r9 = r9 + 1
            if (r9 >= r3) goto L_0x004e
            char r13 = r2.charAt(r9)
            goto L_0x004f
        L_0x004e:
            r13 = 0
        L_0x004f:
            r14 = 92
            if (r8 == r14) goto L_0x0056
            r15 = r13
            r13 = r8
            goto L_0x0060
        L_0x0056:
            int r9 = r9 + 1
            if (r9 >= r3) goto L_0x005f
            char r15 = r2.charAt(r9)
            goto L_0x0060
        L_0x005f:
            r15 = 0
        L_0x0060:
            if (r15 == r11) goto L_0x0071
            if (r13 != r12) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            char r8 = r1.charAt(r10)
            if (r8 == r13) goto L_0x006d
            goto L_0x01b8
        L_0x006d:
            int r10 = r10 + 1
            r8 = r15
            goto L_0x003d
        L_0x0071:
            if (r8 != r14) goto L_0x0074
            goto L_0x00ae
        L_0x0074:
            if (r13 != r12) goto L_0x00ad
            int r8 = r3 + -1
            if (r9 >= r8) goto L_0x00aa
            int r9 = r9 + 1
            char r8 = r2.charAt(r9)
            if (r8 == r14) goto L_0x0083
            goto L_0x008d
        L_0x0083:
            int r9 = r9 + 1
            if (r9 >= r3) goto L_0x008c
            char r8 = r2.charAt(r9)
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            char r11 = r1.charAt(r10)
            if (r11 == r8) goto L_0x0098
            int r10 = r10 + 1
            if (r10 < r4) goto L_0x008d
            goto L_0x0099
        L_0x0098:
        L_0x0099:
            if (r10 == r4) goto L_0x00a8
            int r9 = r9 + 1
            if (r9 >= r3) goto L_0x00a4
            char r8 = r2.charAt(r9)
            goto L_0x00a5
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            int r10 = r10 + 1
            goto L_0x003d
        L_0x00a8:
            goto L_0x01b8
        L_0x00aa:
            r5 = 1
            goto L_0x01b8
        L_0x00ad:
        L_0x00ae:
            char r8 = r1.charAt(r10)
            if (r8 != r13) goto L_0x00ba
            int r10 = r10 + 1
            if (r10 < r4) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            goto L_0x00ae
        L_0x00ba:
        L_0x00bb:
            int r9 = r9 + 1
            if (r9 >= r3) goto L_0x00c5
            char r8 = r2.charAt(r9)
            goto L_0x003d
        L_0x00c5:
            r8 = 0
            goto L_0x003d
        L_0x00c8:
            if (r9 >= r3) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            if (r10 < r4) goto L_0x00d0
            r5 = 1
            goto L_0x01b8
        L_0x00d0:
            int r3 = r3 + r7
            if (r9 != r3) goto L_0x00e2
            char r1 = r2.charAt(r9)
            if (r1 != r12) goto L_0x00e2
            int r9 = r9 + r6
            char r1 = r2.charAt(r9)
            if (r1 == r11) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            return r6
        L_0x00e2:
            goto L_0x01b8
        L_0x00e4:
            r2 = 3
            if (r4 != r2) goto L_0x01b7
            int r4 = r3.length
            int r9 = r18.length()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x00f0:
            if (r10 >= r4) goto L_0x01af
            r14 = r3[r10]
            r15 = -4
            r2 = -1
            if (r14 == r15) goto L_0x011d
            if (r14 == r7) goto L_0x0102
            if (r14 == r2) goto L_0x0102
            int r12 = r10 + 1
            r14 = r13
            r13 = r10
            r10 = 0
            goto L_0x0123
        L_0x0102:
            if (r14 != r2) goto L_0x0106
            r12 = 2
            goto L_0x0107
        L_0x0106:
            r12 = 3
        L_0x0107:
            int r13 = r10 + 1
        L_0x0109:
            int r10 = r10 + r6
            if (r10 < r4) goto L_0x010d
            goto L_0x0113
        L_0x010d:
            r14 = r3[r10]
            r15 = -3
            if (r14 == r15) goto L_0x0113
            goto L_0x0109
        L_0x0113:
            int r14 = r10 + -1
            int r10 = r10 + 1
            r16 = r12
            r12 = r10
            r10 = r16
            goto L_0x0123
        L_0x011d:
            int r10 = r10 + 1
            r14 = r13
            r13 = r12
            r12 = r10
            r10 = 1
        L_0x0123:
            r15 = 2147483647(0x7fffffff, float:NaN)
            if (r12 < r4) goto L_0x012b
            r5 = 1
            r15 = 1
            goto L_0x0149
        L_0x012b:
            r5 = r3[r12]
            r7 = -8
            if (r5 == r7) goto L_0x0146
            r7 = -7
            if (r5 == r7) goto L_0x0142
            r7 = -5
            if (r5 == r7) goto L_0x0139
            r5 = 1
            r15 = 1
            goto L_0x0149
        L_0x0139:
            int r12 = r12 + 1
            r5 = r3[r12]
            int r12 = r12 + r6
            r15 = r3[r12]
            int r12 = r12 + r8
            goto L_0x0149
        L_0x0142:
            int r12 = r12 + 1
            r5 = 0
            goto L_0x0149
        L_0x0146:
            int r12 = r12 + 1
            r5 = 1
        L_0x0149:
            if (r5 <= r15) goto L_0x014e
            r5 = 0
            goto L_0x01b8
        L_0x014e:
            r7 = 0
        L_0x014f:
            if (r7 >= r15) goto L_0x019a
            int r2 = r11 + r7
            if (r2 >= r9) goto L_0x019a
            if (r10 == 0) goto L_0x018a
            if (r10 == r6) goto L_0x0192
            if (r10 == r8) goto L_0x0174
            r8 = r13
        L_0x015c:
            if (r8 >= r14) goto L_0x0192
            char r6 = r1.charAt(r2)
            r0 = r3[r8]
            if (r6 >= r0) goto L_0x0167
        L_0x0166:
            goto L_0x016e
        L_0x0167:
            int r0 = r8 + 1
            r0 = r3[r0]
            if (r6 > r0) goto L_0x0166
            goto L_0x019a
        L_0x016e:
            int r8 = r8 + 2
            r0 = r17
            r6 = 1
            goto L_0x015c
        L_0x0174:
            r0 = r13
        L_0x0175:
            if (r0 >= r14) goto L_0x019a
            char r6 = r1.charAt(r2)
            r8 = r3[r0]
            if (r6 >= r8) goto L_0x0180
        L_0x017f:
            goto L_0x0187
        L_0x0180:
            int r8 = r0 + 1
            r8 = r3[r8]
            if (r6 > r8) goto L_0x017f
            goto L_0x0192
        L_0x0187:
            int r0 = r0 + 2
            goto L_0x0175
        L_0x018a:
            char r0 = r1.charAt(r2)
            r2 = r3[r13]
            if (r0 != r2) goto L_0x019a
        L_0x0192:
            int r7 = r7 + 1
            r0 = r17
            r2 = -1
            r6 = 1
            r8 = 2
            goto L_0x014f
        L_0x019a:
            if (r7 >= r5) goto L_0x019d
            r7 = -1
        L_0x019d:
            r0 = -1
            if (r7 == r0) goto L_0x01ad
            int r11 = r11 + r7
            r0 = r17
            r10 = r12
            r12 = r13
            r13 = r14
            r2 = 3
            r5 = 0
            r6 = 1
            r7 = -2
            r8 = 2
            goto L_0x00f0
        L_0x01ad:
            r5 = 0
            goto L_0x01b8
        L_0x01af:
            if (r10 >= r4) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            if (r11 >= r9) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r0 = 1
            return r0
        L_0x01b7:
            r5 = 0
        L_0x01b8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.shared.PatternMatcher.a(java.lang.String):boolean");
    }
}
