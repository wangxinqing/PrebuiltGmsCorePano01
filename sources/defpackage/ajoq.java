package defpackage;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.R;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: ajoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajoq extends qvr {
    final /* synthetic */ Context a;
    final /* synthetic */ LocationHistorySettingsChimeraActivity b;

    public ajoq(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity, Context context) {
        this.b = locationHistorySettingsChimeraActivity;
        this.a = context;
    }

    public final void handleMessage(Message message) {
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity;
        int i;
        String str;
        this.b.e.setText(R.string.location_settings_delete_location_history);
        this.b.e.setEnabled(true);
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 == 2) {
                locationHistorySettingsChimeraActivity = this.b;
                i = R.string.location_settings_delete_auth_error;
                str = "DeleteAuthErrorDialog";
            } else if (jkf.a(this.a)) {
                locationHistorySettingsChimeraActivity = this.b;
                i = R.string.common_network_unavailable;
                str = "DeleteIOErrorDialog";
            } else {
                locationHistorySettingsChimeraActivity = this.b;
                i = R.string.common_no_network;
                str = "DeleteOfflineErrorDialog";
            }
            locationHistorySettingsChimeraActivity.a(i, str);
        }
    }
}
