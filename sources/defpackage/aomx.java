package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: aomx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aomx implements auco {
    UNDEFINED(0),
    SUCCESS(1),
    EXECUTION_ERROR(2),
    NOT_STARTED(3),
    INTERRUPTED(4),
    CANCELLED(5),
    CALL_CREDENTIALS_ERROR(6),
    UNKNOWN_HOST(7),
    UNSUPPORTED_PROTOCOL(8),
    PENDING_LOCAL_CHANGES(9),
    CONNECT_EXCEPTION(10),
    UNAUTHENTICATED(11),
    UNAVAILABLE(12),
    DEADLINE_EXCEEDED(13),
    UNRECOGNIZED(-1);
    
    private final int p;

    private aomx(int i) {
        this.p = i;
    }

    public static aomx a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return SUCCESS;
            case 2:
                return EXECUTION_ERROR;
            case 3:
                return NOT_STARTED;
            case 4:
                return INTERRUPTED;
            case 5:
                return CANCELLED;
            case 6:
                return CALL_CREDENTIALS_ERROR;
            case 7:
                return UNKNOWN_HOST;
            case 8:
                return UNSUPPORTED_PROTOCOL;
            case 9:
                return PENDING_LOCAL_CHANGES;
            case 10:
                return CONNECT_EXCEPTION;
            case 11:
                return UNAUTHENTICATED;
            case 12:
                return UNAVAILABLE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return DEADLINE_EXCEEDED;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aomw.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
