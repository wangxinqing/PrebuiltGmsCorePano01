package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity;

/* renamed from: ohy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohy implements Response.ErrorListener {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ ClickToCallChimeraActivity d;

    public ohy(ClickToCallChimeraActivity clickToCallChimeraActivity, String str, String str2, String str3) {
        this.d = clickToCallChimeraActivity;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        int i;
        boolean z = false;
        this.d.a(false);
        ClickToCallChimeraActivity clickToCallChimeraActivity = this.d;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        NetworkResponse networkResponse = volleyError.networkResponse;
        int i2 = 17039360;
        int i3 = R.string.gh_c2c_action_text;
        int i4 = -1;
        if (networkResponse == null) {
            i = R.string.gh_network_not_connected;
            z = true;
        } else {
            int i5 = networkResponse.statusCode;
            if (i5 == 406) {
                clickToCallChimeraActivity.a(clickToCallChimeraActivity.a, R.string.gh_c2c_invalid_phone_number_error);
                return;
            } else if (i5 != 403) {
                i = i5 != 408 ? R.string.gh_server_failure_dialog_message : R.string.gh_c2c_timeout_dialog_message;
                z = true;
            } else {
                i = R.string.gh_c2c_not_available_dialog_message;
                i3 = 17039370;
                i2 = -1;
                i4 = R.string.gh_c2c_not_available_dialog_title;
            }
        }
        okg.a((nzu) clickToCallChimeraActivity, 22, avmt.C2C);
        ohu a2 = ohw.a();
        a2.a = i4;
        a2.b = i;
        a2.c = i3;
        a2.d = i2;
        if (z) {
            a2.e = ClickToCallChimeraActivity.a(str, str2, str3);
        }
        a2.a().show(clickToCallChimeraActivity.getSupportFragmentManager(), "error_handler_dialog");
    }
}
