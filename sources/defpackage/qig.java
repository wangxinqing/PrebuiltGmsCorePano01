package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: qig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qig extends qic {
    public qig(qij qij) {
        super(qij, "startWatchingMode");
    }

    public final Bundle a(Bundle bundle) {
        bundle.getString("op");
        bundle.getString("packageName");
        ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable("receiver");
        return new Bundle();
    }
}
