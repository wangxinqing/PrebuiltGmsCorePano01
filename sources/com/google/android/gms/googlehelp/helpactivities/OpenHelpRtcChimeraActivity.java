package com.google.android.gms.googlehelp.helpactivities;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenHelpRtcChimeraActivity extends Activity {
    private aoru a;
    private okc b;
    private boolean c = false;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class OnPackageChangeOperation extends IntentOperation {
        public final void onHandleIntent(Intent intent) {
            String str;
            String action = intent.getAction();
            if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) {
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = "";
                }
                if (str != null && "com.google.android.apps.helprtc".equals(str)) {
                    Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity")).addFlags(268435456);
                    addFlags.putExtra("launch_source_key", "launch_source_package_update_value");
                    addFlags.putExtra("package_change_type_key", action);
                    startActivity(addFlags);
                }
            }
        }
    }

    public static String a(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("invitationId");
        }
        return null;
    }

    private final void b() {
        String str;
        if (!a() || ((long) new ocu(this).a()) <= axmj.p()) {
            a(getIntent().getExtras().getString("invitationId"), !a() ? 155 : 156);
            String a2 = a(getIntent().getExtras());
            Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
            className.putExtra("play_store_key", "play_store_value");
            className.putExtra("invitationId", a2);
            PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 10104, className, 134217728);
            Context applicationContext = getApplicationContext();
            iwq a3 = iwq.a(applicationContext);
            je jeVar = new je(applicationContext, "open_helprtc_channel_id");
            jeVar.e(getString(R.string.gh_notify_install_google_support_services_title));
            jeVar.j = 1;
            jeVar.a(3);
            jeVar.b(hdg.a(this, R.drawable.quantum_ic_brightness_1_googblue_24));
            jeVar.b((CharSequence) getString(R.string.gh_notify_install_google_support_services_content));
            jeVar.f = activity;
            jeVar.a(true);
            if (Build.VERSION.SDK_INT >= 26 && a3.a("open_helprtc_channel_id") == null) {
                if (ofq.b(axqk.b())) {
                    str = getString(R.string.gh_top_appbar_support_label);
                } else {
                    str = "open helprtc channel name";
                }
                a3.a(new NotificationChannel("open_helprtc_channel_id", str, 4));
            }
            a3.a(4104, jeVar.b());
            moveTaskToBack(true);
            return;
        }
        Intent addFlags = new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")).addFlags(805306368);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            for (String str2 : extras.keySet()) {
                Object obj = extras.get(str2);
                if (obj != null) {
                    addFlags.putExtra(str2, obj.toString());
                }
            }
        }
        try {
            startActivity(addFlags);
        } catch (Exception e) {
            Log.e("gH_OpenHelpRtcActivity", "Unable to start the screenshare activity.", e);
        } catch (Throwable th) {
            finishAndRemoveTask();
            throw th;
        }
        finishAndRemoveTask();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int a2 = new ocu(this).a();
            long j = (long) a2;
            long p = axmj.p();
            if (a2 <= 0 || j <= p) {
                if (getIntent() != null) {
                    bundle = getIntent().getExtras();
                } else {
                    bundle = null;
                }
                String a3 = a(bundle);
                HelpConfig helpConfig = new HelpConfig();
                helpConfig.b = "com.google.android.apps.helprtc";
                helpConfig.e = okg.a(a3);
                Context applicationContext = getApplicationContext();
                if (this.a == null) {
                    this.a = jfm.a(9);
                }
                aoru aoru = this.a;
                aoru.execute(new omm(applicationContext, helpConfig, a3, aoru, this.b));
                if (a2 > 0) {
                    i3 = 161;
                } else {
                    i3 = 160;
                }
                a(a3, i3);
                Toast.makeText(this, getString(R.string.gh_google_support_services_not_installed), 1).show();
                finishAndRemoveTask();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = new okc(this);
        requestWindowFeature(1);
        if (a(getIntent())) {
            b();
        } else {
            finishAndRemoveTask();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        okc okc = this.b;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    private final void a(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.helprtc"));
            this.c = true;
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
            a(str, 157);
            String string = getString(R.string.gh_play_store_activity_or_browser_not_found);
            Log.e("gH_OpenHelpRtcActivity", string, e);
            Toast.makeText(this, string, 1).show();
            finishAndRemoveTask();
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        int i;
        super.onNewIntent(intent);
        if (a(intent) && this.c) {
            startActivity(intent);
        } else if (a(intent) && !this.c) {
            setIntent(intent);
            b();
        } else if (intent.getExtras() != null && "play_store_value".equals(intent.getExtras().getString("play_store_key"))) {
            a(intent.getExtras().getString("invitationId"));
        } else if (intent.getExtras() != null && "launch_source_package_update_value".equals(intent.getExtras().getString("launch_source_key"))) {
            String a2 = a(getIntent().getExtras());
            if (!"android.intent.action.PACKAGE_CHANGED".equals(intent.getExtras().getString("package_change_type_key"))) {
                i = 158;
            } else {
                i = 159;
            }
            a(a2, i);
            b();
        }
    }

    private static boolean a(Intent intent) {
        return intent.getExtras() != null && "launch_source_gcm_value".equals(intent.getExtras().getString("launch_source_key"));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i) {
        MetricsIntentOperation.a(getApplicationContext(), okg.a(str), "com.google.android.apps.helprtc", 108, i, true);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return new ocu(this).a() > 0;
    }
}
