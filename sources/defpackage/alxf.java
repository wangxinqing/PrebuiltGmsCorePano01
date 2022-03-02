package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: alxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alxf extends alxd {
    private final String d = b("objectId").b();
    private final int e = ((int) b("index").a());
    private final amii f;
    private final amic g;
    private final Map h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public alxf(defpackage.amic r5) {
        /*
            r4 = this;
            r4.<init>(r5)
            java.lang.String r5 = "value"
            amic r5 = r4.a(r5)
            r4.g = r5
            amhx r5 = r5.d()
            java.util.Map r5 = r5.a()
            r4.h = r5
            java.lang.String r5 = "objectId"
            amic r5 = r4.b(r5)
            java.lang.String r5 = r5.b()
            r4.d = r5
            java.lang.String r5 = "index"
            amic r5 = r4.b(r5)
            double r0 = r5.a()
            int r5 = (int) r0
            r4.e = r5
            java.lang.String r5 = "deleteMode"
            boolean r0 = r4.c(r5)
            if (r0 == 0) goto L_0x00a4
            amic r5 = r4.b(r5)
            java.lang.String r5 = r5.b()
            int r0 = r5.hashCode()
            r1 = -1481713298(0xffffffffa7aed96e, float:-4.853044E-15)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x0068
            r1 = 998662160(0x3b866010, float:0.004100807)
            if (r0 == r1) goto L_0x005e
            r1 = 1102859787(0x41bc4e0b, float:23.538107)
            if (r0 == r1) goto L_0x0054
            goto L_0x0072
        L_0x0054:
            java.lang.String r0 = "shift_after_delete"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0072
            r0 = 0
            goto L_0x0073
        L_0x005e:
            java.lang.String r0 = "shift_to_invalid"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0072
            r0 = 2
            goto L_0x0073
        L_0x0068:
            java.lang.String r0 = "shift_before_delete"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = -1
        L_0x0073:
            if (r0 == 0) goto L_0x0081
            if (r0 == r3) goto L_0x007e
            if (r0 == r2) goto L_0x007b
            r0 = 0
            goto L_0x0083
        L_0x007b:
            amii r0 = defpackage.amii.SHIFT_TO_INVALID
            goto L_0x0083
        L_0x007e:
            amii r0 = defpackage.amii.SHIFT_BEFORE_DELETE
            goto L_0x0083
        L_0x0081:
            amii r0 = defpackage.amii.SHIFT_AFTER_DELETE
        L_0x0083:
            r4.f = r0
            if (r0 != 0) goto L_0x00a3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Unknown delete mode: "
            int r2 = r5.length()
            if (r2 != 0) goto L_0x009b
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            goto L_0x009f
        L_0x009b:
            java.lang.String r5 = r1.concat(r5)
        L_0x009f:
            r0.<init>(r5)
            throw r0
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.String r5 = "canBeDeleted"
            boolean r0 = r4.c(r5)
            if (r0 == 0) goto L_0x00bc
            amic r5 = r4.b(r5)
            boolean r5 = r5.c()
            amii r5 = defpackage.alut.a(r5)
            r4.f = r5
            return
        L_0x00bc:
            amii r5 = defpackage.amii.SHIFT_AFTER_DELETE
            r4.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alxf.<init>(amic):void");
    }

    private final amic b(String str) {
        if (c(str)) {
            return (amic) this.h.get(str);
        }
        throw new alrz(str, alsc.a(this.g));
    }

    private final boolean c(String str) {
        return this.h.containsKey(str);
    }

    public final List a() {
        return Collections.singletonList(aluv.a(this.a, this.d, this.e, this.f));
    }
}
