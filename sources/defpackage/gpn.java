package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;

/* renamed from: gpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpn extends gni {
    final /* synthetic */ gqa a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gpn(gqa gqa, Context context) {
        super(context);
        this.a = gqa;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        gfi gfi = new gfi(this.a.getActivity());
        boolean z = false;
        try {
            Boolean bool = (Boolean) gfi.a(new gfe());
            if (bool == null) {
                Log.w("FrpClient", "isChallengeRequired(): null");
            } else {
                z = bool.booleanValue();
            }
        } catch (RemoteException | InterruptedException e) {
            Log.w("FrpClient", e);
        }
        return Pair.create(Boolean.valueOf(z), Boolean.valueOf(gfi.a()));
    }
}
