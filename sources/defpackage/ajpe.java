package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.IBinder;
import android.service.notification.Condition;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.chimera.ConditionProviderService;
import com.google.android.gms.R;
import java.util.Set;

/* renamed from: ajpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ajpe extends ConditionProviderService {
    protected final Set a = new ArraySet();
    private boolean b = false;

    protected static boolean a(Context context) {
        iwq a2 = iwq.a(context);
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
        for (AutomaticZenRule automaticZenRule : a2.d().values()) {
            if (componentName.equals(automaticZenRule.getOwner())) {
                return a(automaticZenRule.getConditionId());
            }
        }
        return false;
    }

    private final void b(Uri uri) {
        if (a(uri)) {
            c(3);
        } else {
            c(2);
        }
    }

    private final void c(int i) {
        synchronized (this.a) {
            if (!e()) {
                if (this.b) {
                    b(i);
                    this.b = false;
                }
            } else if (!this.b) {
                a(i);
                this.b = true;
            }
        }
    }

    private final boolean e() {
        iwq a2 = iwq.a(getApplicationContext());
        ComponentName componentName = new ComponentName(getApplicationContext().getPackageName(), a());
        for (AutomaticZenRule automaticZenRule : a2.d().values()) {
            if (automaticZenRule.isEnabled() && componentName.equals(automaticZenRule.getOwner())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract void b(int i);

    public abstract ajpd c();

    /* access modifiers changed from: protected */
    public final void d() {
        if (!e() && jkr.e() && axzp.b()) {
            super.requestUnbind();
        }
    }

    public IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        SharedPreferences sharedPreferences = getSharedPreferences("dnd_providers", 0);
        String concat = String.valueOf(b()).concat("_first_run");
        if (sharedPreferences.getBoolean(concat, true) && aycw.a.a().addDndRuleOnBind()) {
            try {
                iwq.a((Context) this).a(c().a((Context) this));
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ZenCondProv", valueOf.length() == 0 ? new String("IllegalArgument exception = ") : "IllegalArgument exception = ".concat(valueOf));
            } catch (SecurityException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                Log.w("ZenCondProv", valueOf2.length() == 0 ? new String("Security exception = ") : "Security exception = ".concat(valueOf2));
            }
            sharedPreferences.edit().putBoolean(concat, false).apply();
        }
        return onBind;
    }

    public final void onConnected() {
        d();
    }

    public final void onSubscribe(Uri uri) {
        if (uri != null) {
            try {
                synchronized (this.a) {
                    this.a.add(uri);
                }
                b(uri);
            } catch (SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ZenCondProv", valueOf.length() == 0 ? new String("Security exception = ") : "Security exception = ".concat(valueOf));
                return;
            }
        }
        if (axzm.b() && uri != null && a(uri)) {
            a(uri.getBooleanQueryParameter("driving_mode_enable_dnd_rule", false), getString(R.string.dnd_state_driving));
        }
    }

    public final void onUnsubscribe(Uri uri) {
        if (uri != null) {
            try {
                synchronized (this.a) {
                    this.a.remove(uri);
                }
                b(uri);
                d();
            } catch (SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("ZenCondProv", valueOf.length() == 0 ? new String("Security exception = ") : "Security exception = ".concat(valueOf));
            }
        }
    }

    protected static boolean a(Uri uri) {
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("rule_source");
            return !TextUtils.isEmpty(queryParameter) && queryParameter.equalsIgnoreCase("driving_mode");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, String str) {
        synchronized (this.a) {
            for (Uri condition : this.a) {
                notifyCondition(new Condition(condition, str, z ? 1 : 0));
            }
        }
    }
}
