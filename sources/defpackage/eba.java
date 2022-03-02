package defpackage;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: eba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eba extends bhw implements IInterface {
    public final String a;
    private final Context b;
    private final ClientContext c;

    public eba() {
        super("com.google.android.gms.appstate.internal.IAppStateService");
    }

    private static boolean a(int i) {
        return i >= 0 && i < 4;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r13v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r13v23, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r13v27, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r12, android.os.Parcel r13, android.os.Parcel r14) {
        /*
            r11 = this;
            r0 = 3
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 0
            switch(r12) {
                case 5001: goto L_0x028d;
                case 5002: goto L_0x0286;
                case 5003: goto L_0x0215;
                case 5004: goto L_0x01bb;
                case 5005: goto L_0x0177;
                case 5006: goto L_0x00f9;
                case 5007: goto L_0x00a5;
                case 5008: goto L_0x0063;
                case 5009: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            return r8
        L_0x0014:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x002e
            java.lang.String r13 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r13 = r12.queryLocalInterface(r13)
            boolean r0 = r13 instanceof defpackage.eaz
            if (r0 == 0) goto L_0x0028
            r6 = r13
            eaz r6 = (defpackage.eaz) r6
            goto L_0x002f
        L_0x0028:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            int r12 = android.os.Process.myUid()
            int r13 = android.os.Binder.getCallingUid()
            if (r12 != r13) goto L_0x005d
            java.lang.String r12 = "Must provide a valid callback object"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r12)
            boolean r12 = defpackage.awhx.b()
            if (r12 == 0) goto L_0x004a
            r6.a((int) r8)     // Catch:{ RemoteException -> 0x0048 }
            goto L_0x0058
        L_0x0048:
            r12 = move-exception
            goto L_0x0058
        L_0x004a:
            android.content.Context r12 = r11.b
            com.google.android.gms.common.internal.ClientContext r13 = r11.c
            hdb r0 = com.google.android.gms.appstate.service.AppStateIntentChimeraService.a
            ebt r1 = new ebt
            r1.<init>(r13, r6)
            com.google.android.gms.appstate.service.AppStateIntentChimeraService.a(r12, r0, r1)
        L_0x0058:
            r14.writeNoException()
            goto L_0x0293
        L_0x005d:
            java.lang.SecurityException r12 = new java.lang.SecurityException
            r12.<init>()
            throw r12
        L_0x0063:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x007d
            java.lang.String r13 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r13 = r12.queryLocalInterface(r13)
            boolean r0 = r13 instanceof defpackage.eaz
            if (r0 == 0) goto L_0x0077
            r6 = r13
            eaz r6 = (defpackage.eaz) r6
            goto L_0x007e
        L_0x0077:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x007e
        L_0x007d:
        L_0x007e:
            android.content.Context r12 = r11.b
            com.google.android.gms.common.internal.ClientContext r13 = r11.c
            java.lang.String r13 = r13.e
            defpackage.jgu.c(r12, r13)
            java.lang.Object r12 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.b
            monitor-enter(r12)
            java.util.HashMap r13 = com.google.android.gms.appstate.service.AppStateAndroidChimeraService.a     // Catch:{ all -> 0x00a2 }
            r13.clear()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r12)     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x009d
            r12 = 5004(0x138c, float:7.012E-42)
            android.os.Parcel r13 = r6.aQ()     // Catch:{ RemoteException -> 0x009c }
            r6.b(r12, r13)     // Catch:{ RemoteException -> 0x009c }
            goto L_0x009d
        L_0x009c:
            r12 = move-exception
        L_0x009d:
            r14.writeNoException()
            goto L_0x0293
        L_0x00a2:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a2 }
            throw r13
        L_0x00a5:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x00bf
            java.lang.String r0 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r0 = r12.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.eaz
            if (r1 == 0) goto L_0x00b9
            r6 = r0
            eaz r6 = (defpackage.eaz) r6
            goto L_0x00c0
        L_0x00b9:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x00c0
        L_0x00bf:
        L_0x00c0:
            int r12 = r13.readInt()
            java.lang.String r13 = "Must provide a valid callback object"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r13)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r13[r8] = r0
            r13[r7] = r2
            boolean r0 = a(r12)
            java.lang.String r1 = "State key is out of bounds: %d is not between 0 and %d"
            defpackage.iva.a(r0, r1, r13)
            boolean r13 = defpackage.awhx.b()
            if (r13 == 0) goto L_0x00e8
            r6.b(r12)     // Catch:{ RemoteException -> 0x00e6 }
            goto L_0x00f4
        L_0x00e6:
            r12 = move-exception
            goto L_0x00f4
        L_0x00e8:
            android.content.Context r13 = r11.b
            hdb r0 = com.google.android.gms.appstate.service.AppStateIntentChimeraService.a
            ebn r1 = new ebn
            r1.<init>(r6, r12)
            com.google.android.gms.appstate.service.AppStateIntentChimeraService.a(r13, r0, r1)
        L_0x00f4:
            r14.writeNoException()
            goto L_0x0293
        L_0x00f9:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x0113
            java.lang.String r1 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r1 = r12.queryLocalInterface(r1)
            boolean r6 = r1 instanceof defpackage.eaz
            if (r6 == 0) goto L_0x010d
            r6 = r1
            eaz r6 = (defpackage.eaz) r6
            goto L_0x0114
        L_0x010d:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x0114
        L_0x0113:
        L_0x0114:
            int r12 = r13.readInt()
            java.lang.String r1 = r13.readString()
            byte[] r13 = r13.createByteArray()
            java.lang.String r9 = "Must provide a valid callback object"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r9)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r9[r8] = r10
            r9[r7] = r2
            boolean r2 = a(r12)
            java.lang.String r10 = "State key is out of bounds: %d is not between 0 and %d"
            defpackage.iva.a(r2, r10, r9)
            java.lang.String r2 = "Must provide a non-null resolved version"
            defpackage.iva.a((java.lang.Object) r1, (java.lang.Object) r2)
            if (r13 == 0) goto L_0x0154
            int r1 = r13.length
            if (r1 > r3) goto L_0x0144
            r2 = 1
            goto L_0x0145
        L_0x0144:
            r2 = 0
        L_0x0145:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r8] = r1
            r3[r7] = r4
            java.lang.String r1 = "App state data is too large (%d bytes). The maximum is %d"
            defpackage.iva.a(r2, r1, r3)
        L_0x0154:
            boolean r1 = defpackage.awhx.b()
            if (r1 == 0) goto L_0x0164
            com.google.android.gms.common.data.DataHolder r13 = com.google.android.gms.common.data.DataHolder.b(r0)     // Catch:{ RemoteException -> 0x0162 }
            r6.a(r12, r13)     // Catch:{ RemoteException -> 0x0162 }
            goto L_0x0172
        L_0x0162:
            r12 = move-exception
            goto L_0x0172
        L_0x0164:
            android.content.Context r0 = r11.b
            com.google.android.gms.common.internal.ClientContext r1 = r11.c
            hdb r2 = com.google.android.gms.appstate.service.AppStateIntentChimeraService.a
            ebq r3 = new ebq
            r3.<init>(r1, r6, r12, r13)
            com.google.android.gms.appstate.service.AppStateIntentChimeraService.a(r0, r2, r3)
        L_0x0172:
            r14.writeNoException()
            goto L_0x0293
        L_0x0177:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x0191
            java.lang.String r13 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r13 = r12.queryLocalInterface(r13)
            boolean r1 = r13 instanceof defpackage.eaz
            if (r1 == 0) goto L_0x018b
            r6 = r13
            eaz r6 = (defpackage.eaz) r6
            goto L_0x0192
        L_0x018b:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x0192
        L_0x0191:
        L_0x0192:
            java.lang.String r12 = "Must provide a valid callback object"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r12)
            boolean r12 = defpackage.awhx.b()
            if (r12 == 0) goto L_0x01a8
            com.google.android.gms.common.data.DataHolder r12 = com.google.android.gms.common.data.DataHolder.b(r0)     // Catch:{ RemoteException -> 0x01a6 }
            r6.a((com.google.android.gms.common.data.DataHolder) r12)     // Catch:{ RemoteException -> 0x01a6 }
            goto L_0x01b6
        L_0x01a6:
            r12 = move-exception
            goto L_0x01b6
        L_0x01a8:
            android.content.Context r12 = r11.b
            com.google.android.gms.common.internal.ClientContext r13 = r11.c
            hdb r0 = com.google.android.gms.appstate.service.AppStateIntentChimeraService.a
            ebo r1 = new ebo
            r1.<init>(r13, r6)
            com.google.android.gms.appstate.service.AppStateIntentChimeraService.a(r12, r0, r1)
        L_0x01b6:
            r14.writeNoException()
            goto L_0x0293
        L_0x01bb:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x01d5
            java.lang.String r1 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r1 = r12.queryLocalInterface(r1)
            boolean r3 = r1 instanceof defpackage.eaz
            if (r3 == 0) goto L_0x01cf
            r6 = r1
            eaz r6 = (defpackage.eaz) r6
            goto L_0x01d6
        L_0x01cf:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x01d6
        L_0x01d5:
        L_0x01d6:
            int r12 = r13.readInt()
            java.lang.String r13 = "Must provide a valid callback object"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r13)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r13[r8] = r1
            r13[r7] = r2
            boolean r1 = a(r12)
            java.lang.String r2 = "State key is out of bounds: %d is not between 0 and %d"
            defpackage.iva.a(r1, r2, r13)
            boolean r13 = defpackage.awhx.b()
            if (r13 == 0) goto L_0x0202
            com.google.android.gms.common.data.DataHolder r13 = com.google.android.gms.common.data.DataHolder.b(r0)     // Catch:{ RemoteException -> 0x0200 }
            r6.a(r12, r13)     // Catch:{ RemoteException -> 0x0200 }
            goto L_0x0210
        L_0x0200:
            r12 = move-exception
            goto L_0x0210
        L_0x0202:
            android.content.Context r13 = r11.b
            com.google.android.gms.common.internal.ClientContext r0 = r11.c
            hdb r1 = com.google.android.gms.appstate.service.AppStateIntentChimeraService.a
            ebp r2 = new ebp
            r2.<init>(r0, r6, r12)
            com.google.android.gms.appstate.service.AppStateIntentChimeraService.a(r13, r1, r2)
        L_0x0210:
            r14.writeNoException()
            goto L_0x0293
        L_0x0215:
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 == 0) goto L_0x022f
            java.lang.String r1 = "com.google.android.gms.appstate.internal.IAppStateCallbacks"
            android.os.IInterface r1 = r12.queryLocalInterface(r1)
            boolean r6 = r1 instanceof defpackage.eaz
            if (r6 == 0) goto L_0x0229
            r6 = r1
            eaz r6 = (defpackage.eaz) r6
            goto L_0x0230
        L_0x0229:
            eaz r6 = new eaz
            r6.<init>(r12)
            goto L_0x0230
        L_0x022f:
        L_0x0230:
            int r12 = r13.readInt()
            byte[] r13 = r13.createByteArray()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r1[r8] = r9
            r1[r7] = r2
            boolean r2 = a(r12)
            java.lang.String r9 = "State key is out of bounds: %d is not between 0 and %d"
            defpackage.iva.a(r2, r9, r1)
            if (r13 == 0) goto L_0x0262
            int r1 = r13.length
            if (r1 > r3) goto L_0x0252
            r2 = 1
            goto L_0x0253
        L_0x0252:
            r2 = 0
        L_0x0253:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r8] = r1
            r3[r7] = r4
            java.lang.String r1 = "App state data is too large (%d bytes). The maximum is %d"
            defpackage.iva.a(r2, r1, r3)
        L_0x0262:
            boolean r1 = defpackage.awhx.b()
            if (r1 != 0) goto L_0x0277
            android.content.Context r0 = r11.b
            com.google.android.gms.common.internal.ClientContext r1 = r11.c
            hdb r2 = com.google.android.gms.appstate.service.AppStateIntentChimeraService.a
            ebr r3 = new ebr
            r3.<init>(r1, r6, r12, r13)
            com.google.android.gms.appstate.service.AppStateIntentChimeraService.a(r0, r2, r3)
            goto L_0x0282
        L_0x0277:
            if (r6 == 0) goto L_0x0282
            com.google.android.gms.common.data.DataHolder r13 = com.google.android.gms.common.data.DataHolder.b(r0)     // Catch:{ RemoteException -> 0x0281 }
            r6.a(r12, r13)     // Catch:{ RemoteException -> 0x0281 }
            goto L_0x0282
        L_0x0281:
            r12 = move-exception
        L_0x0282:
            r14.writeNoException()
            goto L_0x0293
        L_0x0286:
            r14.writeNoException()
            r14.writeInt(r1)
            goto L_0x0293
        L_0x028d:
            r14.writeNoException()
            r14.writeInt(r3)
        L_0x0293:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public eba(Context context, ClientContext clientContext, String str) {
        super("com.google.android.gms.appstate.internal.IAppStateService");
        this.b = context;
        this.c = clientContext;
        this.a = str;
    }
}
