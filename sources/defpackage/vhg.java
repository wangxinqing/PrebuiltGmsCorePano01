package defpackage;

import android.animation.Animator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.BaseCardActivity$1;

/* renamed from: vhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class vhg extends bjs {
    public final Handler a = new qvr();
    public vts b;
    View c;
    public ViewGroup d;
    public boolean e;
    public boolean f = true;
    public Runnable g;
    private final BroadcastReceiver h = new BaseCardActivity$1(this, "nearby");

    public static void a(ViewGroup viewGroup, View view, Transition transition) {
        TransitionValues a2 = vvi.a(view);
        TransitionValues a3 = vvi.a(view);
        transition.captureStartValues(a2);
        transition.captureEndValues(a3);
        Animator createAnimator = transition.createAnimator(viewGroup, a2, a3);
        if (createAnimator != null) {
            createAnimator.start();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                a(viewGroup, viewGroup2.getChildAt(i), transition);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public final vts f() {
        if (this.b == null) {
            this.b = tcn.c(this);
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = f();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.a.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.g = null;
        }
        this.e = true;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        int i = 1;
        if (wid.d(this) && getResources().getConfiguration().orientation != 1) {
            i = 6;
        }
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(i);
        }
        if (getCallingActivity() != null && (getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.ShareSheetActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.InternalShareSheetActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.SetupActivity") || getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.ConsentsActivity"))) {
            getWindow().clearFlags(2);
        }
        postponeEnterTransition();
        this.d.getViewTreeObserver().addOnPreDrawListener(new vhd(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.c.setVisibility(0);
        this.f = true;
        vhb vhb = new vhb(this);
        this.g = vhb;
        Handler handler = this.a;
        int integer = getResources().getInteger(R.integer.sharing_window_transition_duration);
        handler.postDelayed(vhb, (long) (integer + integer + 50));
        this.e = false;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        registerReceiver(this.h, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        thp.a((Context) this, this.h);
        this.c.setVisibility(4);
        super.onStop();
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        View findViewById = findViewById(R.id.root);
        this.c = findViewById;
        findViewById.setOnTouchListener(new vgz(this));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.card);
        this.d = viewGroup;
        viewGroup.setOnTouchListener(vha.a);
    }

    /* access modifiers changed from: protected */
    public final void a(vhf vhf) {
        this.b.a().a((acvv) new vhc(this, vhf));
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (this.d != null) {
            for (int i = 0; i < this.d.getChildCount(); i++) {
                this.d.getChildAt(i).setAlpha(!z ? 1.0f : 0.0f);
            }
        }
    }
}
