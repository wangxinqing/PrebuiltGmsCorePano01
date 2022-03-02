package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: acmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acmj extends Fragment {
    public static final iwd a = acqa.a("Setup", "UI", "FingerprintFragment");
    public acmi b;
    private FingerprintManager c;
    private String d;
    private String e;
    private String f;
    private Boolean g;
    private TextView h;
    private CancellationSignal i;
    private final FingerprintManager.AuthenticationCallback j = new acmg(this);

    public static acmj a(String str, String str2, boolean z) {
        if (jkr.b()) {
            acmj acmj = new acmj();
            Bundle bundle = new Bundle();
            bundle.putString("smartdevice.title", str);
            bundle.putString("smartdevice.message", str2);
            bundle.putBoolean("isMagicWand", z);
            acmj.setArguments(bundle);
            return acmj;
        }
        throw new IllegalStateException("Fingerprint is only supported on SDK 23 and up.");
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (acmi) activity;
        } catch (ClassCastException e2) {
            throw new RuntimeException("Containing activity must implementFingerprintFragment.Listener", e2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        String string = arguments.getString("smartdevice.title");
        iva.c(string);
        this.d = string;
        String string2 = arguments.getString("smartdevice.message");
        iva.c(string2);
        this.e = string2;
        this.g = Boolean.valueOf(arguments.getBoolean("isMagicWand"));
        Activity activity = getActivity();
        if (activity != null) {
            this.c = (FingerprintManager) activity.getSystemService("fingerprint");
        }
        this.i = new CancellationSignal();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        if (!this.g.booleanValue()) {
            i2 = R.layout.smartdevice_setup_fingerprint;
        } else {
            i2 = R.layout.magicwand_fingerprint;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i2, viewGroup, false);
        if (!this.g.booleanValue()) {
            alhf alhf = new alhf(glifLayout.getContext());
            alhf.a(R.string.common_skip_fingerprint);
            alhf.c = 7;
            alhf.d = 2132018061;
            ((alhe) glifLayout.a(alhe.class)).b(alhf.a());
        }
        return glifLayout;
    }

    public final void onPause() {
        super.onPause();
        a.b("onPause", new Object[0]);
        a.b("stopAuthentication", new Object[0]);
        this.i.cancel();
    }

    public final void onResume() {
        super.onResume();
        a.b("onResume", new Object[0]);
        a.b("startAuthentication", new Object[0]);
        this.c.authenticate((FingerprintManager.CryptoObject) null, this.i, 0, this.j, (Handler) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("smartdevice.detailedMessage", this.f);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GlifLayout glifLayout = (GlifLayout) view.findViewById(R.id.glif_layout);
        glifLayout.a((CharSequence) this.d);
        ((TextView) view.findViewById(R.id.message)).setText(this.e);
        if (this.g.booleanValue()) {
            view.findViewById(R.id.skip_fingerprint).setOnClickListener(new acme(this));
            view.findViewById(R.id.cancel_fingerprint).setOnClickListener(new acmh(this));
        } else {
            ((alhe) glifLayout.a(alhe.class)).d.f = new acmf(this);
        }
        this.h = (TextView) view.findViewById(R.id.error_message);
        if (bundle != null) {
            a(bundle.getString("smartdevice.detailedMessage"));
        }
    }

    public static boolean a(Context context) {
        FingerprintManager fingerprintManager = (FingerprintManager) context.getApplicationContext().getSystemService("fingerprint");
        return fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints();
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f = str;
            this.h.setVisibility(0);
            this.h.setText(str);
        }
    }
}
