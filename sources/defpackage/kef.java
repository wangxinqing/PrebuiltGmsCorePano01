package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Debug;
import android.os.IBinder;
import com.google.android.cast.JGCastService;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import com.google.android.gms.drive.api.ApiChimeraService;
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
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: kef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kef extends kwc implements IBinder.DeathRecipient, niz {
    public static final ith a = new ith("DriveService", "");
    public final ApiChimeraService b;
    public final nix c;
    public final kec d;
    public final List e = new ArrayList();
    public boolean f;
    private final kei g;
    private final kdx h;
    private final nit i;
    private final boolean j;

    public kef(ApiChimeraService apiChimeraService, nix nix, kec kec, kdx kdx, kei kei, nit nit, boolean z) {
        this.b = apiChimeraService;
        this.c = nix;
        this.d = kec;
        this.g = kei;
        this.i = nit;
        this.h = kdx;
        synchronized (kdx.a) {
            kdx.a.add(this);
        }
        this.j = z;
    }

    public final IntentSender a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
        int i2;
        kec kec = this.d;
        khq khq = kec.d;
        lfr lfr = kec.q;
        ApiChimeraService apiChimeraService = this.b;
        iva.a(khq.a((Set) EnumSet.of(jzl.FULL, jzl.FILE)), (Object) "Insufficient scopes");
        MetadataBundle metadataBundle = createFileIntentSenderRequest.a;
        Integer num = createFileIntentSenderRequest.e;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int i3 = createFileIntentSenderRequest.b;
        if (i2 == 0) {
            iva.a(i3 >= 0, (Object) "The request id must be provided.");
        }
        lgc d2 = ((lfv) lfr).d();
        d2.i();
        d2.c(0, 5);
        d2.a(metadataBundle);
        d2.d(i2);
        DriveId driveId = createFileIntentSenderRequest.d;
        String str = createFileIntentSenderRequest.c;
        iva.a((Object) khq, (Object) "app");
        Intent intent = new Intent();
        intent.setClassName(apiChimeraService, "com.google.android.gms.drive.ui.create.CreateFileActivityDelegate");
        intent.putExtra("accountName", khq.a.a);
        intent.putExtra("callerSdkAppId", khq.b);
        intent.putExtra("callerPackageName", khq.c.b);
        intent.putExtra("metadata", metadataBundle);
        intent.putExtra("requestId", i3);
        intent.putExtra("selectedCollectionDriveId", driveId);
        intent.putExtra("dialogTitle", str);
        intent.putExtra("fileType", i2);
        Set a2 = jzl.a((Iterable) khq.e);
        intent.putExtra("clientScopes", (String[]) a2.toArray(new String[a2.size()]));
        IntentSender intentSender = jhg.a((Context) apiChimeraService, intent, (int) JGCastService.FLAG_PRIVATE_DISPLAY).getIntentSender();
        d2.h();
        d2.a();
        return intentSender;
    }

    public final void b(QueryRequest queryRequest, kwg kwg) {
        this.c.a(new khb(this.d, queryRequest, kwg));
    }

    public final void binderDied() {
        a(false);
    }

    public final void c(kwg kwg) {
        this.c.a(new kgg(this.d, kwg));
    }

    public final void d(kwg kwg) {
        this.c.a(new kge(this.d, kwg));
    }

    public final void e(kwg kwg) {
        this.c.a(new kga(this.d, kwg));
    }

    public final void f(kwg kwg) {
        this.c.a(new kfx(this.d, kwg));
    }

    public final void g(kwg kwg) {
        this.c.a(new kgb(this.d, kwg));
    }

    public final void h(kwg kwg) {
        this.c.a(new kfy(this.d, this.g, kwg));
    }

    public final void b(kwg kwg) {
        this.c.a(new kgt(this.d, kwg, lsm.a().j));
    }

    public final IntentSender a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
        kec kec = this.d;
        return kej.a(this.b, kec.d, openFileIntentSenderRequest, kec.q);
    }

    public final DriveServiceResponse a(OpenContentsRequest openContentsRequest, kwg kwg) {
        kgm kgm = new kgm(this.d, this.g, openContentsRequest, lsm.a().G, kwg);
        this.c.a(kgm);
        return new DriveServiceResponse(kgm.f);
    }

    public final DriveServiceResponse a(StreamContentsRequest streamContentsRequest, kwg kwg) {
        kgz kgz = new kgz(this.d, this.g, streamContentsRequest, lsm.a().G, kwg);
        this.c.a(kgz);
        return new DriveServiceResponse(kgz.f);
    }

    public final void a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, kwg kwg) {
        this.c.a(new khc(this.d, realtimeDocumentSyncRequest, kwg));
    }

    public final void a(AddEventListenerRequest addEventListenerRequest, kwj kwj, kwg kwg) {
        this.c.a(new keu(this.d, addEventListenerRequest, kwj, kwg));
    }

    public final void a(AddPermissionRequest addPermissionRequest, kwg kwg) {
        this.c.a(new kev(this.d, addPermissionRequest, kwg));
    }

    public final void a(AuthorizeAccessRequest authorizeAccessRequest, kwg kwg) {
        this.c.a(new kfc(this.d, authorizeAccessRequest, kwg));
    }

    public final void a(CancelPendingActionsRequest cancelPendingActionsRequest, kwg kwg) {
        this.c.a(new kfd(this.d, cancelPendingActionsRequest, kwg));
    }

    public final void a(ChangeResourceParentsRequest changeResourceParentsRequest, kwg kwg) {
        this.c.a(new kfh(this.d, changeResourceParentsRequest, kwg));
    }

    public final void a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, kwg kwg) {
        this.c.a(new kfi(this.d, checkResourceIdsExistRequest, kwg));
    }

    public final void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, kwg kwg) {
        lsm a2 = lsm.a();
        this.c.a(new kfl(this.d, this.g, a2.p, a2.d, a2.o, closeContentsAndUpdateMetadataRequest, kwg));
    }

    public final void a(CloseContentsRequest closeContentsRequest, kwg kwg) {
        Contents contents;
        Boolean bool = closeContentsRequest.b;
        if (bool == null || !bool.booleanValue() || (contents = closeContentsRequest.a) == null) {
            this.c.a(new kfs(this.d, this.g, closeContentsRequest, kwg));
        } else {
            a(new CloseContentsAndUpdateMetadataRequest(contents.d, MetadataBundle.a(), (Contents) null, false, (String) null, 0, contents.b, contents.e, true), kwg);
        }
    }

    public final void a(ControlProgressRequest controlProgressRequest, kwg kwg) {
        this.c.a(new kfn(this.d, controlProgressRequest, kwg));
    }

    public final void a(CreateContentsRequest createContentsRequest, kwg kwg) {
        this.c.a(new kfo(this.d, this.g, createContentsRequest, kwg));
    }

    public final void a(CreateFileRequest createFileRequest, kwg kwg) {
        this.c.a(new kfp(this.d, this.g, lsm.a().d, createFileRequest, kwg));
    }

    public final void a(CreateFolderRequest createFolderRequest, kwg kwg) {
        this.c.a(new kfq(this.d, createFolderRequest, kwg));
    }

    public final void a(DeleteResourceRequest deleteResourceRequest, kwg kwg) {
        this.c.a(new kfr(this.d, deleteResourceRequest, kwg));
    }

    public final void a(DisconnectRequest disconnectRequest) {
        this.c.a(new kft(this.d, new ked(), this));
    }

    public final void a(FetchThumbnailRequest fetchThumbnailRequest, kwg kwg) {
        this.c.a(new kfv(this.d, fetchThumbnailRequest, kwg));
    }

    public final void a(GetChangesRequest getChangesRequest, kwg kwg) {
        this.c.a(new kfw(this.d, getChangesRequest, kwg));
    }

    public final void a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, kwg kwg) {
        this.c.a(new kfz(this.d, getDriveIdFromUniqueIdentifierRequest, kwg));
    }

    public final void a(GetMetadataRequest getMetadataRequest, kwg kwg) {
        this.c.a(new kgc(this.d, getMetadataRequest, kwg));
    }

    public final void a(GetPermissionsRequest getPermissionsRequest, kwg kwg) {
        this.c.a(new kgd(this.d, getPermissionsRequest, kwg));
    }

    public final void a(ListParentsRequest listParentsRequest, kwg kwg) {
        this.c.a(new kgh(this.d, listParentsRequest, kwg));
    }

    public final void a(LoadRealtimeRequest loadRealtimeRequest, kwg kwg) {
        nix nix = this.c;
        kec kec = this.d;
        nix.a(new kgk(kec, this, loadRealtimeRequest, kwg, kec.k));
    }

    public final void a(QueryRequest queryRequest, kwg kwg) {
        this.c.a(new kgo(this.d, queryRequest, kwg));
    }

    public final void a(QueryRequest queryRequest, kwj kwj, kwg kwg) {
        this.c.a(new kgx(this.d, queryRequest, kwj, kwg));
    }

    public final void a(RemoveEventListenerRequest removeEventListenerRequest, kwj kwj, kwg kwg) {
        this.c.a(new kgp(this.d, removeEventListenerRequest, kwj, kwg));
    }

    public final void a(RemovePermissionRequest removePermissionRequest, kwg kwg) {
        this.c.a(new kgq(this.d, removePermissionRequest, kwg));
    }

    public final void a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, kwg kwg) {
        this.c.a(new kgu(this.d, setFileUploadPreferencesRequest, kwg));
    }

    public final void a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, kwg kwg) {
        this.c.a(new kgv(this.d, setPinnedDownloadPreferencesRequest, kwg));
    }

    public final void a(SetResourceParentsRequest setResourceParentsRequest, kwg kwg) {
        this.c.a(new kgw(this.d, setResourceParentsRequest, kwg));
    }

    public final void a(TrashResourceRequest trashResourceRequest, kwg kwg) {
        this.c.a(new khd(this.d, trashResourceRequest, kwg));
    }

    public final void a(UnsubscribeResourceRequest unsubscribeResourceRequest, kwg kwg) {
        this.c.a(new khe(this.d, unsubscribeResourceRequest, kwg));
    }

    public final void a(UntrashResourceRequest untrashResourceRequest, kwg kwg) {
        this.c.a(new khf(this.d, untrashResourceRequest, kwg));
    }

    public final void a(UpdateMetadataRequest updateMetadataRequest, kwg kwg) {
        this.c.a(new khg(this.d, updateMetadataRequest, kwg));
    }

    public final void a(UpdatePermissionRequest updatePermissionRequest, kwg kwg) {
        this.c.a(new khh(this.d, updatePermissionRequest, kwg));
    }

    public final void a(kwg kwg) {
        this.c.a(new kfm(this.d, kwg));
    }

    public final void a(kwj kwj, kwg kwg) {
        this.c.a(new kgr(this.d, kwj, kwg));
    }

    public final void a(boolean z) {
        try {
            this.d.i();
            kdx kdx = this.h;
            synchronized (kdx.a) {
                kdx.a.remove(this);
            }
            synchronized (this.e) {
                for (keo a2 : this.e) {
                    a2.a();
                }
                this.e.clear();
                this.f = true;
            }
            if (z) {
                this.i.a.asBinder().unlinkToDeath(this, 0);
            }
            if (this.j) {
                Debug.stopMethodTracing();
            }
        } catch (Throwable th) {
            if (this.j) {
                Debug.stopMethodTracing();
            }
            throw th;
        }
    }
}
