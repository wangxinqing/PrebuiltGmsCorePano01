package defpackage;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.util.List;

/* renamed from: qfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class qfx extends bhw implements qfy {
    public qfx() {
        super("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    public final void a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void b(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, PackageInfo packageInfo) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, BitmapTeleporter bitmapTeleporter) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, LaunchData launchData) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, DiagnosticInfo diagnosticInfo) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, OptInInfo optInInfo) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, Permissions permissions) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR), (InstantAppPreLaunchInfo) bhx.a(parcel, InstantAppPreLaunchInfo.CREATOR));
            return true;
        } else if (i == 13) {
            a((Status) bhx.a(parcel, Status.CREATOR), (OptInInfo) bhx.a(parcel, OptInInfo.CREATOR));
            return true;
        } else if (i == 9) {
            a((Status) bhx.a(parcel, Status.CREATOR), (Permissions) bhx.a(parcel, Permissions.CREATOR));
            return true;
        } else if (i == 10) {
            a(parcel.readInt());
            return true;
        } else if (i == 26) {
            a((Status) bhx.a(parcel, Status.CREATOR), bhx.a(parcel));
            return true;
        } else if (i != 27) {
            switch (i) {
                case 18:
                    a((Status) bhx.a(parcel, Status.CREATOR), (PackageInfo) bhx.a(parcel, PackageInfo.CREATOR));
                    return true;
                case 19:
                    a((Status) bhx.a(parcel, Status.CREATOR), (LaunchData) bhx.a(parcel, LaunchData.CREATOR));
                    return true;
                case 20:
                    a((Status) bhx.a(parcel, Status.CREATOR), (List) parcel.createTypedArrayList(VisitedApplication.CREATOR));
                    return true;
                case 21:
                    a((Status) bhx.a(parcel, Status.CREATOR), (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR));
                    return true;
                case 22:
                    a((Status) bhx.a(parcel, Status.CREATOR), (BitmapTeleporter) bhx.a(parcel, BitmapTeleporter.CREATOR));
                    return true;
                case 23:
                    a((Status) bhx.a(parcel, Status.CREATOR), (DiagnosticInfo) bhx.a(parcel, DiagnosticInfo.CREATOR));
                    return true;
                default:
                    return false;
            }
        } else {
            b((Status) bhx.a(parcel, Status.CREATOR), bhx.a(parcel));
            return true;
        }
    }
}
