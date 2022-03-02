package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.google.android.gms.R;
import com.google.android.gms.drive.DriveId;

/* renamed from: lok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lok implements DialogInterface.OnClickListener {
    final /* synthetic */ lop a;

    public lok(lop lop) {
        this.a = lop;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        kvp kvp;
        lop lop = this.a;
        lop.d = true;
        String obj = lop.b.getText().toString();
        ProgressDialog show = ProgressDialog.show(loc.a(lop.getActivity()), "", lop.getString(R.string.drive_creating_folder), true);
        jzu jzu = new jzu();
        iva.a((Object) obj, (Object) "Title cannot be null.");
        jzu.a.b(lce.Q, obj);
        iva.a((Object) "application/vnd.google-apps.folder");
        jzu.a.b(lce.N, "application/vnd.google-apps.folder");
        jzv jzv = new jzv(jzu.a);
        icc icc = ((lnx) lop.getActivity()).a;
        if (!icc.i()) {
            lop.a.c("CreateFolderDialogFragm", "Client is not in connected state");
            lop.a();
            show.dismiss();
            loo loo = lop.c;
            if (loo != null) {
                loo.a(3, (DriveId) null);
                return;
            }
            return;
        }
        if (lop.e != null) {
            kvp = jzf.e.a(icc, lop.e);
        } else {
            kvp = jzf.e.a(icc);
        }
        if (jzv.a() == null || jzv.a().equals("application/vnd.google-apps.folder")) {
            icc.b((idf) new kvj(kvp, icc, jzv)).a((icm) new lon(lop, show));
            return;
        }
        throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
    }
}
