package defpackage;

import android.os.Parcel;

/* renamed from: rsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsx extends bhw implements rsy {
    final /* synthetic */ alec a;

    public rsx() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.a.a.a.e.b(true);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rsx(alec alec) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
        this.a = alec;
    }
}
