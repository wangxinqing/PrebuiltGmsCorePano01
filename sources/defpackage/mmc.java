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

/* renamed from: mmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mmc extends DialogFragment {
    public mmb a;
    public LinearLayout b;
    public WalletCustomTheme c;
    public boolean d;
    private View e;

    public static mmc a(String str, int i, int i2) {
        Bundle bundle = new Bundle(3);
        bundle.putString("accountName", str);
        bundle.putInt("maxAvailableSlots", i);
        bundle.putInt("inviteeRole", i2);
        mmc mmc = new mmc();
        mmc.setArguments(bundle);
        return mmc;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!axgm.b()) {
            getActivity().getWindow().addFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
        }
        if (bundle != null) {
            this.d = bundle.getBoolean("paymentsChallengeFlowStarted", false);
        }
        if (!this.d) {
            String string = getResources().getString(R.string.fm_just_a_sec_message);
            if (getDialog() != null) {
                getDialog().setCanceledOnTouchOutside(false);
            }
            ((TextView) this.b.findViewById(R.id.fm_verify_cvc_progress_bar_text)).setText(string);
            this.b.setVisibility(0);
            getLoaderManager().initLoader(0, (Bundle) null, new mma(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown request code: ");
            sb.append(i);
            mfv.f("InvitationsPreconditionsFragment", sb.toString(), new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("PM Flow Done: ");
        sb2.append(i2);
        sb2.toString();
        ith ith = mfv.a;
        if (i2 == -1) {
            this.a.b().a(this.a.l(), 8);
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            if (byteArrayExtra != null) {
                try {
                    atim atim = (atim) aucj.a((aucj) atim.c, byteArrayExtra, aubs.c());
                    int a2 = atil.a(atim.a);
                    if (a2 != 0 && a2 == 3) {
                        this.a.b().a(this.a.l(), 9);
                        this.a.a(getArguments().getInt("maxAvailableSlots"), getArguments().getInt("inviteeRole"));
                        return;
                    }
                    this.a.b().a(this.a.l(), 11);
                    String valueOf = String.valueOf(atim.b);
                    if (valueOf.length() == 0) {
                        new String("Instrument challenge not successful: ");
                    } else {
                        "Instrument challenge not successful: ".concat(valueOf);
                    }
                    this.a.m();
                } catch (IOException e2) {
                    mfv.f("InvitationsPreconditionsFragment", "Failure parsing RequestChallengeResponse proto.", new Object[0]);
                    a();
                }
            } else {
                mfv.f("InvitationsPreconditionsFragment", "No RequestChallengeResponse found in data.", new Object[0]);
                a();
            }
        } else {
            this.a.b().a(this.a.l(), 7);
            this.a.m();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mmb) mfy.a(mmb.class, getActivity());
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.a.m();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_invitations_preconditions, viewGroup, false);
        this.e = inflate;
        this.b = (LinearLayout) inflate.findViewById(R.id.fm_verify_cvc_progress_bar);
        int a2 = mfx.a(getActivity().getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a = hdg.a(getActivity(), a2);
        this.c = walletCustomTheme;
        this.a.b().a(this.a.l(), 5);
        return this.e;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("paymentsChallengeFlowStarted", this.d);
    }

    public final void a() {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.a.n();
    }
}
