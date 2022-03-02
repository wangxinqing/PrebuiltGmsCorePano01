package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: qih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qih extends qic {
    public qih(qij qij) {
        super(qij, "stopWatchingMode");
    }

    public final Bundle a(Bundle bundle) {
        ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable("receiver");
        return new Bundle();
    }
}
