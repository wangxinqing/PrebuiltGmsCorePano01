package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: iii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class iii extends bhw implements iij {
    public iii() {
        super("com.google.android.gms.common.audience.dynamite.IAudienceView");
    }

    public static iij asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
        if (queryLocalInterface instanceof iij) {
            return (iij) queryLocalInterface;
        }
        return new iih(iBinder);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            switch(r5) {
                case 2: goto L_0x005f;
                case 3: goto L_0x0054;
                case 4: goto L_0x0049;
                case 5: goto L_0x0039;
                case 6: goto L_0x002d;
                case 7: goto L_0x001d;
                case 8: goto L_0x0011;
                case 9: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5 = 0
            return r5
        L_0x0005:
            boolean r5 = defpackage.bhx.a(r6)
            r4.setIsUnderageAccount(r5)
            r7.writeNoException()
            goto L_0x00b3
        L_0x0011:
            mby r5 = r4.getView()
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (android.os.IInterface) r5)
            goto L_0x00b3
        L_0x001d:
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r4.onRestoreInstanceState(r5)
            r7.writeNoException()
            goto L_0x00b3
        L_0x002d:
            android.os.Bundle r5 = r4.onSaveInstanceState()
            r7.writeNoException()
            defpackage.bhx.b(r7, r5)
            goto L_0x00b3
        L_0x0039:
            android.os.Parcelable$Creator r5 = com.google.android.gms.common.people.data.Audience.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.common.people.data.Audience r5 = (com.google.android.gms.common.people.data.Audience) r5
            r4.setAudience(r5)
            r7.writeNoException()
            goto L_0x00b3
        L_0x0049:
            boolean r5 = defpackage.bhx.a(r6)
            r4.setShowEmptyText(r5)
            r7.writeNoException()
            goto L_0x00b3
        L_0x0054:
            int r5 = r6.readInt()
            r4.setEditMode(r5)
            r7.writeNoException()
            goto L_0x00b3
        L_0x005f:
            android.os.IBinder r5 = r6.readStrongBinder()
            java.lang.String r0 = "com.google.android.gms.dynamic.IObjectWrapper"
            r1 = 0
            if (r5 == 0) goto L_0x0079
            android.os.IInterface r2 = r5.queryLocalInterface(r0)
            boolean r3 = r2 instanceof defpackage.mby
            if (r3 == 0) goto L_0x0073
            mby r2 = (defpackage.mby) r2
            goto L_0x007a
        L_0x0073:
            mbw r2 = new mbw
            r2.<init>(r5)
            goto L_0x007a
        L_0x0079:
            r2 = r1
        L_0x007a:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0091
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof defpackage.mby
            if (r3 == 0) goto L_0x008b
            mby r0 = (defpackage.mby) r0
            goto L_0x0092
        L_0x008b:
            mbw r0 = new mbw
            r0.<init>(r5)
            goto L_0x0092
        L_0x0091:
            r0 = r1
        L_0x0092:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x00ac
            java.lang.String r6 = "com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks"
            android.os.IInterface r6 = r5.queryLocalInterface(r6)
            boolean r1 = r6 instanceof defpackage.iim
            if (r1 == 0) goto L_0x00a6
            r1 = r6
            iim r1 = (defpackage.iim) r1
            goto L_0x00ad
        L_0x00a6:
            iik r1 = new iik
            r1.<init>(r5)
            goto L_0x00ad
        L_0x00ac:
        L_0x00ad:
            r4.initialize(r2, r0, r1)
            r7.writeNoException()
        L_0x00b3:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iii.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
