package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: acji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acji implements igp {
    private final Challenge[] a;
    private final boolean b;
    private final boolean c;

    public acji(Challenge[] challengeArr, boolean z, boolean z2) {
        this.a = challengeArr;
        this.b = z;
        this.c = z2;
    }

    public final void a(Object obj, Object obj2) {
        Challenge[] challengeArr = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        acix acix = (acix) obj;
        acjp acjp = new acjp((acwd) obj2, acje.a);
        acix.w();
        ((acjv) acix.x()).a(new acio(acjp), challengeArr, z, z2);
    }
}
