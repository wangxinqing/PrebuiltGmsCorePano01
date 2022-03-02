package defpackage;

/* renamed from: tby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class tby extends bhw implements tbz {
    public tby() {
        super("com.google.android.gms.mobstore.IMobStoreFileService");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms.mobstore.IMobStoreFileCallbacks"
            r2 = 0
            if (r5 == r0) goto L_0x0058
            r3 = 2
            if (r5 == r3) goto L_0x0033
            r3 = 3
            if (r5 == r3) goto L_0x000e
            r5 = 0
            return r5
        L_0x000e:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0026
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.tbw
            if (r2 == 0) goto L_0x0020
            r2 = r1
            tbw r2 = (defpackage.tbw) r2
            goto L_0x0027
        L_0x0020:
            tbu r2 = new tbu
            r2.<init>(r5)
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            android.os.Parcelable$Creator r5 = com.google.android.gms.mobstore.RenameRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.mobstore.RenameRequest r5 = (com.google.android.gms.mobstore.RenameRequest) r5
            r4.a((defpackage.tbw) r2, (com.google.android.gms.mobstore.RenameRequest) r5)
            goto L_0x007c
        L_0x0033:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x004b
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.tbw
            if (r2 == 0) goto L_0x0045
            r2 = r1
            tbw r2 = (defpackage.tbw) r2
            goto L_0x004c
        L_0x0045:
            tbu r2 = new tbu
            r2.<init>(r5)
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            android.os.Parcelable$Creator r5 = com.google.android.gms.mobstore.DeleteFileRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.mobstore.DeleteFileRequest r5 = (com.google.android.gms.mobstore.DeleteFileRequest) r5
            r4.a((defpackage.tbw) r2, (com.google.android.gms.mobstore.DeleteFileRequest) r5)
            goto L_0x007c
        L_0x0058:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0070
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.tbw
            if (r2 == 0) goto L_0x006a
            r2 = r1
            tbw r2 = (defpackage.tbw) r2
            goto L_0x0071
        L_0x006a:
            tbu r2 = new tbu
            r2.<init>(r5)
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            android.os.Parcelable$Creator r5 = com.google.android.gms.mobstore.OpenFileDescriptorRequest.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r5 = (com.google.android.gms.mobstore.OpenFileDescriptorRequest) r5
            r4.a((defpackage.tbw) r2, (com.google.android.gms.mobstore.OpenFileDescriptorRequest) r5)
        L_0x007c:
            r7.writeNoException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tby.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
