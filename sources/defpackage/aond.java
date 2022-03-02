package defpackage;

/* renamed from: aond  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aond implements auco {
    OK(0),
    DOCUMENT_TRIMMED(1),
    INDEX_TOKENS_CLIPPED(2),
    URI_REPLACED(3),
    DOCUMENT_THING_MODIFIED(4),
    PROTO_PARSE_ERROR(10),
    ERROR_URI_NOT_FOUND(20),
    ERROR_DOCSTORE(21),
    ERROR_TAG_CAP_EXCEEDED(22),
    ERROR_INVALID_SEQNO(23),
    ERROR_IDC_TOO_MANY_RECURSIONS_DEPTH(24),
    ERROR_UPDATING_DELETED_DOC(25),
    ERROR_INDEX_LEXICON_FULL(30),
    UNRECOGNIZED(-1);
    
    private final int o;

    private aond(int i) {
        this.o = i;
    }

    public static aond a(int i) {
        if (i == 0) {
            return OK;
        }
        if (i == 1) {
            return DOCUMENT_TRIMMED;
        }
        if (i == 2) {
            return INDEX_TOKENS_CLIPPED;
        }
        if (i == 3) {
            return URI_REPLACED;
        }
        if (i == 4) {
            return DOCUMENT_THING_MODIFIED;
        }
        if (i == 10) {
            return PROTO_PARSE_ERROR;
        }
        if (i == 30) {
            return ERROR_INDEX_LEXICON_FULL;
        }
        switch (i) {
            case 20:
                return ERROR_URI_NOT_FOUND;
            case 21:
                return ERROR_DOCSTORE;
            case 22:
                return ERROR_TAG_CAP_EXCEEDED;
            case 23:
                return ERROR_INVALID_SEQNO;
            case 24:
                return ERROR_IDC_TOO_MANY_RECURSIONS_DEPTH;
            case 25:
                return ERROR_UPDATING_DELETED_DOC;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aonc.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
