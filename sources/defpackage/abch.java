package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abch implements DialogInterface.OnClickListener {
    public static final DialogInterface.OnClickListener a = new abch();

    private abch() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        iwd iwd = SignInChimeraActivity.a;
        dialogInterface.cancel();
    }
}
