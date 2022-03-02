package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

/* renamed from: loq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class loq implements icm {
    private final low a;

    public loq(low low) {
        this.a = low;
    }

    public final void a(icl icl) {
        low low = this.a;
        Status status = (Status) icl;
        if (!status.c()) {
            low.a.b("FileListAdapter", "Search query failed %s", status.j);
            Toast.makeText(low.n, R.string.drive_empty_doclist_cannot_retrieve, 1).show();
            low.k = null;
        }
    }
}
