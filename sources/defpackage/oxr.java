package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.io.IOException;

/* renamed from: oxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxr extends oxh {
    public boolean a;
    private final ActionImpl b;
    private final String c;
    private final String d;
    private pxs e;
    private oxe f;
    private Thing g;

    public oxr(ActionImpl actionImpl, String str, String str2) {
        super(0);
        this.b = actionImpl;
        this.c = str;
        this.d = str2;
    }

    public final void a(Context context, SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        UsageInfo usageInfo;
        iva.a((Object) this.e, (Object) "executeOnDb called without successful validateInput");
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = pxf.a(this.b.c);
        if ("com.google.android.gms".equals(this.d) && a2 != null) {
            usageInfo = oym.b(this.b, currentTimeMillis, a2);
        } else {
            usageInfo = oym.a(this.b, currentTimeMillis, this.c);
        }
        UsageInfo[] usageInfoArr = {usageInfo};
        if (this.e.a(usageInfoArr, this.c, currentTimeMillis, pxq.a(context, currentTimeMillis), new oxq(this))) {
            oso.a("UserActionNotificationResult: %s", (Object) prn.a(context, this.c, usageInfoArr, hya.a(context)));
            pwp.a(context, this.c, usageInfoArr, "FirebaseUserActions");
            oxx.a(context).a(this.c, this.b);
            return;
        }
        throw new IOException("Failed to log UsageInfo");
    }

    public final /* bridge */ /* synthetic */ void a(ozc ozc, osf osf) {
    }

    public final void a(osf osf, ozc ozc, owf owf) {
        iva.a((Object) this.f, (Object) "execute called without validateInput");
        ovz.a(osf, ozc, this.f);
        avqi b2 = oyl.b(this.g);
        aucd o = ora.c.o();
        aucd o2 = ore.d.o();
        String str = this.f.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        str.getClass();
        ((ore) o2.b).a = str;
        String b3 = this.f.b();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ore ore = (ore) o2.b;
        b3.getClass();
        ore.b = b3;
        b2.getClass();
        ore.c = b2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ora ora = (ora) o.b;
        ore ore2 = (ore) o2.i();
        ore2.getClass();
        ora.b = ore2;
        ora.a = 6;
        owf.a((ora) o.i());
    }

    public final void a(ovw ovw, ozc ozc, osf osf) {
        if (this.a) {
            osf.c.d(new ovi(osf, false, false));
            osf.r.b(16004);
            this.a = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ozc r13, defpackage.osf r14, defpackage.oyb r15) {
        /*
            r12 = this;
            com.google.firebase.appindexing.internal.ActionImpl r0 = r12.b
            java.lang.String r1 = r0.c
            if (r1 == 0) goto L_0x0218
            pxs r14 = r14.k
            r12.e = r14
            if (r14 == 0) goto L_0x020e
            axsj r14 = defpackage.axsj.a
            axsk r14 = r14.a()
            boolean r14 = r14.e()
            if (r14 == 0) goto L_0x020d
            com.google.firebase.appindexing.internal.ActionImpl r14 = r12.b     // Catch:{ aplk -> 0x01fc }
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r0 = r14.e     // Catch:{ aplk -> 0x01fc }
            if (r0 == 0) goto L_0x002b
            boolean r1 = r0.f     // Catch:{ aplk -> 0x01fc }
            if (r1 != 0) goto L_0x0023
            goto L_0x002b
        L_0x0023:
            aplk r13 = new aplk     // Catch:{ aplk -> 0x01fc }
            java.lang.String r14 = "Cannot convert context-only Action to Indexable"
            r13.<init>(r14)     // Catch:{ aplk -> 0x01fc }
            throw r13     // Catch:{ aplk -> 0x01fc }
        L_0x002b:
            aply r1 = new aply     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = "Action"
            r1.<init>(r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = r14.b     // Catch:{ aplk -> 0x01fc }
            r1.c(r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = r14.c     // Catch:{ aplk -> 0x01fc }
            r1.b(r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = r14.a     // Catch:{ aplk -> 0x01fc }
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ aplk -> 0x01fc }
            r5 = 0
            r4[r5] = r2     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = "additionalType"
            r1.a((java.lang.String) r2, (java.lang.String[]) r4)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = r14.d     // Catch:{ aplk -> 0x01fc }
            if (r2 == 0) goto L_0x0059
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ aplk -> 0x01fc }
            r4[r5] = r2     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = "sameAs"
            r1.a((java.lang.String) r2, (java.lang.String[]) r4)     // Catch:{ aplk -> 0x01fc }
        L_0x0059:
            java.lang.String r2 = r14.f     // Catch:{ aplk -> 0x01fc }
            java.lang.String r4 = "FailedActionStatus"
            java.lang.String r6 = "CompletedActionStatus"
            java.lang.String r7 = "ActiveActionStatus"
            r8 = 0
            if (r2 == 0) goto L_0x00a5
            int r9 = r2.hashCode()
            r10 = -2130832917(0xffffffff80fe11eb, float:-2.3332644E-38)
            r11 = 2
            if (r9 == r10) goto L_0x008d
            r10 = -580380876(0xffffffffdd681734, float:-1.04524331E18)
            if (r9 == r10) goto L_0x0083
            r10 = 1575353005(0x5de5faad, float:2.0714685E18)
            if (r9 == r10) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            java.lang.String r9 = "http://schema.org/CompletedActionStatus"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0097
            r2 = 1
            goto L_0x0098
        L_0x0083:
            java.lang.String r9 = "http://schema.org/ActiveActionStatus"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0097
            r2 = 0
            goto L_0x0098
        L_0x008d:
            java.lang.String r9 = "http://schema.org/FailedActionStatus"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0097
            r2 = 2
            goto L_0x0098
        L_0x0097:
            r2 = -1
        L_0x0098:
            if (r2 == 0) goto L_0x00a3
            if (r2 == r3) goto L_0x00a1
            if (r2 == r11) goto L_0x009f
            goto L_0x00a6
        L_0x009f:
            r8 = r4
            goto L_0x00a6
        L_0x00a1:
            r8 = r6
            goto L_0x00a6
        L_0x00a3:
            r8 = r7
            goto L_0x00a6
        L_0x00a5:
        L_0x00a6:
            if (r8 != 0) goto L_0x00a9
            goto L_0x00df
        L_0x00a9:
            boolean r2 = r7.equals(r8)     // Catch:{ aplk -> 0x01fc }
            if (r2 == 0) goto L_0x00b1
            goto L_0x00d6
        L_0x00b1:
            boolean r2 = r6.equals(r8)     // Catch:{ aplk -> 0x01fc }
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r4.equals(r8)     // Catch:{ aplk -> 0x01fc }
            if (r2 != 0) goto L_0x00d6
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ aplk -> 0x01fc }
            java.lang.String r14 = "Invalid action status "
            int r15 = r8.length()     // Catch:{ aplk -> 0x01fc }
            if (r15 != 0) goto L_0x00ce
            java.lang.String r15 = new java.lang.String     // Catch:{ aplk -> 0x01fc }
            r15.<init>(r14)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00d2
        L_0x00ce:
            java.lang.String r15 = r14.concat(r8)     // Catch:{ aplk -> 0x01fc }
        L_0x00d2:
            r13.<init>(r15)     // Catch:{ aplk -> 0x01fc }
            throw r13     // Catch:{ aplk -> 0x01fc }
        L_0x00d6:
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ aplk -> 0x01fc }
            r2[r5] = r8     // Catch:{ aplk -> 0x01fc }
            java.lang.String r4 = "actionStatus"
            r1.a((java.lang.String) r4, (java.lang.String[]) r2)     // Catch:{ aplk -> 0x01fc }
        L_0x00df:
            android.os.Bundle r14 = r14.g     // Catch:{ aplk -> 0x01fc }
            java.util.Set r2 = r14.keySet()     // Catch:{ aplk -> 0x01fc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ aplk -> 0x01fc }
        L_0x00e9:
            boolean r4 = r2.hasNext()     // Catch:{ aplk -> 0x01fc }
            if (r4 == 0) goto L_0x0172
            java.lang.Object r4 = r2.next()     // Catch:{ aplk -> 0x01fc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ aplk -> 0x01fc }
            java.lang.Object r6 = r14.get(r4)     // Catch:{ aplk -> 0x01fc }
            boolean r7 = r6 instanceof long[]     // Catch:{ aplk -> 0x01fc }
            if (r7 != 0) goto L_0x016b
            boolean r7 = r6 instanceof boolean[]     // Catch:{ aplk -> 0x01fc }
            if (r7 != 0) goto L_0x0164
            boolean r7 = r6 instanceof java.lang.String[]     // Catch:{ aplk -> 0x01fc }
            if (r7 != 0) goto L_0x015e
            boolean r7 = r6 instanceof defpackage.aplu[]     // Catch:{ aplk -> 0x01fc }
            if (r7 == 0) goto L_0x0136
            aplu[] r6 = (defpackage.aplu[]) r6     // Catch:{ aplk -> 0x01fc }
            android.os.Bundle r7 = r1.a     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.a((java.lang.Object) r6)     // Catch:{ aplk -> 0x01fc }
            int r8 = r6.length     // Catch:{ aplk -> 0x01fc }
            com.google.firebase.appindexing.internal.Thing[] r8 = new com.google.firebase.appindexing.internal.Thing[r8]     // Catch:{ aplk -> 0x01fc }
            r9 = 0
        L_0x0117:
            int r10 = r6.length     // Catch:{ aplk -> 0x01fc }
            if (r9 >= r10) goto L_0x0132
            r10 = r6[r9]     // Catch:{ aplk -> 0x01fc }
            if (r10 == 0) goto L_0x012b
            boolean r11 = r10 instanceof com.google.firebase.appindexing.internal.Thing     // Catch:{ aplk -> 0x01fc }
            if (r11 == 0) goto L_0x0123
            goto L_0x012b
        L_0x0123:
            aplk r13 = new aplk     // Catch:{ aplk -> 0x01fc }
            java.lang.String r14 = "Invalid Indexable encountered. Use Indexable.Builder or convenience methods under Indexables to create the Indexable."
            r13.<init>(r14)     // Catch:{ aplk -> 0x01fc }
            throw r13     // Catch:{ aplk -> 0x01fc }
        L_0x012b:
            com.google.firebase.appindexing.internal.Thing r10 = (com.google.firebase.appindexing.internal.Thing) r10     // Catch:{ aplk -> 0x01fc }
            r8[r9] = r10     // Catch:{ aplk -> 0x01fc }
            int r9 = r9 + 1
            goto L_0x0117
        L_0x0132:
            defpackage.aply.a((android.os.Bundle) r7, (java.lang.String) r4, (com.google.firebase.appindexing.internal.Thing[]) r8)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00e9
        L_0x0136:
            boolean r7 = r6 instanceof double[]     // Catch:{ aplk -> 0x01fc }
            if (r7 == 0) goto L_0x00e9
            double[] r6 = (double[]) r6     // Catch:{ aplk -> 0x01fc }
            android.os.Bundle r7 = r1.a     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.a((java.lang.Object) r6)     // Catch:{ aplk -> 0x01fc }
            int r8 = r6.length     // Catch:{ aplk -> 0x01fc }
            if (r8 > 0) goto L_0x014d
            java.lang.String r4 = "Double array is empty and is ignored by put method."
            defpackage.apmu.a((java.lang.String) r4)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00e9
        L_0x014d:
            r9 = 100
            if (r8 < r9) goto L_0x015a
            java.lang.String r8 = "Input Array of elements is too big, cutting off."
            defpackage.apmu.a((java.lang.String) r8)     // Catch:{ aplk -> 0x01fc }
            double[] r6 = java.util.Arrays.copyOf(r6, r9)     // Catch:{ aplk -> 0x01fc }
        L_0x015a:
            r7.putDoubleArray(r4, r6)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00e9
        L_0x015e:
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ aplk -> 0x01fc }
            r1.a((java.lang.String) r4, (java.lang.String[]) r6)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00e9
        L_0x0164:
            boolean[] r6 = (boolean[]) r6     // Catch:{ aplk -> 0x01fc }
            r1.a((java.lang.String) r4, (boolean[]) r6)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00e9
        L_0x016b:
            long[] r6 = (long[]) r6     // Catch:{ aplk -> 0x01fc }
            r1.a((java.lang.String) r4, (long[]) r6)     // Catch:{ aplk -> 0x01fc }
            goto L_0x00e9
        L_0x0172:
            if (r0 == 0) goto L_0x01eb
            aplt r14 = new aplt     // Catch:{ aplk -> 0x01fc }
            r14.<init>()     // Catch:{ aplk -> 0x01fc }
            int r2 = r0.a     // Catch:{ aplk -> 0x01fc }
            long[] r4 = new long[r3]     // Catch:{ aplk -> 0x01fc }
            long r6 = (long) r2     // Catch:{ aplk -> 0x01fc }
            r4[r5] = r6     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = "eventStatus"
            r1.a((java.lang.String) r2, (long[]) r4)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = r0.d     // Catch:{ aplk -> 0x01fc }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ aplk -> 0x01fc }
            if (r2 != 0) goto L_0x0199
            java.lang.String r2 = r0.d     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r4 = "accountEmail must not be an empty string"
            defpackage.iva.a((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ aplk -> 0x01fc }
            r14.a = r2     // Catch:{ aplk -> 0x01fc }
        L_0x0199:
            java.lang.String r2 = r0.c     // Catch:{ aplk -> 0x01fc }
            if (r2 == 0) goto L_0x01a6
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ aplk -> 0x01fc }
            r4[r5] = r2     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = "completionToken"
            r1.a((java.lang.String) r2, (java.lang.String[]) r4)     // Catch:{ aplk -> 0x01fc }
        L_0x01a6:
            byte[] r2 = r0.e     // Catch:{ aplk -> 0x01fc }
            if (r2 == 0) goto L_0x01b7
            java.lang.String r4 = "ssbContext"
            defpackage.iva.a((java.lang.Object) r4)     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.a((java.lang.Object) r2)     // Catch:{ aplk -> 0x01fc }
            android.os.Bundle r6 = r1.a     // Catch:{ aplk -> 0x01fc }
            r6.putByteArray(r4, r2)     // Catch:{ aplk -> 0x01fc }
        L_0x01b7:
            boolean r0 = r0.b     // Catch:{ aplk -> 0x01fc }
            if (r0 == 0) goto L_0x01e8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ aplk -> 0x01fc }
            r2 = 69
            r0.<init>(r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r2 = "The scope of this indexable is not valid, scope value is "
            r0.append(r2)     // Catch:{ aplk -> 0x01fc }
            r2 = 3
            r0.append(r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r4 = "."
            r0.append(r4)     // Catch:{ aplk -> 0x01fc }
            boolean r2 = defpackage.aplx.a(r2)     // Catch:{ aplk -> 0x01fc }
            java.lang.String r0 = r0.toString()     // Catch:{ aplk -> 0x01fc }
            defpackage.iva.b(r2, r0)     // Catch:{ aplk -> 0x01fc }
            long[] r0 = new long[r3]     // Catch:{ aplk -> 0x01fc }
            r2 = 3
            r0[r5] = r2     // Catch:{ aplk -> 0x01fc }
            android.os.Bundle r2 = r14.b     // Catch:{ aplk -> 0x01fc }
            java.lang.String r3 = "scope"
            defpackage.aply.a((android.os.Bundle) r2, (java.lang.String) r3, (long[]) r0)     // Catch:{ aplk -> 0x01fc }
        L_0x01e8:
            r1.a((defpackage.aplt) r14)     // Catch:{ aplk -> 0x01fc }
        L_0x01eb:
            aplu r14 = r1.a()     // Catch:{ aplk -> 0x01fc }
            com.google.firebase.appindexing.internal.Thing r14 = (com.google.firebase.appindexing.internal.Thing) r14     // Catch:{ aplk -> 0x01fc }
            r12.g = r14     // Catch:{ aplk -> 0x01fc }
            java.lang.String r13 = r13.f
            oxe r13 = defpackage.oxf.a((com.google.firebase.appindexing.internal.Thing) r14, (java.lang.String) r13, (defpackage.oyb) r15)
            r12.f = r13
            return
        L_0x01fc:
            r13 = move-exception
            r5 = r13
            oxa r13 = new oxa
            aolv r1 = defpackage.aolv.ACTION_START
            com.google.firebase.appindexing.internal.ActionImpl r3 = r12.b
            aolx r4 = defpackage.aolx.INTERNAL_ERROR
            java.lang.String r2 = "Internal error happened in ActionIndexableConverter"
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            throw r13
        L_0x020d:
            return
        L_0x020e:
            oxa r13 = new oxa
            aolx r14 = defpackage.aolx.INTERNAL_ERROR
            java.lang.String r15 = "Internal error"
            r13.<init>(r15, r0, r14)
            throw r13
        L_0x0218:
            oxa r13 = new oxa
            aolx r14 = defpackage.aolx.INVALID_ARGUMENT_NULL
            java.lang.String r15 = "Action.objectUrl cannot be null"
            r13.<init>(r15, r0, r14)
            goto L_0x0223
        L_0x0222:
            throw r13
        L_0x0223:
            goto L_0x0222
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxr.a(ozc, osf, oyb):void");
    }
}
