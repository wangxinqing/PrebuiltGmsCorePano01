package androidx.slice;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SliceItemParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r6.equals("image") != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.slice.SliceItem read(defpackage.atl r9) {
        /*
            androidx.slice.SliceItem r0 = new androidx.slice.SliceItem
            r0.<init>()
            java.lang.String[] r1 = r0.a
            r2 = 1
            java.lang.Object[] r1 = r9.b((java.lang.Object[]) r1, (int) r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.a = r1
            java.lang.String r1 = r0.b
            r3 = 2
            java.lang.String r1 = r9.b((java.lang.String) r1, (int) r3)
            r0.b = r1
            java.lang.String r1 = r0.c
            r4 = 3
            java.lang.String r1 = r9.b((java.lang.String) r1, (int) r4)
            r0.c = r1
            androidx.slice.SliceItemHolder r1 = r0.f
            r5 = 4
            atq r9 = r9.b((defpackage.atq) r1, (int) r5)
            androidx.slice.SliceItemHolder r9 = (androidx.slice.SliceItemHolder) r9
            r0.f = r9
            androidx.slice.SliceItemHolder r9 = r0.f
            r1 = 0
            if (r9 == 0) goto L_0x0103
            java.lang.String r6 = r0.b
            anu r7 = androidx.slice.SliceItemHolder.b
            if (r7 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            anu r7 = androidx.slice.SliceItemHolder.b
            r7.a(r9, r6)
        L_0x003e:
            int r7 = r6.hashCode()
            r8 = 0
            switch(r7) {
                case -1422950858: goto L_0x0082;
                case 104431: goto L_0x0078;
                case 3327612: goto L_0x006e;
                case 3556653: goto L_0x0064;
                case 100313435: goto L_0x005b;
                case 100358090: goto L_0x0051;
                case 109526418: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x008c
        L_0x0047:
            java.lang.String r2 = "slice"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 2
            goto L_0x008d
        L_0x0051:
            java.lang.String r2 = "input"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 3
            goto L_0x008d
        L_0x005b:
            java.lang.String r3 = "image"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x008c
            goto L_0x008d
        L_0x0064:
            java.lang.String r2 = "text"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 4
            goto L_0x008d
        L_0x006e:
            java.lang.String r2 = "long"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 6
            goto L_0x008d
        L_0x0078:
            java.lang.String r2 = "int"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 5
            goto L_0x008d
        L_0x0082:
            java.lang.String r2 = "action"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x008c
            r2 = 0
            goto L_0x008d
        L_0x008c:
            r2 = -1
        L_0x008d:
            switch(r2) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cd;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00b5;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a7;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unrecognized format "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00a7:
            long r2 = r9.g
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            goto L_0x00e9
        L_0x00ae:
            int r9 = r9.f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00e9
        L_0x00b5:
            java.lang.String r2 = r9.e
            if (r2 != 0) goto L_0x00ba
            goto L_0x00c7
        L_0x00ba:
            int r2 = r2.length()
            if (r2 == 0) goto L_0x00c7
            java.lang.String r9 = r9.e
            android.text.Spanned r9 = defpackage.no.a(r9, r8)
            goto L_0x00e9
        L_0x00c7:
            java.lang.String r9 = ""
            goto L_0x00e9
        L_0x00ca:
            android.os.Parcelable r9 = r9.d
            goto L_0x00e9
        L_0x00cd:
            atq r9 = r9.c
            goto L_0x00e9
        L_0x00d0:
            android.os.Parcelable r2 = r9.d
            if (r2 == 0) goto L_0x00d5
            goto L_0x00db
        L_0x00d5:
            atq r3 = r9.c
            if (r3 != 0) goto L_0x00db
            r9 = r1
            goto L_0x00e9
        L_0x00db:
            oq r3 = new oq
            if (r2 == 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r2 = r1
        L_0x00e1:
            atq r9 = r9.c
            androidx.slice.Slice r9 = (androidx.slice.Slice) r9
            r3.<init>(r2, r9)
            r9 = r3
        L_0x00e9:
            r0.d = r9
            androidx.slice.SliceItemHolder r9 = r0.f
            anv r2 = r9.h
            if (r2 == 0) goto L_0x0105
            r9.d = r1
            r9.c = r1
            r9.f = r8
            r3 = 0
            r9.g = r3
            r9.e = r1
            java.util.ArrayList r2 = r2.a
            r2.add(r9)
            goto L_0x0105
        L_0x0103:
            r0.d = r1
        L_0x0105:
            r0.f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItemParcelizer.read(atl):androidx.slice.SliceItem");
    }

    public static void write(SliceItem sliceItem, atl atl) {
        atl.a(true, true);
        sliceItem.f = new SliceItemHolder(sliceItem.b, sliceItem.d, atl.a());
        if (!Arrays.equals(Slice.a, sliceItem.a)) {
            atl.a((Object[]) sliceItem.a, 1);
        }
        if (!"text".equals(sliceItem.b)) {
            atl.a(sliceItem.b, 2);
        }
        String str = sliceItem.c;
        if (str != null) {
            atl.a(str, 3);
        }
        atl.a((atq) sliceItem.f, 4);
    }
}
