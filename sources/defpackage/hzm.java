package defpackage;

import android.content.Intent;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: hzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hzm implements ax {
    private final SimpleDialogAccountPickerChimeraActivity a;

    public hzm(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.a = simpleDialogAccountPickerChimeraActivity;
    }

    public final void a(Object obj) {
        Intent intent;
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.a;
        pzo pzo = (pzo) obj;
        if (pzo != null) {
            int i = pzo.a;
            if (i == 1) {
                intent = AccountTypePickerChimeraActivity.a(simpleDialogAccountPickerChimeraActivity, simpleDialogAccountPickerChimeraActivity.d);
            } else {
                intent = i == 2 ? pzo.b : null;
            }
            if (intent != null) {
                simpleDialogAccountPickerChimeraActivity.startActivityForResult(intent, pzo.a);
            }
        }
    }
}
