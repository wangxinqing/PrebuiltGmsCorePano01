package defpackage;

import android.telephony.PhoneStateListener;
import java.lang.ref.WeakReference;

/* renamed from: eec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eec extends PhoneStateListener {
    private final WeakReference a;

    public eec(eee eee) {
        this.a = new WeakReference(eee);
    }

    public final void onCallStateChanged(int i, String str) {
        eee eee = (eee) this.a.get();
        if (eee != null) {
            eee.b.post(new eeb(eee, i));
        }
    }
}
