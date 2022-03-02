package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: hzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hzl implements ax {
    private final SimpleDialogAccountPickerChimeraActivity a;

    public hzl(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.a = simpleDialogAccountPickerChimeraActivity;
    }

    public final void a(Object obj) {
        Bundle extras;
        String string;
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.a;
        pzo pzo = (pzo) obj;
        if (pzo != null) {
            Intent intent = pzo.b;
            int i = pzo.a;
            if (i == 10) {
                Toast.makeText(simpleDialogAccountPickerChimeraActivity, R.string.common_account_restricted_no_accounts, 0).show();
                i = 0;
            } else if (!(i != -1 || intent == null || !simpleDialogAccountPickerChimeraActivity.d.c || (extras = intent.getExtras()) == null || (string = extras.getString("authAccount")) == null)) {
                itg.a((Context) simpleDialogAccountPickerChimeraActivity, string, simpleDialogAccountPickerChimeraActivity.c);
            }
            if (intent != null) {
                simpleDialogAccountPickerChimeraActivity.setResult(i, intent);
            } else {
                simpleDialogAccountPickerChimeraActivity.setResult(i);
            }
            simpleDialogAccountPickerChimeraActivity.finish();
        }
    }
}
