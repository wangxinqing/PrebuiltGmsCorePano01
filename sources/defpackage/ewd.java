package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: ewd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ewd extends qcf {
    public static final anaf a;
    public fgr b;
    private eze c;

    static {
        anab h = anaf.h();
        h.a(1, "account_list");
        h.a(2, "consent");
        a = h.a();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        eze eze = (eze) qck.a(getActivity()).a(eze.class);
        this.c = eze;
        eze.g.a(this, new ewb(this));
        this.b = new fgr(this, this.c.d.c, (hol) null);
    }

    public final void onCreate(Bundle bundle) {
        setStyle(1, R.style.CredentialsDialogTheme);
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new ewc(this, getActivity(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.credentials_google_sign_in_dialog, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations() && this.c.k.b() == null) {
            this.c.a(ezf.a());
        }
    }
}
