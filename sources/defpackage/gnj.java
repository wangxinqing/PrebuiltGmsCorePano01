package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: gnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gnj {
    public static fzl a(Activity activity, Bundle bundle) {
        Bundle bundle2 = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("com.google.android.gms.auth.ui.UiState");
        } else if (!(activity.getIntent() == null || activity.getIntent().getExtras() == null || (bundle2 = activity.getIntent().getExtras().getBundle("ControlledActivity.indirection_key")) != null)) {
            bundle2 = activity.getIntent().getExtras();
        }
        return new fzl(bundle2);
    }

    public static fzl a(Fragment fragment, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("com.google.android.gms.auth.ui.UiState");
        } else {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = fragment.getArguments();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        return new fzl(bundle2);
    }

    public static void a(fzl fzl, Bundle bundle) {
        bundle.putBundle("com.google.android.gms.auth.ui.UiState", fzl.a);
    }
}
