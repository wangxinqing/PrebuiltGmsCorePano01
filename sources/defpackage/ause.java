package defpackage;

/* renamed from: ause  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ause {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "INITIATOR_START";
            case 2:
                return "INITIATOR_WAITING_FOR_RESPONDER_COMMITMENT";
            case 3:
                return "INITIATOR_AFTER_RESPONDER_COMMITMENT";
            case 4:
                return "INITIATOR_WAITING_FOR_RESPONDER_HASH";
            case 5:
                return "RESPONDER_START";
            case 6:
                return "RESPONDER_AFTER_INITIATOR_COMMITMENT";
            case 7:
                return "RESPONDER_WAITING_FOR_INITIATOR_HASH";
            case 8:
                return "RESPONDER_AFTER_INITIATOR_HASH";
            case 9:
                return "HANDSHAKE_FINISHED";
            case 10:
                return "HANDSHAKE_ALREADY_USED";
            default:
                return "null";
        }
    }
}
