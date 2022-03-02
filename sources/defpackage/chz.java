package defpackage;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;

/* renamed from: chz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class chz extends bva {
    final /* synthetic */ cif a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chz(cif cif, String str, Object... objArr) {
        super(str, objArr);
        this.a = cif;
    }

    public final void a(Exception exc) {
        int i;
        cif cif = this.a;
        if (exc instanceof ibr) {
            i = ((ibr) exc).a();
        } else {
            i = 8;
        }
        cif.a(i, (Snapshot) null);
    }
}
