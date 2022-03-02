package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzd extends nis {
    static final Set a = new HashSet();
    private final zsg b = zsg.a("RestoreContactsOp");
    private final zvm c;
    private final String d;
    private final String e;
    private final String f;
    private final String[] g;
    private final zsp h = new zsp(4);

    public zzd(zvm zvm, String str, String str2, String str3, String[] strArr) {
        super(135, "RestoreContacts");
        this.c = zvm;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = strArr;
    }

    private static void a(Context context, int i) {
        zsi.a().a(i, iwr.a(context.getApplicationContext()).a());
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
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e8  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:114:0x01c3=Splitter:B:114:0x01c3, B:95:0x0166=Splitter:B:95:0x0166, B:34:0x009a=Splitter:B:34:0x009a, B:76:0x012a=Splitter:B:76:0x012a, B:57:0x00ee=Splitter:B:57:0x00ee} */
    public final void a(android.content.Context r11) {
        /*
            r10 = this;
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r1 = a     // Catch:{ all -> 0x0220 }
            java.lang.String r2 = r10.e     // Catch:{ all -> 0x0220 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0220 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0022
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0220 }
            java.lang.String r3 = r10.f     // Catch:{ all -> 0x0220 }
            r1[r2] = r3     // Catch:{ all -> 0x0220 }
            r1 = 6
            a(r11, r1)     // Catch:{ all -> 0x0220 }
            zvm r11 = r10.c     // Catch:{ all -> 0x0220 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x0220 }
            r11.a(r1)     // Catch:{ all -> 0x0220 }
            monitor-exit(r0)     // Catch:{ all -> 0x0220 }
            return
        L_0x0022:
            java.util.Set r1 = a     // Catch:{ all -> 0x0220 }
            java.lang.String r4 = r10.e     // Catch:{ all -> 0x0220 }
            r1.add(r4)     // Catch:{ all -> 0x0220 }
            monitor-exit(r0)     // Catch:{ all -> 0x0220 }
            zsn r0 = new zsn
            r0.<init>(r11)
            r1 = 4
            r4 = 3
            zsp r5 = r10.h     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            r5.a()     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            zvu r5 = new zvu     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            r5.<init>(r11)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r6 = r10.d     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            com.google.android.gms.common.internal.ClientContext r6 = defpackage.zvr.a(r11, r6)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r7 = r10.e     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String[] r8 = r10.g     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r9 = ""
            aqxb r5 = r5.a(r6, r7, r8, r9)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            zsp r6 = r10.h     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r7 = "fetch_contacts"
            r6.a(r11, r7, r3)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r6 = "SUW_Restore"
            int r6 = defpackage.zzf.a(r6)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            ztb r6 = defpackage.ztc.a(r11, r6)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r7 = r10.d     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            r6.a((defpackage.aqxb) r5, (java.lang.String) r7, (boolean) r2)     // Catch:{ eif -> 0x01c0, babk -> 0x0163, RemoteException -> 0x0127, OperationApplicationException -> 0x00eb, RuntimeException -> 0x0097, all -> 0x0094 }
            java.lang.String r2 = r10.e     // Catch:{ eif -> 0x0091, babk -> 0x008e, RemoteException -> 0x008b, OperationApplicationException -> 0x0089, RuntimeException -> 0x0087, all -> 0x0083 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ eif -> 0x0091, babk -> 0x008e, RemoteException -> 0x008b, OperationApplicationException -> 0x0089, RuntimeException -> 0x0087, all -> 0x0083 }
            defpackage.zys.a(r11, r2, r5)     // Catch:{ eif -> 0x0091, babk -> 0x008e, RemoteException -> 0x008b, OperationApplicationException -> 0x0089, RuntimeException -> 0x0087, all -> 0x0083 }
            a(r11, r4)
            zvm r11 = r10.c
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            r11.a(r0)
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r11 = a     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x0080 }
            r11.remove(r1)     // Catch:{ all -> 0x0080 }
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return
        L_0x0080:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r11
        L_0x0083:
            r0 = move-exception
            r2 = 1
            goto L_0x01fe
        L_0x0087:
            r2 = move-exception
            goto L_0x009a
        L_0x0089:
            r2 = move-exception
            goto L_0x00ee
        L_0x008b:
            r2 = move-exception
            goto L_0x012a
        L_0x008e:
            r2 = move-exception
            goto L_0x0166
        L_0x0091:
            r2 = move-exception
            goto L_0x01c3
        L_0x0094:
            r0 = move-exception
            goto L_0x01fe
        L_0x0097:
            r3 = move-exception
            r2 = r3
            r3 = 0
        L_0x009a:
            double r5 = defpackage.azfa.m()     // Catch:{ all -> 0x01fc }
            r0.a(r2, r5)     // Catch:{ all -> 0x01fc }
            zsg r0 = r10.b     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "Failed to restore contacts due to runtime exception."
            r0.a((java.lang.Throwable) r2, (java.lang.String) r5)     // Catch:{ all -> 0x01fc }
            zsi r0 = defpackage.zsi.a()     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "restore_error:runtime_error:"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01fc }
            int r6 = r2.length()     // Catch:{ all -> 0x01fc }
            if (r6 != 0) goto L_0x00c2
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x01fc }
            r2.<init>(r5)     // Catch:{ all -> 0x01fc }
            goto L_0x00c6
        L_0x00c2:
            java.lang.String r2 = r5.concat(r2)     // Catch:{ all -> 0x01fc }
        L_0x00c6:
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r1 = 3
        L_0x00cd:
            a(r11, r1)
            zvm r11 = r10.c
            if (r3 != 0) goto L_0x00d7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x00d9
        L_0x00d7:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x00d9:
            r11.a(r0)
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r11 = a     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x00e8 }
            r11.remove(r1)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            return
        L_0x00e8:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            throw r11
        L_0x00eb:
            r3 = move-exception
            r2 = r3
            r3 = 0
        L_0x00ee:
            double r5 = defpackage.azfa.l()     // Catch:{ all -> 0x01fc }
            r0.a(r2, r5)     // Catch:{ all -> 0x01fc }
            zsg r0 = r10.b     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "Failed to write contacts to CP2."
            r0.a((java.lang.Throwable) r2, (java.lang.String) r5)     // Catch:{ all -> 0x01fc }
            zsi r0 = defpackage.zsi.a()     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = "restore_error:cp2_operation_exception"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r1 = 3
        L_0x0109:
            a(r11, r1)
            zvm r11 = r10.c
            if (r3 != 0) goto L_0x0113
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x0115
        L_0x0113:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x0115:
            r11.a(r0)
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r11 = a     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x0124 }
            r11.remove(r1)     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            return
        L_0x0124:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            throw r11
        L_0x0127:
            r3 = move-exception
            r2 = r3
            r3 = 0
        L_0x012a:
            double r5 = defpackage.azfa.l()     // Catch:{ all -> 0x01fc }
            r0.a(r2, r5)     // Catch:{ all -> 0x01fc }
            zsg r0 = r10.b     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "Contacts write failed during the execution of a remote method."
            r0.a((java.lang.Throwable) r2, (java.lang.String) r5)     // Catch:{ all -> 0x01fc }
            zsi r0 = defpackage.zsi.a()     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = "restore_error:cp2_remote_exception"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r1 = 3
        L_0x0145:
            a(r11, r1)
            zvm r11 = r10.c
            if (r3 != 0) goto L_0x014f
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x0151
        L_0x014f:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x0151:
            r11.a(r0)
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r11 = a     // Catch:{ all -> 0x0160 }
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x0160 }
            r11.remove(r1)     // Catch:{ all -> 0x0160 }
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            return
        L_0x0160:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            throw r11
        L_0x0163:
            r3 = move-exception
            r2 = r3
            r3 = 0
        L_0x0166:
            double r5 = defpackage.azfa.l()     // Catch:{ all -> 0x01fc }
            r0.a(r2, r5)     // Catch:{ all -> 0x01fc }
            zsg r0 = r10.b     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "Status Exception when fetching contacts from server"
            r0.a((java.lang.Throwable) r2, (java.lang.String) r5)     // Catch:{ all -> 0x01fc }
            zsi r0 = defpackage.zsi.a()     // Catch:{ all -> 0x01fc }
            babj r2 = r2.a     // Catch:{ all -> 0x01fc }
            babg r2 = r2.r     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01fc }
            int r5 = r5.length()     // Catch:{ all -> 0x01fc }
            int r5 = r5 + 27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fc }
            r6.<init>(r5)     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "restore_error:status_error:"
            r6.append(r5)     // Catch:{ all -> 0x01fc }
            r6.append(r2)     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x01fc }
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r1 = 3
        L_0x01a2:
            a(r11, r1)
            zvm r11 = r10.c
            if (r3 != 0) goto L_0x01ac
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x01ae
        L_0x01ac:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x01ae:
            r11.a(r0)
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r11 = a     // Catch:{ all -> 0x01bd }
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x01bd }
            r11.remove(r1)     // Catch:{ all -> 0x01bd }
            monitor-exit(r0)     // Catch:{ all -> 0x01bd }
            return
        L_0x01bd:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01bd }
            throw r11
        L_0x01c0:
            r3 = move-exception
            r2 = r3
            r3 = 0
        L_0x01c3:
            double r5 = defpackage.azfa.l()     // Catch:{ all -> 0x01fc }
            r0.a(r2, r5)     // Catch:{ all -> 0x01fc }
            zsg r0 = r10.b     // Catch:{ all -> 0x01fc }
            java.lang.String r5 = "Auth Exception when fetching contacts from server"
            r0.a((java.lang.Throwable) r2, (java.lang.String) r5)     // Catch:{ all -> 0x01fc }
            zsi r0 = defpackage.zsi.a()     // Catch:{ all -> 0x01fc }
            java.lang.String r2 = "restore_error:authentication_failure"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x01fc }
            if (r3 != 0) goto L_0x01dd
            goto L_0x01de
        L_0x01dd:
            r1 = 3
        L_0x01de:
            a(r11, r1)
            zvm r11 = r10.c
            if (r3 != 0) goto L_0x01e8
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            goto L_0x01ea
        L_0x01e8:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
        L_0x01ea:
            r11.a(r0)
            java.util.Set r0 = a
            monitor-enter(r0)
            java.util.Set r11 = a     // Catch:{ all -> 0x01f9 }
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x01f9 }
            r11.remove(r1)     // Catch:{ all -> 0x01f9 }
            monitor-exit(r0)     // Catch:{ all -> 0x01f9 }
            return
        L_0x01f9:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01f9 }
            throw r11
        L_0x01fc:
            r0 = move-exception
            r2 = r3
        L_0x01fe:
            if (r2 != 0) goto L_0x0201
            goto L_0x0202
        L_0x0201:
            r1 = 3
        L_0x0202:
            a(r11, r1)
            zvm r11 = r10.c
            if (r2 != 0) goto L_0x020c
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.c
            goto L_0x020e
        L_0x020c:
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a
        L_0x020e:
            r11.a(r1)
            java.util.Set r11 = a
            monitor-enter(r11)
            java.util.Set r1 = a     // Catch:{ all -> 0x021d }
            java.lang.String r2 = r10.e     // Catch:{ all -> 0x021d }
            r1.remove(r2)     // Catch:{ all -> 0x021d }
            monitor-exit(r11)     // Catch:{ all -> 0x021d }
            throw r0
        L_0x021d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x021d }
            throw r0
        L_0x0220:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0220 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzd.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.c.a(status);
    }
}
