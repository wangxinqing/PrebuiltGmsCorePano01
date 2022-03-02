package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;

/* renamed from: deq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class deq {
    public static void a(Context context, FragmentManager fragmentManager, Fragment fragment, String str, dep dep) {
        Fragment findFragmentByTag;
        if (dep.l && (findFragmentByTag = fragmentManager.findFragmentByTag(str)) != null) {
            qb.L(findFragmentByTag.getView());
        }
        if (awgy.a.a().a()) {
            int i = Build.VERSION.SDK_INT;
            if (Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 0.0f) == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 0.0f) == 0.0f) {
                dep = dep.INSTANT;
            }
        }
        fragmentManager.beginTransaction().setCustomAnimations(dep.j, dep.k).replace(R.id.fragment_container, fragment, str).commitNow();
    }

    public static void a(Fragment fragment, Fragment fragment2, String str, dep dep) {
        a(fragment.getContext(), fragment.getChildFragmentManager(), fragment2, str, dep);
    }

    public static void a(Fragment fragment, dhh dhh) {
        Fragment.SavedState savedState;
        if (dhh != null && fragment.getClass().getName().equals(dhh.a) && (savedState = dhh.b) != null) {
            fragment.setInitialSavedState(savedState);
        }
    }

    public static boolean a(Activity activity, String str) {
        return activity.getSupportFragmentManager().findFragmentByTag(str) != null;
    }
}
