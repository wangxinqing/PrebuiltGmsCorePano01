package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclChimeraActivity;
import java.util.List;

/* renamed from: gnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnu extends crq {
    final /* synthetic */ GrantCredentialsWithAclChimeraActivity d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gnu(GrantCredentialsWithAclChimeraActivity grantCredentialsWithAclChimeraActivity, Context context, List list) {
        super(context, list);
        this.d = grantCredentialsWithAclChimeraActivity;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.auth_consent_account_chip_padding);
        view2.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        ((TextView) view2.findViewById(R.id.account_name)).setTextColor(this.d.getResources().getColor(17170443));
        ((TextView) view2.findViewById(R.id.account_display_name)).setTextColor(this.d.getResources().getColor(17170443));
        return view2;
    }
}
