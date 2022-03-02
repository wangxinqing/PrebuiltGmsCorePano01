package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.mdm.internal.DeviceInfo;

/* renamed from: smn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smn extends bhw implements IInterface {
    private final int a;

    public smn() {
        super("com.google.android.gms.mdm.internal.IDeviceManagerService");
    }

    public static void a(RequestFuture requestFuture) {
        avun avun = (avun) requestFuture.get();
    }

    private final void a(smm smm, int i, DeviceInfo deviceInfo) {
        String str;
        if (jjk.a(this.a)) {
            Parcel aQ = smm.aQ();
            aQ.writeInt(i);
            bhx.a(aQ, (Parcelable) deviceInfo);
            smm.b(4, aQ);
            return;
        }
        if (deviceInfo != null) {
            str = deviceInfo.a;
        } else {
            str = null;
        }
        Parcel aQ2 = smm.aQ();
        aQ2.writeInt(i);
        aQ2.writeString(str);
        smm.b(1, aQ2);
    }

    public smn(int i) {
        super("com.google.android.gms.mdm.internal.IDeviceManagerService");
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.android.gms.mdm.internal.DeviceInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: smm} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r12, android.os.Parcel r13, android.os.Parcel r14) {
        /*
            r11 = this;
            r0 = 2
            java.lang.String r1 = "com.google.android.gms.mdm.internal.IDeviceManagerCallbacks"
            r2 = 1
            r3 = 0
            r4 = 0
            if (r12 == r2) goto L_0x008f
            if (r12 == r0) goto L_0x004b
            r0 = 3
            if (r12 == r0) goto L_0x000e
            return r4
        L_0x000e:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x0025
            android.os.IInterface r13 = r12.queryLocalInterface(r1)
            boolean r1 = r13 instanceof defpackage.smm
            if (r1 == 0) goto L_0x001f
            smm r13 = (defpackage.smm) r13
            goto L_0x0026
        L_0x001f:
            smm r13 = new smm
            r13.<init>(r12)
            goto L_0x0026
        L_0x0025:
            r13 = r3
        L_0x0026:
            defpackage.iva.a((java.lang.Object) r13)
            com.android.volley.toolbox.RequestFuture r12 = com.android.volley.toolbox.RequestFuture.newFuture()
            defpackage.smh.a(r3, r12, r12)
            a(r12)     // Catch:{ InterruptedException -> 0x0041, ExecutionException -> 0x003f }
            android.os.Parcel r12 = r13.aQ()     // Catch:{ InterruptedException -> 0x0041, ExecutionException -> 0x003f }
            r12.writeInt(r4)     // Catch:{ InterruptedException -> 0x0041, ExecutionException -> 0x003f }
            r13.b(r0, r12)     // Catch:{ InterruptedException -> 0x0041, ExecutionException -> 0x003f }
            goto L_0x016b
        L_0x003f:
            r12 = move-exception
            goto L_0x0042
        L_0x0041:
            r12 = move-exception
        L_0x0042:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.String r13 = "Failed to clear device name"
            defpackage.snn.a(r13, r12)
            goto L_0x016b
        L_0x004b:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x0063
            android.os.IInterface r0 = r12.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.smm
            if (r1 == 0) goto L_0x005d
            r3 = r0
            smm r3 = (defpackage.smm) r3
            goto L_0x0064
        L_0x005d:
            smm r3 = new smm
            r3.<init>(r12)
            goto L_0x0064
        L_0x0063:
        L_0x0064:
            java.lang.String r12 = r13.readString()
            defpackage.iva.a((java.lang.Object) r3)
            if (r12 != 0) goto L_0x0074
            r12 = 10
            r3.a(r12)
            goto L_0x016b
        L_0x0074:
            com.android.volley.toolbox.RequestFuture r13 = com.android.volley.toolbox.RequestFuture.newFuture()
            defpackage.smh.a(r12, r13, r13)
            a(r13)     // Catch:{ InterruptedException -> 0x0085, ExecutionException -> 0x0083 }
            r3.a(r4)     // Catch:{ InterruptedException -> 0x0085, ExecutionException -> 0x0083 }
            goto L_0x016b
        L_0x0083:
            r12 = move-exception
            goto L_0x0086
        L_0x0085:
            r12 = move-exception
        L_0x0086:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.String r13 = "Failed to rename device name"
            defpackage.snn.a(r13, r12)
            goto L_0x016b
        L_0x008f:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x00a6
            android.os.IInterface r13 = r12.queryLocalInterface(r1)
            boolean r1 = r13 instanceof defpackage.smm
            if (r1 == 0) goto L_0x00a0
            smm r13 = (defpackage.smm) r13
            goto L_0x00a7
        L_0x00a0:
            smm r13 = new smm
            r13.<init>(r12)
            goto L_0x00a7
        L_0x00a6:
            r13 = r3
        L_0x00a7:
            defpackage.iva.a((java.lang.Object) r13)
            com.android.volley.toolbox.RequestFuture r12 = com.android.volley.toolbox.RequestFuture.newFuture()
            com.android.volley.RequestQueue r1 = defpackage.smh.a()
            avuc r5 = defpackage.avuc.e
            aucd r5 = r5.o()
            ihs r6 = defpackage.ihs.b()
            long r6 = defpackage.jhg.a((android.content.Context) r6)
            boolean r8 = r5.c
            if (r8 == 0) goto L_0x00c9
            r5.c()
            r5.c = r4
        L_0x00c9:
            aucj r8 = r5.b
            avuc r8 = (defpackage.avuc) r8
            aucv r9 = r8.b
            boolean r9 = r9.a()
            if (r9 != 0) goto L_0x00dd
            aucv r9 = r8.b
            aucv r9 = defpackage.aucj.a((defpackage.aucv) r9)
            r8.b = r9
        L_0x00dd:
            aucv r8 = r8.b
            r8.a((long) r6)
            boolean r8 = r5.c
            if (r8 != 0) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            r5.c()
            r5.c = r4
        L_0x00ec:
            aucj r8 = r5.b
            avuc r8 = (defpackage.avuc) r8
            int r9 = r8.a
            r0 = r0 | r9
            r8.a = r0
            r8.d = r6
            r0 = r0 | r2
            r8.a = r0
            r8.c = r2
            java.lang.String r0 = defpackage.azfq.b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "/nova/get_devices"
            java.lang.String r0 = r0.concat(r6)
            r6 = 1
            avud r7 = defpackage.avud.b
            r8 = 7
            java.lang.Object r7 = r7.c(r8)
            r9 = r7
            auef r9 = (defpackage.auef) r9
            aucj r5 = r5.i()
            r10 = r5
            avuc r10 = (defpackage.avuc) r10
            r5 = r0
            r7 = r12
            r8 = r12
            smi r0 = defpackage.smi.a(r5, r6, r7, r8, r9, r10)
            r1.add(r0)
            r0 = 13
            java.lang.Object r12 = r12.get()     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            avud r12 = (defpackage.avud) r12     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            aucx r12 = r12.a     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            int r1 = r12.size()     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            if (r1 != r2) goto L_0x0154
            java.lang.Object r12 = r12.get(r4)     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            avus r12 = (defpackage.avus) r12     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            avua r12 = r12.a     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
            if (r12 != 0) goto L_0x0142
            avua r12 = defpackage.avua.c     // Catch:{ InterruptedException -> 0x0160, ExecutionException -> 0x015e, all -> 0x015a }
        L_0x0142:
            com.google.android.gms.mdm.internal.DeviceInfo r0 = new com.google.android.gms.mdm.internal.DeviceInfo     // Catch:{ InterruptedException -> 0x0151, ExecutionException -> 0x014f, all -> 0x014d }
            java.lang.String r1 = r12.a     // Catch:{ InterruptedException -> 0x0151, ExecutionException -> 0x014f, all -> 0x014d }
            java.lang.String r12 = r12.b     // Catch:{ InterruptedException -> 0x0151, ExecutionException -> 0x014f, all -> 0x014d }
            r0.<init>(r1, r12)     // Catch:{ InterruptedException -> 0x0151, ExecutionException -> 0x014f, all -> 0x014d }
            r3 = r0
            goto L_0x0156
        L_0x014d:
            r12 = move-exception
            goto L_0x0171
        L_0x014f:
            r12 = move-exception
            goto L_0x0152
        L_0x0151:
            r12 = move-exception
        L_0x0152:
            r0 = 0
            goto L_0x0161
        L_0x0154:
            r4 = 13
        L_0x0156:
            r11.a((defpackage.smm) r13, (int) r4, (com.google.android.gms.mdm.internal.DeviceInfo) r3)
            goto L_0x016b
        L_0x015a:
            r12 = move-exception
            r4 = 13
            goto L_0x0171
        L_0x015e:
            r12 = move-exception
            goto L_0x0161
        L_0x0160:
            r12 = move-exception
        L_0x0161:
            java.lang.String r1 = "Failed to retrieve device name"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x016f }
            defpackage.snn.a(r12, r1, r4)     // Catch:{ all -> 0x016f }
            r11.a((defpackage.smm) r13, (int) r0, (com.google.android.gms.mdm.internal.DeviceInfo) r3)
        L_0x016b:
            r14.writeNoException()
            return r2
        L_0x016f:
            r12 = move-exception
            r4 = r0
        L_0x0171:
            r11.a((defpackage.smm) r13, (int) r4, (com.google.android.gms.mdm.internal.DeviceInfo) r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smn.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
