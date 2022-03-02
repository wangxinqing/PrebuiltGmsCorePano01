package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

/* renamed from: lot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lot implements icm {
    final /* synthetic */ low a;

    public lot(low low) {
        this.a = low;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        int i;
        Status status = (Status) icl;
        if (status.c()) {
            this.a.a(false, true);
            return;
        }
        low.a.b("FileListAdapter", "Could not refresh: %s", status.j);
        if (status.i == 7) {
            i = R.string.drive_menu_sync_fail_no_connection;
        } else {
            i = R.string.drive_menu_sync_fail_generic;
        }
        Toast.makeText(this.a.n, i, 1).show();
        lpl lpl = this.a.q;
        if (lpl != null) {
            lpl.a();
        }
    }
}
