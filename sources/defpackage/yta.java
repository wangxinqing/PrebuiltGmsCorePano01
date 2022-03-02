package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: yta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yta extends bhw implements ytb {
    public yta() {
        super("com.google.android.gms.plus.dynamite.IAddToCirclesButton");
    }

    public static ytb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.dynamite.IAddToCirclesButton");
        if (queryLocalInterface instanceof ytb) {
            return (ytb) queryLocalInterface;
        }
        return new ysz(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: mbw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: mbw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: mbw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: ytd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: mbw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: mbw} */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v0, types: [ytd] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r0v9, types: [ytc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r7, android.os.Parcel r8, android.os.Parcel r9) {
        /*
            r6 = this;
            r0 = 0
            switch(r7) {
                case 2: goto L_0x0088;
                case 3: goto L_0x004e;
                case 4: goto L_0x0042;
                case 5: goto L_0x0036;
                case 6: goto L_0x002a;
                case 7: goto L_0x0022;
                case 8: goto L_0x0016;
                case 9: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r7 = 0
            return r7
        L_0x0006:
            java.lang.String r7 = r8.readString()
            int r8 = r8.readInt()
            r6.setAnalyticsStartView(r7, r8)
            r9.writeNoException()
            goto L_0x00d9
        L_0x0016:
            boolean r7 = defpackage.bhx.a(r8)
            r6.setShowProgressIndicator(r7)
            r9.writeNoException()
            goto L_0x00d9
        L_0x0022:
            r6.refreshButton()
            r9.writeNoException()
            goto L_0x00d9
        L_0x002a:
            int r7 = r8.readInt()
            r6.setType(r7)
            r9.writeNoException()
            goto L_0x00d9
        L_0x0036:
            int r7 = r8.readInt()
            r6.setSize(r7)
            r9.writeNoException()
            goto L_0x00d9
        L_0x0042:
            mby r7 = r6.getView()
            r9.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r9, (android.os.IInterface) r7)
            goto L_0x00d9
        L_0x004e:
            java.lang.String r1 = r8.readString()
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator r7 = com.google.android.gms.common.people.data.AudienceMember.CREATOR
            android.os.Parcelable r7 = defpackage.bhx.a((android.os.Parcel) r8, (android.os.Parcelable.Creator) r7)
            r3 = r7
            com.google.android.gms.common.people.data.AudienceMember r3 = (com.google.android.gms.common.people.data.AudienceMember) r3
            java.lang.String r4 = r8.readString()
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x007e
            java.lang.String r8 = "com.google.android.gms.plus.dynamite.IAddToCirclesCallbacks"
            android.os.IInterface r8 = r7.queryLocalInterface(r8)
            boolean r0 = r8 instanceof defpackage.ytd
            if (r0 == 0) goto L_0x0078
            r0 = r8
            ytd r0 = (defpackage.ytd) r0
            r5 = r0
            goto L_0x0080
        L_0x0078:
            ytc r0 = new ytc
            r0.<init>(r7)
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            r5 = r0
        L_0x0080:
            r0 = r6
            r0.configure(r1, r2, r3, r4, r5)
            r9.writeNoException()
            goto L_0x00d9
        L_0x0088:
            android.os.IBinder r7 = r8.readStrongBinder()
            java.lang.String r1 = "com.google.android.gms.dynamic.IObjectWrapper"
            if (r7 == 0) goto L_0x00a1
            android.os.IInterface r2 = r7.queryLocalInterface(r1)
            boolean r3 = r2 instanceof defpackage.mby
            if (r3 == 0) goto L_0x009b
            mby r2 = (defpackage.mby) r2
            goto L_0x00a2
        L_0x009b:
            mbw r2 = new mbw
            r2.<init>(r7)
            goto L_0x00a2
        L_0x00a1:
            r2 = r0
        L_0x00a2:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x00b9
            android.os.IInterface r3 = r7.queryLocalInterface(r1)
            boolean r4 = r3 instanceof defpackage.mby
            if (r4 == 0) goto L_0x00b3
            mby r3 = (defpackage.mby) r3
            goto L_0x00ba
        L_0x00b3:
            mbw r3 = new mbw
            r3.<init>(r7)
            goto L_0x00ba
        L_0x00b9:
            r3 = r0
        L_0x00ba:
            android.os.IBinder r7 = r8.readStrongBinder()
            if (r7 == 0) goto L_0x00d2
            android.os.IInterface r8 = r7.queryLocalInterface(r1)
            boolean r0 = r8 instanceof defpackage.mby
            if (r0 == 0) goto L_0x00cc
            r0 = r8
            mby r0 = (defpackage.mby) r0
            goto L_0x00d3
        L_0x00cc:
            mbw r0 = new mbw
            r0.<init>(r7)
            goto L_0x00d3
        L_0x00d2:
        L_0x00d3:
            r6.initialize(r2, r3, r0)
            r9.writeNoException()
        L_0x00d9:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yta.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
