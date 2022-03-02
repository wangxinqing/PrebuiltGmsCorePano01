package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.firstparty.shared.LatencyTracker;

/* renamed from: gfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gfw extends FragmentActivity {
    private boolean a;
    protected final String b;
    protected LatencyTracker c;
    protected boolean d;
    protected boolean e;

    public gfw() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        this.b = sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String string;
        LatencyTracker latencyTracker;
        Intent intent = getIntent();
        if (bundle != null) {
            LatencyTracker latencyTracker2 = (LatencyTracker) bundle.getParcelable("latency.tracker");
            this.c = latencyTracker2;
            if (latencyTracker2 == null) {
                this.c = LatencyTracker.a("session").b(getClass().getSimpleName());
            }
        } else {
            if (intent != null) {
                latencyTracker = (LatencyTracker) intent.getParcelableExtra("latency.tracker");
            } else {
                latencyTracker = null;
            }
            if (latencyTracker == null) {
                latencyTracker = LatencyTracker.a("session");
            }
            this.c = latencyTracker.b(getClass().getSimpleName());
        }
        if (bundle != null) {
            str = "Icicle";
        } else {
            str = "Intent";
        }
        if (str.length() == 0) {
            new String("onCreate() with ");
        } else {
            "onCreate() with ".concat(str);
        }
        super.onCreate(bundle);
        int i = getResources().getConfiguration().screenLayout;
        if (bundle == null) {
            bundle = getIntent().getExtras();
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.containsKey("notificationId") && (string = bundle.getString("notificationId")) != null) {
                if (string.indexOf("-") > 0) {
                    iwq.a((Context) this).a(string, 1);
                } else {
                    iwq.a((Context) this).a(string, 2);
                }
                setResult(0);
                finish();
                return;
            }
        }
        this.a = bundle.getBoolean("showingProgressDialog", false);
        setResult(0, intent);
        this.d = bundle.getBoolean("is_setup_wizard", bundle.getBoolean("firstRun"));
        this.e = bundle.getBoolean("useImmersiveMode");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("showingProgressDialog", this.a);
        bundle.putBoolean("firstRun", this.d);
        bundle.putBoolean("useImmersiveMode", this.e);
        bundle.putParcelable("latency.tracker", this.c);
    }

    public void startActivity(Intent intent) {
        if (intent != null) {
            intent.putExtra("useImmersiveMode", this.e);
            intent.putExtra("firstRun", this.d);
            if (!(intent.getComponent() == null || intent.getComponent().getPackageName() == null || !intent.getComponent().getPackageName().startsWith("com.google.android.gms"))) {
                this.c.d.a(intent);
                String valueOf = String.valueOf(intent.toString());
                if (valueOf.length() == 0) {
                    new String("Starting intent: ");
                } else {
                    "Starting intent: ".concat(valueOf);
                }
            }
            super.startActivity(intent);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (intent != null) {
            intent.putExtra("useImmersiveMode", this.e);
            intent.putExtra("firstRun", this.d);
            if (!(intent.getComponent() == null || intent.getComponent().getPackageName() == null || !intent.getComponent().getPackageName().startsWith("com.google.android.gms"))) {
                this.c.d.a(intent);
                String valueOf = String.valueOf(intent.toString());
                if (valueOf.length() == 0) {
                    new String("Starting intent for result: ");
                } else {
                    "Starting intent for result: ".concat(valueOf);
                }
            }
            super.startActivityForResult(intent, i);
        }
    }
}
