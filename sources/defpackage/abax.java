package defpackage;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abax implements amqy {
    private final ConsentChimeraActivity a;

    public abax(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        consentChimeraActivity.e.a((Object) 500);
        switch (((qal) obj).a) {
            case 2:
            case 7:
            case 8:
                consentChimeraActivity.a(5, "Unexpected server error");
                return ampu.a;
            case 3:
                consentChimeraActivity.a(3, "Network error");
                return ampu.a;
            case 4:
                consentChimeraActivity.a(3, "App installation failure");
                return ampu.a;
            case 5:
            case 9:
                consentChimeraActivity.a(6, "Device management not supported");
                return ampu.a;
            case 6:
            case 10:
                consentChimeraActivity.a(4, "User canceled");
                return ampu.a;
            default:
                return amri.b(0);
        }
    }
}
