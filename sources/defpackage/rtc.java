package defpackage;

import android.os.Parcel;

/* renamed from: rtc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rtc extends bhw implements rtd {
    final /* synthetic */ aleb a;

    public rtc() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        parcel.readInt();
        this.a.a.a.e.b(false);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rtc(aleb aleb) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        this.a = aleb;
    }
}
