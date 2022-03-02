package defpackage;

/* renamed from: lov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lov implements icm {
    final /* synthetic */ low a;

    public lov(low low) {
        this.a = low;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kve kve = (kve) icl;
        if (kve.a.c()) {
            low.a.b("Sync more success, requerying");
            this.a.a(false, true);
            return;
        }
        low.a.b("FileListAdapter", "Could not sync more (%s)", kve.a.j);
        low low = this.a;
        low.h = false;
        low.M(low.f.a());
    }
}
