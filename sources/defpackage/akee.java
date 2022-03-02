package defpackage;

import android.content.Intent;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.pano.chimera.Action;

/* renamed from: akee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akee extends Fragment implements akdo, akef {
    public Activity a;
    public final akdz b = new akdz(this);

    static void a(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.setCustomAnimations(R.anim.fragment_slide_left_in, R.anim.fragment_slide_left_out, R.anim.fragment_slide_right_in, R.anim.fragment_slide_right_out);
    }

    public final Activity a() {
        Activity activity = this.a;
        return activity == null ? getActivity() : activity;
    }

    public final FragmentTransaction a(Fragment fragment) {
        FragmentManager fragmentManager = a().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("content");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (findFragmentByTag != null) {
            a(beginTransaction);
        }
        int i = this.b.a;
        beginTransaction.replace(R.id.content_fragment, fragment, "content");
        return beginTransaction;
    }

    public final FragmentTransaction a(Fragment fragment, FragmentTransaction fragmentTransaction, FragmentManager fragmentManager) {
        if (fragmentTransaction == null) {
            fragmentTransaction = fragmentManager.beginTransaction();
        }
        if (fragmentManager.findFragmentByTag("action") != null) {
            a(fragmentTransaction);
            fragmentTransaction.addToBackStack((String) null);
        }
        int i = this.b.b;
        fragmentTransaction.replace(R.id.action_fragment, fragment, "action");
        akdt akdt = ((akds) fragment).a;
        if (akdt.f == null) {
            akdt.f = this;
        }
        return fragmentTransaction;
    }

    public final void a(Action action) {
        Activity a2 = a();
        if (!(a2 instanceof akdo)) {
            Intent intent = action.d;
            if (intent != null) {
                a2.startActivity(intent);
                a2.finish();
                return;
            }
            return;
        }
        ((akdo) a2).a(action);
    }
}
