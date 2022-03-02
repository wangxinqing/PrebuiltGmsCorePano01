package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: hsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsq extends bhw implements hsr {
    final /* synthetic */ acwd a;

    public hsq() {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    public final void a(Status status, int i) {
        this.a.a((Object) Integer.valueOf(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hsq(acwd acwd) {
        super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), parcel.readInt());
        return true;
    }
}
