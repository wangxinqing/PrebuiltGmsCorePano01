package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Intent;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.SnackbarLayout;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoSaveSnackbarChimeraService extends Service {
    public static final long a = TimeUnit.SECONDS.toMillis(3);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(new ContextThemeWrapper(this, R.style.SignInSnackbar)).inflate(R.layout.credential_auto_save_toast, (ViewGroup) null, false);
        fbo.a(snackbarLayout);
        snackbarLayout.setAccessibilityDelegate(new fqi(this));
        new jml(this, snackbarLayout, a).a();
        stopSelf();
        return 2;
    }
}
