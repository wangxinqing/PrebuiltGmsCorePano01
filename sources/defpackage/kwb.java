package defpackage;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import com.google.android.gms.drive.internal.AddEventListenerRequest;
import com.google.android.gms.drive.internal.AddPermissionRequest;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;
import com.google.android.gms.drive.internal.CancelPendingActionsRequest;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import com.google.android.gms.drive.internal.CheckResourceIdsExistRequest;
import com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest;
import com.google.android.gms.drive.internal.CloseContentsRequest;
import com.google.android.gms.drive.internal.ControlProgressRequest;
import com.google.android.gms.drive.internal.CreateContentsRequest;
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.internal.CreateFolderRequest;
import com.google.android.gms.drive.internal.DeleteResourceRequest;
import com.google.android.gms.drive.internal.DisconnectRequest;
import com.google.android.gms.drive.internal.DriveServiceResponse;
import com.google.android.gms.drive.internal.FetchThumbnailRequest;
import com.google.android.gms.drive.internal.GetChangesRequest;
import com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest;
import com.google.android.gms.drive.internal.GetMetadataRequest;
import com.google.android.gms.drive.internal.GetPermissionsRequest;
import com.google.android.gms.drive.internal.ListParentsRequest;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;
import com.google.android.gms.drive.internal.OpenContentsRequest;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.internal.RemoveEventListenerRequest;
import com.google.android.gms.drive.internal.RemovePermissionRequest;
import com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;
import com.google.android.gms.drive.internal.SetResourceParentsRequest;
import com.google.android.gms.drive.internal.StreamContentsRequest;
import com.google.android.gms.drive.internal.TrashResourceRequest;
import com.google.android.gms.drive.internal.UnsubscribeResourceRequest;
import com.google.android.gms.drive.internal.UntrashResourceRequest;
import com.google.android.gms.drive.internal.UpdateMetadataRequest;
import com.google.android.gms.drive.internal.UpdatePermissionRequest;

/* renamed from: kwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwb extends bhv implements kwd {
    public kwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
    }

    public final IntentSender a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
        throw null;
    }

    public final IntentSender a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
        throw null;
    }

    public final DriveServiceResponse a(OpenContentsRequest openContentsRequest, kwg kwg) {
        throw null;
    }

    public final DriveServiceResponse a(StreamContentsRequest streamContentsRequest, kwg kwg) {
        throw null;
    }

    public final void a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, kwg kwg) {
        throw null;
    }

    public final void a(AddEventListenerRequest addEventListenerRequest, kwj kwj, kwg kwg) {
        throw null;
    }

    public final void a(AddPermissionRequest addPermissionRequest, kwg kwg) {
        throw null;
    }

    public final void a(CancelPendingActionsRequest cancelPendingActionsRequest, kwg kwg) {
        throw null;
    }

    public final void a(ChangeResourceParentsRequest changeResourceParentsRequest, kwg kwg) {
        throw null;
    }

    public final void a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, kwg kwg) {
        throw null;
    }

    public final void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, kwg kwg) {
        throw null;
    }

    public final void a(CloseContentsRequest closeContentsRequest, kwg kwg) {
        throw null;
    }

    public final void a(ControlProgressRequest controlProgressRequest, kwg kwg) {
        throw null;
    }

    public final void a(CreateContentsRequest createContentsRequest, kwg kwg) {
        throw null;
    }

    public final void a(DeleteResourceRequest deleteResourceRequest, kwg kwg) {
        throw null;
    }

    public final void a(FetchThumbnailRequest fetchThumbnailRequest, kwg kwg) {
        throw null;
    }

    public final void a(GetChangesRequest getChangesRequest, kwg kwg) {
        throw null;
    }

    public final void a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, kwg kwg) {
        throw null;
    }

    public final void a(GetPermissionsRequest getPermissionsRequest, kwg kwg) {
        throw null;
    }

    public final void a(LoadRealtimeRequest loadRealtimeRequest, kwg kwg) {
        throw null;
    }

    public final void a(RemoveEventListenerRequest removeEventListenerRequest, kwj kwj, kwg kwg) {
        throw null;
    }

    public final void a(RemovePermissionRequest removePermissionRequest, kwg kwg) {
        throw null;
    }

    public final void a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, kwg kwg) {
        throw null;
    }

    public final void a(SetResourceParentsRequest setResourceParentsRequest, kwg kwg) {
        throw null;
    }

    public final void a(TrashResourceRequest trashResourceRequest, kwg kwg) {
        throw null;
    }

    public final void a(UnsubscribeResourceRequest unsubscribeResourceRequest, kwg kwg) {
        throw null;
    }

    public final void a(UntrashResourceRequest untrashResourceRequest, kwg kwg) {
        throw null;
    }

    public final void a(UpdateMetadataRequest updateMetadataRequest, kwg kwg) {
        throw null;
    }

    public final void a(UpdatePermissionRequest updatePermissionRequest, kwg kwg) {
        throw null;
    }

    public final void a(kwg kwg) {
        throw null;
    }

    public final void b(QueryRequest queryRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) queryRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(19, aQ);
    }

    public final void c(kwg kwg) {
        throw null;
    }

    public final void d(kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) kwg);
        b(32, aQ);
    }

    public final void e(kwg kwg) {
        throw null;
    }

    public final void f(kwg kwg) {
        throw null;
    }

    public final void g(kwg kwg) {
        throw null;
    }

    public final void h(kwg kwg) {
        throw null;
    }

    public final void b(kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) kwg);
        b(9, aQ);
    }

    public final void a(AuthorizeAccessRequest authorizeAccessRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) authorizeAccessRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(12, aQ);
    }

    public final void a(CreateFileRequest createFileRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) createFileRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(5, aQ);
    }

    public final void a(CreateFolderRequest createFolderRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) createFolderRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(6, aQ);
    }

    public final void a(DisconnectRequest disconnectRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) disconnectRequest);
        b(16, aQ);
    }

    public final void a(GetMetadataRequest getMetadataRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getMetadataRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(1, aQ);
    }

    public final void a(ListParentsRequest listParentsRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) listParentsRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(13, aQ);
    }

    public final void a(QueryRequest queryRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) queryRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(2, aQ);
    }

    public final void a(QueryRequest queryRequest, kwj kwj, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) queryRequest);
        bhx.a(aQ, (IInterface) kwj);
        bhx.a(aQ, (IInterface) kwg);
        b(51, aQ);
    }

    public final void a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) setPinnedDownloadPreferencesRequest);
        bhx.a(aQ, (IInterface) kwg);
        b(33, aQ);
    }

    public final void a(kwj kwj, kwg kwg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) kwj);
        bhx.a(aQ, (IInterface) kwg);
        b(52, aQ);
    }
}
