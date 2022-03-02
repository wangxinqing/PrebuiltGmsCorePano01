package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.Service;
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
import org.chromium.net.UrlRequest;

/* renamed from: kwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class kwf extends bhw implements kwg {
    public kwf() {
        super("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }

    public void a(Status status) {
    }

    public final void a(ChangeSequenceNumber changeSequenceNumber) {
    }

    public final void a(GetPermissionsResponse getPermissionsResponse) {
    }

    public final void a(OnChangesResponse onChangesResponse) {
    }

    public final void a(OnContentsResponse onContentsResponse) {
    }

    public void a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
    }

    public final void a(OnDownloadProgressResponse onDownloadProgressResponse) {
    }

    public void a(OnDriveIdResponse onDriveIdResponse) {
    }

    public final void a(OnFetchThumbnailResponse onFetchThumbnailResponse) {
    }

    public void a(OnListEntriesResponse onListEntriesResponse) {
    }

    public void a(OnListParentsResponse onListParentsResponse) {
    }

    public final void a(OnLoadRealtimeResponse onLoadRealtimeResponse, lmm lmm) {
    }

    public void a(OnMetadataResponse onMetadataResponse) {
    }

    public void a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
    }

    public final void a(OnResourceIdSetResponse onResourceIdSetResponse) {
    }

    public final void a(OnStartStreamSession onStartStreamSession) {
    }

    public void a(OnSyncMoreResponse onSyncMoreResponse) {
    }

    public final void a(StringListResponse stringListResponse) {
    }

    public final void a(boolean z) {
    }

    public void b() {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                OnDownloadProgressResponse onDownloadProgressResponse = (OnDownloadProgressResponse) bhx.a(parcel, OnDownloadProgressResponse.CREATOR);
                break;
            case 2:
                a((OnListEntriesResponse) bhx.a(parcel, OnListEntriesResponse.CREATOR));
                break;
            case 3:
                a((OnDriveIdResponse) bhx.a(parcel, OnDriveIdResponse.CREATOR));
                break;
            case 4:
                a((OnMetadataResponse) bhx.a(parcel, OnMetadataResponse.CREATOR));
                break;
            case 5:
                OnContentsResponse onContentsResponse = (OnContentsResponse) bhx.a(parcel, OnContentsResponse.CREATOR);
                break;
            case 6:
                a((Status) bhx.a(parcel, Status.CREATOR));
                break;
            case 7:
                b();
                break;
            case 8:
                a((OnListParentsResponse) bhx.a(parcel, OnListParentsResponse.CREATOR));
                break;
            case 9:
                a((OnSyncMoreResponse) bhx.a(parcel, OnSyncMoreResponse.CREATOR));
                break;
            case 11:
                OnLoadRealtimeResponse onLoadRealtimeResponse = (OnLoadRealtimeResponse) bhx.a(parcel, OnLoadRealtimeResponse.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (!(queryLocalInterface instanceof lmm)) {
                        new lmk(readStrongBinder);
                        break;
                    } else {
                        lmm lmm = (lmm) queryLocalInterface;
                        break;
                    }
                }
                break;
            case 12:
                OnResourceIdSetResponse onResourceIdSetResponse = (OnResourceIdSetResponse) bhx.a(parcel, OnResourceIdSetResponse.CREATOR);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                a((OnPinnedDownloadPreferencesResponse) bhx.a(parcel, OnPinnedDownloadPreferencesResponse.CREATOR));
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                a((OnDeviceUsagePreferenceResponse) bhx.a(parcel, OnDeviceUsagePreferenceResponse.CREATOR));
                break;
            case Service.START_CONTINUATION_MASK:
                bhx.a(parcel);
                break;
            case 16:
                OnFetchThumbnailResponse onFetchThumbnailResponse = (OnFetchThumbnailResponse) bhx.a(parcel, OnFetchThumbnailResponse.CREATOR);
                break;
            case 17:
                ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) bhx.a(parcel, ChangeSequenceNumber.CREATOR);
                break;
            case 18:
                OnChangesResponse onChangesResponse = (OnChangesResponse) bhx.a(parcel, OnChangesResponse.CREATOR);
                break;
            case 20:
                GetPermissionsResponse getPermissionsResponse = (GetPermissionsResponse) bhx.a(parcel, GetPermissionsResponse.CREATOR);
                break;
            case 21:
                StringListResponse stringListResponse = (StringListResponse) bhx.a(parcel, StringListResponse.CREATOR);
                break;
            case 22:
                OnStartStreamSession onStartStreamSession = (OnStartStreamSession) bhx.a(parcel, OnStartStreamSession.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
