package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zze extends nis {
    static final Set a = new HashSet();
    private static final AtomicInteger b = new AtomicInteger(0);
    private final zsg c = zsg.a("RestoreContactsOp");
    private final zvm d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String[] i;
    private final zsp j = new zsp(4);

    public zze(zvm zvm, String str, String str2, String str3, String str4, String[] strArr) {
        super(135, "RestoreContacts");
        this.d = zvm;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = strArr;
    }

    private static void a(Context context, int i2) {
        zsi.a().a(i2, b(context).a());
    }

    private static iwr b(Context context) {
        return iwr.a(context.getApplicationContext());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c3  */
    public final void a(android.content.Context r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.util.Set r3 = a
            monitor-enter(r3)
            java.util.Set r0 = a     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = r1.g     // Catch:{ all -> 0x01d7 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x01d7 }
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d7 }
            java.lang.String r4 = r1.h     // Catch:{ all -> 0x01d7 }
            r0[r5] = r4     // Catch:{ all -> 0x01d7 }
            r0 = 6
            a(r2, r0)     // Catch:{ all -> 0x01d7 }
            zvm r0 = r1.d     // Catch:{ all -> 0x01d7 }
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x01d7 }
            r0.a(r2)     // Catch:{ all -> 0x01d7 }
            monitor-exit(r3)     // Catch:{ all -> 0x01d7 }
            return
        L_0x0026:
            java.util.Set r0 = a     // Catch:{ all -> 0x01d7 }
            java.lang.String r6 = r1.g     // Catch:{ all -> 0x01d7 }
            r0.add(r6)     // Catch:{ all -> 0x01d7 }
            monitor-exit(r3)     // Catch:{ all -> 0x01d7 }
            java.util.concurrent.atomic.AtomicInteger r0 = b
            int r3 = r0.getAndIncrement()
            boolean r0 = defpackage.azfh.b()
            r6 = 17301628(0x108007c, float:2.4979602E-38)
            r7 = 0
            if (r0 != 0) goto L_0x007d
            je r0 = new je
            r0.<init>(r2)
            iwr r8 = b(r17)
            boolean r9 = r8.a()
            if (r9 == 0) goto L_0x007a
            r9 = 2131953796(0x7f130884, float:1.9544073E38)
            java.lang.String r9 = r2.getString(r9)
            r0.e(r9)
            r9 = 2131953810(0x7f130892, float:1.9544101E38)
            java.lang.String r9 = r2.getString(r9)
            r0.b((java.lang.CharSequence) r9)
            r0.b((int) r6)
            r0.a((int) r5, (int) r5, (boolean) r4)
            r0.b((boolean) r4)
            java.lang.String r9 = "progress"
            r0.s = r9
            android.app.Notification r9 = r0.b()
            java.lang.String r10 = "romanesco:contacts_restore"
            r8.a(r10, r3, r9)
            r9 = r0
            r8 = r7
            goto L_0x0093
        L_0x007a:
            r9 = r0
            r8 = r7
            goto L_0x0093
        L_0x007d:
            iwr r0 = b(r17)
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0090
            zzc r0 = defpackage.zzc.a()
            zzb r0 = r0.a(r2)
            goto L_0x0091
        L_0x0090:
            r0 = r7
        L_0x0091:
            r8 = r0
            r9 = r7
        L_0x0093:
            zsn r10 = new zsn
            r10.<init>(r2)
            azfa r0 = defpackage.azfa.a
            azfb r0 = r0.a()
            long r11 = r0.D()
            int r12 = (int) r11
            if (r8 == 0) goto L_0x00b4
            android.content.Context r0 = r8.a
            r11 = 2131953798(0x7f130886, float:1.9544077E38)
            java.lang.String r0 = r0.getString(r11)
            r8.a((int) r5, (java.lang.String) r0)
            r11 = 0
            r13 = 0
            goto L_0x00b6
        L_0x00b4:
            r11 = 0
            r13 = 0
        L_0x00b6:
            zsp r0 = r1.j     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            r0.a()     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            zvu r0 = new zvu     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            r0.<init>(r2)     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            java.lang.String r14 = r1.f     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            com.google.android.gms.common.internal.ClientContext r14 = defpackage.zvr.a(r2, r14)     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            java.lang.String r15 = r1.g     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            java.lang.String[] r6 = r1.i     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            java.lang.String r5 = ""
            aqxb r7 = r0.a(r14, r15, r6, r5)     // Catch:{ eif -> 0x012b, babk -> 0x00ef }
            zsp r0 = r1.j     // Catch:{ eif -> 0x00ed, babk -> 0x00eb }
            java.lang.String r5 = "fetch_contacts"
            r0.a(r2, r5, r4)     // Catch:{ eif -> 0x00ed, babk -> 0x00eb }
            if (r8 == 0) goto L_0x00e9
            r0 = 120(0x78, float:1.68E-43)
            android.content.Context r5 = r8.a     // Catch:{ eif -> 0x00ed, babk -> 0x00eb }
            r6 = 2131953819(0x7f13089b, float:1.954412E38)
            java.lang.String r5 = r5.getString(r6)     // Catch:{ eif -> 0x00ed, babk -> 0x00eb }
            r8.a((int) r0, (java.lang.String) r5)     // Catch:{ eif -> 0x00ed, babk -> 0x00eb }
            r13 = 1
            goto L_0x0145
        L_0x00e9:
            r13 = 1
            goto L_0x0145
        L_0x00eb:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ed:
            r0 = move-exception
            goto L_0x012c
        L_0x00ef:
            r0 = move-exception
        L_0x00f0:
            double r5 = defpackage.azfa.l()
            r10.a(r0, r5)
            zsg r5 = r1.c
            java.lang.String r6 = "Status Exception when fetching contacts from server"
            r5.a((java.lang.Throwable) r0, (java.lang.String) r6)
            zsi r5 = defpackage.zsi.a()
            babj r0 = r0.a
            babg r0 = r0.r
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r6 = r6 + 27
            r14.<init>(r6)
            java.lang.String r6 = "restore_error:status_error:"
            r14.append(r6)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r5.a((java.lang.String) r0)
            int r11 = r11 + 1
            goto L_0x0145
        L_0x012b:
            r0 = move-exception
        L_0x012c:
            double r5 = defpackage.azfa.l()
            r10.a(r0, r5)
            zsg r5 = r1.c
            java.lang.String r6 = "Auth Exception when fetching contacts from server"
            r5.a((java.lang.Throwable) r0, (java.lang.String) r6)
            zsi r0 = defpackage.zsi.a()
            java.lang.String r5 = "restore_error:authentication_failure"
            r0.a((java.lang.String) r5)
            int r11 = r11 + 1
        L_0x0145:
            if (r13 != 0) goto L_0x014f
            if (r11 > r12) goto L_0x014f
            r5 = 0
            r6 = 17301628(0x108007c, float:2.4979602E-38)
            goto L_0x00b6
        L_0x014f:
            if (r7 != 0) goto L_0x0154
            ampu r0 = defpackage.ampu.a
            goto L_0x0158
        L_0x0154:
            amri r0 = defpackage.amri.b(r7)
        L_0x0158:
            boolean r5 = r0.a()
            if (r5 == 0) goto L_0x0169
            java.lang.Object r0 = r0.b()
            aqxb r0 = (defpackage.aqxb) r0
            boolean r0 = r1.a(r8, r2, r10, r0)
            goto L_0x016a
        L_0x0169:
            r0 = 0
        L_0x016a:
            boolean r5 = defpackage.azfh.b()
            if (r5 != 0) goto L_0x01a9
            iwr r5 = b(r17)
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x01b4
            if (r0 != 0) goto L_0x0180
            r6 = 2131952322(0x7f1302c2, float:1.9541083E38)
            goto L_0x0183
        L_0x0180:
            r6 = 2131953795(0x7f130883, float:1.9544071E38)
        L_0x0183:
            r7 = 0
            r9.a((int) r7, (int) r7, (boolean) r7)
            java.lang.String r6 = r2.getString(r6)
            r9.b((java.lang.CharSequence) r6)
            r6 = 17301628(0x108007c, float:2.4979602E-38)
            r9.b((int) r6)
            r9.a((boolean) r4)
            r9.b((boolean) r7)
            java.lang.String r4 = "progress"
            r9.s = r4
            android.app.Notification r4 = r9.b()
            java.lang.String r6 = "romanesco:contacts_restore"
            r5.a(r6, r3, r4)
            goto L_0x01b4
        L_0x01a9:
            if (r8 == 0) goto L_0x01b4
            if (r0 != 0) goto L_0x01b1
            r8.b()
            goto L_0x01b4
        L_0x01b1:
            r8.a()
        L_0x01b4:
            if (r0 != 0) goto L_0x01b8
            r3 = 4
            goto L_0x01b9
        L_0x01b8:
            r3 = 3
        L_0x01b9:
            a(r2, r3)
            zvm r2 = r1.d
            if (r0 != 0) goto L_0x01c3
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x01c5
        L_0x01c3:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x01c5:
            r2.a(r0)
            java.util.Set r2 = a
            monitor-enter(r2)
            java.util.Set r0 = a     // Catch:{ all -> 0x01d4 }
            java.lang.String r3 = r1.g     // Catch:{ all -> 0x01d4 }
            r0.remove(r3)     // Catch:{ all -> 0x01d4 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d4 }
            return
        L_0x01d4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d4 }
            throw r0
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d7 }
            goto L_0x01db
        L_0x01da:
            throw r0
        L_0x01db:
            goto L_0x01da
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zze.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.d.a(status);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.zzb r5, android.content.Context r6, defpackage.zsn r7, defpackage.aqxb r8) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = r4.e     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
            int r2 = defpackage.zzf.a(r2)     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
            ztb r2 = defpackage.ztc.a(r6, r2)     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
            if (r5 != 0) goto L_0x0014
            java.lang.String r5 = r4.f     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
            r2.a((defpackage.aqxb) r8, (java.lang.String) r5, (boolean) r1)     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
            goto L_0x0019
        L_0x0014:
            java.lang.String r3 = r4.f     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
            r2.a((defpackage.aqxb) r8, (java.lang.String) r3, (defpackage.zzb) r5)     // Catch:{ RemoteException -> 0x0075, OperationApplicationException -> 0x005b, RuntimeException -> 0x0029 }
        L_0x0019:
            java.lang.String r5 = r4.g     // Catch:{ RemoteException -> 0x0027, OperationApplicationException -> 0x0025, RuntimeException -> 0x0023 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x0027, OperationApplicationException -> 0x0025, RuntimeException -> 0x0023 }
            defpackage.zys.a(r6, r5, r1)     // Catch:{ RemoteException -> 0x0027, OperationApplicationException -> 0x0025, RuntimeException -> 0x0023 }
            goto L_0x008e
        L_0x0023:
            r5 = move-exception
            goto L_0x002b
        L_0x0025:
            r5 = move-exception
            goto L_0x005d
        L_0x0027:
            r5 = move-exception
            goto L_0x0077
        L_0x0029:
            r5 = move-exception
            r0 = 0
        L_0x002b:
            double r1 = defpackage.azfa.m()
            r7.a(r5, r1)
            zsg r6 = r4.c
            java.lang.String r7 = "Failed to restore contacts due to runtime exception."
            r6.a((java.lang.Throwable) r5, (java.lang.String) r7)
            zsi r6 = defpackage.zsi.a()
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "restore_error:runtime_error:"
            int r8 = r5.length()
            if (r8 != 0) goto L_0x0053
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
            goto L_0x0057
        L_0x0053:
            java.lang.String r5 = r7.concat(r5)
        L_0x0057:
            r6.a((java.lang.String) r5)
            goto L_0x008e
        L_0x005b:
            r5 = move-exception
            r0 = 0
        L_0x005d:
            double r1 = defpackage.azfa.l()
            r7.a(r5, r1)
            zsg r6 = r4.c
            java.lang.String r7 = "Failed to write contacts to CP2."
            r6.a((java.lang.Throwable) r5, (java.lang.String) r7)
            zsi r5 = defpackage.zsi.a()
            java.lang.String r6 = "restore_error:cp2_operation_exception"
            r5.a((java.lang.String) r6)
            goto L_0x008e
        L_0x0075:
            r5 = move-exception
            r0 = 0
        L_0x0077:
            double r1 = defpackage.azfa.l()
            r7.a(r5, r1)
            zsg r6 = r4.c
            java.lang.String r7 = "Contacts write failed during the execution of a remote method."
            r6.a((java.lang.Throwable) r5, (java.lang.String) r7)
            zsi r5 = defpackage.zsi.a()
            java.lang.String r6 = "restore_error:cp2_remote_exception"
            r5.a((java.lang.String) r6)
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zze.a(zzb, android.content.Context, zsn, aqxb):boolean");
    }
}
