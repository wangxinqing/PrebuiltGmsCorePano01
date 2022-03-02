package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abud implements acvv {
    private final abug a;
    private final abxq b;

    public abud(abug abug, abxq abxq) {
        this.a = abug;
        this.b = abxq;
    }

    public final void a(Object obj) {
        abug abug = this.a;
        abxq abxq = this.b;
        Void voidR = (Void) obj;
        abug.a.b("Target mode enabled.", new Object[0]);
        abug.j = true;
        abug.b(abxq, new Status(0));
    }
}
