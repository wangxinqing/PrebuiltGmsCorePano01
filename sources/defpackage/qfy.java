package defpackage;

import android.content.pm.PackageInfo;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import java.util.List;

/* renamed from: qfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface qfy extends IInterface {
    void a(int i);

    void a(Status status, PackageInfo packageInfo);

    void a(Status status, ParcelFileDescriptor parcelFileDescriptor);

    void a(Status status, BitmapTeleporter bitmapTeleporter);

    void a(Status status, LaunchData launchData);

    void a(Status status, DiagnosticInfo diagnosticInfo);

    void a(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo);

    void a(Status status, OptInInfo optInInfo);

    void a(Status status, Permissions permissions);

    void a(Status status, List list);

    void a(Status status, boolean z);

    void b(Status status, boolean z);
}
