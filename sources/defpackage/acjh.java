package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: acjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acjh implements igp {
    private final UserBootstrapInfo[] a;

    public acjh(UserBootstrapInfo[] userBootstrapInfoArr) {
        this.a = userBootstrapInfoArr;
    }

    public final void a(Object obj, Object obj2) {
        UserBootstrapInfo[] userBootstrapInfoArr = this.a;
        acix acix = (acix) obj;
        acjp acjp = new acjp((acwd) obj2, acjf.a);
        acix.w();
        ((acjv) acix.x()).a((acjs) new acit(acjp), userBootstrapInfoArr);
    }
}
