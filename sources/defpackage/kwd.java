package defpackage;

import android.content.IntentSender;
import android.os.IInterface;
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

/* renamed from: kwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface kwd extends IInterface {
    IntentSender a(CreateFileIntentSenderRequest createFileIntentSenderRequest);

    IntentSender a(OpenFileIntentSenderRequest openFileIntentSenderRequest);

    DriveServiceResponse a(OpenContentsRequest openContentsRequest, kwg kwg);

    DriveServiceResponse a(StreamContentsRequest streamContentsRequest, kwg kwg);

    void a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, kwg kwg);

    void a(AddEventListenerRequest addEventListenerRequest, kwj kwj, kwg kwg);

    void a(AddPermissionRequest addPermissionRequest, kwg kwg);

    void a(AuthorizeAccessRequest authorizeAccessRequest, kwg kwg);

    void a(CancelPendingActionsRequest cancelPendingActionsRequest, kwg kwg);

    void a(ChangeResourceParentsRequest changeResourceParentsRequest, kwg kwg);

    void a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, kwg kwg);

    void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, kwg kwg);

    void a(CloseContentsRequest closeContentsRequest, kwg kwg);

    void a(ControlProgressRequest controlProgressRequest, kwg kwg);

    void a(CreateContentsRequest createContentsRequest, kwg kwg);

    void a(CreateFileRequest createFileRequest, kwg kwg);

    void a(CreateFolderRequest createFolderRequest, kwg kwg);

    void a(DeleteResourceRequest deleteResourceRequest, kwg kwg);

    void a(DisconnectRequest disconnectRequest);

    void a(FetchThumbnailRequest fetchThumbnailRequest, kwg kwg);

    void a(GetChangesRequest getChangesRequest, kwg kwg);

    void a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, kwg kwg);

    void a(GetMetadataRequest getMetadataRequest, kwg kwg);

    void a(GetPermissionsRequest getPermissionsRequest, kwg kwg);

    void a(ListParentsRequest listParentsRequest, kwg kwg);

    void a(LoadRealtimeRequest loadRealtimeRequest, kwg kwg);

    void a(QueryRequest queryRequest, kwg kwg);

    void a(QueryRequest queryRequest, kwj kwj, kwg kwg);

    void a(RemoveEventListenerRequest removeEventListenerRequest, kwj kwj, kwg kwg);

    void a(RemovePermissionRequest removePermissionRequest, kwg kwg);

    void a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, kwg kwg);

    void a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, kwg kwg);

    void a(SetResourceParentsRequest setResourceParentsRequest, kwg kwg);

    void a(TrashResourceRequest trashResourceRequest, kwg kwg);

    void a(UnsubscribeResourceRequest unsubscribeResourceRequest, kwg kwg);

    void a(UntrashResourceRequest untrashResourceRequest, kwg kwg);

    void a(UpdateMetadataRequest updateMetadataRequest, kwg kwg);

    void a(UpdatePermissionRequest updatePermissionRequest, kwg kwg);

    void a(kwg kwg);

    void a(kwj kwj, kwg kwg);

    void b(QueryRequest queryRequest, kwg kwg);

    void b(kwg kwg);

    void c(kwg kwg);

    void d(kwg kwg);

    void e(kwg kwg);

    void f(kwg kwg);

    void g(kwg kwg);

    void h(kwg kwg);
}
