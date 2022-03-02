package defpackage;

/* renamed from: qcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qcv implements auco {
    DEFAULT_SAVE_ACCOUNT_LINKING_TOKEN_FLOW_STEP(0),
    SAVE_ACCOUNT_LINKING_TOKEN_ACCOUNT_CHOOSER(1),
    SAVE_ACCOUNT_LINKING_TOKEN_REAUTH_ACCOUNT(2),
    SAVE_ACCOUNT_LINKING_TOKEN_EXTERNAL_CONSENT(3),
    SAVE_ACCOUNT_LINKING_TOKEN_SAVE_TOKEN(4);
    
    private final int f;

    private qcv(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
