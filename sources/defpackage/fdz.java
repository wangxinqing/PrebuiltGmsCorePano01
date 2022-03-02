package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

/* renamed from: fdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdz extends qcf {
    public static final anaf a;
    public String b;
    private View c;
    private fek d;

    static {
        anab h = anaf.h();
        h.a(1, "account_chooser_page");
        h.a(2, "loading_page");
        a = h.a();
    }

    public static fdz a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        fdz fdz = new fdz();
        fdz.setArguments(bundle);
        return fdz;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        fek fek = (fek) qck.a(getActivity()).a(fek.class);
        this.d = fek;
        fek.c.a(this, new fdy(this));
    }

    public final void onCreate(Bundle bundle) {
        setStyle(1, R.style.CredentialsDialogTheme);
        this.b = getArguments().getString("calling_package");
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.credentials_gis_token_saving_dialog, viewGroup, false);
        new hol(getContext(), "IDENTITY_GMSCORE", (String) null);
        return this.c;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations()) {
            this.d.a(new fej(Status.e, ampu.a));
        }
        super.onDismiss(dialogInterface);
    }
}
