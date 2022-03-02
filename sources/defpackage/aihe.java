package defpackage;

import android.location.Location;
import java.io.PrintWriter;

/* renamed from: aihe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aihe implements arne, arnb, aqhm {
    private static aihe a = null;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: aihg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: aihd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: aihg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: aihg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aihe a(android.content.Context r12) {
        /*
            aihe r0 = a
            if (r0 != 0) goto L_0x007f
            android.os.Looper r0 = defpackage.aieo.a()
            if (r0 == 0) goto L_0x0078
            aipq r0 = new aipq
            r0.<init>()
            arnd r0 = r0.a(r12)
            qvr r7 = new qvr
            android.os.Looper r1 = defpackage.aieo.a()
            r7.<init>((android.os.Looper) r1)
            jgy r5 = defpackage.jgy.a((android.content.Context) r12)
            aiha r6 = new aiha
            r6.<init>(r12)
            if (r0 == 0) goto L_0x0070
            r8 = 5147455389092024339(0x476f6f676c001013, double:1.3057659520462474E36)
            arnh r3 = r0.a((long) r8)
            boolean r1 = defpackage.axxm.k()
            if (r1 == 0) goto L_0x0070
            boolean r1 = defpackage.jkr.h()
            if (r1 != 0) goto L_0x003d
            goto L_0x0070
        L_0x003d:
            if (r3 == 0) goto L_0x0070
            axxm r1 = defpackage.axxm.a
            axxn r1 = r1.a()
            boolean r1 = r1.flpBluePixelIgnorePreProdVersions()
            if (r1 == 0) goto L_0x005e
            int r1 = r3.c()
            long r1 = (long) r1
            axxm r4 = defpackage.axxm.a
            axxn r4 = r4.a()
            long r10 = r4.flpBluePixelEarliestSupportedVersion()
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0070
        L_0x005e:
            boolean r1 = defpackage.jgu.f(r12)
            if (r1 == 0) goto L_0x0070
            aihg r10 = new aihg
            r1 = r10
            r2 = r12
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.a(r8, r10, r7)
            goto L_0x0075
        L_0x0070:
            aihd r10 = new aihd
            r10.<init>()
        L_0x0075:
            a = r10
            goto L_0x007f
        L_0x0078:
            aihd r12 = new aihd
            r12.<init>()
            a = r12
        L_0x007f:
            aihe r12 = a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihe.a(android.content.Context):aihe");
    }

    public abstract void a(aihb aihb);

    public abstract void a(aihc aihc);

    public abstract void a(Location location);

    public abstract void a(PrintWriter printWriter);

    public abstract aift b();
}
