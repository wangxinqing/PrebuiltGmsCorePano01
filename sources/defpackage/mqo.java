package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.io.IOException;

/* renamed from: mqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mqo extends DialogFragment {
    public String a;
    public String b;
    public boolean c;
    public mqn d;
    public WalletCustomTheme e;
    public boolean f;
    public int g = 1;
    private LinearLayout h;

    public final void a() {
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void b() {
        a();
        this.d.x();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getWindow().addFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
        if (bundle != null) {
            this.f = bundle.getBoolean("paymentsChallengeFlowStarted", false);
        }
        if (!this.f) {
            String string = getResources().getString(R.string.fm_just_a_sec_message);
            if (getDialog() != null) {
                getDialog().setCanceledOnTouchOutside(false);
            }
            ((TextView) this.h.findViewById(R.id.fm_verify_cvc_progress_bar_text)).setText(string);
            this.h.setVisibility(0);
            getLoaderManager().initLoader(0, (Bundle) null, new mqm(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i);
            mfv.f("UpgradePreconditionsFragment", sb.toString(), new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("PM Flow Done: ");
        sb2.append(i2);
        sb2.toString();
        ith ith = mfv.a;
        if (i2 == -1) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            if (byteArrayExtra != null) {
                try {
                    atim atim = (atim) aucj.a((aucj) atim.c, byteArrayExtra, aubs.c());
                    int a2 = atil.a(atim.a);
                    if (a2 != 0 && a2 == 3) {
                        this.d.d(this.c);
                        return;
                    }
                    String valueOf = String.valueOf(atim.b);
                    if (valueOf.length() == 0) {
                        new String("Instrument challenge not successful: ");
                    } else {
                        "Instrument challenge not successful: ".concat(valueOf);
                    }
                    this.d.y();
                } catch (IOException e2) {
                    mfv.f("UpgradePreconditionsFragment", "Failure parsing RequestChallengeResponse proto.", new Object[0]);
                    b();
                }
            } else {
                mfv.f("UpgradePreconditionsFragment", "No RequestChallengeResponse found in data.", new Object[0]);
                b();
            }
        } else {
            this.d.y();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = (mqn) mfy.a(mqn.class, getActivity());
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.d.y();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getString("accountName");
        this.b = getArguments().getString("referencePcid");
        int a2 = apiv.a(getArguments().getInt("pcidType"));
        if (a2 == 0) {
            a2 = 1;
        }
        this.g = a2;
        this.c = getArguments().getBoolean("headless");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_upgrade_preconditions, viewGroup, false);
        this.h = (LinearLayout) inflate.findViewById(R.id.fm_verify_cvc_progress_bar);
        int a2 = mfx.a(getActivity().getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a = hdg.a(getActivity(), a2);
        this.e = walletCustomTheme;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.d = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("paymentsChallengeFlowStarted", this.f);
    }
}
