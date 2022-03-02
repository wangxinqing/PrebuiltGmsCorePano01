package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.drive.ui.select.path.DriveIdPathElement;
import com.google.android.gms.drive.ui.select.path.PathElement;

/* renamed from: los  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class los implements icm {
    final /* synthetic */ low a;
    private final boolean b;
    private final boolean c;

    public los(low low, boolean z, boolean z2) {
        this.a = low;
        this.b = z;
        this.c = z2;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kus kus = (kus) icl;
        if (kus.a.c()) {
            low low = this.a;
            low.i = true;
            low.h = kus.c;
            low.a.a("query success with moreEntriesMayExist = %b", Boolean.valueOf(this.a.h));
            this.a.a(kus.b, this.b);
            PathElement b2 = this.a.l.b();
            if (b2 instanceof DriveIdPathElement) {
                low low2 = this.a;
                low2.m.a(low2.j, ((DriveIdPathElement) b2).a());
                return;
            }
            return;
        }
        low.a.b("FileListAdapter", "Could not retrieve query result (%s)", kus.a.j);
        if (!this.c) {
            low low3 = this.a;
            low3.i = false;
            low3.f();
            this.a.as();
            lpl lpl = this.a.q;
            if (lpl != null) {
                lpl.a(this.b);
                return;
            }
            return;
        }
        lpl lpl2 = this.a.q;
        if (lpl2 != null) {
            lpl2.a();
        }
        low low4 = this.a;
        if (low4.h) {
            low4.h = false;
            low4.M(low4.f.a());
        }
        Toast.makeText(this.a.n, R.string.drive_empty_doclist_cannot_retrieve, 1).show();
    }
}
