package defpackage;

import android.widget.Toast;
import com.android.volley.Response;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.ClickToCallChimeraActivity;

/* renamed from: ohx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohx implements Response.Listener {
    final /* synthetic */ ClickToCallChimeraActivity a;

    public ohx(ClickToCallChimeraActivity clickToCallChimeraActivity) {
        this.a = clickToCallChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Void voidR = (Void) obj;
        okg.a((nzu) this.a, 21, avmt.C2C);
        Toast.makeText(this.a, R.string.gh_c2c_success_message, 1).show();
        this.a.finish();
    }
}
