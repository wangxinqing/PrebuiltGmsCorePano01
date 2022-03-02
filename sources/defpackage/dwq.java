package defpackage;

/* renamed from: dwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dwq extends bhw implements dwr {
    public dwq() {
        super("com.google.android.gms.appinvite.internal.IAppInviteService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.appinvite.internal.IAppInviteCallbacks"
            r2 = 0
            if (r5 == r0) goto L_0x004c
            r3 = 2
            if (r5 == r3) goto L_0x002b
            r3 = 3
            if (r5 == r3) goto L_0x000e
            r5 = 0
            return r5
        L_0x000e:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0026
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.dwm
            if (r1 == 0) goto L_0x0020
            r2 = r6
            dwm r2 = (defpackage.dwm) r2
            goto L_0x0027
        L_0x0020:
            dwm r2 = new dwm
            r2.<init>(r5)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            r4.a(r2)
            goto L_0x006c
        L_0x002b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0043
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dwm
            if (r2 == 0) goto L_0x003d
            r2 = r1
            dwm r2 = (defpackage.dwm) r2
            goto L_0x0044
        L_0x003d:
            dwm r2 = new dwm
            r2.<init>(r5)
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            java.lang.String r5 = r6.readString()
            r4.b(r2, r5)
            goto L_0x006c
        L_0x004c:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0064
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.dwm
            if (r2 == 0) goto L_0x005e
            r2 = r1
            dwm r2 = (defpackage.dwm) r2
            goto L_0x0065
        L_0x005e:
            dwm r2 = new dwm
            r2.<init>(r5)
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            java.lang.String r5 = r6.readString()
            r4.a(r2, r5)
        L_0x006c:
            r7.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwq.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
