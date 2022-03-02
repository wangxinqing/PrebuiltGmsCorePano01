package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* renamed from: aaul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaul extends aanp {
    public static final /* synthetic */ int b = 0;
    final Intent a;

    static {
        aaul.class.getSimpleName();
    }

    public aaul(Context context, Intent intent) {
        super(context, "rharesult");
        this.a = intent;
    }

    public final void a(Context context) {
        int intExtra = this.a.getIntExtra("nonce", -1);
        int d = aauk.a(context).d();
        if (d < 0 || intExtra != d) {
            b(Status.c);
        } else if (!this.a.hasExtra("pressed_uninstall_action") || !this.a.hasExtra("dialog_not_shown")) {
            b(Status.c);
        } else {
            boolean booleanExtra = this.a.getBooleanExtra("pressed_uninstall_action", false);
            int intExtra2 = this.a.getIntExtra("dialog_not_shown", 0);
            if (booleanExtra && intExtra2 == 2) {
                intExtra2 = 3;
            }
            aauk.a(context).a(new Status(0), intExtra2);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Status status) {
        aauk.a(this.c).a(status, 0);
    }
}
