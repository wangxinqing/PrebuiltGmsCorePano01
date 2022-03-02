package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adid extends bhv implements adif {
    public adid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.update.ISystemUpdateApiService");
    }

    public final void a(adil adil) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adil);
        b(2, aQ);
    }

    public final SystemUpdateStatus b() {
        Parcel a = a(4, aQ());
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) bhx.a(a, SystemUpdateStatus.CREATOR);
        a.recycle();
        return systemUpdateStatus;
    }

    public final void c() {
        b(7, aQ());
    }

    public final void d() {
        b(9, aQ());
    }

    public final void e() {
        b(11, aQ());
    }

    public final void f() {
        throw null;
    }

    public final boolean g() {
        throw null;
    }

    public final long h() {
        Parcel a = a(16, aQ());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final void a(ActivityStatus activityStatus) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) activityStatus);
        b(10, aQ);
    }

    public final void b(adil adil) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) adil);
        b(3, aQ);
    }

    public final void a(DownloadOptions downloadOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) downloadOptions);
        b(5, aQ);
    }

    public final void b(DownloadOptions downloadOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) downloadOptions);
        b(8, aQ);
    }

    public final void a(InstallationOptions installationOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) installationOptions);
        b(6, aQ);
    }

    public final void b(InstallationOptions installationOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) installationOptions);
        b(12, aQ);
    }

    public final void a(ifu ifu, ConfigUpdateOptions configUpdateOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) configUpdateOptions);
        b(15, aQ);
    }
}
