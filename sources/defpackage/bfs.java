package defpackage;

import java.util.HashMap;

/* renamed from: bfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfs extends bfq {
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;

    public bfs() {
        this.a = "E";
        this.b = -1;
        this.c = "E";
        this.d = "E";
        this.e = "E";
    }

    /* access modifiers changed from: protected */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, Long.valueOf(this.b));
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bfs(java.lang.String r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "E"
            r5.a = r0
            r1 = -1
            r5.b = r1
            r5.c = r0
            r5.d = r0
            r5.e = r0
            java.util.HashMap r6 = defpackage.bfq.a(r6)
            if (r6 == 0) goto L_0x0085
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r6.get(r3)
            if (r4 == 0) goto L_0x0029
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x002a
        L_0x0029:
            r3 = r0
        L_0x002a:
            r5.a = r3
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r6.get(r3)
            if (r4 == 0) goto L_0x0042
            java.lang.Object r1 = r6.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            r5.b = r1
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r6.get(r1)
            if (r2 == 0) goto L_0x0057
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0058
        L_0x0057:
            r1 = r0
        L_0x0058:
            r5.c = r1
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r6.get(r1)
            if (r2 == 0) goto L_0x006c
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x006d
        L_0x006c:
            r1 = r0
        L_0x006d:
            r5.d = r1
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r6.get(r1)
            if (r2 == 0) goto L_0x0082
            java.lang.Object r6 = r6.get(r1)
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0083
        L_0x0082:
        L_0x0083:
            r5.e = r0
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfs.<init>(java.lang.String):void");
    }
}
