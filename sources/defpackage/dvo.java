package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: dvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvo extends Fragment {
    dvp a;
    boolean b;
    Intent c;

    /* access modifiers changed from: package-private */
    public final void a(Activity activity) {
        if (this.b && isResumed()) {
            Intent intent = this.c;
            if (intent == null) {
                activity.finish();
            } else if (eaq.a(intent)) {
                activity.startActivityForResult(this.c, 0);
            } else {
                activity.startActivity(this.c);
                activity.finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.c = (Intent) bundle.getParcelable("fdlIntent");
            this.b = bundle.getBoolean("taskComplete");
        }
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        if (this.b) {
            a(activity);
        } else if (this.a == null) {
            dvp dvp = new dvp(activity, activity.getIntent(), new dwe(activity.getApplicationContext(), (String) null), this);
            this.a = dvp;
            dvp.execute(new Void[0]);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Intent intent = this.c;
        if (intent != null) {
            bundle.putParcelable("fdlIntent", intent);
        }
        bundle.putBoolean("taskComplete", this.b);
    }

    public final void onStop() {
        super.onStop();
        if (this.a != null && !getActivity().isChangingConfigurations()) {
            this.a.cancel(true);
            this.a = null;
        }
    }
}
