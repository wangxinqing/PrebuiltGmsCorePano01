package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: osq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osq {
    private final Context a;
    private final oyq b;

    public osq(Context context, oyq oyq) {
        this.a = context;
        this.b = oyq;
    }

    private final boolean a(String str, SharedPreferences sharedPreferences, FileGroupResponse fileGroupResponse) {
        oso.a("%s Writing new client file group for %s", (Object) "MDDHelper", (Object) str);
        oyq oyq = this.b;
        long d = (long) ((int) axtc.a.a().d());
        if (oyq.a(d)) {
            aucd o = aojg.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojg aojg = (aojg) o.b;
            str.getClass();
            aojg.a |= 1;
            aojg.b = str;
            aucd o2 = aoji.R.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoji aoji = (aoji) o2.b;
            aojg aojg2 = (aojg) o.i();
            aojg2.getClass();
            aoji.j = aojg2;
            aoji.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            oyq.a(1035, o2, d);
        }
        aucd o3 = opz.d.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        opz opz = (opz) o3.b;
        str.getClass();
        opz.a |= 1;
        opz.b = str;
        for (int i = 0; i < fileGroupResponse.c.size(); i++) {
            MddFile mddFile = (MddFile) fileGroupResponse.c.get(i);
            aucd o4 = opy.d.o();
            String str2 = mddFile.a;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            opy opy = (opy) o4.b;
            str2.getClass();
            int i2 = opy.a | 1;
            opy.a = i2;
            opy.b = str2;
            String str3 = mddFile.b;
            str3.getClass();
            opy.a = i2 | 2;
            opy.c = str3;
            o3.a((opy) o4.i());
        }
        return sharedPreferences.edit().putString(str, Base64.encodeToString(((opz) o3.i()).k(), 3)).commit();
    }

    /* access modifiers changed from: package-private */
    public final opz b(String str) {
        return (opz) paa.a(this.a.getSharedPreferences("gms_icing_client_groups_mdd", 0), str, (auef) opz.d.c(7));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.a
            rxy r0 = defpackage.rxu.a(r0)
            java.lang.String r1 = "com.google.android.gms"
            acwa r0 = r0.a(r13, r1)
            r1 = 3000(0xbb8, double:1.482E-320)
            r3 = 0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x0099, TimeoutException -> 0x0097, InterruptedException -> 0x0095 }
            defpackage.acws.a(r0, r1, r4)     // Catch:{ ExecutionException -> 0x0099, TimeoutException -> 0x0097, InterruptedException -> 0x0095 }
            java.lang.Object r0 = r0.d()
            com.google.android.gms.mdd.FileGroupResponse r0 = (com.google.android.gms.mdd.FileGroupResponse) r0
            android.content.Context r1 = r12.a
            java.lang.String r2 = "gms_icing_client_groups_mdd"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            opz r2 = defpackage.opz.d
            r4 = 7
            java.lang.Object r2 = r2.c(r4)
            auef r2 = (defpackage.auef) r2
            audx r2 = defpackage.paa.a(r1, r13, r2)
            opz r2 = (defpackage.opz) r2
            if (r2 != 0) goto L_0x0041
            java.util.List r2 = r0.c
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0040
            boolean r13 = r12.a(r13, r1, r0)
            return r13
        L_0x0040:
            return r3
        L_0x0041:
            aucx r4 = r2.c
            int r4 = r4.size()
            java.util.List r5 = r0.c
            int r5 = r5.size()
            if (r4 == r5) goto L_0x0054
            boolean r13 = r12.a(r13, r1, r0)
            return r13
        L_0x0054:
            java.util.List r4 = r0.c
            java.util.Iterator r4 = r4.iterator()
        L_0x005a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r4.next()
            com.google.android.gms.mdd.MddFile r5 = (com.google.android.gms.mdd.MddFile) r5
            java.lang.String r6 = r5.a
            aucx r7 = r2.c
            int r8 = r7.size()
            r9 = 0
        L_0x006f:
            if (r9 >= r8) goto L_0x0082
            java.lang.Object r10 = r7.get(r9)
            opy r10 = (defpackage.opy) r10
            int r9 = r9 + 1
            java.lang.String r11 = r10.b
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x006f
            goto L_0x0083
        L_0x0082:
            r10 = 0
        L_0x0083:
            if (r10 == 0) goto L_0x008f
            java.lang.String r6 = r10.c
            java.lang.String r5 = r5.b
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x005a
        L_0x008f:
            boolean r13 = r12.a(r13, r1, r0)
            return r13
        L_0x0094:
            return r3
        L_0x0095:
            r0 = move-exception
            goto L_0x009a
        L_0x0097:
            r0 = move-exception
            goto L_0x009a
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MDDHelper"
            r1[r3] = r2
            r2 = 1
            r1[r2] = r13
            r13 = 2
            r1[r13] = r0
            java.lang.String r13 = "%s Exception while executing mdd read task for group %s : %s"
            defpackage.oso.c((java.lang.String) r13, (java.lang.Object[]) r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osq.a(java.lang.String):boolean");
    }
}
