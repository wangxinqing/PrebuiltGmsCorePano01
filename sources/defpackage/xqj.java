package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

/* renamed from: xqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqj extends nis {
    private final xvm a;
    private final wtb b;
    private final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xqj(wtb wtb, Context context, String str) {
        super(208, "GetBackupAndSyncOptInState");
        xvm a2 = xvm.a(context);
        this.c = str;
        this.a = a2;
        this.b = wtb;
    }

    private static void a(aucd aucd) {
        wml.a().a((xld) aucd.i());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0 == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ Exception -> 0x0157, all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132 A[Catch:{ Exception -> 0x0157, all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b A[Catch:{ Exception -> 0x0157, all -> 0x0155 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = r1.c
            int r0 = defpackage.xqi.b(r0)
            xld r2 = defpackage.xld.e
            aucd r2 = r2.o()
            boolean r3 = r2.c
            r4 = 0
            if (r3 != 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r2.c()
            r2.c = r4
        L_0x0019:
            aucj r3 = r2.b
            xld r3 = (defpackage.xld) r3
            r5 = 3
            r3.b = r5
            int r6 = r3.a
            r7 = 1
            r6 = r6 | r7
            r3.a = r6
            int r8 = r0 + -1
            r9 = 0
            if (r0 == 0) goto L_0x01a5
            r3.d = r8
            r8 = 4
            r6 = r6 | r8
            r3.a = r6
            boolean r3 = defpackage.aytd.b()
            java.lang.String r6 = r1.c
            boolean r6 = defpackage.xqi.a(r6)
            r10 = 2
            if (r6 == 0) goto L_0x0177
            aytd r6 = defpackage.aytd.a     // Catch:{ Exception -> 0x0157 }
            ayte r6 = r6.a()     // Catch:{ Exception -> 0x0157 }
            boolean r6 = r6.d()     // Catch:{ Exception -> 0x0157 }
            if (r6 != 0) goto L_0x004b
            goto L_0x00a2
        L_0x004b:
            if (r0 == r10) goto L_0x00a2
            boolean r0 = defpackage.aytd.c()     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x006a
            aytd r0 = defpackage.aytd.a     // Catch:{ Exception -> 0x0157 }
            ayte r0 = r0.a()     // Catch:{ Exception -> 0x0157 }
            boolean r0 = r0.l()     // Catch:{ Exception -> 0x0157 }
            if (r0 != 0) goto L_0x0064
            boolean r0 = defpackage.ayqr.h()     // Catch:{ Exception -> 0x0157 }
            goto L_0x0068
        L_0x0064:
            boolean r0 = defpackage.ayqr.g()     // Catch:{ Exception -> 0x0157 }
        L_0x0068:
            if (r0 != 0) goto L_0x00a2
        L_0x006a:
            wtb r0 = r1.b     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.a     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r6 = new com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState     // Catch:{ Exception -> 0x0157 }
            int[] r11 = new int[r4]     // Catch:{ Exception -> 0x0157 }
            java.lang.String[] r12 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0157 }
            r6.<init>(r9, r11, r8, r12)     // Catch:{ Exception -> 0x0157 }
            r0.a((com.google.android.gms.common.api.Status) r5, (com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState) r6)     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x009e
            wml r0 = defpackage.wml.a()     // Catch:{ Exception -> 0x0157 }
            boolean r5 = r2.c     // Catch:{ Exception -> 0x0157 }
            if (r5 != 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r2.c()     // Catch:{ Exception -> 0x0157 }
            r2.c = r4     // Catch:{ Exception -> 0x0157 }
        L_0x008a:
            aucj r5 = r2.b     // Catch:{ Exception -> 0x0157 }
            xld r5 = (defpackage.xld) r5     // Catch:{ Exception -> 0x0157 }
            r5.c = r7     // Catch:{ Exception -> 0x0157 }
            int r6 = r5.a     // Catch:{ Exception -> 0x0157 }
            r6 = r6 | r10
            r5.a = r6     // Catch:{ Exception -> 0x0157 }
            aucj r5 = r2.i()     // Catch:{ Exception -> 0x0157 }
            xld r5 = (defpackage.xld) r5     // Catch:{ Exception -> 0x0157 }
            r0.a((defpackage.xld) r5)     // Catch:{ Exception -> 0x0157 }
        L_0x009e:
            r2.i()
            return
        L_0x00a2:
            wtb r6 = r1.b     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.common.api.Status r8 = com.google.android.gms.common.api.Status.a     // Catch:{ Exception -> 0x0157 }
            xvm r0 = r1.a     // Catch:{ Exception -> 0x0157 }
            boolean r11 = defpackage.ayxm.c()     // Catch:{ Exception -> 0x0157 }
            if (r11 == 0) goto L_0x0132
            boolean r11 = defpackage.aytd.e()     // Catch:{ Exception -> 0x0157 }
            if (r11 != 0) goto L_0x00b5
            goto L_0x00c1
        L_0x00b5:
            boolean r11 = r0.a()     // Catch:{ nja -> 0x012c }
            if (r11 == 0) goto L_0x00c1
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r0 = defpackage.xvm.d()     // Catch:{ nja -> 0x012c }
            goto L_0x0136
        L_0x00c1:
            xsg r11 = r0.c()     // Catch:{ Exception -> 0x0157 }
            xvl r0 = r0.a     // Catch:{ Exception -> 0x0157 }
            boolean r12 = defpackage.aytd.i()     // Catch:{ Exception -> 0x0157 }
            boolean r13 = defpackage.aytd.j()     // Catch:{ Exception -> 0x0157 }
            android.accounts.Account[] r0 = r0.a(r12, r13)     // Catch:{ Exception -> 0x0157 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0157 }
            r12.<init>()     // Catch:{ Exception -> 0x0157 }
            int r13 = r0.length     // Catch:{ Exception -> 0x0157 }
            r14 = 0
        L_0x00da:
            if (r14 >= r13) goto L_0x00e6
            r15 = r0[r14]     // Catch:{ Exception -> 0x0157 }
            java.lang.String r15 = r15.name     // Catch:{ Exception -> 0x0157 }
            r12.add(r15)     // Catch:{ Exception -> 0x0157 }
            int r14 = r14 + 1
            goto L_0x00da
        L_0x00e6:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r0 = r12.toArray(r0)     // Catch:{ Exception -> 0x0157 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x0157 }
            boolean r12 = r11.b     // Catch:{ Exception -> 0x0157 }
            if (r12 == 0) goto L_0x011b
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r12 = new com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState     // Catch:{ Exception -> 0x0157 }
            java.lang.String r13 = r11.c     // Catch:{ Exception -> 0x0157 }
            aucs r11 = r11.d     // Catch:{ Exception -> 0x0157 }
            if (r11 == 0) goto L_0x0114
            int r9 = r11.size()     // Catch:{ Exception -> 0x0157 }
            int[] r14 = new int[r9]     // Catch:{ Exception -> 0x0157 }
            r15 = 0
        L_0x0101:
            if (r15 >= r9) goto L_0x0112
            java.lang.Object r16 = r11.get(r15)     // Catch:{ Exception -> 0x0157 }
            java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ Exception -> 0x0157 }
            int r16 = r16.intValue()     // Catch:{ Exception -> 0x0157 }
            r14[r15] = r16     // Catch:{ Exception -> 0x0157 }
            int r15 = r15 + 1
            goto L_0x0101
        L_0x0112:
            r9 = r14
            goto L_0x0115
        L_0x0114:
        L_0x0115:
            r12.<init>(r13, r9, r5, r0)     // Catch:{ Exception -> 0x0157 }
            r0 = r12
            goto L_0x0136
        L_0x011b:
            int r5 = r0.length     // Catch:{ Exception -> 0x0157 }
            if (r5 <= 0) goto L_0x0127
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r5 = new com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState     // Catch:{ Exception -> 0x0157 }
            int[] r11 = new int[r4]     // Catch:{ Exception -> 0x0157 }
            r5.<init>(r9, r11, r10, r0)     // Catch:{ Exception -> 0x0157 }
            r0 = r5
            goto L_0x0136
        L_0x0127:
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r0 = defpackage.xvm.d()     // Catch:{ Exception -> 0x0157 }
            goto L_0x0136
        L_0x012c:
            r0 = move-exception
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r0 = defpackage.xvm.d()     // Catch:{ Exception -> 0x0157 }
            goto L_0x0136
        L_0x0132:
            com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r0 = defpackage.xvm.d()     // Catch:{ Exception -> 0x0157 }
        L_0x0136:
            r6.a((com.google.android.gms.common.api.Status) r8, (com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState) r0)     // Catch:{ Exception -> 0x0157 }
            if (r3 == 0) goto L_0x009e
            boolean r0 = r2.c     // Catch:{ Exception -> 0x0157 }
            if (r0 != 0) goto L_0x0140
            goto L_0x0145
        L_0x0140:
            r2.c()     // Catch:{ Exception -> 0x0157 }
            r2.c = r4     // Catch:{ Exception -> 0x0157 }
        L_0x0145:
            aucj r0 = r2.b     // Catch:{ Exception -> 0x0157 }
            xld r0 = (defpackage.xld) r0     // Catch:{ Exception -> 0x0157 }
            r0.c = r7     // Catch:{ Exception -> 0x0157 }
            int r5 = r0.a     // Catch:{ Exception -> 0x0157 }
            r5 = r5 | r10
            r0.a = r5     // Catch:{ Exception -> 0x0157 }
            a((defpackage.aucd) r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x009e
        L_0x0155:
            r0 = move-exception
            goto L_0x0173
        L_0x0157:
            r0 = move-exception
            if (r3 == 0) goto L_0x0172
            boolean r3 = r2.c     // Catch:{ all -> 0x0155 }
            if (r3 != 0) goto L_0x015f
            goto L_0x0164
        L_0x015f:
            r2.c()     // Catch:{ all -> 0x0155 }
            r2.c = r4     // Catch:{ all -> 0x0155 }
        L_0x0164:
            aucj r3 = r2.b     // Catch:{ all -> 0x0155 }
            xld r3 = (defpackage.xld) r3     // Catch:{ all -> 0x0155 }
            r3.c = r4     // Catch:{ all -> 0x0155 }
            int r4 = r3.a     // Catch:{ all -> 0x0155 }
            r4 = r4 | r10
            r3.a = r4     // Catch:{ all -> 0x0155 }
            a((defpackage.aucd) r2)     // Catch:{ all -> 0x0155 }
        L_0x0172:
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0173:
            r2.i()
            throw r0
        L_0x0177:
            if (r3 == 0) goto L_0x0191
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x017e
            goto L_0x0183
        L_0x017e:
            r2.c()
            r2.c = r4
        L_0x0183:
            aucj r0 = r2.b
            xld r0 = (defpackage.xld) r0
            r0.c = r4
            int r3 = r0.a
            r3 = r3 | r10
            r0.a = r3
            a((defpackage.aucd) r2)
        L_0x0191:
            nja r0 = new nja
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = r1.c
            r2[r4] = r3
            r3 = 10
            java.lang.String r4 = "Inelegibile calling package: %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r0.<init>(r3, r2)
            throw r0
        L_0x01a5:
            goto L_0x01a7
        L_0x01a6:
            throw r9
        L_0x01a7:
            goto L_0x01a6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqj.a(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a(status, (BackupAndSyncOptInState) null);
    }
}
