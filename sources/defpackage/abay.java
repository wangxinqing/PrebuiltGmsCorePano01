package defpackage;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abay implements amqy {
    private final ConsentChimeraActivity a;

    public abay(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        consentChimeraActivity.e.a((Object) 501);
        if (((qal) obj).a == -1) {
            return amri.b(0);
        }
        consentChimeraActivity.a(4, "Error setting up the lock screen");
        return ampu.a;
    }
}
