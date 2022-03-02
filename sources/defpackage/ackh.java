package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import java.util.ArrayList;

/* renamed from: ackh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ackh extends Fragment {
    public ArrayList a;
    public String b;
    public ss c;
    public AccountChallengeWebView d;
    ackd e;
    private int f;

    public static ackh a(ArrayList arrayList, String str) {
        ackh ackh = new ackh();
        ackh.setArguments(b(arrayList, str));
        return ackh;
    }

    public static Bundle b(ArrayList arrayList, String str) {
        iva.a((Object) arrayList);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", arrayList);
        bundle.putString("restoreAccount", str);
        return bundle;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(getActivity() instanceof ackg)) {
            throw new RuntimeException("Parent activity should implement AccountChallengeFragment.Listener");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getParcelableArrayList("accounts");
            this.b = arguments.getString("restoreAccount");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.smartdevice_account_challenge_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("accounts", this.a);
    }

    public final void onStart() {
        super.onStart();
        Activity activity = getActivity();
        if (activity != null) {
            this.f = activity.getRequestedOrientation();
            activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
        }
    }

    public final void onStop() {
        super.onStop();
        Activity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.f);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        this.e = new ackd(this);
        AccountChallengeWebView accountChallengeWebView = (AccountChallengeWebView) view.findViewById(R.id.account_challenge_webview);
        this.d = accountChallengeWebView;
        accountChallengeWebView.n = this.e;
        String a2 = jli.a("setupwizard.theme", "");
        boolean z2 = true;
        accountChallengeWebView.m = !"glif".equals(a2) ? "glif_light".equals(a2) : true;
        AccountChallengeWebView accountChallengeWebView2 = this.d;
        accountChallengeWebView2.e = true;
        ArrayList arrayList = this.a;
        if (accountChallengeWebView2.d == null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Cannot call AccountChallengeWebView#startChallenges more than once.");
        iva.a((Object) arrayList, (Object) "accounts cannot be null.");
        accountChallengeWebView2.d = arrayList;
        accountChallengeWebView2.i = 0;
        accountChallengeWebView2.k = null;
        if (arrayList.size() <= 0) {
            z2 = false;
        }
        iva.a(z2, (Object) "Must have at least one account.");
        accountChallengeWebView2.g = accountChallengeWebView2.d.size();
        accountChallengeWebView2.post(new acoo(accountChallengeWebView2));
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setSoftInputMode(16);
            if (!this.d.a()) {
                Window window = activity.getWindow();
                int i = Build.VERSION.SDK_INT;
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                view.setSystemUiVisibility(1024);
                view.requestApplyInsets();
            }
        }
    }

    public final void a(CharSequence charSequence) {
        Activity activity = getActivity();
        if (activity != null && activity.getContainerActivity() != null) {
            acpc.a(activity.getContainerActivity(), charSequence);
        }
    }
}
