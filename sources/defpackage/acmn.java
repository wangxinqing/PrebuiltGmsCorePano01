package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: acmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acmn extends Fragment {
    private static final iwd b = acqa.a("Setup", "UI", "LockScreenFragment");
    acmm a;
    private boolean c;
    private String d;

    public static boolean a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && !keyguardManager.isKeyguardSecure();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 5) {
            return;
        }
        if (i2 != -1) {
            b.d("User skipped lock screen", new Object[0]);
            this.a.i();
            return;
        }
        b.b("Successfully verified via lockscreen", new Object[0]);
        this.a.f();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.a = (acmm) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement LockScreenFragment.Listener", e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("lockscreenShown")) {
            z = true;
        }
        this.c = z;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.d = arguments.getString("lockScreenText", getString(R.string.smartdevice_d2d_lockscreen_description));
    }

    public final void onPause() {
        b.b("onPause", new Object[0]);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        b.b("onResume", new Object[0]);
        if (this.c) {
            this.c = false;
            this.a.f();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("lockscreenShown", this.c);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        b.b("preparing to lock device", new Object[0]);
        this.a.j();
        Activity activity = getActivity();
        if (activity == null) {
            b.d("activity not attached", new Object[0]);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        b.b("locking screen on L+ device", new Object[0]);
        int i2 = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService("keyguard");
        if (keyguardManager != null) {
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent((CharSequence) null, this.d);
            if (createConfirmDeviceCredentialIntent != null) {
                startActivityForResult(createConfirmDeviceCredentialIntent, 5);
                activity.overridePendingTransition(R.anim.slide_next_in, R.anim.slide_next_out);
                return;
            }
            b.e("Received null intent from KeyguardManager.", new Object[0]);
            this.a.h();
            return;
        }
        b.e("Keyguard manager was null.", new Object[0]);
        this.a.h();
    }
}
