package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: iwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iwm extends bhw implements iwn {
    public iwm() {
        super("com.google.android.gms.common.net.ISocketFactoryCreator");
    }

    public static iwn asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
        if (queryLocalInterface instanceof iwn) {
            return (iwn) queryLocalInterface;
        }
        return new iwl(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r7, android.os.Parcel r8, android.os.Parcel r9) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.dynamic.IObjectWrapper"
            r2 = 0
            if (r7 == r0) goto L_0x0063
            r3 = 2
            if (r7 == r3) goto L_0x000b
            r7 = 0
            return r7
        L_0x000b:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x0022
            android.os.IInterface r3 = r7.queryLocalInterface(r1)
            boolean r4 = r3 instanceof defpackage.mby
            if (r4 == 0) goto L_0x001c
            mby r3 = (defpackage.mby) r3
            goto L_0x0023
        L_0x001c:
            mbw r3 = new mbw
            r3.<init>(r7)
            goto L_0x0023
        L_0x0022:
            r3 = r2
        L_0x0023:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x003a
            android.os.IInterface r4 = r7.queryLocalInterface(r1)
            boolean r5 = r4 instanceof defpackage.mby
            if (r5 == 0) goto L_0x0034
            mby r4 = (defpackage.mby) r4
            goto L_0x003b
        L_0x0034:
            mbw r4 = new mbw
            r4.<init>(r7)
            goto L_0x003b
        L_0x003a:
            r4 = r2
        L_0x003b:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x0053
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x004d
            r2 = r1
            mby r2 = (defpackage.mby) r2
            goto L_0x0054
        L_0x004d:
            mbw r2 = new mbw
            r2.<init>(r7)
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            java.lang.String r7 = r8.readString()
            mby r7 = r6.newSocketFactoryWithCacheDir(r3, r4, r2, r7)
            r9.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r9, (android.os.IInterface) r7)
            goto L_0x00ba
        L_0x0063:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x007a
            android.os.IInterface r3 = r7.queryLocalInterface(r1)
            boolean r4 = r3 instanceof defpackage.mby
            if (r4 == 0) goto L_0x0074
            mby r3 = (defpackage.mby) r3
            goto L_0x007b
        L_0x0074:
            mbw r3 = new mbw
            r3.<init>(r7)
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x0092
            android.os.IInterface r4 = r7.queryLocalInterface(r1)
            boolean r5 = r4 instanceof defpackage.mby
            if (r5 == 0) goto L_0x008c
            mby r4 = (defpackage.mby) r4
            goto L_0x0093
        L_0x008c:
            mbw r4 = new mbw
            r4.<init>(r7)
            goto L_0x0093
        L_0x0092:
            r4 = r2
        L_0x0093:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x00ab
            android.os.IInterface r1 = r7.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.mby
            if (r2 == 0) goto L_0x00a5
            r2 = r1
            mby r2 = (defpackage.mby) r2
            goto L_0x00ac
        L_0x00a5:
            mbw r2 = new mbw
            r2.<init>(r7)
            goto L_0x00ac
        L_0x00ab:
        L_0x00ac:
            boolean r7 = defpackage.bhx.a(r8)
            mby r7 = r6.newSocketFactory(r3, r4, r2, r7)
            r9.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r9, (android.os.IInterface) r7)
        L_0x00ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwm.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
