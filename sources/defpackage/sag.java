package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.concurrent.Executor;

/* renamed from: sag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sag extends bhw implements sah {
    public volatile boolean a;
    public final afil b;
    private final Executor c;

    public sag() {
        super("com.google.android.gms.mdh.internal.ILatestFootprintListener");
    }

    public final void a(ifu ifu, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        if (this.a) {
            this.c.execute(new rzs(this, latestFootprintFilter, mdhFootprintListSafeParcelable));
        }
        ifu.a(Status.a);
    }

    public sag(Executor executor, afil afil) {
        super("com.google.android.gms.mdh.internal.ILatestFootprintListener");
        this.a = true;
        this.c = executor;
        this.b = afil;
    }

    public final void a(ifu ifu, SyncStatus syncStatus) {
        if (this.a) {
            this.c.execute(new rzv(this, syncStatus));
        }
        ifu.a(Status.a);
    }

    public final void a(ifu ifu, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        if (this.a) {
            this.c.execute(new rzt(this, mdhFootprintListSafeParcelable));
        }
        ifu.a(Status.a);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4, android.os.Parcel r5, android.os.Parcel r6) {
        /*
            r3 = this;
            r6 = 1
            java.lang.String r0 = "com.google.android.gms.common.api.internal.IStatusCallback"
            r1 = 0
            if (r4 == r6) goto L_0x008c
            r2 = 2
            if (r4 == r2) goto L_0x0067
            r2 = 3
            if (r4 == r2) goto L_0x0037
            r2 = 5
            if (r4 == r2) goto L_0x0011
            r4 = 0
            return r4
        L_0x0011:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x0029
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0023
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x002a
        L_0x0023:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdh.SyncStatus.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdh.SyncStatus r4 = (com.google.android.gms.mdh.SyncStatus) r4
            r3.a((defpackage.ifu) r1, (com.google.android.gms.mdh.SyncStatus) r4)
            goto L_0x00b8
        L_0x0037:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x004f
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0049
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0050
        L_0x0049:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            r5.createByteArray()
            boolean r4 = r3.a
            if (r4 == 0) goto L_0x0061
            java.util.concurrent.Executor r4 = r3.c
            rzu r5 = new rzu
            r5.<init>(r3)
            r4.execute(r5)
        L_0x0061:
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.a
            r1.a(r4)
            goto L_0x00b8
        L_0x0067:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x007f
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x0079
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x0080
        L_0x0079:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable r4 = (com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable) r4
            r3.a((defpackage.ifu) r1, (com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable) r4)
            goto L_0x00b8
        L_0x008c:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x00a4
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.ifu
            if (r1 == 0) goto L_0x009e
            r1 = r0
            ifu r1 = (defpackage.ifu) r1
            goto L_0x00a5
        L_0x009e:
            ifs r1 = new ifs
            r1.<init>(r4)
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            android.os.Parcelable$Creator r4 = com.google.android.gms.mdh.LatestFootprintFilter.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.mdh.LatestFootprintFilter r4 = (com.google.android.gms.mdh.LatestFootprintFilter) r4
            android.os.Parcelable$Creator r0 = com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r5, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable r5 = (com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable) r5
            r3.a((defpackage.ifu) r1, (com.google.android.gms.mdh.LatestFootprintFilter) r4, (com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable) r5)
        L_0x00b8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sag.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
