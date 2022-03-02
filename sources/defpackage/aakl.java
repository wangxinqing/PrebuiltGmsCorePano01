package defpackage;

/* renamed from: aakl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aakl extends bhw implements aakm {
    public aakl() {
        super("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r0 = 2
            java.lang.String r1 = "com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks"
            r2 = 0
            if (r4 == r0) goto L_0x0030
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.ime.GetIMEUpdatesCall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.ime.GetIMEUpdatesCall$Request r4 = (com.google.android.gms.search.ime.GetIMEUpdatesCall$Request) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x002b
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.aakj
            if (r0 == 0) goto L_0x0025
            r2 = r5
            aakj r2 = (defpackage.aakj) r2
            goto L_0x002c
        L_0x0025:
            aakj r2 = new aakj
            r2.<init>(r4)
            goto L_0x002c
        L_0x002b:
        L_0x002c:
            r3.b(r2)
            goto L_0x0054
        L_0x0030:
            android.os.Parcelable$Creator r4 = com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request r4 = (com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0050
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof defpackage.aakj
            if (r0 == 0) goto L_0x004a
            r2 = r5
            aakj r2 = (defpackage.aakj) r2
            goto L_0x0051
        L_0x004a:
            aakj r2 = new aakj
            r2.<init>(r4)
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            r3.a(r2)
        L_0x0054:
            r6.writeNoException()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aakl.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
