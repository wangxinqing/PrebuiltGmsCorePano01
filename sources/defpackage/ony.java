package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ony  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ony extends ons {
    private final HelpConfig f;
    private final String g;
    private final String h;
    private final String i;

    public ony(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, HelpConfig helpConfig, String str2, String str3, String str4) {
        super("RequestClickToCallOperation", googleHelpChimeraService, str, ojq);
        this.f = helpConfig;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    public final void a(Context context) {
        if (TextUtils.isEmpty(this.g)) {
            Log.w("gH_RequestClickToCallOp", "Requester phone number is required for C2C support.");
            this.e.e();
            return;
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        GoogleHelpChimeraService googleHelpChimeraService = this.a;
        obb.a(googleHelpChimeraService, this.f, googleHelpChimeraService.a(), (String) null, this.g, this.h, this.i, newFuture, newFuture);
        try {
            newFuture.get(axmj.q(), TimeUnit.SECONDS);
            this.e.d();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_RequestClickToCallOp", "C2C support request failed.", e);
            this.e.e();
        }
    }
}
