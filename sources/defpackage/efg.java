package defpackage;

import android.os.Parcel;

/* renamed from: efg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class efg extends bhw implements efh {
    final /* synthetic */ ige a;

    public efg() {
        super("com.google.android.gms.audiomodem.internal.ISnoopCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
        } else if (i != 2) {
            return false;
        } else {
            c();
        }
        parcel2.writeNoException();
        return true;
    }

    public final void b() {
        this.a.a(new ecr());
    }

    public final void c() {
        this.a.a(new ecs());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public efg(ige ige) {
        super("com.google.android.gms.audiomodem.internal.ISnoopCallback");
        this.a = ige;
    }
}
