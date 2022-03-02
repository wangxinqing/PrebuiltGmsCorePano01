package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: ido  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ido implements Runnable {
    private final icm a;
    private final icl b;

    public ido(icm icm, icl icl) {
        this.a = icm;
        this.b = icl;
    }

    public final void run() {
        icm icm = this.a;
        icl icl = this.b;
        int i = BasePendingResult.l;
        icm.a(icl);
    }
}
