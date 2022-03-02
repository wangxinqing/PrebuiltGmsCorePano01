package defpackage;

/* renamed from: avtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avtj implements auco {
    UNKNOWN(0),
    REGULAR_REGISTER(1),
    WEAK_REGISTER(2),
    BULK_REGISTER(25),
    SET_APP_SPECIFIC_PROPERTIES(32),
    UNREGISTER(3),
    GET_CONFIG_SNAPSHOT(4),
    COMMIT_CONFIG(5),
    COMMIT_ON_QUERY(37),
    GET_EXP_FOR_LOGGING(6),
    GET_EXP(7),
    GET_DOGFOODS_TOKEN(9),
    SET_DOGFOODS_TOKEN(10),
    GET_FLAG(11),
    GET_COMMITTED_CONFIGURATION(12),
    SYNC_AFTER(15),
    SYNC_AFTER_GCM_PUSH(18),
    GET_GCM_MSG(22),
    REGISTER_SYNC(17),
    SHOULD_SYNC(27),
    SYNC(28),
    PEEK_CONFIG(29),
    SET_EXTERNAL_EXPERIMENT_IDS(30),
    SET_DIMENSIONS(36),
    GET_SERVING_VERSION(38),
    PHENOTYPE_INFO(8),
    EXPERIMENT_TOKEN(13),
    PHENOTYPE_COMMIT(14),
    PHENOTYPE_SYNC_AFTER_DELAY(16),
    PHENOTYPE_DATABASE_ERROR(31),
    PHENOTYPE_SCHEDULE_TASK(33),
    PHENOTYPE_CATCHUP_UPDATE_TASK(34),
    PHENOTYPE_BROADCAST(39),
    SET_FLAG_OVERRIDE(19),
    DELETE_FLAG_OVERRIDE(20),
    LIST_FLAG_OVERRIDE(21),
    GET_ALT_CONFIG_SNAPSHOT(23),
    COMMIT_ALT_CONFIG(24),
    PLATFORM_CHANGED_OUT_OF_BAND(26),
    DATABASE_CREATED(35);
    
    public final int O;

    private avtj(int i) {
        this.O = i;
    }

    public final int a() {
        return this.O;
    }

    public final String toString() {
        return Integer.toString(this.O);
    }
}
