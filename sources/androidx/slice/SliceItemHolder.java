package androidx.slice;

import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SliceItemHolder implements atq {
    public static final Object a = new Object();
    public static anu b;
    public atq c = null;
    public Parcelable d = null;
    String e = null;
    int f = 0;
    long g = 0;
    public anv h;

    public SliceItemHolder(anv anv) {
        this.h = anv;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SliceItemHolder(java.lang.String r4, java.lang.Object r5, boolean r6) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.c = r0
            r3.d = r0
            r3.e = r0
            r0 = 0
            r3.f = r0
            r1 = 0
            r3.g = r1
            int r1 = r4.hashCode()
            switch(r1) {
                case -1422950858: goto L_0x0055;
                case 104431: goto L_0x004b;
                case 3327612: goto L_0x0041;
                case 3556653: goto L_0x0037;
                case 100313435: goto L_0x002d;
                case 100358090: goto L_0x0023;
                case 109526418: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x005f
        L_0x0019:
            java.lang.String r1 = "slice"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 2
            goto L_0x0060
        L_0x0023:
            java.lang.String r1 = "input"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 3
            goto L_0x0060
        L_0x002d:
            java.lang.String r1 = "image"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x0037:
            java.lang.String r1 = "text"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 4
            goto L_0x0060
        L_0x0041:
            java.lang.String r1 = "long"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 6
            goto L_0x0060
        L_0x004b:
            java.lang.String r1 = "int"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 5
            goto L_0x0060
        L_0x0055:
            java.lang.String r1 = "action"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 0
            goto L_0x0060
        L_0x005f:
            r1 = -1
        L_0x0060:
            switch(r1) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0096;
                case 2: goto L_0x0096;
                case 3: goto L_0x0091;
                case 4: goto L_0x0076;
                case 5: goto L_0x006d;
                case 6: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x00b9
        L_0x0064:
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r3.g = r5
            goto L_0x00b9
        L_0x006d:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.f = r5
            goto L_0x00b9
        L_0x0076:
            boolean r6 = r5 instanceof android.text.Spanned
            if (r6 == 0) goto L_0x008c
            android.text.Spanned r5 = (android.text.Spanned) r5
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r6 < r1) goto L_0x0087
            java.lang.String r5 = android.text.Html.toHtml(r5, r0)
            goto L_0x008e
        L_0x0087:
            java.lang.String r5 = android.text.Html.toHtml(r5)
            goto L_0x008e
        L_0x008c:
            java.lang.String r5 = (java.lang.String) r5
        L_0x008e:
            r3.e = r5
            goto L_0x00b9
        L_0x0091:
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            r3.d = r5
            goto L_0x00b9
        L_0x0096:
            atq r5 = (defpackage.atq) r5
            r3.c = r5
            goto L_0x00b9
        L_0x009b:
            oq r5 = (defpackage.oq) r5
            java.lang.Object r0 = r5.a
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00a8
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.d = r0
            goto L_0x00aa
        L_0x00a8:
            if (r6 == 0) goto L_0x00b1
        L_0x00aa:
            java.lang.Object r5 = r5.b
            atq r5 = (defpackage.atq) r5
            r3.c = r5
            goto L_0x00b9
        L_0x00b1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot write callback to parcel"
            r4.<init>(r5)
            throw r4
        L_0x00b9:
            anu r5 = b
            if (r5 == 0) goto L_0x00c0
            r5.a(r3, r4)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItemHolder.<init>(java.lang.String, java.lang.Object, boolean):void");
    }
}
