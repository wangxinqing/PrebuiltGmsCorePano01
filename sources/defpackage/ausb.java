package defpackage;

/* renamed from: ausb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausb {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "INITIATOR_START";
            case 2:
                return "INITIATOR_WAITING_FOR_RESPONDER_HELLO";
            case 3:
                return "RESPONDER_START";
            case 4:
                return "RESPONDER_AFTER_INITIATOR_HELLO";
            case 5:
                return "HANDSHAKE_FINISHED";
            case 6:
                return "HANDSHAKE_ALREADY_USED";
            default:
                return "null";
        }
    }
}
