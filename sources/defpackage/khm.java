package defpackage;

/* renamed from: khm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum khm {
    OK(true),
    OK_EXPIRED(true),
    FAIL_USER_CONSENT_REQUIRED(false),
    FAIL_PERMANENT(false),
    FAIL_TRANSIENT(false);
    
    public final boolean f;

    private khm(boolean z) {
        this.f = z;
    }
}
