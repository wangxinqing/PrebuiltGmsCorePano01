package defpackage;

import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmh implements acvv {
    final /* synthetic */ PreAddAccountChimeraActivity a;

    public gmh(PreAddAccountChimeraActivity preAddAccountChimeraActivity) {
        this.a = preAddAccountChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        iwd iwd = PreAddAccountChimeraActivity.a;
        String valueOf = String.valueOf(num);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Checkin result status: ");
        sb.append(valueOf);
        iwd.e(sb.toString(), new Object[0]);
        if (ibt.d(num.intValue())) {
            this.a.e.a(true);
        } else {
            this.a.e.a(false);
        }
    }
}
