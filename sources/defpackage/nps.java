package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* renamed from: nps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nps {
    final File a;
    private final File b;
    private final SharedPreferences c;
    private final bhs d;

    public nps(Context context, bhs bhs) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        npt.a(dir, false);
        this.b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        npt.a(dir2, true);
        this.a = dir2;
        this.d = bhs;
    }

    static String a(bhu bhu) {
        return jjp.a(bhu.au().k());
    }

    private final File b() {
        File file = new File(this.b, Integer.toString(this.d.f));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String c() {
        int i = this.d.f;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i);
        return sb.toString();
    }

    private final String d() {
        int i = this.d.f;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final bhu a(int i) {
        String str;
        if (i != 1) {
            str = this.c.getString(c(), (String) null);
        } else {
            str = this.c.getString(d(), (String) null);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                bhu bhu = (bhu) aucj.a((aucj) bhu.g, auay.a(jjp.a(str)));
                String str2 = bhu.b;
                File a2 = npt.a(str2, "pcam", b());
                File a3 = npt.a(str2, "pcbc", b());
                if (!a2.exists() || !a3.exists()) {
                    return null;
                }
                return bhu;
            } catch (auda e) {
            }
        }
        return null;
    }

    public final npr a() {
        bhu a2 = a(1);
        if (a2 == null) {
            return null;
        }
        String str = a2.b;
        return new npr(a2, npt.a(str, "pcam", b()), npt.a(str, "pcbc", b()), npt.a(str, "pcopt", b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bht r9, defpackage.now r10) {
        /*
            r8 = this;
            bhu r0 = r9.b
            if (r0 == 0) goto L_0x0005
            goto L_0x0007
        L_0x0005:
            bhu r0 = defpackage.bhu.g
        L_0x0007:
            java.lang.String r0 = r0.b
            auay r1 = r9.c
            byte[] r1 = r1.k()
            auay r2 = r9.d
            byte[] r2 = r2.k()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x01e0
            if (r2 == 0) goto L_0x01e0
            int r3 = r2.length
            if (r3 == 0) goto L_0x01e0
            java.io.File r3 = r8.a
            defpackage.npt.b(r3)
            java.io.File r3 = r8.a
            r3.mkdirs()
            java.io.File r3 = r8.a
            java.io.File r3 = defpackage.npt.a((java.lang.String) r0, (java.io.File) r3)
            r3.mkdirs()
            java.io.File r3 = r8.a
            java.lang.String r5 = "pcam"
            java.io.File r3 = defpackage.npt.a(r0, r5, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x004a
        L_0x003f:
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004a
            boolean r1 = defpackage.npt.a((java.io.File) r3, (byte[]) r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x01e0
        L_0x004a:
            java.io.File r1 = r8.a
            java.lang.String r3 = "pcbc"
            java.io.File r0 = defpackage.npt.a(r0, r3, r1)
            boolean r0 = defpackage.npt.a((java.io.File) r0, (byte[]) r2)
            if (r0 == 0) goto L_0x01e0
            bhu r0 = r9.b
            if (r0 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            bhu r0 = defpackage.bhu.g
        L_0x005f:
            java.lang.String r0 = r0.b
            java.io.File r1 = r8.a
            java.io.File r0 = defpackage.npt.a(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x006e
        L_0x006d:
            goto L_0x0077
        L_0x006e:
            if (r10 == 0) goto L_0x0077
            boolean r10 = r10.a(r0)
            if (r10 != 0) goto L_0x006d
            return r4
        L_0x0077:
            bhu r10 = r9.b
            if (r10 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            bhu r10 = defpackage.bhu.g
        L_0x007e:
            java.lang.String r10 = r10.b
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x019d
            java.io.File r0 = r8.a
            java.io.File r0 = defpackage.npt.a(r10, r5, r0)
            java.io.File r6 = r8.a
            java.io.File r6 = defpackage.npt.a(r10, r3, r6)
            java.io.File r7 = r8.b()
            java.io.File r5 = defpackage.npt.a(r10, r5, r7)
            java.io.File r7 = r8.b()
            java.io.File r10 = defpackage.npt.a(r10, r3, r7)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b0
            boolean r0 = r0.renameTo(r5)
            if (r0 == 0) goto L_0x019d
        L_0x00b0:
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x019d
            boolean r10 = r6.renameTo(r10)
            if (r10 == 0) goto L_0x019d
            bhu r10 = defpackage.bhu.g
            aucd r10 = r10.o()
            bhu r0 = r9.b
            if (r0 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            bhu r0 = defpackage.bhu.g
        L_0x00c9:
            java.lang.String r0 = r0.b
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x00d0
            goto L_0x00d5
        L_0x00d0:
            r10.c()
            r10.c = r4
        L_0x00d5:
            aucj r3 = r10.b
            bhu r3 = (defpackage.bhu) r3
            r0.getClass()
            int r5 = r3.a
            r5 = r5 | r2
            r3.a = r5
            r3.b = r0
            bhu r0 = r9.b
            if (r0 == 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            bhu r0 = defpackage.bhu.g
        L_0x00ea:
            java.lang.String r0 = r0.c
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x00f1
            goto L_0x00f6
        L_0x00f1:
            r10.c()
            r10.c = r4
        L_0x00f6:
            aucj r3 = r10.b
            bhu r3 = (defpackage.bhu) r3
            r0.getClass()
            int r5 = r3.a
            r5 = r5 | r1
            r3.a = r5
            r3.c = r0
            bhu r0 = r9.b
            if (r0 == 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            bhu r0 = defpackage.bhu.g
        L_0x010b:
            long r5 = r0.e
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            r10.c()
            r10.c = r4
        L_0x0117:
            aucj r0 = r10.b
            bhu r0 = (defpackage.bhu) r0
            int r3 = r0.a
            r3 = r3 | 8
            r0.a = r3
            r0.e = r5
            bhu r0 = r9.b
            if (r0 == 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            bhu r0 = defpackage.bhu.g
        L_0x012a:
            long r5 = r0.f
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x0131
            goto L_0x0136
        L_0x0131:
            r10.c()
            r10.c = r4
        L_0x0136:
            aucj r0 = r10.b
            bhu r0 = (defpackage.bhu) r0
            int r3 = r0.a
            r3 = r3 | 16
            r0.a = r3
            r0.f = r5
            bhu r9 = r9.b
            if (r9 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            bhu r9 = defpackage.bhu.g
        L_0x0149:
            long r5 = r9.d
            boolean r9 = r10.c
            if (r9 != 0) goto L_0x0150
            goto L_0x0155
        L_0x0150:
            r10.c()
            r10.c = r4
        L_0x0155:
            aucj r9 = r10.b
            bhu r9 = (defpackage.bhu) r9
            int r0 = r9.a
            r0 = r0 | 4
            r9.a = r0
            r9.d = r5
            aucj r9 = r10.i()
            bhu r9 = (defpackage.bhu) r9
            bhu r10 = r8.a((int) r2)
            android.content.SharedPreferences r0 = r8.c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r10 == 0) goto L_0x0188
            java.lang.String r3 = r9.b
            java.lang.String r5 = r10.b
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0188
            java.lang.String r3 = r8.c()
            java.lang.String r10 = a((defpackage.bhu) r10)
            r0.putString(r3, r10)
        L_0x0188:
            java.lang.String r10 = r8.d()
            java.lang.String r9 = a((defpackage.bhu) r9)
            r0.putString(r10, r9)
            boolean r9 = r0.commit()
            if (r9 == 0) goto L_0x019b
            r9 = 1
            goto L_0x019e
        L_0x019b:
            r9 = 0
            goto L_0x019e
        L_0x019d:
            r9 = 0
        L_0x019e:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            bhu r0 = r8.a((int) r2)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.b
            r10.add(r0)
        L_0x01ae:
            bhu r0 = r8.a((int) r1)
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = r0.b
            r10.add(r0)
        L_0x01ba:
            java.io.File r0 = r8.b()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x01c3:
            if (r4 >= r1) goto L_0x01df
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r10.contains(r2)
            if (r3 != 0) goto L_0x01dc
            java.io.File r3 = r8.b()
            java.io.File r2 = defpackage.npt.a((java.lang.String) r2, (java.io.File) r3)
            defpackage.npt.b(r2)
        L_0x01dc:
            int r4 = r4 + 1
            goto L_0x01c3
        L_0x01df:
            return r9
        L_0x01e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nps.a(bht, now):boolean");
    }
}
