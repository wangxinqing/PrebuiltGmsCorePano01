package defpackage;

/* renamed from: hum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
enum hum implements hvd {
    PLC_HASH_COLLISION("PlcHashCollision", hry.DROPS_BY_PLC_HASH_COLLISION),
    PLC_TO_BYTES_FAIL("PlcToByteFail", hry.DROPS_BY_PLC_TO_BYTES_FAIL),
    LOG_FILE_TOO_OLD("LogFileTooOld", hry.DROPS_BY_LOG_FILE_TOO_OLD),
    CORRUPTED_PLC_FILE("CorruptedPlcFile", hry.DROPS_BY_CORRUPTED_PLC_FILE),
    FAIL_TO_DELETE_PLC_DIR("FailedToDeletePlcDir", hry.DROPS_BY_FAIL_TO_DELETE_PLC_DIR),
    DIR_HAS_NO_PLC_FILE("DirHasNoPlcFile", hry.DROPS_BY_DIR_HAS_NO_PLC_FILE),
    CORRUPTED_LOG_FILE_NAME("CorruptedLogFileName", hry.DROPS_BY_CORRUPTED_LOG_FILE_NAME),
    CORRUPTED_LOG_FILE_CONTENTS("CorruptedLogFileContents", hry.DROPS_BY_CORRUPTED_LOG_FILE_CONTENTS),
    FAIL_TO_READ_PLC_FILE("FailedToReadPlcFile", hry.DROPS_BY_FAIL_TO_READ_PLC_FILE),
    FAIL_TO_PARSE_PLC_DIR_NAME("FailedToParsePlcDirName", hry.DROPS_BY_FAIL_TO_PARSE_PLC_DIR_NAME),
    PLC_HASH_MISMATCH("PlcHashMismatch", hry.DROPS_BY_PLC_HASH_MISMATCH),
    FAIL_TO_PARSE_PLC_PROTO("FailToParsePlcProto", hry.DROPS_BY_FAIL_TO_PARSE_PLC_PROTO),
    DIR_TRAVERSAL_ATTACK("DirTraversalAttack", hry.DROPS_BY_DIR_TRAVERSAL_ATTACK);
    
    public final String n;
    public final hry o;

    private hum(String str, hry hry) {
        this.n = str;
        this.o = hry;
    }

    public final hry a() {
        return this.o;
    }

    public final String toString() {
        return this.n;
    }

    public final hun a(Throwable th) {
        return new hun(this, th);
    }
}
