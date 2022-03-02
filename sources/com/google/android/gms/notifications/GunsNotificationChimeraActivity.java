package com.google.android.gms.notifications;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GunsNotificationChimeraActivity extends Activity {
    private static final jjg a = jjg.a(iyc.GUNS);

    private final void a() {
        sendOrderedBroadcast(wjl.a(getApplicationContext(), getIntent()), (String) null);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if ("com.google.android.gms.notifications.intents.START_ACTIVITY".equals(intent.getAction())) {
            amew b = wjp.b(intent);
            if (wjp.b(b)) {
                amel amel = b.c;
                if (amel == null) {
                    amel = amel.b;
                }
                amek amek = amel.a;
                if (amek == null) {
                    amek = amek.g;
                }
                if (wjk.a(this, amek)) {
                    a();
                    finish();
                }
            }
            if (!wjp.a(b)) {
                ((anih) a.b()).a("Failed to start webview or intent targe due to invalid payload.");
                a();
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    amen a2 = wjp.a(getIntent());
                    if (a2 != null) {
                        amev amev = a2.e;
                        if (amev == null) {
                            amev = amev.t;
                        }
                        str = amev.j;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Toast.makeText(getApplicationContext(), str, 1).show();
                    }
                } else {
                    amex amex = b.b;
                    if (amex == null) {
                        amex = amex.c;
                    }
                    if (amex.b) {
                        Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.notifications.GunsBrowserActivity");
                        className.setAction("com.google.android.gms.notifications.intents.LOAD_URL");
                        className.putExtras(getIntent().getExtras());
                        startActivity(className);
                    } else {
                        amex amex2 = b.b;
                        if (amex2 == null) {
                            amex2 = amex.c;
                        }
                        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(amex2.a)));
                    }
                    a();
                }
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
