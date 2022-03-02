package defpackage;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface kei {
    long a(khq khq, int i);

    ParcelFileDescriptor a(kmp kmp);

    Contents a(khq khq, int i, IBinder iBinder);

    DriveId a(khq khq, int i, MetadataBundle metadataBundle, DriveId driveId, kdo kdo);

    void a(AppIdentity appIdentity, int i);

    void a(khq khq, int i, MetadataBundle metadataBundle, boolean z, kdo kdo);
}
