package defpackage;

import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;

/* renamed from: rzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rzt implements Runnable {
    private final MdhFootprintListSafeParcelable a;
    private final sag b;

    public rzt(sag sag, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        this.b = sag;
        this.a = mdhFootprintListSafeParcelable;
    }

    public final void run() {
        sag sag = this.b;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = this.a;
        if (sag.a) {
            afil afil = sag.b;
            afil.b.a(afie.a((MdhFootprint) mdhFootprintListSafeParcelable.a.get(0), afil.a));
        }
    }
}
