package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

/* renamed from: ezu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezu extends qcf {
    public static final int a = R.id.main_dialog_container;
    public static final int b = R.id.consent_dialog_container;
    public static final anaf c;
    public String d;
    public fgr e;
    private View f;
    private fbn g;

    static {
        anab h = anaf.h();
        h.a(1, "loading_page");
        h.a(2, "account_chooser_page");
        h.a(3, "consent_page");
        c = h.a();
    }

    public static ezu a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        ezu ezu = new ezu();
        ezu.setArguments(bundle);
        return ezu;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.g = (fbn) qck.a(activity).a(fbn.class);
        qck.a(activity).a(pzg.class);
        this.g.e.a(this, new ezr(this));
        this.g.h.a(this, new ezs(this));
        this.e = new fgr(this, this.g.i, (hol) null);
    }

    public final void onCreate(Bundle bundle) {
        setStyle(1, R.style.CredentialsDialogTheme);
        this.d = getArguments().getString("calling_package");
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new ezt(this, getActivity(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f = layoutInflater.inflate(R.layout.credentials_authorization_dialog, viewGroup, false);
        new hol(getContext(), "IDENTITY_GMSCORE", (String) null);
        return this.f;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations()) {
            this.g.a(new fbm(Status.e, ampu.a));
        }
        super.onDismiss(dialogInterface);
    }
}
