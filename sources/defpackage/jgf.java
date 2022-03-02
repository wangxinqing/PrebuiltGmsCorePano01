package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.ui.ErrorDialogActivity;

/* renamed from: jgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jgf {
    public final Intent a;

    public jgf(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW").setClass(context, ErrorDialogActivity.class).setPackage("com.google.android.gms");
        this.a = intent;
        intent.addFlags(603979776);
        this.a.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
    }
}
