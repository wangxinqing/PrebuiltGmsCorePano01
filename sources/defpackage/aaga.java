package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: aaga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaga implements pqa {
    private final acwa a;

    public aaga(acwa acwa) {
        this.a = acwa;
    }

    public final /* bridge */ /* synthetic */ Object h() {
        try {
            acws.a(this.a);
            return null;
        } catch (InterruptedException | ExecutionException e) {
            return e.toString();
        }
    }
}
