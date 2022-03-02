package com.google.android.gms.appinvite.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppInviteInstallIntentOperation extends IntentOperation {
    private dwe a = null;

    public AppInviteInstallIntentOperation() {
    }

    public final void onCreate() {
        if (this.a == null) {
            this.a = new dwe(this, (String) null);
        }
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            String action2 = intent.getAction();
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                Log.e("AppInstallOperation", "Package name not found in the intent.");
            } else if (!eau.c(this, str)) {
            } else {
                if (action2.equals("android.intent.action.PACKAGE_FULLY_REMOVED")) {
                    eau.b(this, str);
                } else if (!eau.a("loggerInstallEvent", true, this, str)) {
                    eau.b("loggerInstallEvent", this, str);
                    dwe dwe = this.a;
                    if (dwe.a && !dwe.c.i() && !dwe.c.j()) {
                        dwe.c.a(5000, TimeUnit.MILLISECONDS);
                    }
                    dwe dwe2 = this.a;
                    int m = eau.m(this, str);
                    int i = !eau.a("isInlineInstall", false, this, str) ? 2 : 3;
                    boolean a2 = eau.a("launchFromContinueUrl", false, this, str);
                    boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                    String h = eau.h(this, str);
                    int a3 = avgz.a(eau.i(this, str));
                    String j = eau.j(this, str);
                    String k = eau.k(this, str);
                    String l = eau.l(this, str);
                    aucd o = anrc.h.o();
                    if (!TextUtils.isEmpty(str)) {
                        aucd o2 = anrr.c.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        anrr anrr = (anrr) o2.b;
                        str.getClass();
                        anrr.a |= 2;
                        anrr.b = str;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anrc anrc = (anrc) o.b;
                        anrr anrr2 = (anrr) o2.i();
                        anrr2.getClass();
                        anrc.b = anrr2;
                        anrc.a |= 1;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    anrc anrc2 = (anrc) o.b;
                    int i2 = m - 1;
                    if (m != 0) {
                        anrc2.c = i2;
                        int i3 = anrc2.a | 2;
                        anrc2.a = i3;
                        anrc2.d = i - 1;
                        int i4 = i3 | 4;
                        anrc2.a = i4;
                        anrc2.a = i4 | 8;
                        anrc2.e = a2;
                        if (!TextUtils.isEmpty(j) || !TextUtils.isEmpty(k)) {
                            anrm a4 = dwe.a(j, k, h, a3, "");
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            anrc anrc3 = (anrc) o.b;
                            a4.getClass();
                            anrc3.f = a4;
                            anrc3.a |= 32;
                        }
                        int a5 = dwe.a(true, booleanExtra);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anrc anrc4 = (anrc) o.b;
                        anrc4.g = a5 - 1;
                        anrc4.a |= 64;
                        dwe2.a((anrc) o.i(), 11, l);
                        ClientContext clientContext = new ClientContext();
                        clientContext.b = getApplicationInfo().uid;
                        clientContext.e = getPackageName();
                        clientContext.f = getPackageName();
                        try {
                            new dwx(clientContext, dwj.a((Context) this), new dwd(this), eau.a("invitationId", this, str), (dwm) null).a(this);
                        } catch (RemoteException | jbk e) {
                            apev.a(e);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    AppInviteInstallIntentOperation(Context context, dwe dwe) {
        attachBaseContext(context);
        this.a = dwe;
    }
}
