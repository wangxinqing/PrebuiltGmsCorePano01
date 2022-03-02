package defpackage;

/* renamed from: eby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class eby extends bhw implements ebz {
    public eby() {
        super("com.google.android.gms.appusage.internal.IAppUsageService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r11, android.os.Parcel r12, android.os.Parcel r13) {
        /*
            r10 = this;
            r0 = 2
            java.lang.String r1 = "com.google.android.gms.appusage.internal.IAppUsageCallbacks"
            r2 = 0
            if (r11 == r0) goto L_0x0037
            r0 = 3
            if (r11 == r0) goto L_0x000b
            r11 = 0
            return r11
        L_0x000b:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0024
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ebx
            if (r1 == 0) goto L_0x001e
            r2 = r0
            ebx r2 = (defpackage.ebx) r2
            r4 = r2
            goto L_0x0026
        L_0x001e:
            ebx r2 = new ebx
            r2.<init>(r11)
            goto L_0x0025
        L_0x0024:
        L_0x0025:
            r4 = r2
        L_0x0026:
            long r5 = r12.readLong()
            long r7 = r12.readLong()
            java.util.ArrayList r9 = r12.createStringArrayList()
            r3 = r10
            r3.b(r4, r5, r7, r9)
            goto L_0x0062
        L_0x0037:
            android.os.IBinder r11 = r12.readStrongBinder()
            if (r11 == 0) goto L_0x0050
            android.os.IInterface r0 = r11.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.ebx
            if (r1 == 0) goto L_0x004a
            r2 = r0
            ebx r2 = (defpackage.ebx) r2
            r4 = r2
            goto L_0x0052
        L_0x004a:
            ebx r2 = new ebx
            r2.<init>(r11)
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            r4 = r2
        L_0x0052:
            long r5 = r12.readLong()
            long r7 = r12.readLong()
            java.util.ArrayList r9 = r12.createStringArrayList()
            r3 = r10
            r3.a(r4, r5, r7, r9)
        L_0x0062:
            r13.writeNoException()
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eby.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
