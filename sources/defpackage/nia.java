package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: nia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nia {
    public static final Object a = new Object();
    public static nia b = null;
    long c = -1;
    private boolean d;
    private final ngm e;
    private final ngo f;
    private final nfw g;
    private nfv h;
    private nfv i;
    private final List j = new ArrayList();
    private final Set k = new HashSet();
    private final Context l;
    private int m = 1;
    private final nhm n;

    public nia(ngm ngm, ngo ngo, nfw nfw, nhm nhm, Context context) {
        iva.a((Object) ngm, (Object) "disk");
        this.e = ngm;
        iva.a((Object) ngo, (Object) "downloader");
        this.f = ngo;
        iva.a((Object) nfw, (Object) "directorySpec");
        this.g = nfw;
        iva.a((Object) nhm, (Object) "fontDirectory");
        this.n = nhm;
        this.l = context;
    }

    private final void a(int i2) {
        int i3;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        nfv nfv = this.n.a;
        int i4 = 0;
        if (nfv != null) {
            i3 = nfv.b;
        } else {
            i3 = 0;
        }
        objArr[0] = Integer.valueOf(i3);
        nfv nfv2 = this.i;
        if (nfv2 != null) {
            i4 = nfv2.b;
        }
        objArr[1] = Integer.valueOf(i4);
        nhz.a.a(this.l).a(9, i2, String.format(locale, "com.google.android.gms.fonts.update.%dto%d", objArr));
    }

    private final void b(int i2) {
        this.i = null;
        this.d = false;
        this.m = i2;
        b = null;
        File a2 = this.f.a(this.g.b);
        if (a2.exists()) {
            a2.delete();
        }
        this.f.a(ngt.a(this.g), this.g.b);
        for (oq oqVar : this.k) {
            this.f.a((String) oqVar.a, (String) oqVar.b);
        }
        this.h = null;
    }

    private final boolean c() {
        return this.m == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c1, code lost:
        r4 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r15 = this;
            int r0 = r15.m
            r1 = 1
            if (r0 != r1) goto L_0x029e
            nfv r0 = r15.h
            if (r0 != 0) goto L_0x006c
            nfw r0 = r15.g
            java.lang.String r0 = defpackage.ngt.a((defpackage.nfw) r0)
            nfw r2 = r15.g
            boolean r0 = r15.a(r0, r2)
            if (r0 == 0) goto L_0x029e
            r0 = 0
            r15.i = r0
            ngo r0 = r15.f     // Catch:{ IllegalArgumentException -> 0x0034, IllegalStateException -> 0x0032, NullPointerException -> 0x0030, IOException -> 0x002b }
            nfw r2 = r15.g     // Catch:{ IllegalArgumentException -> 0x0034, IllegalStateException -> 0x0032, NullPointerException -> 0x0030, IOException -> 0x002b }
            java.lang.String r2 = r2.b     // Catch:{ IllegalArgumentException -> 0x0034, IllegalStateException -> 0x0032, NullPointerException -> 0x0030, IOException -> 0x002b }
            byte[] r0 = r0.b(r2)     // Catch:{ IllegalArgumentException -> 0x0034, IllegalStateException -> 0x0032, NullPointerException -> 0x0030, IOException -> 0x002b }
            nfv r0 = defpackage.nhg.a(r0)     // Catch:{ IllegalArgumentException -> 0x0034, IllegalStateException -> 0x0032, NullPointerException -> 0x0030, IOException -> 0x002b }
            r15.i = r0     // Catch:{ IllegalArgumentException -> 0x0034, IllegalStateException -> 0x0032, NullPointerException -> 0x0030, IOException -> 0x002b }
            goto L_0x0038
        L_0x002b:
            r0 = move-exception
            r15.a((java.lang.Exception) r0)
            goto L_0x0038
        L_0x0030:
            r0 = move-exception
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            goto L_0x0035
        L_0x0034:
            r0 = move-exception
        L_0x0035:
            r15.a((java.lang.Exception) r0)
        L_0x0038:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x0068
            nhm r0 = r15.n
            nfv r0 = r0.a
            int r0 = r0.b
            nfv r2 = r15.i
            int r3 = r2.b
            if (r0 < r3) goto L_0x0066
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 59
            r2.<init>(r4)
            java.lang.String r4 = "Version inside directory is set to wrong value: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r15.a((java.lang.Exception) r0)
            goto L_0x0068
        L_0x0066:
            r15.h = r2
        L_0x0068:
            nfv r0 = r15.h
            if (r0 == 0) goto L_0x029e
        L_0x006c:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x029e
            boolean r0 = r15.d
            r2 = 0
            if (r0 != 0) goto L_0x01cc
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "FontsUpdateRunner"
            java.lang.String r4 = "Starting to acquire font files"
            defpackage.ngz.c(r3, r4, r0)
            nfw r0 = r15.g
            long r3 = r0.c
            java.util.List r0 = r15.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008d
            goto L_0x00c4
        L_0x008d:
            nfv r0 = r15.h
            aucx r0 = r0.a
            int r5 = r0.size()
            r6 = 0
        L_0x0096:
            if (r6 >= r5) goto L_0x00c4
            java.lang.Object r7 = r0.get(r6)
            nfz r7 = (defpackage.nfz) r7
            nhm r8 = r15.n
            java.lang.String r9 = r7.b
            nfz r8 = r8.a(r9)
            if (r8 != 0) goto L_0x00a9
        L_0x00a8:
            goto L_0x00c1
        L_0x00a9:
            int r8 = r8.c
            int r9 = r7.c
            if (r8 >= r9) goto L_0x00a8
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r9 = r7.b
            r8[r2] = r9
            java.lang.String r9 = "FontsUpdateRunner"
            java.lang.String r10 = "Potential family to be updated: %s"
            defpackage.ngz.c(r9, r10, r8)
            java.util.List r8 = r15.j
            r8.add(r7)
        L_0x00c1:
            int r6 = r6 + 1
            goto L_0x0096
        L_0x00c4:
            java.util.List r0 = r15.j
            int r5 = r0.size()
            r6 = 0
        L_0x00cb:
            if (r6 >= r5) goto L_0x0102
            java.lang.Object r7 = r0.get(r6)
            nfz r7 = (defpackage.nfz) r7
            aucx r8 = r7.d
            int r9 = r8.size()
            r10 = 0
        L_0x00da:
            int r11 = r6 + 1
            if (r10 >= r9) goto L_0x0100
            java.lang.Object r11 = r8.get(r10)
            nfy r11 = (defpackage.nfy) r11
            ngm r12 = r15.e     // Catch:{ IllegalStateException -> 0x00fb }
            java.io.File r12 = r12.a((defpackage.nfz) r7, (defpackage.nfy) r11, (boolean) r2)     // Catch:{ IllegalStateException -> 0x00fb }
            if (r12 == 0) goto L_0x00f7
            nfw r11 = r11.a     // Catch:{ IllegalStateException -> 0x00fb }
            if (r11 == 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            nfw r11 = defpackage.nfw.e     // Catch:{ IllegalStateException -> 0x00fb }
        L_0x00f3:
            long r11 = r11.c     // Catch:{ IllegalStateException -> 0x00fb }
            long r3 = r3 + r11
            goto L_0x00f8
        L_0x00f7:
        L_0x00f8:
            int r10 = r10 + 1
            goto L_0x00da
        L_0x00fb:
            r0 = move-exception
            r15.a((java.lang.Exception) r0)
            return
        L_0x0100:
            r6 = r11
            goto L_0x00cb
        L_0x0102:
            long r5 = r15.c
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0117
            axiu r0 = defpackage.axiu.a
            axiv r0 = r0.a()
            long r5 = r0.i()
            r15.c = r5
            goto L_0x0118
        L_0x0117:
        L_0x0118:
            long r3 = r3 + r5
            ngm r0 = r15.e
            boolean r0 = r0.b(r3)
            if (r0 == 0) goto L_0x0122
        L_0x0121:
            goto L_0x0146
        L_0x0122:
            ngm r0 = r15.e
            boolean r0 = r0.c(r3)
            if (r0 != 0) goto L_0x0121
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "FontsUpdateRunner"
            java.lang.String r2 = "Not enough disk space to process update."
            defpackage.ngz.b(r1, r2, r0)
            java.lang.Object r0 = a
            monitor-enter(r0)
            nia r1 = b     // Catch:{ all -> 0x0143 }
            if (r1 == 0) goto L_0x0141
            nia r1 = b     // Catch:{ all -> 0x0143 }
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x0143 }
            r1.a((com.google.android.gms.common.api.Status) r2)     // Catch:{ all -> 0x0143 }
        L_0x0141:
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            return
        L_0x0143:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0143 }
            throw r1
        L_0x0146:
            java.util.List r0 = r15.j
            int r3 = r0.size()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x014f:
            if (r4 >= r3) goto L_0x01c3
            java.lang.Object r7 = r0.get(r4)
            nfz r7 = (defpackage.nfz) r7
            aucx r8 = r7.d
            int r9 = r8.size()
            r10 = 0
        L_0x015e:
            int r11 = r4 + 1
            if (r10 >= r9) goto L_0x01c1
            java.lang.Object r11 = r8.get(r10)
            nfy r11 = (defpackage.nfy) r11
            ngm r12 = r15.e     // Catch:{ IllegalStateException -> 0x01bc }
            java.io.File r12 = r12.a((defpackage.nfz) r7, (defpackage.nfy) r11, (boolean) r2)     // Catch:{ IllegalStateException -> 0x01bc }
            if (r12 == 0) goto L_0x01b8
            int r5 = r5 + 1
            java.lang.String r12 = defpackage.ngt.a((defpackage.nfy) r11)     // Catch:{ IllegalStateException -> 0x01bc }
            nfw r13 = r11.a     // Catch:{ IllegalStateException -> 0x01bc }
            if (r13 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            nfw r13 = defpackage.nfw.e     // Catch:{ IllegalStateException -> 0x01bc }
        L_0x017d:
            nfw r13 = defpackage.ngg.a((defpackage.nfw) r13)     // Catch:{ IllegalStateException -> 0x01bc }
            boolean r12 = r15.a(r12, r13)     // Catch:{ IllegalStateException -> 0x01bc }
            if (r12 == 0) goto L_0x01b2
            java.util.Set r12 = r15.k     // Catch:{ IllegalStateException -> 0x01bc }
            java.lang.String r13 = defpackage.ngt.a((defpackage.nfy) r11)     // Catch:{ IllegalStateException -> 0x01bc }
            nfw r11 = r11.a     // Catch:{ IllegalStateException -> 0x01bc }
            if (r11 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            nfw r11 = defpackage.nfw.e     // Catch:{ IllegalStateException -> 0x01bc }
        L_0x0194:
            auay r11 = r11.d     // Catch:{ IllegalStateException -> 0x01bc }
            byte[] r11 = r11.k()     // Catch:{ IllegalStateException -> 0x01bc }
            java.lang.String r11 = defpackage.ngg.a((byte[]) r11)     // Catch:{ IllegalStateException -> 0x01bc }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ IllegalStateException -> 0x01bc }
            java.lang.String r14 = ".ttf"
            java.lang.String r11 = r11.concat(r14)     // Catch:{ IllegalStateException -> 0x01bc }
            oq r11 = defpackage.oq.a(r13, r11)     // Catch:{ IllegalStateException -> 0x01bc }
            r12.add(r11)     // Catch:{ IllegalStateException -> 0x01bc }
            int r6 = r6 + 1
            goto L_0x01b3
        L_0x01b2:
        L_0x01b3:
            int r11 = r15.m     // Catch:{ IllegalStateException -> 0x01bc }
            if (r11 != r1) goto L_0x029d
            goto L_0x01b9
        L_0x01b8:
        L_0x01b9:
            int r10 = r10 + 1
            goto L_0x015e
        L_0x01bc:
            r0 = move-exception
            r15.a((java.lang.Exception) r0)
            return
        L_0x01c1:
            r4 = r11
            goto L_0x014f
        L_0x01c3:
            if (r5 != r6) goto L_0x01c7
            r0 = 1
            goto L_0x01c8
        L_0x01c7:
            r0 = 0
        L_0x01c8:
            r15.d = r0
            if (r0 == 0) goto L_0x029d
        L_0x01cc:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x029d
            java.lang.Object[] r0 = new java.lang.Object[r1]
            nfv r3 = r15.h
            int r3 = r3.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "FontsUpdateRunner"
            java.lang.String r4 = "Starting to move downloaded fonts for directory v %d"
            defpackage.ngz.c(r3, r4, r0)
            r0 = 2
            java.util.List r3 = r15.j     // Catch:{ Exception -> 0x0258 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0258 }
        L_0x01ec:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0258 }
            if (r4 == 0) goto L_0x0265
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0258 }
            nfz r4 = (defpackage.nfz) r4     // Catch:{ Exception -> 0x0258 }
            nhm r5 = r15.n     // Catch:{ Exception -> 0x0258 }
            java.lang.String r6 = r4.b     // Catch:{ Exception -> 0x0258 }
            nfz r5 = r5.a(r6)     // Catch:{ Exception -> 0x0258 }
            aucx r6 = r4.d     // Catch:{ Exception -> 0x0258 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0258 }
        L_0x0206:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0258 }
            if (r7 == 0) goto L_0x01ec
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0258 }
            nfy r7 = (defpackage.nfy) r7     // Catch:{ Exception -> 0x0258 }
            ngm r8 = r15.e     // Catch:{ Exception -> 0x0258 }
            java.io.File r8 = r8.a((defpackage.nfz) r5, (defpackage.nfy) r7, (boolean) r2)     // Catch:{ Exception -> 0x0258 }
            if (r8 == 0) goto L_0x0206
            ngo r8 = r15.f     // Catch:{ Exception -> 0x0258 }
            nfw r9 = r7.a     // Catch:{ Exception -> 0x0258 }
            if (r9 == 0) goto L_0x0221
            goto L_0x0223
        L_0x0221:
            nfw r9 = defpackage.nfw.e     // Catch:{ Exception -> 0x0258 }
        L_0x0223:
            auay r9 = r9.d     // Catch:{ Exception -> 0x0258 }
            byte[] r9 = r9.k()     // Catch:{ Exception -> 0x0258 }
            java.lang.String r9 = defpackage.ngg.a((byte[]) r9)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0258 }
            java.lang.String r10 = ".ttf"
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Exception -> 0x0258 }
            java.io.File r8 = r8.a(r9)     // Catch:{ Exception -> 0x0258 }
            ngm r9 = r15.e     // Catch:{ Exception -> 0x0258 }
            r9.a((java.io.File) r8, (defpackage.nfz) r4, (defpackage.nfy) r7)     // Catch:{ Exception -> 0x0258 }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0258 }
            java.lang.String r8 = r4.b     // Catch:{ Exception -> 0x0258 }
            r7[r2] = r8     // Catch:{ Exception -> 0x0258 }
            nfv r8 = r15.h     // Catch:{ Exception -> 0x0258 }
            int r8 = r8.b     // Catch:{ Exception -> 0x0258 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0258 }
            r7[r1] = r8     // Catch:{ Exception -> 0x0258 }
            java.lang.String r8 = "FontsUpdateRunner"
            java.lang.String r9 = "Successfully moved %s to disk for directory v %d"
            defpackage.ngz.c(r8, r9, r7)     // Catch:{ Exception -> 0x0258 }
            goto L_0x0206
        L_0x0258:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "FontsUpdateRunner"
            java.lang.String r6 = "Moving the downloaded fonts to disk failed"
            defpackage.ngz.a((java.lang.String) r5, (java.lang.Throwable) r3, (java.lang.String) r6, (java.lang.Object[]) r4)
            r15.a((java.lang.Exception) r3)
        L_0x0265:
            boolean r3 = r15.c()
            if (r3 == 0) goto L_0x0291
            ngm r3 = r15.e     // Catch:{ IOException -> 0x027a }
            nfv r4 = r15.h     // Catch:{ IOException -> 0x027a }
            r3.a((defpackage.nfv) r4)     // Catch:{ IOException -> 0x027a }
            nhz r3 = defpackage.nhz.a     // Catch:{ IOException -> 0x027a }
            android.content.Context r4 = r15.l     // Catch:{ IOException -> 0x027a }
            r3.e(r4)     // Catch:{ IOException -> 0x027a }
            goto L_0x0291
        L_0x027a:
            r3 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            nfv r4 = r15.h
            int r4 = r4.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "FontsUpdateRunner"
            java.lang.String r5 = "Writing directory to disk failed for v %d"
            defpackage.ngz.a((java.lang.String) r4, (java.lang.Throwable) r3, (java.lang.String) r5, (java.lang.Object[]) r1)
            r15.a((java.lang.Exception) r3)
        L_0x0291:
            int r1 = r15.m
            r3 = 3
            if (r1 == r3) goto L_0x029c
            r15.a((int) r2)
            r15.b(r0)
        L_0x029c:
            return
        L_0x029d:
            return
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nia.b():void");
    }

    private final void a(Status status) {
        ngz.a("FontsUpdateRunner", "Abort update with status %s", status);
        a(23504);
        b(3);
    }

    private final void a(Exception exc) {
        ngz.a("FontsUpdateRunner", "Update failed for %s due to: %s", this.g.b, exc.getMessage());
        a(new Status(13, exc.getMessage()));
    }

    public static boolean a() {
        boolean z;
        synchronized (a) {
            z = b != null;
        }
        return z;
    }

    private final boolean a(String str, nfw nfw) {
        Status a2 = this.f.a(str, nfw);
        int i2 = a2.i;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 23509) {
            return false;
        }
        a(a2);
        return false;
    }
}
