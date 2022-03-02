package defpackage;

import android.os.StrictMode;
import android.os.strictmode.Violation;

/* renamed from: agna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agna implements StrictMode.OnThreadViolationListener {
    private final agnb a;

    public agna(agnb agnb) {
        this.a = agnb;
    }

    public final void onThreadViolation(Violation violation) {
        this.a.a(violation);
    }
}
