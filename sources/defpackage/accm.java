package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* renamed from: accm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class accm {
    private static final int a = R.id.fragment_container;
    private final Activity b;
    private final accl c;
    private int d = -1;
    private Fragment e;

    static {
        acqa.a("D2D", "UI", "FragmentTransitionController");
    }

    public final void a(int i, int i2) {
        a(i, i2, (Bundle) null);
    }

    public accm(Activity activity, accl accl) {
        this.b = activity;
        this.c = accl;
    }

    public final void a(int i, int i2, Bundle bundle) {
        if (!this.b.isFinishing()) {
            if (this.d == i) {
                i2 = 4;
            }
            this.d = i;
            this.e = this.c.a(i, bundle);
            FragmentTransaction beginTransaction = this.b.getSupportFragmentManager().beginTransaction();
            if (i2 == 1) {
                beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_next_out);
            } else if (i2 == 2) {
                beginTransaction.setCustomAnimations(R.anim.slide_back_in, R.anim.slide_back_out);
            } else if (i2 == 3) {
                beginTransaction.setCustomAnimations(17432576, 17432577);
            }
            Fragment fragment = this.e;
            if (fragment instanceof DialogFragment) {
                beginTransaction.add(fragment, (String) null);
            } else {
                beginTransaction.replace(a, fragment);
            }
            beginTransaction.commit();
        }
    }
}
