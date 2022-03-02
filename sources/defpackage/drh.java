package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: drh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drh {
    static List a;
    static final Object b = new Object();
    private final Context c;

    protected drh(Context context) {
        iva.a((Object) context);
        this.c = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r3.b.h != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r3.b.h != false) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection a(boolean r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            a = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.List r1 = a
            defpackage.dpz.a(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.GOOGLE_SETTINGS_OPERATION"
            r1.<init>(r2)
            android.content.Context r2 = r8.c
            java.lang.String r2 = r2.getPackageName()
            android.content.Intent r1 = r1.setPackage(r2)
            java.lang.String r2 = "className"
            java.lang.String r3 = "GoogleSettingsIndexGetter"
            r0.putString(r2, r3)
            r1.putExtras(r0)
            java.lang.Object r0 = b
            monitor-enter(r0)
            android.content.Context r2 = r8.c     // Catch:{ all -> 0x011d }
            r2.startService(r1)     // Catch:{ all -> 0x011d }
            java.lang.Object r1 = b     // Catch:{ InterruptedException -> 0x003e }
            r1.wait()     // Catch:{ InterruptedException -> 0x003e }
            goto L_0x0044
        L_0x003e:
            r1 = move-exception
            java.lang.String r2 = "GoogleSettingsIndexGetter"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x011d }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x011d }
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = a
            if (r1 == 0) goto L_0x010e
            android.content.Context r1 = r8.c
            boolean r1 = defpackage.jgu.e(r1)
            java.util.List r2 = a
            java.util.Iterator r2 = r2.iterator()
        L_0x005a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x010e
            java.lang.Object r3 = r2.next()
            android.os.Parcel r3 = (android.os.Parcel) r3
            r4 = 0
            r3.setDataPosition(r4)
            android.os.Parcelable$Creator r5 = com.google.android.gms.chimera.GoogleSettingsItem.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r3)
            com.google.android.gms.chimera.GoogleSettingsItem r5 = (com.google.android.gms.chimera.GoogleSettingsItem) r5
            r3.recycle()
            boolean r3 = r5.k
            if (r3 == 0) goto L_0x005a
            dri r3 = new dri
            android.content.Context r6 = r8.c
            r3.<init>(r6, r5)
            java.lang.String r5 = r3.b()
            boolean r5 = r0.containsKey(r5)
            if (r5 == 0) goto L_0x00b4
            java.lang.String r3 = r3.b()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 39
            r5.<init>(r4)
            java.lang.String r4 = "index key ("
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ") already present, ignore it"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "GoogleSettingsIndexGetter"
            android.util.Log.e(r4, r3)
            goto L_0x005a
        L_0x00b4:
            if (r9 != 0) goto L_0x00b7
            goto L_0x0105
        L_0x00b7:
            if (r1 != 0) goto L_0x0105
            boolean r5 = r3.f
            if (r5 == 0) goto L_0x0105
            com.google.android.gms.chimera.GoogleSettingsItem r5 = r3.b
            boolean r6 = r5.m
            if (r6 == 0) goto L_0x0105
            int r6 = r5.c
            r7 = 2
            if (r6 == r7) goto L_0x0105
            boolean r5 = r5.f
            if (r5 == 0) goto L_0x00da
            android.content.Context r5 = r3.a
            boolean r5 = defpackage.jgu.c(r5)
            if (r5 != 0) goto L_0x00da
            com.google.android.gms.chimera.GoogleSettingsItem r5 = r3.b
            boolean r5 = r5.h
            if (r5 == 0) goto L_0x0105
        L_0x00da:
            com.google.android.gms.chimera.GoogleSettingsItem r5 = r3.b
            boolean r5 = r5.g
            if (r5 != 0) goto L_0x00e1
            goto L_0x00f0
        L_0x00e1:
            android.content.Context r5 = r3.a
            boolean r5 = defpackage.jgu.b((android.content.Context) r5)
            if (r5 != 0) goto L_0x00f0
            com.google.android.gms.chimera.GoogleSettingsItem r5 = r3.b
            boolean r5 = r5.h
            if (r5 != 0) goto L_0x00f0
            goto L_0x0105
        L_0x00f0:
            com.google.android.gms.chimera.GoogleSettingsItem r5 = r3.b
            int r5 = r5.c
            r6 = 3
            if (r5 != r6) goto L_0x005a
            android.content.Context r5 = r3.a
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r6 = "development_settings_enabled"
            int r4 = android.provider.Settings.Global.getInt(r5, r6, r4)
            if (r4 != 0) goto L_0x005a
        L_0x0105:
            java.lang.String r4 = r3.b()
            r0.put(r4, r3)
            goto L_0x005a
        L_0x010e:
            java.util.List r9 = a
            if (r9 == 0) goto L_0x0118
            r9.clear()
            r9 = 0
            a = r9
        L_0x0118:
            java.util.Collection r9 = r0.values()
            return r9
        L_0x011d:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011d }
            goto L_0x0121
        L_0x0120:
            throw r9
        L_0x0121:
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drh.a(boolean):java.util.Collection");
    }
}
