package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: oje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oje extends ojk {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;
    final /* synthetic */ GoogleHelp c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oje(icc icc, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(icc);
        this.a = bundle;
        this.b = j;
        this.c = googleHelp;
    }

    /* access modifiers changed from: protected */
    public final void a(ojt ojt) {
        try {
            ojt.b(this.a, this.b, this.c, (ojq) new ojd(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            c(ojl.a);
        }
    }
}
