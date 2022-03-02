package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgb extends kfb {
    static {
        new ith("GetFolderColorPaletteOp", "");
    }

    public kgb(kec kec, kwg kwg) {
        super("GetFolderColorPaletteOp", kec, kwg, (byte[]) null);
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r0 = r1.a;
        r2 = r0.c.d;
        r0 = r0.d;
        r3 = r0.a;
        r2.b(r3.b, r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        throw new defpackage.nja(13, "App is no longer authorized to make this request.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b A[ExcHandler: eif (e eif), Splitter:B:2:0x0018] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r18 = this;
            r1 = r18
            kec r0 = r1.a
            lsm r2 = r0.c
            lhx r2 = r2.g
            khq r0 = r0.d
            kkz r0 = r0.a
            java.lang.String r0 = r0.a
            java.util.List r3 = r2.a(r0)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0087
            kec r3 = r1.a     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            lsm r4 = r3.c     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            lnn r5 = r4.i     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            khq r3 = r3.d     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            android.content.Context r6 = r4.b     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            com.google.android.gms.common.internal.ClientContext r8 = r3.a((android.content.Context) r6)     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            r3 = 2821(0xb05, float:3.953E-42)
            lns r3 = r5.a((com.google.android.gms.common.internal.ClientContext) r8, (int) r3)     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            lnt r7 = new lnt     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            r7.<init>(r3)     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            iyu r3 = new iyu     // Catch:{ VolleyError -> 0x005c, eif -> 0x006b }
            r3.<init>()     // Catch:{ VolleyError -> 0x005c, eif -> 0x006b }
            java.lang.String r5 = "folderColorPalette"
            r3.a((java.lang.String) r5)     // Catch:{ VolleyError -> 0x005c, eif -> 0x006b }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = r3
            com.google.android.gms.drive.internal.model.About r3 = r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ VolleyError -> 0x005c, eif -> 0x006b }
            lhx r4 = r4.g     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            kec r5 = r1.a     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            java.lang.String r5 = r5.a()     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            java.util.List r3 = r3.b     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            r4.a(r5, r3)     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            java.util.List r3 = r2.a(r0)
            goto L_0x0088
        L_0x005c:
            r0 = move-exception
            defpackage.lry.a((com.android.volley.VolleyError) r0)     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
            throw r0     // Catch:{ eif -> 0x006b, VolleyError -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            nja r0 = new nja
            r2 = 7
            java.lang.String r3 = "Unable to fetch folder color palette while offline."
            r0.<init>(r2, r3)
            throw r0
        L_0x006b:
            r0 = move-exception
            kec r0 = r1.a
            lsm r2 = r0.c
            kkf r2 = r2.d
            khq r0 = r0.d
            kkz r3 = r0.a
            java.lang.String r0 = r0.b
            long r3 = r3.b
            r2.b((long) r3, (java.lang.String) r0)
            nja r0 = new nja
            r2 = 13
            java.lang.String r3 = "App is no longer authorized to make this request."
            r0.<init>(r2, r3)
            throw r0
        L_0x0087:
        L_0x0088:
            kwg r0 = r1.b     // Catch:{ RemoteException -> 0x0093 }
            com.google.android.gms.drive.internal.StringListResponse r2 = new com.google.android.gms.drive.internal.StringListResponse     // Catch:{ RemoteException -> 0x0093 }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x0093 }
            r0.a((com.google.android.gms.drive.internal.StringListResponse) r2)     // Catch:{ RemoteException -> 0x0093 }
            return
        L_0x0093:
            r0 = move-exception
            lfq r0 = r1.c
            lfn r0 = r0.g()
            r0.b()
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgb.c():void");
    }
}
