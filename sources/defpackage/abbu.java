package defpackage;

import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbu implements amqy {
    private final SignInChimeraActivity a;

    public abbu(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        qal qal = (qal) obj;
        int i = qal.a;
        if (i == -1) {
            return amri.b(6);
        }
        signInChimeraActivity.a(i, qal.b);
        return ampu.a;
    }
}
