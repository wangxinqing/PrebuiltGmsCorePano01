package defpackage;

import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;

/* renamed from: abcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abcf implements amqy {
    private final SignInChimeraActivity a;

    public abcf(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        IOException iOException = (IOException) obj;
        if (((Boolean) abdl.f.c()).booleanValue()) {
            SignInChimeraActivity.a.c("Couldn't fetch app's branding information, but continuing without it.", new Object[0]);
            return amri.b(2);
        }
        SignInChimeraActivity.a.e("Errors encountered when trying to fetch app's branding information", iOException, new Object[0]);
        signInChimeraActivity.a(0, (Intent) null);
        return ampu.a;
    }
}
