package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbq implements amqy {
    public static final amqy a = new abbq();

    private abbq() {
    }

    public final Object a(Object obj) {
        iwd iwd = SignInChimeraActivity.a;
        if (!((Status) obj).c()) {
            SignInChimeraActivity.a.d("Failed to record the consent.", new Object[0]);
        }
        return amri.b(4);
    }
}
