package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmi extends gni {
    final /* synthetic */ PreAddAccountChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gmi(PreAddAccountChimeraActivity preAddAccountChimeraActivity, Context context, boolean z) {
        super(context, z);
        this.a = preAddAccountChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        FrpSnapshot frpSnapshot;
        try {
            frpSnapshot = (FrpSnapshot) new gfi(this.a).a(new gff());
        } catch (RemoteException | InterruptedException e) {
            Log.w("FrpClient", e);
            frpSnapshot = FrpSnapshot.a();
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("loader_result_frp", ivy.a(frpSnapshot));
        return bundle;
    }
}
