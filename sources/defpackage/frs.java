package defpackage;

import android.widget.Toast;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class frs implements aora {
    final /* synthetic */ String a;
    final /* synthetic */ CredentialsSettingsChimeraActivity b;

    public frs(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, String str) {
        this.b = credentialsSettingsChimeraActivity;
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        this.b.f();
    }

    public final void a(Throwable th) {
        this.b.e();
        this.b.f();
        Toast.makeText(this.b.getContainerActivity(), this.a, 1).show();
    }
}
