package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;
import com.google.android.gms.auth.api.credentials.yolo.ui.EventsInterceptableLinearLayout;
import java.util.List;

/* renamed from: frr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class frr implements aora {
    final /* synthetic */ CredentialsSettingsChimeraActivity a;

    public frr(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity) {
        this.a = credentialsSettingsChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        AccountCredentialSettings accountCredentialSettings = (AccountCredentialSettings) obj;
        this.a.b(false);
        ffs ffs = new ffs(accountCredentialSettings);
        ffs.c.clear();
        ffs.a(amzy.a(anbs.a((Iterable) accountCredentialSettings.c, (amrm) new frq(this))));
        AccountCredentialSettings a2 = ffs.a();
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        credentialsSettingsChimeraActivity.g = a2;
        if (!a2.d) {
            credentialsSettingsChimeraActivity.a(true);
            credentialsSettingsChimeraActivity.e.setVisibility(8);
            credentialsSettingsChimeraActivity.f.setVisibility(0);
            credentialsSettingsChimeraActivity.a.setChecked(a2.a);
            credentialsSettingsChimeraActivity.b.setChecked(a2.b);
            credentialsSettingsChimeraActivity.c.removeAllViews();
            List list = a2.c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String c = hiq.c((String) list.get(i));
                View inflate = credentialsSettingsChimeraActivity.getLayoutInflater().inflate(R.layout.credentials_app_item, (ViewGroup) null, false);
                credentialsSettingsChimeraActivity.a(inflate, c);
                credentialsSettingsChimeraActivity.c.addView(inflate);
                inflate.setOnClickListener(new frn(credentialsSettingsChimeraActivity, c));
            }
            boolean z = a2.a;
            EventsInterceptableLinearLayout eventsInterceptableLinearLayout = (EventsInterceptableLinearLayout) credentialsSettingsChimeraActivity.findViewById(R.id.extra_options);
            float alpha = eventsInterceptableLinearLayout.getAlpha();
            if (!z) {
                if (alpha != 0.5f) {
                    eventsInterceptableLinearLayout.setVisibility(0);
                    eventsInterceptableLinearLayout.setAlpha(1.0f);
                    eventsInterceptableLinearLayout.a = true;
                    eventsInterceptableLinearLayout.animate().alpha(0.5f).setListener(new frp(eventsInterceptableLinearLayout));
                }
            } else if (alpha != 1.0f) {
                eventsInterceptableLinearLayout.setAlpha(0.5f);
                eventsInterceptableLinearLayout.animate().alpha(1.0f).setListener(new fro(eventsInterceptableLinearLayout));
            }
            List d = jgu.d(credentialsSettingsChimeraActivity, credentialsSettingsChimeraActivity.getPackageName());
            if (a2.a || d.size() <= 1) {
                credentialsSettingsChimeraActivity.findViewById(R.id.storage_enabled_helper_text).setVisibility(8);
            } else {
                credentialsSettingsChimeraActivity.findViewById(R.id.storage_enabled_helper_text).setVisibility(0);
            }
        } else {
            credentialsSettingsChimeraActivity.a(false);
            credentialsSettingsChimeraActivity.e.setVisibility(0);
            credentialsSettingsChimeraActivity.f.setVisibility(8);
        }
    }

    public final void a(Throwable th) {
        this.a.b(true);
        this.a.e();
        Toast.makeText(this.a.getContainerActivity(), this.a.getResources().getString(R.string.credentials_pref_failed_load), 1).show();
    }
}
