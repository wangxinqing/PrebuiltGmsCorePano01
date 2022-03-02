package defpackage;

import android.os.Parcel;

/* renamed from: efk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efk extends bhw implements efl {
    final /* synthetic */ ige a;

    public efk() {
        super("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
    }

    public final void a(int i) {
        this.a.a(new ect());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public efk(ige ige) {
        super("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
        this.a = ige;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
