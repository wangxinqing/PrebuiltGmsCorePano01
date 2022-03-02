package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abue implements acvs {
    private final abug a;
    private final abxq b;

    public abue(abug abug, abxq abxq) {
        this.a = abug;
        this.b = abxq;
    }

    public final void a(Exception exc) {
        abug abug = this.a;
        abxq abxq = this.b;
        abug.a.d("Target mode not enabled.", new Object[0]);
        abug.j = false;
        abug.b(abxq, new Status(10557));
    }
}
