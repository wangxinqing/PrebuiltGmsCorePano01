package defpackage;

import android.app.ProgressDialog;
import com.google.android.gms.drive.DriveId;

/* renamed from: lon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lon implements icm {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ lop b;

    public lon(lop lop, ProgressDialog progressDialog) {
        this.b = lop;
        this.a = progressDialog;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kvi kvi = (kvi) icl;
        if (kvi.a.c()) {
            DriveId driveId = kvi.b.a;
            this.a.dismiss();
            loo loo = this.b.c;
            if (loo != null) {
                loo.a(0, driveId);
                return;
            }
            return;
        }
        lop.a.b("CreateFolderDialogFragm", "Failed to create folder (%d): %s", Integer.valueOf(kvi.a.i), kvi.a.j);
        this.b.a();
        this.a.dismiss();
        loo loo2 = this.b.c;
        if (loo2 != null) {
            loo2.a(3, (DriveId) null);
        }
    }
}
