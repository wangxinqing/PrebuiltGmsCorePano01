package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqp implements View.OnClickListener {
    private final SetupChimeraActivity a;

    public vqp(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        setupChimeraActivity.startActivityForResult(ContactSelectChimeraActivity.a((Context) setupChimeraActivity), 1002);
    }
}
