package defpackage;

import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

/* renamed from: fqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqw implements aora {
    final /* synthetic */ eug a;
    final /* synthetic */ CredentialPickerChimeraActivity b;

    public fqw(CredentialPickerChimeraActivity credentialPickerChimeraActivity, eug eug) {
        this.b = credentialPickerChimeraActivity;
        this.a = eug;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.c = amzy.a((Object) (IdToken) obj);
        this.b.a(-1, 201, this.a.a());
    }

    public final void a(Throwable th) {
        this.b.a(-1, 101, this.a.a());
    }
}
