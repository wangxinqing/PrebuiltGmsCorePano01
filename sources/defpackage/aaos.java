package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* renamed from: aaos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaos implements acvv {
    final /* synthetic */ aaot a;

    public aaos(aaot aaot) {
        this.a = aaot;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.a(new Status(0), ((RecaptchaResultData) obj).a);
        } catch (RemoteException e) {
            this.a.a((Exception) e);
        }
    }
}
