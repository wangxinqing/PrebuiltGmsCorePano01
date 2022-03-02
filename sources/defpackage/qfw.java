package defpackage;

import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import java.util.List;

/* renamed from: qfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfw extends bhv implements qfy {
    public qfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        c(10, aQ);
    }

    public final void b(Status status, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, z);
        c(27, aQ);
    }

    public final void a(Status status, PackageInfo packageInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) packageInfo);
        c(18, aQ);
    }

    public final void a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) parcelFileDescriptor);
        c(21, aQ);
    }

    public final void a(Status status, BitmapTeleporter bitmapTeleporter) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) bitmapTeleporter);
        c(22, aQ);
    }

    public final void a(Status status, LaunchData launchData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) launchData);
        c(19, aQ);
    }

    public final void a(Status status, DiagnosticInfo diagnosticInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) diagnosticInfo);
        c(23, aQ);
    }

    public final void a(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) instantAppPreLaunchInfo);
        c(2, aQ);
    }

    public final void a(Status status, OptInInfo optInInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) optInInfo);
        c(13, aQ);
    }

    public final void a(Status status, Permissions permissions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) permissions);
        c(9, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(20, aQ);
    }

    public final void a(Status status, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, z);
        c(26, aQ);
    }
}
