package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: mbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbe {
    public final Context a;
    private final List b = new ArrayList();

    public static File a(Context context) {
        return new File(b(context), String.valueOf(UUID.randomUUID().toString()).concat(".apk"));
    }

    public static File b(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public mbe(Context context) {
        this.a = context;
    }

    private final mbg a() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return a(valueOf.length() == 0 ? new String("tmp_") : "tmp_".concat(valueOf));
    }

    private final void b() {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            File file = (File) list.get(i);
            if (!lzv.a(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed to clean up temporary file ");
                sb.append(valueOf);
                sb.append(".");
                Log.e("DG", sb.toString());
            }
        }
        this.b.clear();
    }

    private static void a(File file, File file2) {
        if (!file.renameTo(file2)) {
            String valueOf = String.valueOf(file);
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
            sb.append("Failed to rename ");
            sb.append(valueOf);
            sb.append(" -> ");
            sb.append(valueOf2);
            sb.append(".");
            throw new mah(sb.toString());
        }
    }

    public static final void a(mbg mbg) {
        File file = mbg.c;
        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    String valueOf = String.valueOf(mbg);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Failed to touch last-used file for ");
                    sb.append(valueOf);
                    sb.append(".");
                    throw new mah(sb.toString());
                }
            }
            if (!file.setLastModified(System.currentTimeMillis())) {
                String valueOf2 = String.valueOf(mbg);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                sb2.append("Failed to update last-used timestamp for ");
                sb2.append(valueOf2);
                sb2.append(".");
                throw new mah(sb2.toString());
            }
        } catch (IOException e) {
            String valueOf3 = String.valueOf(mbg);
            String valueOf4 = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
            sb3.append("Failed to touch last-used file for ");
            sb3.append(valueOf3);
            sb3.append(": ");
            sb3.append(valueOf4);
            throw new mah(sb3.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final mbg a(String str) {
        File file = new File(b(this.a), str);
        return new mbg(new File(file, "the.apk"), new File(file, "opt"), new File(file, "t"));
    }

    public final mbg a(mbh mbh) {
        mbg a2 = a(mbh.a);
        if (!a2.b()) {
            return null;
        }
        a(a2);
        return a2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0048=Splitter:B:22:0x0048, B:43:0x00c9=Splitter:B:43:0x00c9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.mbh r10, defpackage.mbg r11) {
        /*
            r9 = this;
            java.util.List r0 = r9.b
            monitor-enter(r0)
            mbg r1 = r9.a()     // Catch:{ all -> 0x00f3 }
            java.util.List r2 = r9.b     // Catch:{ all -> 0x00f3 }
            java.io.File r3 = r1.a()     // Catch:{ all -> 0x00f3 }
            r2.add(r3)     // Catch:{ all -> 0x00f3 }
            java.io.File r2 = r1.a()     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x0022
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00f3 }
            if (r3 != 0) goto L_0x0022
            boolean r2 = r2.mkdirs()     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x00c9
        L_0x0022:
            java.io.File r2 = r1.b     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x00c9
            java.io.File r3 = r1.c     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x00c9
            boolean r2 = r2.exists()     // Catch:{ all -> 0x00f3 }
            if (r2 != 0) goto L_0x0038
            java.io.File r2 = r1.b     // Catch:{ all -> 0x00f3 }
            boolean r2 = r2.mkdirs()     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x00c9
        L_0x0038:
            java.io.File r2 = r1.c     // Catch:{ IOException -> 0x00c8 }
            boolean r2 = r2.exists()     // Catch:{ IOException -> 0x00c8 }
            if (r2 != 0) goto L_0x0048
            java.io.File r2 = r1.c     // Catch:{ IOException -> 0x00c8 }
            boolean r2 = r2.createNewFile()     // Catch:{ IOException -> 0x00c8 }
            if (r2 == 0) goto L_0x00c9
        L_0x0048:
            java.io.File r11 = r11.a     // Catch:{ all -> 0x00f3 }
            java.io.File r2 = r1.a     // Catch:{ all -> 0x00f3 }
            a((java.io.File) r11, (java.io.File) r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x00f3 }
            mbg r10 = r9.a((java.lang.String) r10)     // Catch:{ all -> 0x00f3 }
            java.io.File r11 = r10.a()     // Catch:{ all -> 0x00f3 }
            boolean r11 = r11.exists()     // Catch:{ all -> 0x00f3 }
            if (r11 != 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            mbg r11 = r9.a()     // Catch:{ all -> 0x00f3 }
            java.util.List r2 = r9.b     // Catch:{ all -> 0x00f3 }
            java.io.File r3 = r11.a()     // Catch:{ all -> 0x00f3 }
            r2.add(r3)     // Catch:{ all -> 0x00f3 }
            java.io.File r2 = r10.a()     // Catch:{ all -> 0x00f3 }
            java.io.File r11 = r11.a()     // Catch:{ all -> 0x00f3 }
            a((java.io.File) r2, (java.io.File) r11)     // Catch:{ all -> 0x00f3 }
        L_0x0078:
            a((defpackage.mbg) r1)     // Catch:{ all -> 0x00f3 }
            java.io.File r11 = r1.a()     // Catch:{ all -> 0x00f3 }
            java.io.File r10 = r10.a()     // Catch:{ all -> 0x00f3 }
            a((java.io.File) r11, (java.io.File) r10)     // Catch:{ all -> 0x00f3 }
            android.content.Context r10 = r9.a     // Catch:{ all -> 0x00f3 }
            java.io.File r10 = b(r10)     // Catch:{ all -> 0x00f3 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f3 }
            java.lang.String[] r10 = r10.list()     // Catch:{ all -> 0x00f3 }
            int r11 = r10.length     // Catch:{ all -> 0x00f3 }
            r3 = 0
        L_0x0096:
            if (r3 >= r11) goto L_0x00c3
            r4 = r10[r3]     // Catch:{ all -> 0x00f3 }
            mbg r4 = r9.a((java.lang.String) r4)     // Catch:{ all -> 0x00f3 }
            boolean r5 = r4.b()     // Catch:{ all -> 0x00f3 }
            if (r5 == 0) goto L_0x00c0
            java.io.File r5 = r4.c     // Catch:{ all -> 0x00f3 }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x00f3 }
            if (r6 != 0) goto L_0x00ad
            goto L_0x00b9
        L_0x00ad:
            long r5 = r5.lastModified()     // Catch:{ all -> 0x00f3 }
            r7 = 1209600000(0x48190800, double:5.97621805E-315)
            long r5 = r5 + r7
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00c0
        L_0x00b9:
            java.io.File r4 = r4.a()     // Catch:{ all -> 0x00f3 }
            defpackage.lzv.a(r4)     // Catch:{ all -> 0x00f3 }
        L_0x00c0:
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00c3:
            r9.b()     // Catch:{ all -> 0x00f8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            return
        L_0x00c8:
            r10 = move-exception
        L_0x00c9:
            mah r10 = new mah     // Catch:{ all -> 0x00f3 }
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00f3 }
            int r1 = r1.length()     // Catch:{ all -> 0x00f3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            int r1 = r1 + 31
            r2.<init>(r1)     // Catch:{ all -> 0x00f3 }
            java.lang.String r1 = "Failed to make directores for "
            r2.append(r1)     // Catch:{ all -> 0x00f3 }
            r2.append(r11)     // Catch:{ all -> 0x00f3 }
            java.lang.String r11 = "."
            r2.append(r11)     // Catch:{ all -> 0x00f3 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x00f3 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f3 }
            throw r10     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r10 = move-exception
            r9.b()     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
            goto L_0x00fc
        L_0x00fb:
            throw r10
        L_0x00fc:
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.a(mbh, mbg):void");
    }
}
