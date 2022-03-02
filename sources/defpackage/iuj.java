package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: iuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iuj extends bhw implements iuk {
    public iuj() {
        super("com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public static iuk asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof iuk) {
            return (iuk) queryLocalInterface;
        }
        return new iui(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L_0x0037
            r3 = 2
            if (r5 == r3) goto L_0x000b
            r5 = 0
            return r5
        L_0x000b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0023
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x001d
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0024
        L_0x001d:
            mbw r1 = new mbw
            r1.<init>(r5)
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            android.os.Parcelable$Creator r5 = com.google.android.gms.common.internal.SignInButtonConfig.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.common.internal.SignInButtonConfig r5 = (com.google.android.gms.common.internal.SignInButtonConfig) r5
            mby r5 = r4.newSignInButtonFromConfig(r1, r5)
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (android.os.IInterface) r5)
            goto L_0x0062
        L_0x0037:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x004f
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.mby
            if (r1 == 0) goto L_0x0049
            r1 = r0
            mby r1 = (defpackage.mby) r1
            goto L_0x0050
        L_0x0049:
            mbw r1 = new mbw
            r1.<init>(r5)
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            int r5 = r6.readInt()
            int r6 = r6.readInt()
            mby r5 = r4.newSignInButton(r1, r5, r6)
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (android.os.IInterface) r5)
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
