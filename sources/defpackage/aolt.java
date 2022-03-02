package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: aolt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aolt implements auco {
    INIT(0),
    POST_INIT(1),
    INIT_CPU(2),
    INIT_PREFS(3),
    INIT_UPGRADE(4),
    INIT_NATIVE(5),
    INIT_AUTHENTICATE(6),
    INIT_READ_RESOURCES(7),
    CONTEXTUAL_SUGGESTIONS_FETCH(8),
    CORPUS_STATS_CALCULATION(9),
    SMS_CORPUS_PROCESS_NEW_SMS(10),
    SMS_CORPUS_PROCESS_NEW_MMS(11),
    SMS_CORPUS_PROCESS_READ_STATUS_CHANGES(12),
    SMS_CORPUS_PROCESS_DELETIONS(13),
    UNRECOGNIZED(-1);
    
    private final int p;

    private aolt(int i) {
        this.p = i;
    }

    public static aolt a(int i) {
        switch (i) {
            case 0:
                return INIT;
            case 1:
                return POST_INIT;
            case 2:
                return INIT_CPU;
            case 3:
                return INIT_PREFS;
            case 4:
                return INIT_UPGRADE;
            case 5:
                return INIT_NATIVE;
            case 6:
                return INIT_AUTHENTICATE;
            case 7:
                return INIT_READ_RESOURCES;
            case 8:
                return CONTEXTUAL_SUGGESTIONS_FETCH;
            case 9:
                return CORPUS_STATS_CALCULATION;
            case 10:
                return SMS_CORPUS_PROCESS_NEW_SMS;
            case 11:
                return SMS_CORPUS_PROCESS_NEW_MMS;
            case 12:
                return SMS_CORPUS_PROCESS_READ_STATUS_CHANGES;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return SMS_CORPUS_PROCESS_DELETIONS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aols.a;
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
