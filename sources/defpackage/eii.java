package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: eii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eii implements eil {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public eii(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        biw biw;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            biw = queryLocalInterface instanceof biw ? (biw) queryLocalInterface : new biu(iBinder);
        } else {
            biw = null;
        }
        Bundle a2 = biw.a(this.a, this.b);
        eim.a((Object) a2);
        String string = a2.getString("Error");
        if (a2.getBoolean("booleanResult")) {
            return null;
        }
        throw new eif(string);
    }
}
