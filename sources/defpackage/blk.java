package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: blk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class blk extends bll {
    public String a;
    public String b;
    public String c;
    private final int j;
    private final String k;
    private final int l;

    public blk(Context context, int i, String str, int i2, int i3, String str2, bmr bmr) {
        super(context, 4, i, bmr, str);
        this.l = i2;
        this.j = i3;
        this.k = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.ClassLoader a(java.lang.ClassLoader r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ChimeraFileApk"
            java.lang.String r1 = r9.c
            if (r1 == 0) goto L_0x0007
            goto L_0x000b
        L_0x0007:
            java.lang.String r1 = r9.h()
        L_0x000b:
            java.lang.String r2 = r9.h
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0014
            goto L_0x0049
        L_0x0014:
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = java.io.File.pathSeparator
            java.lang.String r3 = r9.h
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + r5
            int r4 = r4 + r6
            r7.<init>(r4)
            r7.append(r1)
            r7.append(r2)
            r7.append(r3)
            java.lang.String r1 = r7.toString()
            goto L_0x0049
        L_0x0047:
            java.lang.String r1 = r9.h
        L_0x0049:
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0055 }
            java.lang.String r3 = r9.d     // Catch:{ IOException -> 0x0055 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0055 }
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0055 }
            goto L_0x007d
        L_0x0055:
            r2 = move-exception
            java.lang.String r2 = r9.d
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 45
            r4.<init>(r3)
            java.lang.String r3 = "Unable to determine canonical path for apk '"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "'"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
            java.lang.String r2 = r9.d
        L_0x007d:
            int r3 = r9.j
            if (r3 <= 0) goto L_0x00bb
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.io.File.pathSeparator
            java.lang.String r4 = r9.d
            int r5 = r9.j
            java.lang.String r4 = defpackage.boq.a(r4, r5)
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r5 = r5 + r6
            int r5 = r5 + r7
            r8.<init>(r5)
            r8.append(r2)
            r8.append(r3)
            r8.append(r4)
            java.lang.String r2 = r8.toString()
        L_0x00bb:
            java.lang.String r3 = r9.g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00f7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.io.File.pathSeparator
            java.lang.String r4 = r9.g
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r5 = r5 + r6
            int r5 = r5 + r7
            r8.<init>(r5)
            r8.append(r2)
            r8.append(r3)
            r8.append(r4)
            java.lang.String r2 = r8.toString()
        L_0x00f7:
            java.lang.ClassLoader r3 = defpackage.bnx.a(r2, r1, r10)
            java.lang.String r4 = r9.a
            if (r4 == 0) goto L_0x0193
            r3.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0103 }
            return r3
        L_0x0103:
            r3 = move-exception
            java.lang.String r4 = r9.d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 41
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Failed to validate PathClassLoader for "
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = ": "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.w(r0, r3)
            boolean r3 = defpackage.bnx.a()
            if (r3 != 0) goto L_0x0140
            goto L_0x016c
        L_0x0140:
            java.lang.String r3 = r9.b
            if (r3 == 0) goto L_0x016c
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 != 0) goto L_0x0152
            r4.mkdir()
        L_0x0152:
            java.lang.String r3 = r9.b
            boolean r4 = defpackage.bnx.a()
            defpackage.amrl.b(r4)
            bnv r4 = new bnv
            r4.<init>(r2, r3, r1, r10)
            java.lang.String r10 = r9.a     // Catch:{ ClassNotFoundException -> 0x0166 }
            r4.loadClass(r10)     // Catch:{ ClassNotFoundException -> 0x0166 }
            return r4
        L_0x0166:
            r10 = move-exception
            java.lang.String r1 = "Failed to validate DexClassLoader."
            android.util.Log.e(r0, r1, r10)
        L_0x016c:
            bop r10 = new bop
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r9.d
            r0.<init>(r1)
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Can't load code for "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x018b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x018f
        L_0x018b:
            java.lang.String r0 = r1.concat(r0)
        L_0x018f:
            r10.<init>(r0)
            throw r10
        L_0x0193:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blk.a(java.lang.ClassLoader):java.lang.ClassLoader");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof blk) {
            return this.d.equals(((blk) obj).d);
        }
        return false;
    }

    public final bnm f() {
        aucd j2 = j();
        long l2 = l();
        if (j2.c) {
            j2.c();
            j2.c = false;
        }
        bnm bnm = (bnm) j2.b;
        bnm bnm2 = bnm.r;
        bnm.a |= 4;
        bnm.d = l2;
        PackageInfo packageArchiveInfo = this.e.getPackageManager().getPackageArchiveInfo(this.d, 0);
        if (packageArchiveInfo == null) {
            String valueOf = String.valueOf(this.d);
            throw new PackageManager.NameNotFoundException(valueOf.length() == 0 ? new String("Failed reading stored package info from ") : "Failed reading stored package info from ".concat(valueOf));
        }
        String str = packageArchiveInfo.packageName;
        if (j2.c) {
            j2.c();
            j2.c = false;
        }
        bnm bnm3 = (bnm) j2.b;
        str.getClass();
        bnm3.a |= 16;
        bnm3.f = str;
        String str2 = packageArchiveInfo.versionName == null ? "" : packageArchiveInfo.versionName;
        if (j2.c) {
            j2.c();
            j2.c = false;
        }
        bnm bnm4 = (bnm) j2.b;
        str2.getClass();
        bnm4.a |= 32;
        bnm4.g = str2;
        int i = packageArchiveInfo.versionCode;
        if (j2.c) {
            j2.c();
            j2.c = false;
        }
        bnm bnm5 = (bnm) j2.b;
        bnm5.a |= 64;
        bnm5.h = i;
        return (bnm) j2.i();
    }

    public final String h() {
        String str = this.d;
        File file = new File(new File(str).getParentFile(), "n");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (file.exists()) {
            List b2 = bor.b();
            int size = b2.size();
            while (i < size) {
                String str2 = (String) b2.get(i);
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append("/");
                sb.append(str2);
                arrayList.add(sb.toString());
                i++;
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            List b3 = bor.b();
            int size2 = b3.size();
            while (i < size2) {
                String str3 = (String) b3.get(i);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str3).length());
                sb2.append(str);
                sb2.append("!/lib/");
                sb2.append(str3);
                arrayList.add(sb2.toString());
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            return TextUtils.join(File.pathSeparator, arrayList);
        }
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final boolean i() {
        return this.d.startsWith("/system/");
    }

    /* access modifiers changed from: protected */
    public final aucd j() {
        aucd j2 = super.j();
        int i = this.l;
        if (j2.c) {
            j2.c();
            j2.c = false;
        }
        bnm bnm = (bnm) j2.b;
        bnm bnm2 = bnm.r;
        bnm.i = i - 1;
        int i2 = bnm.a | 128;
        bnm.a = i2;
        int i3 = this.j;
        int i4 = i2 | 512;
        bnm.a = i4;
        bnm.l = i3;
        String str = this.k;
        str.getClass();
        bnm.a = i4 | 2048;
        bnm.n = str;
        if (i()) {
            String str2 = Build.FINGERPRINT;
            if (j2.c) {
                j2.c();
                j2.c = false;
            }
            bnm bnm3 = (bnm) j2.b;
            str2.getClass();
            bnm3.a |= 16384;
            bnm3.q = str2;
        }
        return j2;
    }

    public final boolean o() {
        return this.l == 3;
    }

    public final boolean p() {
        return this.l == 2;
    }

    public final String toString() {
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append("FileApk(");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean a(boy boy) {
        return a(boy, false);
    }

    public final boolean a(boy boy, boolean z) {
        if (l() != boy.d()) {
            return false;
        }
        if (!z || !i() || Build.FINGERPRINT.equals(boy.q())) {
            return true;
        }
        return false;
    }
}
