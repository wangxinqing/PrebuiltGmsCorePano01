package defpackage;

import android.os.Parcel;

/* renamed from: vyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyp extends bhw implements vyq {
    final /* synthetic */ acwd a;

    public vyp() {
        super("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
    }

    public final void a(String str) {
        this.a.a((Object) str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vyp(acwd acwd) {
        super("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readString());
        return true;
    }
}
