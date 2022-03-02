package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.UpdateDescription;
import org.chromium.net.UrlRequest;

/* renamed from: adjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SystemUpdateStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        DownloadOptions downloadOptions = null;
        InstallationOptions installationOptions = null;
        ActivityStatus activityStatus = null;
        String str2 = null;
        String str3 = null;
        UpdateDescription updateDescription = null;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 3:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 7:
                    downloadOptions = (DownloadOptions) ivw.a(parcel2, readInt, DownloadOptions.CREATOR);
                    break;
                case 8:
                    installationOptions = (InstallationOptions) ivw.a(parcel2, readInt, InstallationOptions.CREATOR);
                    break;
                case 9:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    j = ivw.i(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 16:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 17:
                    j4 = ivw.i(parcel2, readInt);
                    break;
                case 18:
                    activityStatus = (ActivityStatus) ivw.a(parcel2, readInt, ActivityStatus.CREATOR);
                    break;
                case 19:
                    j5 = ivw.i(parcel2, readInt);
                    break;
                case 20:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 21:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 22:
                    j6 = ivw.i(parcel2, readInt);
                    break;
                case 23:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 24:
                    updateDescription = (UpdateDescription) ivw.a(parcel2, readInt, UpdateDescription.CREATOR);
                    break;
                case 25:
                    z8 = ivw.c(parcel2, readInt);
                    break;
                case 26:
                    z9 = ivw.c(parcel2, readInt);
                    break;
                case 27:
                    z10 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SystemUpdateStatus(str, z, i, i2, i3, d, downloadOptions, installationOptions, z2, z3, z4, z5, z6, j, j2, j3, j4, activityStatus, j5, str2, z7, j6, str3, updateDescription, z8, z9, z10);
    }
}
