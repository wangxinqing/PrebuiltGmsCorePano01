package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ytr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytr extends bhw implements IInterface {
    final /* synthetic */ yzz a;

    public ytr() {
        super("com.google.android.gms.plus.internal.IPlusOneDelegate");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ytr(yzz yzz) {
        super("com.google.android.gms.plus.internal.IPlusOneDelegate");
        this.a = yzz;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        PendingIntent pendingIntent = null;
        if (i == 1) {
            yzz yzz = this.a;
            Uri uri = yzz.i;
            ConnectionResult connectionResult = yzz.t;
            if (connectionResult != null) {
                pendingIntent = connectionResult.d;
            }
            parcel2.writeNoException();
            bhx.b(parcel2, pendingIntent);
        } else if (i == 2) {
            yzz yzz2 = this.a;
            yzz2.a = false;
            yzz2.a(yzz2.s);
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            yzz yzz3 = this.a;
            yzz3.x = false;
            Uri uri2 = yzz.i;
            yzz3.t = null;
            if (yzz3.f() || this.a.p.m()) {
                this.a.p.j();
            }
            this.a.p.t();
            parcel2.writeNoException();
        }
        return true;
    }
}
