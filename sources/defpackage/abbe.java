package defpackage;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: abbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abbe implements Callable {
    private final ConsentChimeraActivity a;

    public abbe(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object call() {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        return consentChimeraActivity.g.a(consentChimeraActivity.h);
    }
}
