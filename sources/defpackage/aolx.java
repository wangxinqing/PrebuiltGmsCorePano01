package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aolx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aolx implements auco {
    NO_ERROR(0),
    GENERIC_ERROR(1),
    INVALID_INDEXABLE(2),
    SEQUENCE_TABLE_FULL(3),
    INTERNAL_ERROR(4),
    CLIENT_DISCONNECTED(5),
    INVALID_INDEXABLE_OVER_MAX_NESTING_DEPTH(6),
    INVALID_INDEXABLE_UNSUPPORTED_DATA_TYPE(7),
    INVALID_INDEXABLE_STRING_VALUE_TOO_LONG(8),
    INVALID_INDEXABLE_STRING_KEY_TOO_LONG(9),
    INVALID_INDEXABLE_TOO_MANY_REPEATED_VALUES(10),
    INVALID_INDEXABLE_SAME_AS_FIELD_REPEATED(11),
    INVALID_INDEXABLE_INVALID_WEB_URL(12),
    INVALID_INDEXABLE_METADATA_AT_NON_TOP_LEVEL(13),
    INVALID_INDEXABLE_TOO_MANY_FIELDS(14),
    INVALID_INDEXABLE_INTENT_NOT_HANDLED(15),
    INVALID_INDEXABLE_MISSING_REQUIRED_FIELD(16),
    INVALID_INDEXABLE_INVALID_REPEATED_FIELD(17),
    NOT_ALLOWED(18),
    INVALID_ARGUMENT_NULL(19),
    INVALID_ARGUMENT_TOO_MANY(20),
    INVALID_ARGUMENT_URI(21),
    INVALID_INDEXABLE_TOO_LARGE(22),
    INVALID_ARGUMENT_URI_TOO_LONG(23),
    CALL_IN_PROGRESS(24),
    INVALID_ACTION_EVENT_STATUS(25),
    INVALID_QUERY_TEXT(26),
    INVALID_QUERY_TYPES(27),
    INVALID_QUERY_NO_INDEX(28),
    INVALID_INDEXABLE_INVALID_TYPE_AT_TOP_LEVEL(29),
    NO_PERMISSION(30),
    INVALID_INDEXABLE_BAD_PATCH(31),
    INVALID_REQUEST(32),
    FEATURE_OFF(33),
    INVALID_INDEXABLE_BAD_PARCELABLE(34),
    INVALID_INDEXABLE_INVALID_SCOPE(35),
    INVALID_INDEXABLE_INVALID_ACCOUNT(36),
    INVALID_INDEXABLE_UNPAIRED_SURROGATE(37),
    INVALD_ACTION_URL_MISMATCH(38),
    INVALID_INDEXABLE_INVALID_SLICE_URI(39),
    INVALID_INDEXABLE_NULL_SLICE(40),
    INVALID_INDEXABLE_SLICE_NOT_SERIALIZABLE(41),
    INVALID_INDEXABLE_BIND_SLICE_TIMED_OUT(42),
    INVALID_ARGUMENT_CHECK_SEQUENCE_TABLE(43),
    SLICE_TOO_LARGE(44),
    SLICE_TIMED_OUT(45),
    NULL_SLICE(46),
    INVALID_SLICE_URI_TYPE(47),
    INVALID_SLICE_ARGUMENT(48),
    INVALID_SLICE_AUTHORITY(49),
    TEMPORARY_REDIRECT(50),
    UNRECOGNIZED(-1);
    
    private final int aa;

    private aolx(int i) {
        this.aa = i;
    }

    public static aolx a(int i) {
        switch (i) {
            case 0:
                return NO_ERROR;
            case 1:
                return GENERIC_ERROR;
            case 2:
                return INVALID_INDEXABLE;
            case 3:
                return SEQUENCE_TABLE_FULL;
            case 4:
                return INTERNAL_ERROR;
            case 5:
                return CLIENT_DISCONNECTED;
            case 6:
                return INVALID_INDEXABLE_OVER_MAX_NESTING_DEPTH;
            case 7:
                return INVALID_INDEXABLE_UNSUPPORTED_DATA_TYPE;
            case 8:
                return INVALID_INDEXABLE_STRING_VALUE_TOO_LONG;
            case 9:
                return INVALID_INDEXABLE_STRING_KEY_TOO_LONG;
            case 10:
                return INVALID_INDEXABLE_TOO_MANY_REPEATED_VALUES;
            case 11:
                return INVALID_INDEXABLE_SAME_AS_FIELD_REPEATED;
            case 12:
                return INVALID_INDEXABLE_INVALID_WEB_URL;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return INVALID_INDEXABLE_METADATA_AT_NON_TOP_LEVEL;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return INVALID_INDEXABLE_TOO_MANY_FIELDS;
            case Service.START_CONTINUATION_MASK:
                return INVALID_INDEXABLE_INTENT_NOT_HANDLED;
            case 16:
                return INVALID_INDEXABLE_MISSING_REQUIRED_FIELD;
            case 17:
                return INVALID_INDEXABLE_INVALID_REPEATED_FIELD;
            case 18:
                return NOT_ALLOWED;
            case 19:
                return INVALID_ARGUMENT_NULL;
            case 20:
                return INVALID_ARGUMENT_TOO_MANY;
            case 21:
                return INVALID_ARGUMENT_URI;
            case 22:
                return INVALID_INDEXABLE_TOO_LARGE;
            case 23:
                return INVALID_ARGUMENT_URI_TOO_LONG;
            case 24:
                return CALL_IN_PROGRESS;
            case 25:
                return INVALID_ACTION_EVENT_STATUS;
            case 26:
                return INVALID_QUERY_TEXT;
            case 27:
                return INVALID_QUERY_TYPES;
            case 28:
                return INVALID_QUERY_NO_INDEX;
            case 29:
                return INVALID_INDEXABLE_INVALID_TYPE_AT_TOP_LEVEL;
            case 30:
                return NO_PERMISSION;
            case 31:
                return INVALID_INDEXABLE_BAD_PATCH;
            case 32:
                return INVALID_REQUEST;
            case 33:
                return FEATURE_OFF;
            case 34:
                return INVALID_INDEXABLE_BAD_PARCELABLE;
            case 35:
                return INVALID_INDEXABLE_INVALID_SCOPE;
            case 36:
                return INVALID_INDEXABLE_INVALID_ACCOUNT;
            case 37:
                return INVALID_INDEXABLE_UNPAIRED_SURROGATE;
            case 38:
                return INVALD_ACTION_URL_MISMATCH;
            case 39:
                return INVALID_INDEXABLE_INVALID_SLICE_URI;
            case 40:
                return INVALID_INDEXABLE_NULL_SLICE;
            case 41:
                return INVALID_INDEXABLE_SLICE_NOT_SERIALIZABLE;
            case 42:
                return INVALID_INDEXABLE_BIND_SLICE_TIMED_OUT;
            case 43:
                return INVALID_ARGUMENT_CHECK_SEQUENCE_TABLE;
            case 44:
                return SLICE_TOO_LARGE;
            case 45:
                return SLICE_TIMED_OUT;
            case 46:
                return NULL_SLICE;
            case 47:
                return INVALID_SLICE_URI_TYPE;
            case 48:
                return INVALID_SLICE_ARGUMENT;
            case 49:
                return INVALID_SLICE_AUTHORITY;
            case 50:
                return TEMPORARY_REDIRECT;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aolw.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.aa;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
