package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aono  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aono implements auco {
    UNSPECIFIED(0),
    USAGE_REPORTING_DISABLED(1),
    FEATURE_DISABLED(2),
    CLIENT_NOT_WHITELISTED(3),
    USAGE_INFO_IS_EMPTY(4),
    NO_IME_PACKAGES(5),
    THROTTLED_DUE_TO_PER_SECOND_QUOTA(7),
    THROTTLED_DUE_TO_DAILY_QUOTA(8),
    NO_IME_PACKAGE_WITH_INTENT_SERVICE(6),
    FAIL_TO_START_INTENT_SERVICE(9),
    NO_PERMISSION(10),
    NOTIFICATION_SENT(11),
    NOT_ALLOWED(12),
    NO_IME_PACKAGE_WITH_BROADCAST_RECEIVER(13),
    NOTIFICATION_BROADCAST(14),
    NO_FIREBASE_USER_ACTIONS(15),
    UNRECOGNIZED(-1);
    
    private final int r;

    private aono(int i) {
        this.r = i;
    }

    public static aono a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return USAGE_REPORTING_DISABLED;
            case 2:
                return FEATURE_DISABLED;
            case 3:
                return CLIENT_NOT_WHITELISTED;
            case 4:
                return USAGE_INFO_IS_EMPTY;
            case 5:
                return NO_IME_PACKAGES;
            case 6:
                return NO_IME_PACKAGE_WITH_INTENT_SERVICE;
            case 7:
                return THROTTLED_DUE_TO_PER_SECOND_QUOTA;
            case 8:
                return THROTTLED_DUE_TO_DAILY_QUOTA;
            case 9:
                return FAIL_TO_START_INTENT_SERVICE;
            case 10:
                return NO_PERMISSION;
            case 11:
                return NOTIFICATION_SENT;
            case 12:
                return NOT_ALLOWED;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return NO_IME_PACKAGE_WITH_BROADCAST_RECEIVER;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return NOTIFICATION_BROADCAST;
            case Service.START_CONTINUATION_MASK:
                return NO_FIREBASE_USER_ACTIONS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aonn.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
