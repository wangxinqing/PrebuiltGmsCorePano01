package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class frh implements DialogInterface.OnClickListener {
    private final CredentialsSettingsChimeraActivity a;
    private final amzy b;

    public frh(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, amzy amzy) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = amzy;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        amri a2 = hiq.a(credentialsSettingsChimeraActivity, (String) this.b.get(i));
        if (a2.a()) {
            credentialsSettingsChimeraActivity.a(4, new frd(credentialsSettingsChimeraActivity, a2), credentialsSettingsChimeraActivity.getString(R.string.credentials_pref_failed_add_never_save));
        }
    }
}
