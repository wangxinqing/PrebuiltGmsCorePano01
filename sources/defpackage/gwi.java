package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.checkin.CheckinChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: gwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwi extends jba {
    private final Context a;
    private final ifu d;
    private final Account e;

    public gwi(Context context, ifu ifu, Account account) {
        super(130, "HasAccountCheckin");
        this.a = context;
        this.d = ifu;
        this.e = account;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        int i;
        if (!CheckinChimeraService.a(this.a, this.e)) {
            i = 21040;
        } else {
            i = 21020;
        }
        this.d.a(new Status(i));
    }
}
