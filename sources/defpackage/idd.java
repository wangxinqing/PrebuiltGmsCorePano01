package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: idd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class idd {
    public final nz a;
    public final acwd b = new acwd();
    private final nz c = new nz();
    private int d;
    private boolean e;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public idd(java.lang.Iterable r6) {
        /*
            r5 = this;
            r5.<init>()
            nz r0 = new nz
            r0.<init>()
            r5.c = r0
            acwd r0 = new acwd
            r0.<init>()
            r5.b = r0
            r0 = 0
            r5.e = r0
            nz r1 = new nz
            r1.<init>()
            r5.a = r1
            int r1 = r6.size()
        L_0x001f:
            if (r0 >= r1) goto L_0x0034
            java.lang.Object r2 = r6.get(r0)
            icd r2 = (defpackage.icd) r2
            nz r3 = r5.a
            ida r2 = r2.b()
            r4 = 0
            r3.put(r2, r4)
            int r0 = r0 + 1
            goto L_0x001f
        L_0x0034:
            nz r6 = r5.a
            java.util.Set r6 = r6.keySet()
            int r6 = r6.size()
            r5.d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idd.<init>(java.lang.Iterable):void");
    }

    public final void a(ida ida, ConnectionResult connectionResult, String str) {
        this.a.put(ida, connectionResult);
        this.c.put(ida, str);
        this.d--;
        if (!connectionResult.b()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.b.a((Exception) new ibs(this.a));
            return;
        }
        this.b.a((Object) this.c);
    }
}
