package defpackage;

import android.os.IInterface;
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

/* renamed from: kwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface kwg extends IInterface {
    void a(Status status);

    void a(ChangeSequenceNumber changeSequenceNumber);

    void a(GetPermissionsResponse getPermissionsResponse);

    void a(OnChangesResponse onChangesResponse);

    void a(OnContentsResponse onContentsResponse);

    void a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse);

    void a(OnDownloadProgressResponse onDownloadProgressResponse);

    void a(OnDriveIdResponse onDriveIdResponse);

    void a(OnFetchThumbnailResponse onFetchThumbnailResponse);

    void a(OnListEntriesResponse onListEntriesResponse);

    void a(OnListParentsResponse onListParentsResponse);

    void a(OnLoadRealtimeResponse onLoadRealtimeResponse, lmm lmm);

    void a(OnMetadataResponse onMetadataResponse);

    void a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse);

    void a(OnResourceIdSetResponse onResourceIdSetResponse);

    void a(OnStartStreamSession onStartStreamSession);

    void a(OnSyncMoreResponse onSyncMoreResponse);

    void a(StringListResponse stringListResponse);

    void a(boolean z);

    void b();
}
