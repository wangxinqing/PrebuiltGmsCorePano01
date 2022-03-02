package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: mcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mcz extends bhw implements mda {
    public mcz() {
        super("com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public static mda asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
        if (queryLocalInterface instanceof mda) {
            return (mda) queryLocalInterface;
        }
        return new mcy(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1 = 0
            switch(r3) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x009a;
                case 3: goto L_0x006e;
                case 4: goto L_0x0041;
                case 5: goto L_0x0014;
                case 6: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            int r3 = r2.getIDynamiteLoaderVersion()
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x00ed
        L_0x0014:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x002c
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x0026
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x002d
        L_0x0026:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            java.lang.String r3 = r4.readString()
            boolean r4 = defpackage.bhx.a(r4)
            int r3 = r2.getModuleVersion2NoCrashUtils(r1, r3, r4)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x00ed
        L_0x0041:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0059
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x0053
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x005a
        L_0x0053:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            java.lang.String r3 = r4.readString()
            int r4 = r4.readInt()
            mby r3 = r2.createModuleContextNoCrashUtils(r1, r3, r4)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x00ed
        L_0x006e:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0086
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x0080
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0087
        L_0x0080:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            java.lang.String r3 = r4.readString()
            boolean r4 = defpackage.bhx.a(r4)
            int r3 = r2.getModuleVersion2(r1, r3, r4)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x00ed
        L_0x009a:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00b2
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x00ac
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x00b3
        L_0x00ac:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x00b3
        L_0x00b2:
        L_0x00b3:
            java.lang.String r3 = r4.readString()
            int r4 = r4.readInt()
            mby r3 = r2.createModuleContext(r1, r3, r4)
            r5.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r5, (android.os.IInterface) r3)
            goto L_0x00ed
        L_0x00c6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x00de
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x00d8
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x00df
        L_0x00d8:
            mbw r1 = new mbw
            r1.<init>(r3)
            goto L_0x00df
        L_0x00de:
        L_0x00df:
            java.lang.String r3 = r4.readString()
            int r3 = r2.getModuleVersion(r1, r3)
            r5.writeNoException()
            r5.writeInt(r3)
        L_0x00ed:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcz.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
