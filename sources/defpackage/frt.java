package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;
import java.util.List;

/* renamed from: frt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class frt extends ArrayAdapter {
    final /* synthetic */ CredentialsSettingsChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public frt(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, Context context, List list) {
        super(context, R.layout.credentials_app_item, list);
        this.a = credentialsSettingsChimeraActivity;
    }

    public final boolean areAllItemsEnabled() {
        return true;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.getLayoutInflater().inflate(R.layout.credentials_app_item, viewGroup, false);
        }
        String str = (String) getItem(i);
        if (str != null) {
            CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
            int i2 = CredentialsSettingsChimeraActivity.i;
            credentialsSettingsChimeraActivity.a(view, str);
        }
        return view;
    }

    public final boolean isEnabled(int i) {
        return true;
    }
}
