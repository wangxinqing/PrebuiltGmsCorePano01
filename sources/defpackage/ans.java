package defpackage;

import android.app.slice.SliceSpec;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ans  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ans {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.slice.Slice a(androidx.slice.Slice r8) {
        /*
            if (r8 == 0) goto L_0x00ee
            android.net.Uri r0 = r8.b()
            if (r0 == 0) goto L_0x00ee
            android.app.slice.Slice$Builder r0 = new android.app.slice.Slice$Builder
            android.net.Uri r1 = r8.b()
            androidx.slice.SliceSpec r2 = r8.c
            android.app.slice.SliceSpec r2 = a((androidx.slice.SliceSpec) r2)
            r0.<init>(r1, r2)
            java.util.List r1 = r8.d()
            r0.addHints(r1)
            androidx.slice.SliceItem[] r8 = r8.d
            int r1 = r8.length
            r2 = 0
            r3 = 0
        L_0x0023:
            if (r3 >= r1) goto L_0x00e9
            r4 = r8[r3]
            java.lang.String r5 = r4.b
            int r6 = r5.hashCode()
            switch(r6) {
                case -1422950858: goto L_0x006d;
                case 104431: goto L_0x0063;
                case 3327612: goto L_0x0059;
                case 3556653: goto L_0x004f;
                case 100313435: goto L_0x0045;
                case 100358090: goto L_0x003b;
                case 109526418: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0077
        L_0x0031:
            java.lang.String r6 = "slice"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 0
            goto L_0x0078
        L_0x003b:
            java.lang.String r6 = "input"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 2
            goto L_0x0078
        L_0x0045:
            java.lang.String r6 = "image"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 1
            goto L_0x0078
        L_0x004f:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 4
            goto L_0x0078
        L_0x0059:
            java.lang.String r6 = "long"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 6
            goto L_0x0078
        L_0x0063:
            java.lang.String r6 = "int"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 5
            goto L_0x0078
        L_0x006d:
            java.lang.String r6 = "action"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 3
            goto L_0x0078
        L_0x0077:
            r5 = -1
        L_0x0078:
            switch(r5) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00a6;
                case 4: goto L_0x0098;
                case 5: goto L_0x008a;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x00e5
        L_0x007c:
            long r5 = r4.g()
            java.lang.String r7 = r4.c
            java.util.List r4 = r4.a()
            r0.addLong(r5, r7, r4)
            goto L_0x00e5
        L_0x008a:
            int r5 = r4.e()
            java.lang.String r6 = r4.c
            java.util.List r4 = r4.a()
            r0.addInt(r5, r6, r4)
            goto L_0x00e5
        L_0x0098:
            java.lang.CharSequence r5 = r4.b()
            java.lang.String r6 = r4.c
            java.util.List r4 = r4.a()
            r0.addText(r5, r6, r4)
            goto L_0x00e5
        L_0x00a6:
            android.app.PendingIntent r5 = r4.d()
            androidx.slice.Slice r6 = r4.f()
            android.app.slice.Slice r6 = a((androidx.slice.Slice) r6)
            java.lang.String r4 = r4.c
            r0.addAction(r5, r6, r4)
            goto L_0x00e5
        L_0x00b8:
            java.lang.Object r5 = r4.d
            android.app.RemoteInput r5 = (android.app.RemoteInput) r5
            java.lang.String r6 = r4.c
            java.util.List r4 = r4.a()
            r0.addRemoteInput(r5, r6, r4)
            goto L_0x00e5
        L_0x00c6:
            android.support.v4.graphics.drawable.IconCompat r5 = r4.c()
            android.graphics.drawable.Icon r5 = r5.e()
            java.lang.String r6 = r4.c
            java.util.List r4 = r4.a()
            r0.addIcon(r5, r6, r4)
            goto L_0x00e5
        L_0x00d8:
            androidx.slice.Slice r5 = r4.f()
            android.app.slice.Slice r5 = a((androidx.slice.Slice) r5)
            java.lang.String r4 = r4.c
            r0.addSubSlice(r5, r4)
        L_0x00e5:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x00e9:
            android.app.slice.Slice r8 = r0.build()
            return r8
        L_0x00ee:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ans.a(androidx.slice.Slice):android.app.slice.Slice");
    }

    public static Set b(Set set) {
        ob obVar = new ob();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                obVar.add(a((SliceSpec) it.next()));
            }
        }
        return obVar;
    }

    private static SliceSpec a(androidx.slice.SliceSpec sliceSpec) {
        if (sliceSpec != null) {
            return new SliceSpec(sliceSpec.a, sliceSpec.b);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.slice.Slice a(android.app.slice.Slice r9, android.content.Context r10) {
        /*
            java.lang.String r0 = "The icon resource isn't available."
            java.lang.String r1 = "SliceConvert"
            if (r9 == 0) goto L_0x015d
            android.net.Uri r2 = r9.getUri()
            if (r2 == 0) goto L_0x015d
            anr r2 = new anr
            android.net.Uri r3 = r9.getUri()
            r2.<init>((android.net.Uri) r3)
            java.util.List r3 = r9.getHints()
            r2.a((java.util.List) r3)
            android.app.slice.SliceSpec r3 = r9.getSpec()
            androidx.slice.SliceSpec r3 = a((android.app.slice.SliceSpec) r3)
            r2.b = r3
            java.util.List r9 = r9.getItems()
            java.util.Iterator r9 = r9.iterator()
        L_0x002e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0158
            java.lang.Object r3 = r9.next()
            android.app.slice.SliceItem r3 = (android.app.slice.SliceItem) r3
            java.lang.String r4 = r3.getFormat()
            int r5 = r4.hashCode()
            java.lang.String r6 = "input"
            switch(r5) {
                case -1422950858: goto L_0x0082;
                case 104431: goto L_0x0078;
                case 3327612: goto L_0x006e;
                case 3556653: goto L_0x0064;
                case 100313435: goto L_0x005a;
                case 100358090: goto L_0x0052;
                case 109526418: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x008c
        L_0x0048:
            java.lang.String r5 = "slice"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008c
            r4 = 0
            goto L_0x008d
        L_0x0052:
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x008c
            r4 = 2
            goto L_0x008d
        L_0x005a:
            java.lang.String r5 = "image"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008c
            r4 = 1
            goto L_0x008d
        L_0x0064:
            java.lang.String r5 = "text"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008c
            r4 = 4
            goto L_0x008d
        L_0x006e:
            java.lang.String r5 = "long"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008c
            r4 = 6
            goto L_0x008d
        L_0x0078:
            java.lang.String r5 = "int"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008c
            r4 = 5
            goto L_0x008d
        L_0x0082:
            java.lang.String r5 = "action"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x008c
            r4 = 3
            goto L_0x008d
        L_0x008c:
            r4 = -1
        L_0x008d:
            switch(r4) {
                case 0: goto L_0x0147;
                case 1: goto L_0x0126;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00ad;
                case 6: goto L_0x0091;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x002e
        L_0x0091:
            long r4 = r3.getLong()
            java.lang.String r6 = r3.getSubType()
            java.util.List r3 = r3.getHints()
            int r7 = r3.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r3 = r3.toArray(r7)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.a((long) r4, (java.lang.String) r6, (java.lang.String[]) r3)
            goto L_0x002e
        L_0x00ad:
            int r4 = r3.getInt()
            java.lang.String r5 = r3.getSubType()
            java.util.List r3 = r3.getHints()
            int r6 = r3.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r3 = r3.toArray(r6)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.a((int) r4, (java.lang.String) r5, (java.lang.String[]) r3)
            goto L_0x002e
        L_0x00ca:
            java.lang.CharSequence r4 = r3.getText()
            java.lang.String r5 = r3.getSubType()
            java.util.List r3 = r3.getHints()
            int r6 = r3.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r3 = r3.toArray(r6)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.a((java.lang.CharSequence) r4, (java.lang.String) r5, (java.lang.String[]) r3)
            goto L_0x002e
        L_0x00e7:
            android.app.PendingIntent r4 = r3.getAction()
            android.app.slice.Slice r5 = r3.getSlice()
            androidx.slice.Slice r5 = a(r5, r10)
            java.lang.String r3 = r3.getSubType()
            r2.a((android.app.PendingIntent) r4, (androidx.slice.Slice) r5, (java.lang.String) r3)
            goto L_0x002e
        L_0x00fc:
            android.app.RemoteInput r4 = r3.getRemoteInput()
            java.lang.String r5 = r3.getSubType()
            java.util.List r3 = r3.getHints()
            defpackage.ot.a((java.lang.Object) r4)
            int r7 = r3.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r3 = r3.toArray(r7)
            java.lang.String[] r3 = (java.lang.String[]) r3
            defpackage.ot.a((java.lang.Object) r4)
            java.util.ArrayList r7 = r2.a
            androidx.slice.SliceItem r8 = new androidx.slice.SliceItem
            r8.<init>(r4, r6, r5, r3)
            r7.add(r8)
            goto L_0x002e
        L_0x0126:
            android.graphics.drawable.Icon r4 = r3.getIcon()     // Catch:{ IllegalArgumentException -> 0x0141, NotFoundException -> 0x013b }
            android.support.v4.graphics.drawable.IconCompat r4 = android.support.v4.graphics.drawable.IconCompat.a((android.content.Context) r10, (android.graphics.drawable.Icon) r4)     // Catch:{ IllegalArgumentException -> 0x0141, NotFoundException -> 0x013b }
            java.lang.String r5 = r3.getSubType()     // Catch:{ IllegalArgumentException -> 0x0141, NotFoundException -> 0x013b }
            java.util.List r3 = r3.getHints()     // Catch:{ IllegalArgumentException -> 0x0141, NotFoundException -> 0x013b }
            r2.a((android.support.v4.graphics.drawable.IconCompat) r4, (java.lang.String) r5, (java.util.List) r3)     // Catch:{ IllegalArgumentException -> 0x0141, NotFoundException -> 0x013b }
            goto L_0x002e
        L_0x013b:
            r3 = move-exception
            android.util.Log.w(r1, r0, r3)
            goto L_0x002e
        L_0x0141:
            r3 = move-exception
            android.util.Log.w(r1, r0, r3)
            goto L_0x002e
        L_0x0147:
            android.app.slice.Slice r4 = r3.getSlice()
            androidx.slice.Slice r4 = a(r4, r10)
            java.lang.String r3 = r3.getSubType()
            r2.a(r4, r3)
            goto L_0x002e
        L_0x0158:
            androidx.slice.Slice r9 = r2.a()
            return r9
        L_0x015d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ans.a(android.app.slice.Slice, android.content.Context):androidx.slice.Slice");
    }

    private static androidx.slice.SliceSpec a(SliceSpec sliceSpec) {
        if (sliceSpec != null) {
            return new androidx.slice.SliceSpec(sliceSpec.getType(), sliceSpec.getRevision());
        }
        return null;
    }

    static Set a(Set set) {
        ob obVar = new ob();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                obVar.add(a((androidx.slice.SliceSpec) it.next()));
            }
        }
        return obVar;
    }
}
