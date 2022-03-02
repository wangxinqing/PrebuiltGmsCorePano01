package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.internal.GetPermissionsResponse;
import com.google.android.gms.drive.internal.OnChangesResponse;
import com.google.android.gms.drive.internal.OnContentsResponse;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.internal.OnFetchThumbnailResponse;
import com.google.android.gms.drive.internal.OnListEntriesResponse;
import com.google.android.gms.drive.internal.OnListParentsResponse;
import com.google.android.gms.drive.internal.OnLoadRealtimeResponse;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse;
import com.google.android.gms.drive.internal.OnResourceIdSetResponse;
import com.google.android.gms.drive.internal.OnStartStreamSession;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;
import com.google.android.gms.drive.internal.StringListResponse;

/* renamed from: kwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwe extends bhv implements kwg {
    public kwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(6, aQ);
    }

    public final void b() {
        b(7, aQ());
    }

    public final void a(ChangeSequenceNumber changeSequenceNumber) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) changeSequenceNumber);
        b(17, aQ);
    }

    public final void a(GetPermissionsResponse getPermissionsResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getPermissionsResponse);
        b(20, aQ);
    }

    public final void a(OnChangesResponse onChangesResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onChangesResponse);
        b(18, aQ);
    }

    public final void a(OnContentsResponse onContentsResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onContentsResponse);
        b(5, aQ);
    }

    public final void a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onDeviceUsagePreferenceResponse);
        b(14, aQ);
    }

    public final void a(OnDownloadProgressResponse onDownloadProgressResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onDownloadProgressResponse);
        b(1, aQ);
    }

    public final void a(OnDriveIdResponse onDriveIdResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onDriveIdResponse);
        b(3, aQ);
    }

    public final void a(OnFetchThumbnailResponse onFetchThumbnailResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onFetchThumbnailResponse);
        b(16, aQ);
    }

    public final void a(OnListEntriesResponse onListEntriesResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onListEntriesResponse);
        b(2, aQ);
    }

    public final void a(OnListParentsResponse onListParentsResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onListParentsResponse);
        b(8, aQ);
    }

    public final void a(OnLoadRealtimeResponse onLoadRealtimeResponse, lmm lmm) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onLoadRealtimeResponse);
        bhx.a(aQ, (IInterface) lmm);
        b(11, aQ);
    }

    public final void a(OnMetadataResponse onMetadataResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onMetadataResponse);
        b(4, aQ);
    }

    public final void a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onPinnedDownloadPreferencesResponse);
        b(13, aQ);
    }

    public final void a(OnResourceIdSetResponse onResourceIdSetResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onResourceIdSetResponse);
        b(12, aQ);
    }

    public final void a(OnStartStreamSession onStartStreamSession) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onStartStreamSession);
        b(22, aQ);
    }

    public final void a(OnSyncMoreResponse onSyncMoreResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onSyncMoreResponse);
        b(9, aQ);
    }

    public final void a(StringListResponse stringListResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) stringListResponse);
        b(21, aQ);
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(15, aQ);
    }
}
