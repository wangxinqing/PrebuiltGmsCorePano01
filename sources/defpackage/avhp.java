package defpackage;

/* renamed from: avhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avhp implements auco {
    UNKNOWN_CALL_LOG_TYPE(0),
    INCOMING(1),
    OUTGOING(2),
    MISSED(3),
    VOICEMAIL(4);
    
    public final int f;

    private avhp(int i) {
        this.f = i;
    }

    public static avhp a(int i) {
        if (i == 0) {
            return UNKNOWN_CALL_LOG_TYPE;
        }
        if (i == 1) {
            return INCOMING;
        }
        if (i == 2) {
            return OUTGOING;
        }
        if (i == 3) {
            return MISSED;
        }
        if (i != 4) {
            return null;
        }
        return VOICEMAIL;
    }

    public static aucq b() {
        return avho.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
