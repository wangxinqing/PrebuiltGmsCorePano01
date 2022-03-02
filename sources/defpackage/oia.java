package defpackage;

import android.widget.Toast;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.helpactivities.EmailChimeraActivity;

/* renamed from: oia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oia implements Response.Listener {
    final /* synthetic */ EmailChimeraActivity a;

    public oia(EmailChimeraActivity emailChimeraActivity) {
        this.a = emailChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Void voidR = (Void) obj;
        this.a.finish();
        EmailChimeraActivity emailChimeraActivity = this.a;
        Toast.makeText(emailChimeraActivity, emailChimeraActivity.a, 0).show();
    }
}
