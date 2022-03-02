package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* renamed from: acmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acmo extends acmn implements accj {
    private String b;
    private String c;
    private String d;
    private int e;
    private Boolean f;

    public static acmo a(String str, String str2, String str3, String str4, int i, boolean z) {
        acmo acmo = new acmo();
        Bundle bundle = new Bundle();
        bundle.putString("verifyTitle", str);
        bundle.putString("verifyText", str2);
        bundle.putString("lockScreenText", str3);
        bundle.putString("nextButtonText", str4);
        bundle.putInt("iconId", i);
        bundle.putBoolean("showCancelButton", z);
        acmo.setArguments(bundle);
        return acmo;
    }

    public static acmo b() {
        return a((String) null, (String) null, (String) null, (String) null, R.drawable.quantum_gm_ic_lock_gm_blue_36, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.b = arguments.getString("verifyTitle", getString(R.string.common_confirm_screen_lock_title));
        this.c = arguments.getString("verifyText", getString(R.string.smartdevice_d2d_lockscreen_verification_text));
        this.d = arguments.getString("nextButtonText", getString(R.string.common_next));
        this.e = arguments.getInt("iconId");
        this.f = Boolean.valueOf(arguments.getBoolean("showCancelButton"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.smartdevice_fragment_container, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        acdf acdf = new acdf();
        acdf.b = this.b;
        acdf.c = this.c;
        acdf.a(this.d, 1);
        acdf.a = this.e;
        if (this.f.booleanValue()) {
            acdf.b(getString(R.string.smartdevice_magicwand_cancel_signin), 2);
            acdf.g = true;
        }
        beginTransaction.replace(R.id.fragment_container, acdf.a());
        beginTransaction.commit();
    }

    public final void b(int i, Bundle bundle) {
        if (i == 1) {
            a();
        } else if (i == 2) {
            this.a.i();
        } else {
            StringBuilder sb = new StringBuilder(27);
            sb.append("Unknown action: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }
}
