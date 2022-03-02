package defpackage;

import com.google.android.gms.family.webview.FamilyWebViewChimeraActivity;

/* renamed from: mqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mqq implements acvs {
    private final FamilyWebViewChimeraActivity a;

    public mqq(FamilyWebViewChimeraActivity familyWebViewChimeraActivity) {
        this.a = familyWebViewChimeraActivity;
    }

    public final void a(Exception exc) {
        FamilyWebViewChimeraActivity familyWebViewChimeraActivity = this.a;
        mfv.f("FamilyWebViewChimeraActivity", "Webview initialization failed:", exc);
        familyWebViewChimeraActivity.a();
    }
}
