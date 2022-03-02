package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: mdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mdc extends bhw implements mdd {
    public mdc() {
        super("com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public static mdd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if (queryLocalInterface instanceof mdd) {
            return (mdd) queryLocalInterface;
        }
        return new mdb(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r6, android.os.Parcel r7, android.os.Parcel r8) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.dynamic.IObjectWrapper"
            r2 = 0
            if (r6 == r0) goto L_0x0097
            r3 = 2
            if (r6 == r3) goto L_0x0053
            r3 = 3
            if (r6 == r3) goto L_0x000e
            r6 = 0
            return r6
        L_0x000e:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x0025
            android.os.IInterface r3 = r6.queryLocalInterface(r1)
            boolean r4 = r3 instanceof defpackage.mby
            if (r4 == 0) goto L_0x001f
            mby r3 = (defpackage.mby) r3
            goto L_0x0026
        L_0x001f:
            mbw r3 = new mbw
            r3.<init>(r6)
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            java.lang.String r6 = r7.readString()
            int r4 = r7.readInt()
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 == 0) goto L_0x0046
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x0040
            r2 = r1
            mby r2 = (defpackage.mby) r2
            goto L_0x0047
        L_0x0040:
            mbw r2 = new mbw
            r2.<init>(r7)
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            mby r6 = r5.loadModule2NoCrashUtils(r3, r6, r4, r2)
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (android.os.IInterface) r6)
            goto L_0x00c2
        L_0x0053:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x006a
            android.os.IInterface r3 = r6.queryLocalInterface(r1)
            boolean r4 = r3 instanceof defpackage.mby
            if (r4 == 0) goto L_0x0064
            mby r3 = (defpackage.mby) r3
            goto L_0x006b
        L_0x0064:
            mbw r3 = new mbw
            r3.<init>(r6)
            goto L_0x006b
        L_0x006a:
            r3 = r2
        L_0x006b:
            java.lang.String r6 = r7.readString()
            int r4 = r7.readInt()
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 == 0) goto L_0x008b
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x0085
            r2 = r1
            mby r2 = (defpackage.mby) r2
            goto L_0x008c
        L_0x0085:
            mbw r2 = new mbw
            r2.<init>(r7)
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            mby r6 = r5.loadModule2(r3, r6, r4, r2)
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (android.os.IInterface) r6)
            goto L_0x00c2
        L_0x0097:
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 == 0) goto L_0x00af
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x00a9
            r2 = r1
            mby r2 = (defpackage.mby) r2
            goto L_0x00b0
        L_0x00a9:
            mbw r2 = new mbw
            r2.<init>(r6)
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            java.lang.String r6 = r7.readString()
            byte[] r7 = r7.createByteArray()
            mby r6 = r5.loadModule(r2, r6, r7)
            r8.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r8, (android.os.IInterface) r6)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdc.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
