package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Intent;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoSignInSnackbarChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Credential credential = (Credential) ivy.a(intent, "com.google.android.gms.credentials.Credential", Credential.CREATOR);
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(new ContextThemeWrapper(this, R.style.SignInSnackbar)).inflate(R.layout.credential_auto_signin_toast, (ViewGroup) null, false);
        fqy.a(this, snackbarLayout, credential);
        fbo.a(snackbarLayout);
        snackbarLayout.setAccessibilityDelegate(new fqj(this, credential));
        new jml(this, snackbarLayout, 3000).a();
        aucd o = anox.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anox anox = (anox) o.b;
        anox.b = 300;
        int i3 = anox.a | 1;
        anox.a = i3;
        anox.a = i3 | 16;
        anox.f = false;
        fgm.a().a((anox) o.i());
        if (awoe.b()) {
            hol hol = new hol(this, "IDENTITY_GMSCORE", (String) null);
            aucd o2 = anty.n.o();
            String stringExtra = intent.getStringExtra("log_session_id");
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anty anty = (anty) o2.b;
            stringExtra.getClass();
            int i4 = anty.a | 2;
            anty.a = i4;
            anty.c = stringExtra;
            anty.b = 6;
            anty.a = i4 | 1;
            aucd o3 = antt.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            antt antt = (antt) o3.b;
            antt.b = 510;
            antt.a |= 1;
            antt antt2 = (antt) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anty anty2 = (anty) o2.b;
            antt2.getClass();
            anty2.h = antt2;
            anty2.a |= 64;
            hol.a((audx) o2.i()).b();
        }
        stopSelf();
        return 2;
    }
}
