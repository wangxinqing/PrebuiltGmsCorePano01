package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.EmailChimeraActivity;

/* renamed from: ohz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohz implements Response.ErrorListener {
    final /* synthetic */ EmailChimeraActivity a;

    public ohz(EmailChimeraActivity emailChimeraActivity) {
        this.a = emailChimeraActivity;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.a(false);
        EmailChimeraActivity emailChimeraActivity = this.a;
        ohu a2 = ohw.a();
        a2.b = R.string.gh_server_failure_dialog_message;
        a2.c = R.string.common_send;
        a2.d = 17039360;
        a2.a().show(emailChimeraActivity.getSupportFragmentManager(), "error_handler_dialog");
    }
}
