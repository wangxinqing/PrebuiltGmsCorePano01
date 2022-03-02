package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: jun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jun {
    public final atkq a;

    public jun(atkq atkq) {
        iva.a((Object) atkq);
        this.a = atkq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.jun a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            atkq r0 = defpackage.atkq.e
            aucd r0 = r0.o()
            r1 = 3
            boolean[] r1 = new boolean[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            r1[r4] = r2
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r2 = r2 ^ r3
            r1[r3] = r2
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            r2 = r2 ^ r3
            r5 = 2
            r1[r5] = r2
            boolean r6 = r1[r4]
            if (r6 != 0) goto L_0x002f
            boolean r6 = r1[r3]
            if (r6 == 0) goto L_0x002b
            r2 = 1
            goto L_0x0030
        L_0x002b:
            if (r2 != 0) goto L_0x002f
            r2 = 0
            goto L_0x0030
        L_0x002f:
            r2 = 1
        L_0x0030:
            defpackage.iva.b((boolean) r2)
            boolean r2 = r1[r4]
            if (r2 == 0) goto L_0x004f
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            r0.c()
            r0.c = r4
        L_0x0041:
            aucj r2 = r0.b
            atkq r2 = (defpackage.atkq) r2
            r7.getClass()
            int r6 = r2.a
            r6 = r6 | r3
            r2.a = r6
            r2.b = r7
        L_0x004f:
            boolean r7 = r1[r3]
            if (r7 == 0) goto L_0x006b
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            r0.c()
            r0.c = r4
        L_0x005d:
            aucj r7 = r0.b
            atkq r7 = (defpackage.atkq) r7
            r8.getClass()
            int r2 = r7.a
            r2 = r2 | r5
            r7.a = r2
            r7.c = r8
        L_0x006b:
            boolean r7 = r1[r5]
            if (r7 != 0) goto L_0x0070
            goto L_0x0089
        L_0x0070:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0075
            goto L_0x007a
        L_0x0075:
            r0.c()
            r0.c = r4
        L_0x007a:
            aucj r7 = r0.b
            atkq r7 = (defpackage.atkq) r7
            r9.getClass()
            int r8 = r7.a
            r8 = r8 | 4
            r7.a = r8
            r7.d = r9
        L_0x0089:
            jun r7 = new jun
            aucj r8 = r0.i()
            atkq r8 = (defpackage.atkq) r8
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jun.a(java.lang.String, java.lang.String, java.lang.String):jun");
    }

    public final String b() {
        if (a()) {
            return this.a.b;
        }
        return null;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.a.c);
    }

    public final String d() {
        if (c()) {
            return this.a.c;
        }
        return null;
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.a.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jun) {
            jun jun = (jun) obj;
            return TextUtils.equals(b(), jun.b()) && TextUtils.equals(d(), jun.d()) && TextUtils.equals(f(), jun.f());
        }
    }

    public final String f() {
        if (e()) {
            return this.a.d;
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), d(), f()});
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.a.b);
    }
}
