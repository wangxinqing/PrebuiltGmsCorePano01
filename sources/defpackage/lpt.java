package defpackage;

import com.google.android.gms.drive.ui.select.Selection;

/* renamed from: lpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpt implements icm {
    final /* synthetic */ Selection a;

    public lpt(Selection selection) {
        this.a = selection;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kvn kvn = (kvn) icl;
        if (kvn.a.c()) {
            this.a.b(kvn.b);
            return;
        }
        Selection.a.b("Selection", "Could not get metadata for %s (%s)", this.a.c, kvn.a.j);
    }
}
