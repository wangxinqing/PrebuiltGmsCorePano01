package defpackage;

/* renamed from: qcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qcu implements auco {
    DEFAULT_PASSWORD_SAVING_FLOW_STEP(0),
    MATCH_PASSWORDS(1),
    ACCOUNT_SELECTION(2),
    ACCOUNT_CONFIRMATION(3),
    SAVE_PASSWORD(4);
    
    private final int f;

    private qcu(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
