package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.List;

/* renamed from: ewe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ewe implements ax {
    private final ewj a;

    public ewe(ewj ewj) {
        this.a = ewj;
    }

    public final void a(Object obj) {
        ewj ewj = this.a;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) ((List) obj).get(0);
        if (!TextUtils.isEmpty(internalSignInCredentialWrapper.g.f)) {
            ewj.c.setText(internalSignInCredentialWrapper.g.a);
            ewj.d.setText(ewj.getString(R.string.credentials_assisted_hidden_password));
            ewj.d.setTypeface(Typeface.MONOSPACE);
        } else {
            ewj.c.setText(internalSignInCredentialWrapper.g.b);
            ewj.d.setText(internalSignInCredentialWrapper.f.name);
            ewj.d.setTypeface(Typeface.SANS_SERIF);
        }
        ewj.h = fcp.a(ewj.getContext(), internalSignInCredentialWrapper, ewj.f.m);
        ewj.e.a((Object) ewj.h);
        ewj.b.setText(R.string.credentials_assisted_confirmation_header);
    }
}
