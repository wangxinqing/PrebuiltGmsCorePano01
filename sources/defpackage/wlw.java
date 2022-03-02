package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.SyncStatus;

/* renamed from: wlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wlw extends wzu {
    final /* synthetic */ acwd a;

    public wlw(acwd acwd) {
        this.a = acwd;
    }

    public final void a(int i, SyncStatus syncStatus) {
        ihd.a(new Status(i), syncStatus, this.a);
    }
}
