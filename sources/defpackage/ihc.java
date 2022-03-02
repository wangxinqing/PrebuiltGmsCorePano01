package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ihc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ihc implements acvf {
    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        if (((Boolean) acwa.d()).booleanValue()) {
            return null;
        }
        throw new ibr(new Status(13, "listener already unregistered"));
    }
}
