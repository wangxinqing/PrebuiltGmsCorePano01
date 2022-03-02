package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoSignInWarmWelcomeChimeraService extends Service implements View.OnClickListener {
    public jml a;
    private String b;
    private hol c;

    private final void a(int i) {
        if (awoe.b()) {
            hol hol = this.c;
            aucd o = anty.n.o();
            String str = this.b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anty anty = (anty) o.b;
            str.getClass();
            int i2 = anty.a | 2;
            anty.a = i2;
            anty.c = str;
            anty.b = 6;
            anty.a = i2 | 1;
            aucd o2 = antt.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            antt antt = (antt) o2.b;
            antt.b = i - 1;
            antt.a |= 1;
            antt antt2 = (antt) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anty anty2 = (anty) o.b;
            antt2.getClass();
            anty2.h = antt2;
            anty2.a |= 64;
            hol.a((audx) o.i()).b();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.common_got_it) {
            view.postDelayed(new fqk(this), 400);
            aucd o = anox.h.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anox anox = (anox) o.b;
            anox.b = 302;
            int i = anox.a | 1;
            anox.a = i;
            anox.a = i | 16;
            anox.f = true;
            fgm.a().a((anox) o.i());
            a(304);
        } else if (view.getId() == R.id.credentials_learn_more) {
            Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse((String) fdj.e.c())).addFlags(268435456);
            if (addFlags.resolveActivity(getPackageManager()) != null) {
                startActivity(addFlags);
            } else {
                Toast.makeText(this, getResources().getString(R.string.common_no_browser_found), 1).show();
            }
            aucd o2 = anox.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anox anox2 = (anox) o2.b;
            anox2.b = 301;
            int i2 = anox2.a | 1;
            anox2.a = i2;
            anox2.a = i2 | 16;
            anox2.f = true;
            fgm.a().a((anox) o2.i());
            a(303);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent.getStringExtra("log_session_id");
        iva.a((Object) stringExtra);
        this.b = stringExtra;
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(new ContextThemeWrapper(this, R.style.SignInWarmWelcome)).inflate(R.layout.credential_auto_signin_warm_welcome, (ViewGroup) null, false);
        fqy.a(this, snackbarLayout, (Credential) ivy.a(intent, "com.google.android.gms.credentials.Credential", Credential.CREATOR));
        snackbarLayout.findViewById(R.id.common_got_it).setOnClickListener(this);
        View findViewById = snackbarLayout.findViewById(R.id.credentials_learn_more);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.a = new jml(this, snackbarLayout, 0, (byte[]) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = 2;
        layoutParams.dimAmount = 0.7f;
        jml jml = this.a;
        jml.e = layoutParams;
        jml.a();
        eul.a(this, ffx.a(this.b).a()).a();
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
        anox.f = true;
        fgm.a().a((anox) o.i());
        this.c = new hol(this, "IDENTITY_GMSCORE", (String) null);
        a(302);
        stopSelf();
        return 2;
    }
}
