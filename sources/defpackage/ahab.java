package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: ahab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahab {
    private final Context a;
    private final agzt b;

    private ahab(Context context, agzt agzt) {
        this.a = context;
        this.b = agzt;
    }

    public static ahab a(Context context) {
        return new ahab(context, (agzt) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File b(android.net.Uri r12) {
        /*
            r11 = this;
            a((android.net.Uri) r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.getPathSegments()
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 5
            r5 = 4
            java.lang.String r6 = "managed"
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r3) {
                case -1820761141: goto L_0x0052;
                case 94416770: goto L_0x0048;
                case 97434231: goto L_0x003e;
                case 835260319: goto L_0x0036;
                case 988548496: goto L_0x002c;
                case 991565957: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x005c
        L_0x0022:
            java.lang.String r3 = "directboot-files"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 0
            goto L_0x005d
        L_0x002c:
            java.lang.String r3 = "directboot-cache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x0036:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x005c
            r2 = 4
            goto L_0x005d
        L_0x003e:
            java.lang.String r3 = "files"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 2
            goto L_0x005d
        L_0x0048:
            java.lang.String r3 = "cache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 3
            goto L_0x005d
        L_0x0052:
            java.lang.String r3 = "external"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 5
            goto L_0x005d
        L_0x005c:
            r2 = -1
        L_0x005d:
            java.lang.String r3 = "Direct boot only exists on N or greater: current SDK %s"
            r10 = 24
            if (r2 == 0) goto L_0x0106
            if (r2 == r9) goto L_0x00e3
            if (r2 == r8) goto L_0x00dc
            if (r2 == r7) goto L_0x00d5
            if (r2 == r5) goto L_0x0086
            if (r2 != r4) goto L_0x0076
            android.content.Context r12 = r11.a
            r1 = 0
            java.io.File r12 = r12.getExternalFilesDir(r1)
            goto L_0x0114
        L_0x0076:
            ahbk r0 = new ahbk
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r1] = r12
            java.lang.String r12 = "Path must start with a valid logical location: %s"
            java.lang.String r12 = java.lang.String.format(r12, r2)
            r0.<init>((java.lang.String) r12)
            throw r0
        L_0x0086:
            android.content.Context r12 = r11.a
            java.io.File r12 = defpackage.agzy.a(r12)
            java.io.File r1 = new java.io.File
            r1.<init>(r12, r6)
            int r12 = r0.size()
            if (r12 < r7) goto L_0x00d2
            java.lang.Object r12 = r0.get(r8)     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IllegalArgumentException -> 0x00cb }
            android.accounts.Account r12 = defpackage.agzv.a((java.lang.String) r12)     // Catch:{ IllegalArgumentException -> 0x00cb }
            boolean r2 = defpackage.agzv.b((android.accounts.Account) r12)
            if (r2 != 0) goto L_0x00d2
            agzt r2 = r11.b
            if (r2 == 0) goto L_0x00c3
            aorr r12 = r2.a(r12)
            java.lang.Class<ahbk> r2 = defpackage.ahbk.class
            java.lang.Object r12 = defpackage.aorj.a((java.util.concurrent.Future) r12, (java.lang.Class) r2)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.String r12 = java.lang.Integer.toString(r12)
            r0.set(r8, r12)
            goto L_0x00d3
        L_0x00c3:
            ahbk r12 = new ahbk
            java.lang.String r0 = "AccountManager cannot be null"
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x00cb:
            r12 = move-exception
            ahbk r0 = new ahbk
            r0.<init>((java.lang.Throwable) r12)
            throw r0
        L_0x00d2:
        L_0x00d3:
            r12 = r1
            goto L_0x0114
        L_0x00d5:
            android.content.Context r12 = r11.a
            java.io.File r12 = r12.getCacheDir()
            goto L_0x0114
        L_0x00dc:
            android.content.Context r12 = r11.a
            java.io.File r12 = defpackage.agzy.a(r12)
            goto L_0x0114
        L_0x00e3:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r10) goto L_0x00f2
            android.content.Context r12 = r11.a
            android.content.Context r12 = r12.createDeviceProtectedStorageContext()
            java.io.File r12 = r12.getCacheDir()
            goto L_0x0114
        L_0x00f2:
            ahbk r12 = new ahbk
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r0 = java.lang.String.format(r3, r0)
            r12.<init>((java.lang.String) r0)
            throw r12
        L_0x0106:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r10) goto L_0x0128
            android.content.Context r12 = r11.a
            android.content.Context r12 = r12.createDeviceProtectedStorageContext()
            java.io.File r12 = r12.getFilesDir()
        L_0x0114:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = java.io.File.separator
            int r3 = r0.size()
            java.util.List r0 = r0.subList(r9, r3)
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            r1.<init>(r12, r0)
            return r1
        L_0x0128:
            ahbk r12 = new ahbk
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r0 = java.lang.String.format(r3, r0)
            r12.<init>((java.lang.String) r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahab.b(android.net.Uri):java.io.File");
    }

    public static ahab a(Context context, agzt agzt) {
        return new ahab(context, agzt);
    }

    public static void a(Uri uri) {
        if (!uri.getScheme().equals("android")) {
            throw new ahbk("Scheme must be 'android'");
        } else if (uri.getPathSegments().isEmpty()) {
            throw new ahbk(String.format("Path must start with a valid logical location: %s", new Object[]{uri}));
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new ahbk("Did not expect uri to have query");
        }
    }
}
